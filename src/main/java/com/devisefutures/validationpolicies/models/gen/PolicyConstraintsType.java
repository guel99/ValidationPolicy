//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.25 at 06:33:30 PM BST 
//


package com.devisefutures.validationpolicies.models.gen;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyConstraintsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyConstraintsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequireExplicitPolicy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="InhibitExplicitPolicy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyConstraintsType", propOrder = {
    "requireExplicitPolicy",
    "inhibitExplicitPolicy"
})
public class PolicyConstraintsType {

    @XmlElement(name = "RequireExplicitPolicy")
    protected BigInteger requireExplicitPolicy;
    @XmlElement(name = "InhibitExplicitPolicy")
    protected BigInteger inhibitExplicitPolicy;

    /**
     * Gets the value of the requireExplicitPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequireExplicitPolicy() {
        return requireExplicitPolicy;
    }

    /**
     * Sets the value of the requireExplicitPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequireExplicitPolicy(BigInteger value) {
        this.requireExplicitPolicy = value;
    }

    /**
     * Gets the value of the inhibitExplicitPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInhibitExplicitPolicy() {
        return inhibitExplicitPolicy;
    }

    /**
     * Sets the value of the inhibitExplicitPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInhibitExplicitPolicy(BigInteger value) {
        this.inhibitExplicitPolicy = value;
    }

}
