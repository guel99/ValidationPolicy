---
title: "Validation Policies Implementation"
author: "Miguel Oliveira"
date: "2022"
---

# Validation Policies Implementation

## 1. Introdução

Este documento visa os protocolos que serão usados no serviço de validação eIDAS, de entre os quais fazem parte o ***request*** e ***response***. Foi optada a implementação **JSON**, pelo facto de ser uma sintaxe bastante mais simples e menos verbosa quando comparada com o ***XML***.

Este documento foi construido tendo por base o standard **ETSI TS 119 442**.

## 2. Índice

- [Validation Policies Implementation](#validation-policies-implementation)
  - [1. Introdução](#1-introdução)
  - [2. Índice](#2-índice)
  - [3. ***Request***](#3-request)
    - [3.1 Componente para submeter a assinatura](#31-componente-para-submeter-a-assinatura)
    - [3.2 Componente para submeter os documentos/representação](#32-componente-para-submeter-os-documentosrepresentação)

## 3. ***Request***

Permite realizar pedidos de validação, sendo capaz de lidar com as seguintes situações:

* Submeter a assinatura a ser validada ou então uma referência para a mesma quando a assinatura é *envelopped* num *signed document*
* Submeter o *signed document* ou uma representação do mesmo

Para além do mais, a mensagem poderá conter: 
* um ***identifier* único**.
* um identificador único para a política a ser usada pelo processo de validação

De seguida encontra-se representada essa mensagem

````
"VerifyRequestType": { 
    "type": "object", 
    "properties": { 
        "profile": { 
            "type": "array", 
            "items": { 
                "type": "string" 
            } 
        }, 
        "reqID": { 
            "type": "string" 
        }, 
        "inDocs": { 
            "$ref": "#/definitions/InputDocumentsType" 
        }, 
        "optInp": { 
            "$ref": "#/definitions/OptionalInputsVerifyType" 
        }, 
        "sigObj": { 
            "$ref": "http://docs.oasis-open.org/dss-x/dss-core/v2.0/csprd01/schema/schema.json#definitions/dss2-SignatureObjectType" 
        } 
    } 
} 
````

### 3.1 Componente para submeter a assinatura

A assinatura poderá ser incluida em componentes distintas:
* Se a assinatura é uma AdES embutida (*embedded*), o documento que engloba a assinatura, juntamente com a mesma serão armazenados
  * numa sub-componente do ***input document container*** (sendo que a componente ***signature object container*** deverá conter uma referência para a *embedded signature*)
* Se a assinatura é uma AdES não embutida no documento, ela deverá constar da componente ***signature object container***
* Se estamos perante uma AdES embutida e, ao invés do documento, é submetido um *digest* do documento, a assinatura deverá ser submetida na componente ***signature object container***

### 3.2 Componente para submeter os documentos/representação

Tal como acontece no caso da assinatura, o ***signed document*** pode ser contido em diferentes componentes, dependendo da posição relativa da assinatura correspondente:
* Se uma assinatura **não embutida** **engloba** (*envelops*) o documento assinado, a ***enveloping signature***, juntamente com o ***enveloped signed document***, na componente ***signature object container***
* Se a assinatura não se enquandra no que está descrito em **1)**, o documento assinado deverá ser submetido diretamente na componente ***input document container*** (ou então num anexo de um protocolo subjacente. Neste caso, deverá constar numa sub-componente do *input document container*, uma referência para o anexo onde o documento se encontra)

Para além do que foi descrito até ao momento relativo à submissão dos ***signed documents***, o protocolo permite também submeter para o servidor uma **representação** do documento assinado, no lugar do próprio documento. Dependendo do tipo da representação do documento, ela pode ser submetida:
* na sub-componente ***document digest container***, no caso dessa representação se tratar de um ***digest*** calculado a partir do próprio documento
* na sub-componente ***transformed document container***, no caso da representação se tratar de uma transformação do documento assinado.