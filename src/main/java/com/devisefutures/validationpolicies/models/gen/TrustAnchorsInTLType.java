//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.22 at 07:53:47 PM BST 
//


package com.devisefutures.validationpolicies.models.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrustAnchorsInTLType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrustAnchorsInTLType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TLReference" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="ServiceTypes" type="{http://uri.etsi.org/02231/v2#}NonEmptyURIListType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceStatuses" type="{http://uri.etsi.org/02231/v2#}NonEmptyURIListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="reliableUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrustAnchorsInTLType", propOrder = {
    "tlReference",
    "serviceTypes",
    "serviceStatuses"
})
public class TrustAnchorsInTLType {

    @XmlElement(name = "TLReference", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String tlReference;
    @XmlElement(name = "ServiceTypes")
    protected NonEmptyURIListType serviceTypes;
    @XmlElement(name = "ServiceStatuses")
    protected NonEmptyURIListType serviceStatuses;
    @XmlAttribute(name = "reliableUntil")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reliableUntil;

    /**
     * Gets the value of the tlReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLReference() {
        return tlReference;
    }

    /**
     * Sets the value of the tlReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLReference(String value) {
        this.tlReference = value;
    }

    /**
     * Gets the value of the serviceTypes property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyURIListType }
     *     
     */
    public NonEmptyURIListType getServiceTypes() {
        return serviceTypes;
    }

    /**
     * Sets the value of the serviceTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyURIListType }
     *     
     */
    public void setServiceTypes(NonEmptyURIListType value) {
        this.serviceTypes = value;
    }

    /**
     * Gets the value of the serviceStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyURIListType }
     *     
     */
    public NonEmptyURIListType getServiceStatuses() {
        return serviceStatuses;
    }

    /**
     * Sets the value of the serviceStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyURIListType }
     *     
     */
    public void setServiceStatuses(NonEmptyURIListType value) {
        this.serviceStatuses = value;
    }

    /**
     * Gets the value of the reliableUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReliableUntil() {
        return reliableUntil;
    }

    /**
     * Sets the value of the reliableUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReliableUntil(XMLGregorianCalendar value) {
        this.reliableUntil = value;
    }

}
