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
    - [4.1 Container Constraints](#41-container-constraints)
      - [4.1.1 ***AcceptableContainerTypes***](#411-acceptablecontainertypes)
      - [4.1.2 ***AcceptableMimeTypeFileContent***](#412-acceptablemimetypefilecontent)
      - [4.1.3 **Elementos não abrangidos**](#413-elementos-não-abrangidos)


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

### 4.1 Container Constraints

O primeiro tipo de regras definido por uma política DSS são as ***container constrains***, ou seja aquelas que têm a ver com o processamento da validação de ASiC Containers.

#### 4.1.1 ***AcceptableContainerTypes***

Apesar de a validação do formato da assinatura não integrar os building blocks para uma política de validação definidos no **ETSI EN 310 102-1**, faz sentido a entidade criadora de uma política definir os tipos de ASiC containers que aceita, de entre os tipos conhecidos que são ASiC-S e ASiC-E.

#### 4.1.2 ***AcceptableMimeTypeFileContent***

Quanto a este tópico, faz sentido, para além dos mimetypes que definem o media type dos containers, **application/vnd.etsi.asic-s+zip** e **application/vnd.etsi.asic-e+zip**, faz sentido a entidade poder adicionar qualquer outro mimetype que caracterize o conteúdos do(s) objeto(s) a ser(em) assinado(s), tal como se encontra especificado no **ETSI EN 319 162-1 V1.1.1**. Deste modo, serão sempre, em qualquer política gerada, incluidos os mimetype supramencionados, aos quais serão adicionados aqueles apresentados pelo utilizador após passar num processo de validação (verificar se mimetype é válido - VER SE FAZ SENTIDO).

#### 4.1.3 **Elementos não abrangidos**

* ***MimeTypeFilePresent*** - Por uma questão de simplicidade, o mimetype **não será obrigatório**, sendo que, sempre que um determinado container a validar contiver um ficheiro mimetype, o seu conteúdo deverá sempre ser um daqueles mimetypes mencionados [nesta secção](#412-acceptablemimetypefilecontent), ou então daqueles especificados pelo próprio utilizador como sendo.***AcceptableMimeTypes***. Assim sendo o seu Level será apenas ***Inform***, de modo a que um utilizador seja avisado sempre que o mimetype não esteja presente.
* ***ZipCommentPresent*** - o comentário ZIP acaba por ser um pouco secundário, pelo que não será devido a este que qualquer processo de validação acabe num resultado negativo, não fazendo então parte dos elementos editávais pelo utilizador. Para tal será retornado um ***Inform*** sempre que o comentário não esteja presente no container.
* ***AcceptableZipComment*** - por ter uma relação direta com o anterior. Os comentários mais expectáveis serão sempre "***mimetype=application/vnd.etsi.asic-s+zip***" ou "***mimetype=application/vnd.etsi.asic-e+zip***", ou um daqueles mimetypes introduzidos pelo utilizador na mesma política, sempre que tal não se verificar, o utilizador recerá um level ***Inform***. Caso não acontecerá absolutamente nada.