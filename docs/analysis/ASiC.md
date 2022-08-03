---
title: "ASiC Containers"
author: "Miguel Oliveira"
date: "2022"
---

# CAdES digital signatures

## I - Introdução

Este documento aborda uma das implementações de AdES, definidas pelo **ETSI**, os **ASiC Containers**, e foi concebido com base na análise da seguinte bibliografia:
- __ETSI EN 319 162-1 V1.2.1__ - Electronic Signatures and Infrastructures (ESI);

## II - Índice

- [CAdES digital signatures](#cades-digital-signatures)
  - [I - Introdução](#i---introdução)
  - [II - Índice](#ii---índice)
  - [III - Enquadramento](#iii---enquadramento)
  - [IV - Estrutura e info básica](#iv---estrutura-e-info-básica)
  - [*Associated Signature Containers Simple* (ASiC-S)](#associated-signature-containers-simple-asic-s)
    - [Fomato de um ASiC-S](#fomato-de-um-asic-s)
      - [*Media-type identification*](#media-type-identification)
      - [*File extension*](#file-extension)
    - [ASiC-S *long term availability and integrity*](#asic-s-long-term-availability-and-integrity)
  - [Associated Signature Container Extended (ASiC-E)](#associated-signature-container-extended-asic-e)
    - [Formato de ASiC-E com XAdES](#formato-de-asic-e-com-xades)
      - [Conteúdo de um ASiC-E](#conteúdo-de-um-asic-e)

## III - Enquadramento

A elaboração de um standard para a conceção de um container que guarda ficheiros de dados e ficheiros de assinaturas, surge pela necessidade de associar as assinaturas e o conjuntos de dados aos quais elas se aplicam. Algumas abordagens possíveis são o ***enveloping***(XAdES, CAdES) e ***enveloped*** (XAdES, PAdES) signatures, as quais procuram combinar a própria assinatura com os dados assinados, ou então guardar a assinatura num local separado do ficheiro (***detached***), arranjando um meio externo de associar a assinatura com os próprios dados assinados.

Ora, as ***detached signatures***, apesar das suas vantagens, de entre as quais se destaca a não modificação dos objetos assinados, torna-se fácil, por vezes, perder essa associação, ````assinatura <-> signed data````.

A melhor forma de resolver este problema, passa por estabelecer uma forma de definir um container que armazena não só os próprios dados assinados juntamente com a sua respetiva assinaturas, mas também a associação entre ambos.

Os ASiC surgem precisamente neste contexto. São nada mais de um tipo de containers normalizado, de modo a associar ficheiros de dados com os respetivos ficheiros de assinaturas digitiais/time-assertions.

## IV - Estrutura e info básica

Um ***ASiC*** (*advanced signature container*) é um *container* de **dados** que armazena ficheiros e assinaturas e/ou ***time-stamps*** associados sob o formato **ZIP**.

Um ASiC possui a seguinte estrutura:

 * ***root folder*** :  armazena todo o conteúdo do próprio container
 * ***META-INF** folder* : armazena ficheiros com **metadados** relativos ao **conteúdo** do próprio container, incluindo **assinaturas** e/ou ***time-assertions***

A assinatura ou *time-stamp* de um container encontram-se armazenados em ficheiros específicos para o efeito.

Um ficheiro de assinatura poderá conter :
* Uma instância de assinatura **CAdES** ***detached***
* Uma ou mais instâncias de assinaturas **XAdES**

## *Associated Signature Containers Simple* (ASiC-S)

Associa um único **ficheiro** a:

* um ficheiro de assinatura, contendo uma ou mais **assinaturas digitais** *detached* que se lhe aplicam, o qual poderá conter :
  * uma instância de assinatura **CAdES *detached***, contendo uma ou mais assinaturas de forma paralela (ver especificação do tipo *SignedData* definido no CAdES). Cada uma das assinaturas pode ser individualmente ***counter-signed***
  * uma ou mais assinaturas **XAdES**, em que, do mesmo modo, cada uma delas pode ser ***counter-signed***.
* um ficheiro de *time-assertion*, contendo um ***time-assertion*** que se lhe aplica, o qual poderá ser constituido por:
  * um ***time-stamp token*** de acordo com o IETF RFC 3161
  * um ***Evidence Record***

Existem definidos 3 tipos de *container* **ASiC-S**:
* **ASiC-S** com **XAdES**, onde o **ficheiro de dados** se encontra associado com uma assinatura no formato **XAdES**
* **ASiC-S** com **CAdES**, onde o **ficheiro de dados** se encontra associado com uma assinatura no formato **CAdES**
* **ASiC-S** com ***time assertions***, onde o **ficheiro de dados** se encontra associado a um **momento temporal**

O **ficheiro de dados** poderá ser ele próprio, um ***container***, por exemplo **ZIP**, **OCF**, **ODF** ou então um **ASiC**. No caso de ser um ZIP, o campo "file comment" poderá ser usado para especificar o tipo de media de cada ficheiro presente no ZIP com o valor **mimetype=** seguido do seu tipo.

### Fomato de um ASiC-S

* *"**Mimetype**" file (optional)*
  * Deverá ser guardado na ***root folder***
* **1 *Data file***
  * Deverá ser guardado na ***root folder***
* ***META-INF*** *folder*
  * Deverá conter um dos seguintes ficheiros:
    * "***timestamp.tst***: ***time-stamp*** *token* definido em **IETF RFC 3163**, atualizado pelo **IETFC 5816** aplicado ao **data file**
    * "***signature.p7s***": contendo um objeto **CAdES** incorporando uma ou mais *detached* **CAdES *signatures*** aplicadas ao **data file**
    * "***signatures.xml***": contendo uma sequencia de **XAdES *detached signatures***, tal como especificado em **A.5.2** do **ETSI 319 162-1 V1.1.1**.
* "***evidencerecord.ers***": ficheiro que contém um ***evidence record*** de acordo com o formato **ERS** (IETF RFC 4998: "Evidence Record Syntax (ERS)")
* "***evidencerecord.xml***: ficheiro que contém um ***evidence record*** de acordo com o formato **XMLERS** (IETF RFC 6283: "Extensible Markup Language Evidence Record Syntax (XMLERS)".)

Para alem disso, a pasta META-INF poderá conter os seguintes ficheiros adicionais:

* Um ou mais ficheiros ASiCArchiveManifest, assim como os time-stamp tokens que se lhes aplicam
* Informações relacionadas com o estado de revogação ou certificados referenciados pelas CAdES e XAdES extended signatures
* Outras informações específicas de aplicação

#### *Media-type identification*

No caso de o *mimetype* estar presente, o *media type* (o conteúdo do próprio ficheiro) deverá ser:
1. "**application/vnd.etsi.asic-s+zip**" se
     * a extensão do *container* é "**.zip**" (o que significa que o conteúdo do container será manuseado de forma não automatizada)
     * nenhum tipo de media específica estiver associada ao ficheiro a ser assinado.
2. O *media type* associado ao próprio ficheiro nos outros casos


#### *File extension*

A extensão do container deverá ser:

* "**.asics**" no caso de nenhuma das clausulas seguintes se verificar
* "**.scs**" no caso de o **sistema operativo**/***file system*** não permitir **extensões** de ficheiros com mais que **3 caracteres**
* "**.zip**" no caso de o conteúdo do *container* estar destinado a ser manuseado de forma "**manual**"

### ASiC-S *long term availability and integrity*

1. Para **ASiC-S** com **XAdES** ou com **CAdES**, devem ser usados os atributos específicos de cada formato para garantir disponibilidade e integridade a longo prazo. Devem aplicar-se a todas as assinaturas presentes no container
2. Para **ASiC-S** com *time-stamp token*, um ou mais ficheiros ***ASiCArchiveManifest***, assim como um *time-stamp token* aplicado ao conteúdo de cada um desses ficheiros deverão ser adicionados.
3. Para **ASiC-S** com **ER**, o mecanismo interno especificado em **IETF RFC 4998** e **IETF RFC 6283** deverão ser utilizados.

## Associated Signature Container Extended (ASiC-E)

A diferença para os **ASiC-S** reside no facto de que, ao invés de relacionarem um único **ficheiro de dados** a um único **ficheiro de assinatura**/***time-stamp***/***evidencerecord***, os **ASiC-E** suportam **um ou mais** ficheiros de **assinatura**/***time-assertion***, cada um deles aplicável ao seu próprio conjunto de um ou mais ficheiros de dados.

Cada ficheiro poderá ainda ter associada informação e **metadados adicionais** que poderão ser também protegidos por uma das assinaturas presentes no container.

Existem definidos 2 tipos de **ASiC-E** containers:

1. **ASiC-E** com **XAdES**: os ficheiros de dados são associados com ficheiros de assinaturas, cada um deles contendo uma ou mais assinaturas **XAdES**. O container poderá também conter um ou mais ficheiros ERS
2. **ASiC-E** com **CAdES** - *time assertions*: os ficheiros de dados são associados com os ficheiros de assinatura, cada um deles contendo um objeto **CAdES**, ou então com ficheiros de assertion, cada um contendo um *time-assertion*

### Formato de ASiC-E com XAdES

A extensão do container deverá ser

1. ".asice"
2. ".sce" no caso de o sistema operativo/*file systems* não permitirem extensões de ficheiro com comprimento superior a 3 caracteres

O *mimetype* file content deverá ser:
* "***application/vnd.etsi.asic-e+zip***" para identificar um ASiC-E container no caso de o conteudo a assinar no ter um media type específico
* O media type original do conteúdo

O ".ZIP file comment" poderá estar presente e poderá ter o valor "mimetype=application/vnd.etsi.asic-e+zip".

#### Conteúdo de um ASiC-E

1. O ficheiro "***mimetype***" poderá estar presente
2. Um ou mais "\*signatures\.xml*" deverão estar presentes na *folder* META-INF, cada um deles contendo uma ou mais assinaturas XAdES (baseline or extended), onde os ficheiros assinados por cada uma das assinaturas deverão ser especificados de forma direta, pela própria assinatura, com o conjunto de elementos ````ds:Reference````, ou indiretamente, usando um objeto ````ds:Manifest```` apontado por um ````ds:Reference````.
3. Um ou mais ficheiros ASiCEvidenceRecordManifest, onde cada um deles deverá conter um elemento ````ASiCManifest````.
4. Outros ficheiros específicos de aplicações, tais como:
    * "***container.xml***"
    * "***manifest.xml***"