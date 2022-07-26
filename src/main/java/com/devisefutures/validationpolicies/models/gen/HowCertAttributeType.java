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
 * <p>Java class for HowCertAttributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HowCertAttributeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ClaimedAttribute"/&gt;
 *     &lt;enumeration value="CertifiedAttribute"/&gt;
 *     &lt;enumeration value="SignedAssertion"/&gt;
 *     &lt;enumeration value="Any"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HowCertAttributeType")
@XmlEnum
public enum HowCertAttributeType {

    @XmlEnumValue("ClaimedAttribute")
    CLAIMED_ATTRIBUTE("ClaimedAttribute"),
    @XmlEnumValue("CertifiedAttribute")
    CERTIFIED_ATTRIBUTE("CertifiedAttribute"),
    @XmlEnumValue("SignedAssertion")
    SIGNED_ASSERTION("SignedAssertion"),
    @XmlEnumValue("Any")
    ANY("Any");
    private final String value;

    HowCertAttributeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HowCertAttributeType fromValue(String v) {
        for (HowCertAttributeType c: HowCertAttributeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
