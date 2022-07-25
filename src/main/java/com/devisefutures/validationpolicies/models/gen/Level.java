//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.25 at 06:33:30 PM BST 
//


package com.devisefutures.validationpolicies.models.gen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for level.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="level"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="WARN"/&gt;
 *     &lt;enumeration value="INFORM"/&gt;
 *     &lt;enumeration value="IGNORE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "level", namespace = "http://dss.esig.europa.eu/validation/policy")
@XmlEnum
public enum Level {


    /**
     * Stops the validation process and reports as error
     * 
     */
    FAIL,

    /**
     * Continues the validation process and adds a warning message
     * 
     */
    WARN,

    /**
     * Continues the validation process and adds an informative message
     * 
     */
    INFORM,

    /**
     * Continues the validation process and skips the current check (equals to not present check)
     * 
     */
    IGNORE;

    public String value() {
        return name();
    }

    public static Level fromValue(String v) {
        return valueOf(v);
    }

}
