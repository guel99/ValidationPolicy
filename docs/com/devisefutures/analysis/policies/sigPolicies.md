---
title: "Signature Policies"
author: "Miguel Oliveira"
date: "2022"
---

# Signature Policies

## I. Introdução

Este documento aborda as políticas de assinatura, de forma especialmente voltada para as **políticas de validação**, as quais são definidas pelo **ETSI**, e foi concebido com base na análise da seguinte bibliografia:
- __ETSI TS 119 172-1 V1.1.1__ - Electronic Signatures and Infrastructures (ESI);
Signature Policies; Part 1: Building blocks and table of contents for human readable signature policy documents

## II. Índice

- [Signature Policies](#signature-policies)
  - [I. Introdução](#i-introdução)
  - [II. Índice](#ii-índice)
  - [III. Políticas de assinatura](#iii-políticas-de-assinatura)
  - [IV. Documentos *human-friendly* de políticas de assinatura](#iv-documentos-human-friendly-de-políticas-de-assinatura)

## III. Políticas de assinatura

Uma **política de assinatura** deve ser o resultado da análise dos requisitos aplicáveis, para a implementação de **assinatura digitais**, no contexto de um processo eletrónico de negócio ou domínio de aplicação específicos.

Trata-se, nada mais nada menos, que um conjunto de **regras** relacionadas com os processos de **criação**, **validação** ou ***augmentation*** de assinaturas eletrónicas aplicáveis em simultâneo.

Uma **política de assinatura** deverá, pelo menos, estar inserida numa das três seguintes sub categorias:

* Política de **criação de assinatura**
* Política de ***augmentation* de assinatura**
* Política de **validação de assinatura**

## IV. Documentos *human-friendly* de políticas de assinatura

O documento **ETSI TS 119 172-1 V1.1.1**, fornece uma lista de tópicos que deve ser seguida de modo a construir o respetivo documento (**Anexo A**). 

Essa secção do documento possui a estrutura exatamente igual daquela que terá um documento de política de assinatura, removendo apenas a **letra A** a cada uma das clausulas.

Quando aplicável, as **sub-clausulas** do documento devem identificar, de forma separada, cada política de assinatura presente, e para cada uma destas deverá separar os diferentes processos mencionados (**criação**, ***augmentation*** e **validação**).

O **ETSI TS 119 172-1 V1.1.1** define os *building blocks* de um documento de **política de assinatura** legível por pessoas. Esses *building blocks* são de duas tipologias distintas:
* Definem regras de **aplicabilidade**, tratando-se de restrições procedimentais forçadas pelos processos de negócio onde as assinaturas são usadas. Quando essas restrições não são satisfeitas, podem impedir a continuação do processamento de um certo documento, ainda que a assinatura digital esteja tecnicamente válida.
* Definem condições técnicas, relacionadas com aspetos técnicos da assinatura digital, assim como da sua **validação técnica** (formato da assinatura, atributos da assinatura, restrições aos certificados, *time-stamp tokens*, dados do *revocation material*, entre outros).

Para um ententimento mais aprofundado deste tópico recomenda-se a análise do **ETSI TS 119 172-1 V1.1.1**.

Quando abandonamos o paradigma de ***human readable policy documents***, e passamos para o ***machine readable***, deixamos de parte a parte da política mais orientada para as regras inerentes ao **modelo de negócio**, focando naquilo em que a máquina pretende fazer que é nada mais nada menos que **criar** e **validar** assinaturas, ou seja, nas **condições mais técnicas**.

Existem 2 sintaxes distintas para o fazer, definidas pelo **ETSI**:
* XML (**ETSI TS 119 172-2 V1.1.1**)
* ASN.1 (**ETSI TS 119 172-3 V1.1.1**)

Apesar de se tratarem de 2 notações bastante distintas, o modo como se constroi a polítca nestas duas linguagens é bastante semelhante, tendo em conta que o nome dos atributos coincidem nas 2 alternativas.