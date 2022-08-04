---
title: "eIDAS Validation Service DOC"
author: "Miguel Oliveira"
date: "2022"
---

# eIDAS validation Service

## I - Introdução

Este documento especifica as questões mais básicas do projeto a levar a cabo, tais como as suas **componentes**, a sua **arquitetura**, ***use-cases*** fornecendo explicações bastantes claras sobre cada pormenor da **app de validação eIDAS**.

## II - Índice

- [eIDAS validation Service](#eidas-validation-service)
  - [I - Introdução](#i---introdução)
  - [II - Índice](#ii---índice)
  - [III - *Use-cases*](#iii---use-cases)
  - [III - Arquitetura](#iii---arquitetura)
  - [IV - Componentes](#iv---componentes)
  - [V - Geração de políticas de assinatura](#v---geração-de-políticas-de-assinatura)
    - [1. Alterações realizadas ao *schema* definido pelo ETSI](#1-alterações-realizadas-ao-schema-definido-pelo-etsi)
    - [2. Estudo dos objectos java gerados](#2-estudo-dos-objectos-java-gerados)
    - [3. (*Temporary secction*) Trabalho futuro](#3-temporary-secction-trabalho-futuro)

## III - *Use-cases*

1. **Validar** assinatura/selo eletrónico
    * A partir de um ***signed file***
    * 
2. Criar política de validação de acordo com os standards ETSI
    * Interface web que permita injetar os dados para geração da política
    * Geração de fichero XML com a política ???
3. Selecionar **política** **específica** a ser usada em **1.**
    * Ter uma política *default* no caso de nenhuma ser carregada
    * *Upload* de ficheiro .xml com política a ser aplicada (possívelmente gerada tendo por base o **ponto 2**)

## III - Arquitetura

Imagem..........

## IV - Componentes

## V - Geração de políticas de assinatura

Uma das iniciativas inerentes à dissertação foi a geração de políticas de validação de assinatura. A geração estaria associada à criação de um ficheiro em formato XML de acordo com o *schema* definido no seguinte link.

> https://forge.etsi.org/rep/esi/x19_17202_XML_sign-policies/raw/v1.1.1/19172xmlSchema.xsd

Para a geração de um ficheiro xml a partir do schema anterior, seria necessário desenvolver código para tal. Dada a complexidade do tipo de dados definido no *schema*, tal tarefa seria bastante ineficiente, tendo até disponíveis no mercado, ferramentas com este mesmo propósito. Para o efeito, foi usado o [***jaxb2-maven-plugin***](https://www.mojohaus.org/jaxb2-maven-plugin/Documentation/v2.4/index.html), que permite, a partir de um *xml schema* (.xsd), gerar as classes **java** correspondentes, de forma a converter um **objeto java** num ***xml*** correspondente.

Deste modo, será (em teoria) possível gerar uma política de validação.

### 1. Alterações realizadas ao *schema* definido pelo ETSI

De facto, aquando da primeira vez que tal estratégia foi aplicada, tal não correu bem, uma vez que haviam dados definidos no *schema* da ETSI que já estavam definidos num dos *schemas* importados, como é o caso do tipo ***AnyType*** e do elemento ***PostalAdresses***, ambos já definidos no seguinte schema 

> schema: https://uri.etsi.org/02231/v3.1.2/ts_102231v030102_xsd.xsd; namespace: http://uri.etsi.org/02231/v2# (tsl)

### 2. Estudo dos objectos java gerados

Após a geração dos objetos, chegava a altura de colocar "mãos à obra" e começar a trilhar caminho para a geração de políticas de validação.

O Trabalho começou pela análise do elemento ***Digest*** definido de seguida:

````
    <xs:element name="Digest" type="DigestDetailsType"/> 
    <xs:complexType name="DigestDetailsType"> 
        <xs:sequence> 
            <xs:element ref="ds:DigestMethod" /> 
            <xs:element ref="ds:DigestValue" /> 
            <xs:element ref="ds:CanonicalizationMethod" /> 
        </xs:sequence> 
    </xs:complexType>
````

* O *digest method* apenas guarda um **uri** do algorítmo de *hashing* usado. Esse *mapping* entre algoritmo e uri pode ser revisto em https://www.w3.org/TR/xmlsec-algorithms/#digest-method-uris.

* O ***digestValue*** não é mais do que o valor computado a partir do output proveniente da aplicação do canonicalizatio method aplicado às ***policyComponents***.

* O ***canonicalizationMethod***, tal como o nome indica serve para **normalizar** o conteúdo *xml*, antes de ser calculado o *digest*. Para um melhor entendimento analisar [aqui]{https://www.w3.org/TR/xml-exc-c14n/#sec-Applications}.

### 3. (*Temporary secction*) Trabalho futuro

* Estudar melhor para gerar uma política (em curso)
    * já consegui realizar marshal de um digestMethod (com alguma trafulhice)
    * Tentar criar classe DigestMethod com a anotation ***@XmlRootElement*** para tentar realizar o marshal e unmarshal corretamente
* Estudar melhor que tipo de atributos faz sentido serem editáveis pelos utilizadores que pretender criar uma política de validação
* Procurar validar um documento com política gerada