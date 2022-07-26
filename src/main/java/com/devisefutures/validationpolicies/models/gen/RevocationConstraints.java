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
 * Group of constraints on the revocation data
 * 
 * <p>Java class for RevocationConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevocationConstraints"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dss.esig.europa.eu/validation/policy}LevelConstraint"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UnknownStatus" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="OCSPCertHashPresent" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="OCSPCertHashMatch" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="SelfIssuedOCSP" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="BasicSignatureConstraints" type="{http://dss.esig.europa.eu/validation/policy}BasicSignatureConstraints" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevocationConstraints", namespace = "http://dss.esig.europa.eu/validation/policy", propOrder = {
    "unknownStatus",
    "ocspCertHashPresent",
    "ocspCertHashMatch",
    "selfIssuedOCSP",
    "basicSignatureConstraints"
})
public class RevocationConstraints
    extends LevelConstraint
{

    @XmlElement(name = "UnknownStatus")
    protected LevelConstraint unknownStatus;
    @XmlElement(name = "OCSPCertHashPresent")
    protected LevelConstraint ocspCertHashPresent;
    @XmlElement(name = "OCSPCertHashMatch")
    protected LevelConstraint ocspCertHashMatch;
    @XmlElement(name = "SelfIssuedOCSP")
    protected LevelConstraint selfIssuedOCSP;
    @XmlElement(name = "BasicSignatureConstraints")
    protected BasicSignatureConstraints basicSignatureConstraints;

    /**
     * Gets the value of the unknownStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getUnknownStatus() {
        return unknownStatus;
    }

    /**
     * Sets the value of the unknownStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setUnknownStatus(LevelConstraint value) {
        this.unknownStatus = value;
    }

    /**
     * Gets the value of the ocspCertHashPresent property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getOCSPCertHashPresent() {
        return ocspCertHashPresent;
    }

    /**
     * Sets the value of the ocspCertHashPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setOCSPCertHashPresent(LevelConstraint value) {
        this.ocspCertHashPresent = value;
    }

    /**
     * Gets the value of the ocspCertHashMatch property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getOCSPCertHashMatch() {
        return ocspCertHashMatch;
    }

    /**
     * Sets the value of the ocspCertHashMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setOCSPCertHashMatch(LevelConstraint value) {
        this.ocspCertHashMatch = value;
    }

    /**
     * Gets the value of the selfIssuedOCSP property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSelfIssuedOCSP() {
        return selfIssuedOCSP;
    }

    /**
     * Sets the value of the selfIssuedOCSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSelfIssuedOCSP(LevelConstraint value) {
        this.selfIssuedOCSP = value;
    }

    /**
     * Gets the value of the basicSignatureConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link BasicSignatureConstraints }
     *     
     */
    public BasicSignatureConstraints getBasicSignatureConstraints() {
        return basicSignatureConstraints;
    }

    /**
     * Sets the value of the basicSignatureConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicSignatureConstraints }
     *     
     */
    public void setBasicSignatureConstraints(BasicSignatureConstraints value) {
        this.basicSignatureConstraints = value;
    }

}
