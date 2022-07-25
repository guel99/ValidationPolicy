//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.25 at 06:33:30 PM BST 
//


package com.devisefutures.validationpolicies.models.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Group of checks related to Trusted Lists
 * 
 * <p>Java class for eIDAS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eIDAS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TLFreshness" type="{http://dss.esig.europa.eu/validation/policy}TimeConstraint" minOccurs="0"/&gt;
 *         &lt;element name="TLNotExpired" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="TLWellSigned" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="TLVersion" type="{http://dss.esig.europa.eu/validation/policy}ValueConstraint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eIDAS", namespace = "http://dss.esig.europa.eu/validation/policy", propOrder = {
    "tlFreshness",
    "tlNotExpired",
    "tlWellSigned",
    "tlVersion"
})
public class EIDAS {

    @XmlElement(name = "TLFreshness")
    protected TimeConstraint tlFreshness;
    @XmlElement(name = "TLNotExpired")
    protected LevelConstraint tlNotExpired;
    @XmlElement(name = "TLWellSigned")
    protected LevelConstraint tlWellSigned;
    @XmlElement(name = "TLVersion")
    protected ValueConstraint tlVersion;

    /**
     * Gets the value of the tlFreshness property.
     * 
     * @return
     *     possible object is
     *     {@link TimeConstraint }
     *     
     */
    public TimeConstraint getTLFreshness() {
        return tlFreshness;
    }

    /**
     * Sets the value of the tlFreshness property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeConstraint }
     *     
     */
    public void setTLFreshness(TimeConstraint value) {
        this.tlFreshness = value;
    }

    /**
     * Gets the value of the tlNotExpired property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getTLNotExpired() {
        return tlNotExpired;
    }

    /**
     * Sets the value of the tlNotExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setTLNotExpired(LevelConstraint value) {
        this.tlNotExpired = value;
    }

    /**
     * Gets the value of the tlWellSigned property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getTLWellSigned() {
        return tlWellSigned;
    }

    /**
     * Sets the value of the tlWellSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setTLWellSigned(LevelConstraint value) {
        this.tlWellSigned = value;
    }

    /**
     * Gets the value of the tlVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ValueConstraint }
     *     
     */
    public ValueConstraint getTLVersion() {
        return tlVersion;
    }

    /**
     * Sets the value of the tlVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueConstraint }
     *     
     */
    public void setTLVersion(ValueConstraint value) {
        this.tlVersion = value;
    }

}