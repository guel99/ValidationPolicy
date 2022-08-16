---
title: "Validation Policies Implementation"
author: "Miguel Oliveira"
date: "2022"
---

# Validation Policies Implementation

## 1. Introdução

Este documento procura dar uma perspetiva do modo como o tema "Políticas de validação de assinaturas" foi abordado de modo a ser integrado no projeto final, isto é a aplicação que permite validar assinaturas eletrónicas.

- [Validation Policies Implementation](#validation-policies-implementation)
  - [1. Introdução](#1-introdução)
  - [2. Enquadramento](#2-enquadramento)
  - [3. Geração de um ficheiro de política de validação](#3-geração-de-um-ficheiro-de-política-de-validação)
  - [4. Elementos editáveis pelo utilizador](#4-elementos-editáveis-pelo-utilizador)
    - [4.1 ContainerConstraints](#41-containerconstraints)
      - [4.1.1 ***AcceptableContainerTypes***](#411-acceptablecontainertypes)
      - [4.1.2 ***AcceptableMimeTypeFileContent***](#412-acceptablemimetypefilecontent)
      - [4.1.3 ***AllFilesSigned***](#413-allfilessigned)
      - [4.1.4 **Elementos não editáveis**](#414-elementos-não-editáveis)
    - [4.2 SignatureConstraints](#42-signatureconstraints)
      - [4.2.1 ***AcceptablePolicies*** (*esclarecer o modo como se identifica as políticas aceitáveis antes de mais*)](#421-acceptablepolicies-esclarecer-o-modo-como-se-identifica-as-políticas-aceitáveis-antes-de-mais)
      - [4.2.2 ***AcceptableFormats***](#422-acceptableformats)
      - [4.2.3 ***Full scope***](#423-full-scope)
      - [4.2.4 ***Basic Signature Constraints***](#424-basic-signature-constraints)
      - [4.2.5 ***SignedAttributesConstraints*** e ***UnsignedAttributesConstraints***](#425-signedattributesconstraints-e-unsignedattributesconstraints)
    - [4.3 CounterSignatureConstraints](#43-countersignatureconstraints)
    - [4.4 Time-Stamp](#44-time-stamp)
      - [4.1.1 ***TimestampDelay***](#411-timestampdelay)
      - [4.1.2 ***BasicSignatureConstraints***](#412-basicsignatureconstraints)
      - [4.1.3 ***TSAGeneralNamePresent***](#413-tsageneralnamepresent)
    - [4.5 *Revocation*](#45-revocation)
      - [4.5.1 ***OCSPCertHashPresent*** e ***OCSPCertHashMatch***](#451-ocspcerthashpresent-e-ocspcerthashmatch)
      - [4.5.2 ***SelfIssuedOCSP***](#452-selfissuedocsp)
      - [4.5.3 ***BasicSignatureConstraints***](#453-basicsignatureconstraints)


## 2. Enquadramento

Toda a lógica relacionada com o algorítmo de **validação de assinaturas eletrónicas** normalizada pelo **ETSI**, encontra-se já implementada pelo **DSS** (***Digital Signature Service***), tema que terá que ser abordado no **Estado de Arte** da dissertação. De modo a justificar a dissertação, um dos caminhos pelos quais decidi enveredar, à data do início de elaboração deste documento, foi a possibilidade de:

* por um lado, o utilizador ser capaz de **gerar uma política de validação**, **e**, 
* por outro, **aplicar** essa própria política em concreto, no **processo de validação** de uma assinatura selecionada pelo utilizador. 

Relativamente a este último tópico, nota para o facto que o **DSS** alberga, sem qualquer tipo de problema, a possibilidade de selecionar uma política em específico, por parte do utilizador, desde que esta esteja representada em **formato XML**, e de acordo com o [***schema***](https://github.com/esig/dss/blob/master/dss-policy-jaxb/src/main/resources/xsd/policy.xsd).

## 3. Geração de um ficheiro de política de validação

O ETSI, para além de muitos outros standards relativos às assinaturas eletrónicas, elaborou alguns que vão ao encontro das políticas a serem usadas aquando da aplicação prática do processo de validação, de entre os quais destaco para este caso, o **ETSI TS 119 172-2 V1.1.1** - *Electronic Signatures and Infrastructures (ESI); Signature Policies; Part 2: XML format for signature policies*

No entanto, o schema para uma política de assinatura é completamente distinto daquele mencionado acima, relativo à implementação do DSS. No entanto, é possível notar que a política usada pelo DSS alberga apenas os aspetos mais técnicos relativos ao processo de validação, ao passo que a política de assinatura ETSI, suporta muitos outros atributos secundários e até um pouco alheios ao processo, mais concretamente aqueles incluidos no elemento ````GeneralDetails```` das ````PolicyComponents````, que por sua vez integra o *root element* ***ValidationPolicy***. O elemento mencionado armazena dados relacionados com a própria política, tais como o identificador da política, o seu próprio nome e outros ainda relacionados com a própria entidade criadora da política, tais como o nome, endereços postais, endereços eletrónicos e contactos, entre outros.

Deste modo, e como o objetivo da dissertação passava por conceber uma aplicação que seguisse as normas estipuladas pelo ETSI, optei por permitir criar uma política ETSI para depois, aquando da necessidade da sua aplicação na validação de uma assinatura, ser "resumida" para uma política DSS, para, deste modo, ser aplicável aquando de um pedido de validação.

## 4. Elementos editáveis pelo utilizador

O objetivo por trás da conceção de uma aplicação final com a funcionalidade adicional de conceção de políticas de validação seria facilitar precisamente o processo de geração da política, pelo que, dada a dimensão e a complexidade do formato da política, tal não seria conseguido caso optasse por deixar à escolha do utilizador todo e qualquer elemento da política. Por outro lado, não interessaria minimamente a uma entidade editar certos parâmetros da própria política, a qual poderia até correr alguns riscos caso o fizesse inadvertidamente ou não.

Assim sendo, iremos abordar aqueles elementos que faziam sentido serem editáveis por parte de uma entidade que pretendesse utilizar tal funcionalidade. Para tal teremos por base sempre o schema da política DSS, a qual poderá ser diretamente aplicada no processo de validação, visto que também ele é implementado pelo DSS. A geração da política de assinatura ETSI e posterior resumo para política DSS será tratado mais à frente neste mesmo documento.

Serão mencionadas, em cada uma das seguintes subsecções, os elementos que fazem sentido poder ser editáveis pelos utilizadores. Em cada um deles será especificado o que acontecerá caso o criador da política não especifique a condição, caso esse doravante designado por ***default***.

### 4.1 ContainerConstraints

O primeiro tipo de regras definido por uma política DSS são as ***container constrains***, ou seja aquelas que têm a ver com o processamento da validação de ASiC Containers.

Este elemento no documento de política de validação é do tipo ***ContainerConstraints***.

#### 4.1.1 ***AcceptableContainerTypes***

Apesar de a validação do formato da assinatura não integrar os building blocks para uma política de validação definidos no **ETSI EN 310 102-1**, faz sentido a entidade criadora de uma política definir os tipos de ASiC containers que aceita, de entre os tipos conhecidos que são ASiC-S e ASiC-E.

***Default:*** Serão aceites quais tipos de container: **ASiC-S** e **ASiC-E**.

#### 4.1.2 ***AcceptableMimeTypeFileContent***

Quanto a este tópico, faz sentido, para além dos mimetypes que definem o media type dos containers, **application/vnd.etsi.asic-s+zip** e **application/vnd.etsi.asic-e+zip**, a entidade poder adicionar qualquer outro mimetype que caracterize o conteúdos do(s) objeto(s) a ser(em) assinado(s), tal como se encontra especificado no **ETSI EN 319 162-1 V1.1.1**. Deste modo, serão sempre, em qualquer política gerada, incluidos os mimetype supramencionados, aos quais serão adicionados aqueles apresentados pelo utilizador após passar num processo de validação (verificar se mimetype é válido - VER SE FAZ SENTIDO).

***Default:*** Serão apenas considerados os media types já mencionados nesta mesma secção.

#### 4.1.3 ***AllFilesSigned***

Faz sentido o utilizador, para uma determinada política pretender que todos os ficheiros sejam cobertos por alguma assinatura, e noutros casos não, pelo que este valor poderá ser editável. Para além do mais, o utilizador poderá escolher entre FAIL e WARN, no caso de a condição não ser respeitada.

***Default:*** Será retornado um FAIL, no caso de os ficheiros presentes no container não estarem cobertos por uma assinatura.

#### 4.1.4 **Elementos não editáveis**

* ***MimeTypeFilePresent*** - Por uma questão de simplicidade, o mimetype **não será obrigatório**, sendo que, sempre que um determinado container a validar contiver um ficheiro mimetype, o seu conteúdo deverá sempre ser um daqueles mimetypes mencionados [nesta secção](#412-acceptablemimetypefilecontent), ou então daqueles especificados pelo próprio utilizador como sendo ***AcceptableMimeTypes***. Assim sendo o seu Level será apenas ***Inform***, de modo a que um utilizador seja avisado sempre que o mimetype não esteja presente.
* ***ZipCommentPresent*** - o comentário ZIP acaba por ser um pouco secundário, pelo que não será devido a este que qualquer processo de validação acabe num resultado negativo, não fazendo então parte dos elementos editávais pelo utilizador. Para tal será retornado um ***Inform*** sempre que o comentário não esteja presente no container.
* ***AcceptableZipComment*** - por ter uma relação direta com o anterior. Os comentários mais expectáveis serão sempre "***mimetype=application/vnd.etsi.asic-s+zip***" ou "***mimetype=application/vnd.etsi.asic-e+zip***", ou um daqueles mimetypes introduzidos pelo utilizador na mesma política, sempre que tal não se verificar, o utilizador recerá um level ***Inform***. Caso não acontecerá absolutamente nada.
* ***ManifestFilePresent*** - será sempre verificada, para qualquer tipo de container:
  * **ASiC-S** - Não deverá constar nenhum ficheiro do tipo
  * **ASiC-E** - Será obrigatório pelo menos um ficheiro do tipo
*  ***SignedFilesPresent*** - esta condição terá sempre que se verificar. Por outras palavras, qualquer que seja o tipo do container a validar:
   *  **ASiC-S** - Verifica se um e apenas um ficheiro assinado se encontra ao nível da root do container
   *  **ASiC-E** - verifica se pelo menos um ficheiro assinado se encontra ao nível da root do container

### 4.2 SignatureConstraints

Elemento do tipo ***SignatureConstraints***.

Estas condições etão relacionadas com a validação da própria assinatura, incluindo os atributos assinados e não assinados, os elementos abrangidos pela própria assinatura, certificados, entre outros.

#### 4.2.1 ***AcceptablePolicies*** (*esclarecer o modo como se identifica as políticas aceitáveis antes de mais*)

#### 4.2.2 ***AcceptableFormats***

O utilizador será capaz de selecionar os formatos desejados para a assinatura a validar. Tais formatos poderão ser aqueles standardizados por parte do ETSI, por exemplo:
   * XAdES-BASELINE-B
   * PAdES-BASELINE-LT
   * ...

***Default:*** Serão aceites quaisquer formatos, desde que de acordo com os standards definidos pelo **ETSI** (**ETSI EN 310 162-1**, **ETSI EN 310 162-2**, **ETSI EN 310 122-1**, **ETSI EN 310 122-2**, **ETSI EN 310 182-1**, **ETSI EN 310 142-1**, **ETSI EN 310 142-2**, **ETSI EN 310 132-1** e **ETSI EN 310 132-2**).

#### 4.2.3 ***Full scope***

Será possível indicar se é intenção do utilizador considerar apenas válida uma assinatura se o próprio valor da assinatura cobrir todo o documento.
O utilizador poderá ainda especificar se a validação deve falhar (***FAIL***), caso tal aconteça ou se apenas pretende devolver como resultado um ***WARN***.

***Default:*** A função estará desabilitada, ou seja, a condição não se aplica.

#### 4.2.4 ***Basic Signature Constraints***

As *basic signature constraints* são um sub-elemento das ***SignatureConstraints***, sendo constituidas por regras para qualquer tipo de dados assinados, sejam eles uma assinatura, um time-stamp, ou até mesmo revocation data.

Tendo em conta que são um sub-tipo de restrições que estão incluidos em mais do que apenas uma categoria de restrições, serão abordadas na secção (FIIIIIIXMEEEEEEE).

#### 4.2.5 ***SignedAttributesConstraints*** e ***UnsignedAttributesConstraints***

Os ***signed attributes***, tal como o próprio nome indica, aplica regras relacionadas com os **atributos assinados** de uma **assinatura**, ao passo que os ***unsigned attributes*** se aplicam aos **atributos não assinados**.

À semelhança do que aconteceu na secção [4.2.4](#424-basic-signature-constraints), serão abordados numa secção à parte.

### 4.3 CounterSignatureConstraints

Elemento de tipo igual ao mencionado para as ***SignatureConstraints*** na secção [4.2](#42-signature-constraints).

No entanto, neste caso em particular, ao invés das restrições doravante mencionadas se destinarem à validação da própria assinatura, serão aplicadas às ***countersignatures***, atributo guardado pela própria assinatura.

Assim sendo, as possíveis restrições aplicáveis às countersignatures são precisamente as mesmas que aquelas que são aplicáveis à validação da assinatura, pelo que a opção de escolha por parte do utilizador será exatamente a mesma que foi especificada ao longo da secção [4.2](#42-signature-constraints).

### 4.4 Time-Stamp

É um elemento, no documento de política de validação, do tipo ***TimeStampConstraints***. Possibilita a especificação de regras destinadas à validação de timestamps.

#### 4.1.1 ***TimestampDelay***

Permite especificar a diferença temporal máxima entre o *best-signature-time* e o *claimed signing time*. Este valor poderá ser editável pelo utilizador. Faz sentido que uma determinada entidade apenas considere válida uma assinatura com time-stamp, no caso de o *claimed signing type* da assinatura ser anterior ao *best-signature-time* num intervalo de tempo máximo, definido pela própria entidade.

***Default:*** Parâmetro desativado. A condição não é testada.

#### 4.1.2 ***BasicSignatureConstraints***

Condições aplicáveis à assinatura existente no próprio token. Estas restrições serão tidas em conta numa secção à parte.

#### 4.1.3 ***TSAGeneralNamePresent***

A entidade que gera a política será capaz de garantir que uma assinatura apenas é válida caso o nome da *time stamp authority* conste no output da validação do respetivo token, e inválida caso contrário. O mesmo acontecerá no caso da ***TSAGeneralNameContentMatch*** e da ***TSAGeneralNameOrderMatch***

***Default:*** A condição não será testada.

### 4.5 *Revocation*

Grupo de regras aplicadas aos **dados de revogação**.

#### 4.5.1 ***OCSPCertHashPresent*** e ***OCSPCertHashMatch***

O utilizador poderá selecionar opção que verifica se a extensão OCSP *"certHash"* possui um valor atribuido e mais ainda se corresponde ao certificado para o qual foi realizado o request.

#### 4.5.2 ***SelfIssuedOCSP***

Permite verificar se um certificado testado faz parte do trust certificate path do OCSP responder.

***Default:*** Condição não será verificada

#### 4.5.3 ***BasicSignatureConstraints***

Grupo de restrições aplicadas à assinatura da OCSP response. Tema abordado numa secção à parte.



