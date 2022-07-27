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
  - [III - Estrutura e info básica](#iii---estrutura-e-info-básica)
  - [Tipos de containers](#tipos-de-containers)
    - [ASiC-S - *Associated Signature Containers Simple*](#asic-s---associated-signature-containers-simple)

## III - Estrutura e info básica

Um ***ASiC*** (*advanced signature container*) é um *container* de **dados** que armazena ficheiros e assinaturas e/ou ***time-stamps*** associados sob o formato **ZIP**.

Um ASiC possui a seguinte estrutura:

 * ***root folder*** :  armazena todo o conteúdo do próprio container
 * ***META-INF** folder* : armazena ficheiros com **metadados** relativos ao **conteúdo** do próprio container, incluindo **assinaturas** e/ou ***time-assertions***

A assinatura ou *time-stamp* de um container encontram-se armazenados em ficheiros específicos para o efeito.

Um ficheiro de assinatura poderá conter :
* Uma instância de assinatura **CAdES** ***detached***
* Uma ou mais instâncias de assinaturas **XAdES**

## Tipos de containers

### ASiC-S - *Associated Signature Containers Simple*

Associa um único **ficheiro** a:

* um ficheiro de assinatura, contendo uma ou mais **assinaturas digitais** *detached* que se lhe aplicam, o qual poderá conter :
  * uma instância de assinatura **CAdES *detached***, contendo uma ou mais assinaturas de forma paralela (ver especificação do tipo *SignedData* definido no CAdES). Cada uma das assinaturas pode ser individualmente ***counter-signed***
  * uma ou mais assinaturas **XAdES**, em que, do mesmo modo, cada uma delas pode ser ***counter-signed***.
* um ficheiro de *time-assertion*, contendo um ***time-assertion*** que se lhe aplica, o qual poderá ser constituido por:
  * um ***time-stamp token*** de acordo com o IETF RFC 3161
  * um ***Evidence Record***