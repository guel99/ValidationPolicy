//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.25 at 06:33:30 PM BST 
//


package com.devisefutures.validationpolicies.models.gen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevocationReqType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RevocationReqType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="clrcheck"/&gt;
 *     &lt;enumeration value="ocspcheck"/&gt;
 *     &lt;enumeration value="bothcheck"/&gt;
 *     &lt;enumeration value="eithercheck"/&gt;
 *     &lt;enumeration value="nocheck"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RevocationReqType")
@XmlEnum
public enum RevocationReqType {

    @XmlEnumValue("clrcheck")
    CLRCHECK("clrcheck"),
    @XmlEnumValue("ocspcheck")
    OCSPCHECK("ocspcheck"),
    @XmlEnumValue("bothcheck")
    BOTHCHECK("bothcheck"),
    @XmlEnumValue("eithercheck")
    EITHERCHECK("eithercheck"),
    @XmlEnumValue("nocheck")
    NOCHECK("nocheck"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RevocationReqType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RevocationReqType fromValue(String v) {
        for (RevocationReqType c: RevocationReqType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
