---
title: "CAdES digital signatures"
author: "Miguel Oliveira"
date: "2022"
---

# CAdES digital signatures

## I - Introdução

Este documento aborda uma das implementações de AdES, definidas pelo **ETSI**, a **CAdES** e foi concebido com base na análise da seguinte bibliografia:
- __ETSI EN 319 122-1 V1.2.1__ - Electronic Signatures and Infrastructures (ESI);
CAdES digital signatures; 
Part 1: Building blocks and CAdES baseline signatures
- __IETF RFC 5652__ - Cryptographic Message Syntax (CMS)

Numa primeira instância serão explorados os ***building blocks*** utilizados para a construção de assinaturas desta tipologia, seguindo 
para a abordagem às ***CAdES baseline signatures***, terminando com as ***Extended CAdES signatures***.

## II - Índice


- [CAdES digital signatures](#cades-digital-signatures)
  - [I - Introdução](#i---introdução)
  - [II - Índice](#ii---índice)
  - [III - Building Blocks](#iii---building-blocks)
    - [1. Sintaxe geral](#1-sintaxe-geral)
      - [1.1. Data *content type*](#11-data-content-type)
      - [1.2. Signed-data *content type*](#12-signed-data-content-type)
        - [1.2.1. **SignedData Type**](#121-signeddata-type)
      - [1.3. Time-stamp *token format*](#13-time-stamp-token-format)
      - [1.4. Tipos Adicionais](#14-tipos-adicionais)
    - [2. Atributos - sintaxe e significado](#2-atributos---sintaxe-e-significado)
      - [2.1. Atributo *content-type*](#21-atributo-content-type)
      - [2.2. Atributo *message-digest*](#22-atributo-message-digest)
      - [2.3. Atributo *signing-time*](#23-atributo-signing-time)
      - [2.4. Atributos que referenciam os certificados de assinatura](#24-atributos-que-referenciam-os-certificados-de-assinatura)
        - [2.4.1. Atributo *signing-certificate* (*ESS*)](#241-atributo-signing-certificate-ess)
        - [2.4.2. Atributo *signing-certificate-v2* (*ESS*)](#242-atributo-signing-certificate-v2-ess)
      - [2.5. Atributo *commitment-type-indication*](#25-atributo-commitment-type-indication)
      - [2.6 Atributo *content-hints*](#26-atributo-content-hints)
      - [2.7 Atributo *mime-type*](#27-atributo-mime-type)
      - [2.8 Atributo *signer-location*](#28-atributo-signer-location)
    - [3. CAdES baseline signatures](#3-cades-baseline-signatures)

## III - Building Blocks

As ***CAdES signatures*** têm por base o **Cryptographic Message Syntax (CMS)**, o qual se encontra definido no **IETF RFC 5652**, com a 
incorporação adicional de alguns **atributos assinados** e outros **não assinados**.

### 1. Sintaxe geral
#### 1.1. Data *content type*

Tipo que abrange toda e qualquer *octet string* arbitrária, tal como por exemplo, **texto ASCII**. A interpretação para um objecto do tipo fica à 
responsabilidade da aplicação.

O *object identifier* seguinte identifica o tipo de conteúdo ***data***.

````markdown
id-data OBJECT IDENTIFIER ::= { iso(1) member-body(2)
         us(840) rsadsi(113549) pkcs(1) pkcs7(7) 1 }
````
         
Este *content type* é muitas das vezes encapsulado em outros *content-types*, nomeadamente:
- __signed-data__
- __enveloped-data__
- __digested-data__ ...


#### 1.2. Signed-data *content type*

Tipo que é formado por um conteúdo de qualquer tipo, acompanhado (ou não) de uma ou mais **assinaturas**. Um exemplo de uma aplicação 
prática de tal tipo poderá ser uma **assinatura digital** realizada por um *signer* num qualquer **conteúdo** do tipo ***data*** (mencionado anteriormente).
O típico processo pelo qual ***signed-data's*** são construidos é o seguinte:

1. Para cada *signer*, é calculado um *hash* sobre o conteúdo, aplicando um algorítmo de cálculo de hashes específico para cada *signer*. Se o *signer* 
pretende assinar algo para além do **conteúdo**, o *digest* é calculado, não só a partir do conteúdo a ser assinados, mas também desses **dados adicionais**, 
que para o caso das **CAdES**, serão eventuais ***signed atributes*** introduzidos pelo próprio *signer* aquando da criação da assinatura. A esse conjunto de 
dados é aplicado o mesmo algorítmo para a geração de *hashes*. O resultado torna-se, deste modo, o ***message digest***.

2. Para cada um dos *signers*, o *message digest* resultante é assinado com a **chave privada** do *signer*.
3. Para cada um dos *signers*, o **valor de assinatura**, assim como outras informações específicas do próprio *signer* são colocadas num objecto **SignerInfo**
4. Os **algorítmos** utilizados para a **geração dos *digests***, assim como os ***SignerInfos*** de cada *signer* são colocados, juntamente com o **conteúdo assinado**, num ***SignedData object***.

O *object identifier* que se segue identifica o *signer-data content type*:

````markdown
id-signedData OBJECT IDENTIFIER ::= { iso(1) member-body(2)
         us(840) rsadsi(113549) pkcs(1) pkcs7(7) 2 }
````

##### 1.2.1. **SignedData Type**


O *content-type* ***signed-data*** deverá ser do tipo **ASN.1** ***SignedData***:

````markdown
SignedData ::= SEQUENCE {
    version CMSVersion,
    digestAlgorithms DigestAlgorithmIdentifiers,
    encapContentInfo EncapsulatedContentInfo,
    certificates [0] IMPLICIT CertificateSet OPTIONAL,
    crls [1] IMPLICIT RevocationInfoChoices OPTIONAL,
    signerInfos SignerInfos }

DigestAlgorithmIdentifiers ::= SET OF DigestAlgorithmIdentifier

SignerInfos ::= SET OF SignerInfo
````

* ***version*** - número da versão da sintaxe
* ***digestAlgorithms*** - conjunto de **identificadores dos algorítmos de *hashing***. Trata-se de uma lista dos algorítmos de geração de *hashes* utilizados pelos *signers*. Poderá existir um número qualquer nesse conjunto, ou até mesmo nenhum elemento. Cada um dos elementos identifica não só o algorítmo em si, mas também alguns parâmetros associados.
* ***encapContentInfo*** - representa o **conteúdo assinado**, formado pelo **identificador do tipo de conteúdo** e também pelo próprio **conteúdo** em si.
  ````markdown
  EncapsulatedContentInfo ::= SEQUENCE {
        eContentType ContentType,
        eContent [0] EXPLICIT OCTET STRING OPTIONAL }

  ContentType ::= OBJECT IDENTIFIER
  ````
* ***certificates*** - é esperado que este conjunto de certificados seja suficiente de modo que seja possível formar *trust-chains* partindo de uma ***root***, ou outra qualquer **autoridade de certificação de alto nível** pré-estabelecidas. 
  * Poderá até, eventualmente existir mais certificados do que aqueles necessários.
  * Por outro lado, poderão existir menos certificados do que os necessários, no entanto, em tal cenário, é esperado que exista um meio alternativo de obter os certificados em falta.
* ***crls*** - coleção de informações do **estado de revogação**. É esperado que a coleção mantenha informação suficiente para determinar se os certificados presentes no campo anterior são válidos. Poderão, mais uma vez, existir mais, ou menos, crls do que aquelas que de facto são necessárias.
* ***singerInfos*** - coleção de informações relativas a cada um dos ***signers***. Poderá existir um número qualquer de elementos. É nestes elementos que se encontra alojada a própria assinatura do conteúdo a assinar, assim como os ***signed*** e ***unsigned atributes***.
  ````markdown
  SignerInfo ::= SEQUENCE {
        version CMSVersion,
        sid SignerIdentifier,
        digestAlgorithm DigestAlgorithmIdentifier,
        signedAttrs [0] IMPLICIT SignedAttributes OPTIONAL,
        signatureAlgorithm SignatureAlgorithmIdentifier,
        signature SignatureValue,
        unsignedAttrs [1] IMPLICIT UnsignedAttributes OPTIONAL }

  ````

#### 1.3. Time-stamp *token format*

O seguinte ***object identifier*** identifica o atributo ***Time-stamp*** de uma assinatura, o qual corresponderá a um *unsigned attribute* de uma assinatura:

  ````markdown
  id-aa-timeStampToken OBJECT IDENTIFIER ::= { iso(1) member-body(2)
          us(840) rsadsi(113549) pkcs(1) pkcs-9(9) smime(16) aa(2) 14 }
  ````

Este atributo possui o tipo **ASN.1**, ***SignatureTimeStampToken***:

  ````markdown
  SignatureTimeStampToken ::= TimeStampToken

  TimeStampToken ::= EncapsulatedContentInfo
      -- contentType is id-signedData ([CMS])
      -- content is SignedData ([CMS])
  ````

  Para o caso de um *time-stamp token*, o campo ***eContentType*** é definido como:

  ````markdown
  id-ct-TSTInfo  OBJECT IDENTIFIER ::= { iso(1) member-body(2)
          us(840) rsadsi(113549) pkcs(1) pkcs-9(9) smime(16) ct(1) 4}
  ````

  ao passo que o campo ***eContent*** é o próprio conteúdo do *time-stamp token* sob a forma de uma *octet string*, respeitando o encoding **DER**. O ***time-stamp token*** não terá nenhuma assinatura para além da assinatura feita pela ***time-stamp authority***.

  #### 1.4. Tipos Adicionais

  Para além do mencionado até então, são também mencionados os seguintes tipos:

  - ***VisibleString***, ***BMPString***, ***IA5String***, ***GeneralizedTime*** e ***UTCTime*** - definidos em *Recommendation ITU-T X.680*
  - ***DirectoryString*** - definido em *Recommendation ITU-T X.520*
  - ***AttributeCertificate*** - definido em *IETF RFC 5755*, o qual é compatível com a definição presente em *Recommendation ITU-T X.509*
  - ***ResponderID***, ***OCSPResponse*** e ***BasicOCSPResponse*** - definidos em *IETF RFC 6960*
  - ***Name***, ***Certificate*** e ***AlgorithmIdentifier*** - definidos em *IETF RFC 5280*
  - ***Attribute*** - definido em *IETF RFC 5280*, o qual é compatível com a sintaxe *X.509 v2 CRL* presente em *Recommendation ITU-T X.509*
  - ***RevocationInfoChoices*** - definido em *IETF RFC 5652*

### 2. Atributos - sintaxe e significado

Nesta secção serão fornecidos detalhes acerca dos atributos que serão incorporados numa **CAdES**, onde estão incluidos aqueles especificados pelo **CMS** (IETF RFC 5652), pelo **ESS** (IETF RFC 2634 e IETF RFC 5035), e ainda outros desenhados especificamente para esse efeito.

Tal como é sabido, é-nos possível distinguir dois tipo de atributos: 
* **assinados** - elementos abrangidos pela assinatura, isto é, pelo valor de assinatura calculado a partir da chave privada do signatário. Isto implica que esses atributos sejam processados **pelo signatário** num momento anterior ao da criação da assinatura.
* **não assinados** - elementos adicionados **pelo signatário**, por **uma entidade verificadora** ou **outros terceiros** **após** a criação da assinatura.

Ora os atributos assinados e não assinados são guardados, respetivamente, nos campos ***signerAttrs*** e ***unsignedAttrs*** de uma instância de [***SignerInfo***](#121-signeddata-type).

#### 2.1. Atributo *content-type*

#### 2.2. Atributo *message-digest*

#### 2.3. Atributo *signing-time*

#### 2.4. Atributos que referenciam os certificados de assinatura

Os atributos mencionados neste ponto em específico contêm uma referência para o **certificado de assinatura**.

##### 2.4.1. Atributo *signing-certificate* (*ESS*)

##### 2.4.2. Atributo *signing-certificate-v2* (*ESS*)

#### 2.5. Atributo *commitment-type-indication*

#### 2.6 Atributo *content-hints*

#### 2.7 Atributo *mime-type*

#### 2.8 Atributo *signer-location*

### 3. CAdES baseline signatures

O *standard* **ETSI 319 122-1** define **4** níveis distintos de **CAdES *baseline signatures** de modo a facilitar :
  
  * **B-B level** - providencia requisitos para a incorporação de **atributos assinados** e **não assinados** numa assinatura já gerada
  * **B-T level** - providencia requisitos para a geração e inclusão, para uma assinatura existente, de um ***token* confiável**, provando que a assinatura existiu num certo momento
  * **B-LT level** - providencia requisitos para a incorporação de todo o material necessário para a validação da própria assinatura. Este nível permite alcançar a disponibilidade a longo prazo do material de validação.
  * **B-LTA level** - providencia requisitos para a incorporação de ***time-stamp tokens*** que permitem a validação da assinatura em momentos bastante posteriores aos da geração da mesma. Este nível permite alcançar a disponibilidade da assinatura a longo prazo, assim como a integridade do material de validação.