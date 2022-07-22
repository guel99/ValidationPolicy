//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.22 at 07:53:47 PM BST 
//


package com.devisefutures.validationpolicies.models.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for CertificateRevTrustType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateRevTrustType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/19172/v1.1.1#}CertificateRevReq"/&gt;
 *         &lt;element name="Freshness" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="MaxDifferenceRevocationAndValidation" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *                   &lt;element name="TimeAfterSignature" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SigCertIssuedByCAKeepsExpiredRevokedCertsInfo" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateRevTrustType", propOrder = {
    "certificateRevReq",
    "freshness",
    "sigCertIssuedByCAKeepsExpiredRevokedCertsInfo"
})
public class CertificateRevTrustType {

    @XmlElement(name = "CertificateRevReq", required = true)
    protected CertificateRevReqType certificateRevReq;
    @XmlElement(name = "Freshness")
    protected CertificateRevTrustType.Freshness freshness;
    @XmlElement(name = "SigCertIssuedByCAKeepsExpiredRevokedCertsInfo")
    protected Duration sigCertIssuedByCAKeepsExpiredRevokedCertsInfo;

    /**
     * Gets the value of the certificateRevReq property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateRevReqType }
     *     
     */
    public CertificateRevReqType getCertificateRevReq() {
        return certificateRevReq;
    }

    /**
     * Sets the value of the certificateRevReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateRevReqType }
     *     
     */
    public void setCertificateRevReq(CertificateRevReqType value) {
        this.certificateRevReq = value;
    }

    /**
     * Gets the value of the freshness property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateRevTrustType.Freshness }
     *     
     */
    public CertificateRevTrustType.Freshness getFreshness() {
        return freshness;
    }

    /**
     * Sets the value of the freshness property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateRevTrustType.Freshness }
     *     
     */
    public void setFreshness(CertificateRevTrustType.Freshness value) {
        this.freshness = value;
    }

    /**
     * Gets the value of the sigCertIssuedByCAKeepsExpiredRevokedCertsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSigCertIssuedByCAKeepsExpiredRevokedCertsInfo() {
        return sigCertIssuedByCAKeepsExpiredRevokedCertsInfo;
    }

    /**
     * Sets the value of the sigCertIssuedByCAKeepsExpiredRevokedCertsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSigCertIssuedByCAKeepsExpiredRevokedCertsInfo(Duration value) {
        this.sigCertIssuedByCAKeepsExpiredRevokedCertsInfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="MaxDifferenceRevocationAndValidation" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
     *         &lt;element name="TimeAfterSignature" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "maxDifferenceRevocationAndValidation",
        "timeAfterSignature"
    })
    public static class Freshness {

        @XmlElement(name = "MaxDifferenceRevocationAndValidation")
        protected Duration maxDifferenceRevocationAndValidation;
        @XmlElement(name = "TimeAfterSignature")
        protected Duration timeAfterSignature;

        /**
         * Gets the value of the maxDifferenceRevocationAndValidation property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMaxDifferenceRevocationAndValidation() {
            return maxDifferenceRevocationAndValidation;
        }

        /**
         * Sets the value of the maxDifferenceRevocationAndValidation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMaxDifferenceRevocationAndValidation(Duration value) {
            this.maxDifferenceRevocationAndValidation = value;
        }

        /**
         * Gets the value of the timeAfterSignature property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getTimeAfterSignature() {
            return timeAfterSignature;
        }

        /**
         * Sets the value of the timeAfterSignature property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setTimeAfterSignature(Duration value) {
            this.timeAfterSignature = value;
        }

    }

}
