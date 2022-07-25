//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.25 at 06:33:30 PM BST 
//


package com.devisefutures.validationpolicies.models.gen;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AlgConstraintsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlgConstraintsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlgId" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="Usages" type="{http://uri.etsi.org/19172/v1.1.1#}UsagesType" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="MinKeyLength" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="MinHashLength" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "AlgConstraintsType", propOrder = {
    "algId",
    "usages",
    "expirationDate",
    "minKeyLength",
    "minHashLength",
    "other"
})
public class AlgConstraintsType {

    @XmlElement(name = "AlgId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String algId;
    @XmlList
    @XmlElement(name = "Usages")
    protected List<String> usages;
    @XmlElement(name = "ExpirationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "MinKeyLength")
    protected BigInteger minKeyLength;
    @XmlElement(name = "MinHashLength")
    protected BigInteger minHashLength;
    @XmlElement(name = "Other")
    protected List<AnyType> other;

    /**
     * Gets the value of the algId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgId() {
        return algId;
    }

    /**
     * Sets the value of the algId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgId(String value) {
        this.algId = value;
    }

    /**
     * Gets the value of the usages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUsages() {
        if (usages == null) {
            usages = new ArrayList<String>();
        }
        return this.usages;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the minKeyLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinKeyLength() {
        return minKeyLength;
    }

    /**
     * Sets the value of the minKeyLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinKeyLength(BigInteger value) {
        this.minKeyLength = value;
    }

    /**
     * Gets the value of the minHashLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinHashLength() {
        return minHashLength;
    }

    /**
     * Sets the value of the minHashLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinHashLength(BigInteger value) {
        this.minHashLength = value;
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
