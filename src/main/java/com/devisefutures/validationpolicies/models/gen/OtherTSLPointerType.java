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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherTSLPointerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherTSLPointerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}ServiceDigitalIdentities" minOccurs="0"/&gt;
 *         &lt;element name="TSLLocation" type="{http://uri.etsi.org/02231/v2#}NonEmptyURIType"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}AdditionalInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherTSLPointerType", namespace = "http://uri.etsi.org/02231/v2#", propOrder = {
    "serviceDigitalIdentities",
    "tslLocation",
    "additionalInformation"
})
public class OtherTSLPointerType {

    @XmlElement(name = "ServiceDigitalIdentities")
    protected ServiceDigitalIdentityListType serviceDigitalIdentities;
    @XmlElement(name = "TSLLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String tslLocation;
    @XmlElement(name = "AdditionalInformation")
    protected AdditionalInformationType additionalInformation;

    /**
     * Gets the value of the serviceDigitalIdentities property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDigitalIdentityListType }
     *     
     */
    public ServiceDigitalIdentityListType getServiceDigitalIdentities() {
        return serviceDigitalIdentities;
    }

    /**
     * Sets the value of the serviceDigitalIdentities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDigitalIdentityListType }
     *     
     */
    public void setServiceDigitalIdentities(ServiceDigitalIdentityListType value) {
        this.serviceDigitalIdentities = value;
    }

    /**
     * Gets the value of the tslLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSLLocation() {
        return tslLocation;
    }

    /**
     * Sets the value of the tslLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSLLocation(String value) {
        this.tslLocation = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformationType }
     *     
     */
    public AdditionalInformationType getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformationType }
     *     
     */
    public void setAdditionalInformation(AdditionalInformationType value) {
        this.additionalInformation = value;
    }

}
