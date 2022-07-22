//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.22 at 07:53:47 PM BST 
//


package com.devisefutures.validationpolicies.models.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OtherDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SigningPeriod" type="{http://uri.etsi.org/19172/v1.1.1#}TimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="Other" type="{http://uri.etsi.org/02231/v2#}AnyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherDetailsType", propOrder = {
    "dateOfIssue",
    "signingPeriod",
    "other"
})
public class OtherDetailsType {

    @XmlElement(name = "DateOfIssue", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfIssue;
    @XmlElement(name = "SigningPeriod")
    protected TimePeriodType signingPeriod;
    @XmlElement(name = "Other")
    protected List<AnyType> other;

    /**
     * Gets the value of the dateOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * Sets the value of the dateOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfIssue(XMLGregorianCalendar value) {
        this.dateOfIssue = value;
    }

    /**
     * Gets the value of the signingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getSigningPeriod() {
        return signingPeriod;
    }

    /**
     * Sets the value of the signingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setSigningPeriod(TimePeriodType value) {
        this.signingPeriod = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the other property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOther().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnyType }
     * 
     * 
     */
    public List<AnyType> getOther() {
        if (other == null) {
            other = new ArrayList<AnyType>();
        }
        return this.other;
    }

}
