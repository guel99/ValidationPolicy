# NEXT TODO's in thesis


## Legend

 * X. *task* [EXPECTED DURATION] - epic task
 * > *task* - one single day task

## Table of contents

1. Selecionar quais das restrições de validação possíveis para uma política de validação DSS fazem sentido poder serem editáveis pelo utilizador. E implementar o servico web REST

   > Terminar análise das TimeStampConstraints; Compreender o que é o ***best-signature-time*** no contexto da validação de assinaturas com tempo (AdES-B-T)

   > Analisar as RevocationConstrains e as CryptographicConstraints

   > Analisar as ModelConstraints e as eIDAS

   > Analisar os sub-elementos das constraints de mais alto nível

   * Utils: DSS Validation Policies (**sec. 7.2**): https://ec.europa.eu/digital-building-blocks/DSS/webapp-demo/doc/dss-documentation.html#SignatureValidation


2. Implementar *mapping* de um objeto da classe ***SignaturePolicyType*** (*eIDAS signature policy schema*) para ***ConstraintsParameters*** (*DSS validation policy schema*)

    > Breve análise às implementações de AdES em falta: **XAdES**, **JAdES** e **PAdES**

    > Perceber como construir ***ContainerConstraints*** a partir de uma ***SignaturePolicyType*** e começar a implementação

    > Realizar o mesmo para todos os *sub-elements* da classe ***ContainerConstraints*** (*1 per day*)

 
3. Study and document all about PROTOCOLS to start developping the validation web service