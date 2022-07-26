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
 * <p>Java class for CertificateTrustPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateTrustPointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/19172/v1.1.1#}TrustAnchors"/&gt;
 *         &lt;element name="PathLenConstraint" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="AcceptablePolicySet" type="{http://uri.etsi.org/19172/v1.1.1#}AcceptablePoliciesListType" minOccurs="0"/&gt;
 *         &lt;element name="NameConstraints" type="{http://uri.etsi.org/19172/v1.1.1#}NameConstraintsType" minOccurs="0"/&gt;
 *         &lt;element name="PolicyConstraints" type="{http://uri.etsi.org/19172/v1.1.1#}PolicyConstraintsType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/19172/v1.1.1#}UseCertPath" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateTrustPointType", propOrder = {
    "trustAnchors",
    "pathLenConstraint",
    "acceptablePolicySet",
    "nameConstraints",
    "policyConstraints",
    "useCertPath"
})
public class CertificateTrustPointType {

    @XmlElement(name = "TrustAnchors", required = true)
    protected TrustAnchorListType trustAnchors;
    @XmlElement(name = "PathLenConstraint")
    protected BigInteger pathLenConstraint;
    @XmlElement(name = "AcceptablePolicySet")
    protected AcceptablePoliciesListType acceptablePolicySet;
    @XmlElement(name = "NameConstraints")
    protected NameConstraintsType nameConstraints;
    @XmlElement(name = "PolicyConstraints")
    protected PolicyConstraintsType policyConstraints;
    @XmlElement(name = "UseCertPath")
    protected UseCertPath useCertPath;

    /**
     * Gets the value of the trustAnchors property.
     * 
     * @return
     *     possible object is
     *     {@link TrustAnchorListType }
     *     
     */
    public TrustAnchorListType getTrustAnchors() {
        return trustAnchors;
    }

    /**
     * Sets the value of the trustAnchors property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrustAnchorListType }
     *     
     */
    public void setTrustAnchors(TrustAnchorListType value) {
        this.trustAnchors = value;
    }

    /**
     * Gets the value of the pathLenConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPathLenConstraint() {
        return pathLenConstraint;
    }

    /**
     * Sets the value of the pathLenConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPathLenConstraint(BigInteger value) {
        this.pathLenConstraint = value;
    }

    /**
     * Gets the value of the acceptablePolicySet property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptablePoliciesListType }
     *     
     */
    public AcceptablePoliciesListType getAcceptablePolicySet() {
        return acceptablePolicySet;
    }

    /**
     * Sets the value of the acceptablePolicySet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptablePoliciesListType }
     *     
     */
    public void setAcceptablePolicySet(AcceptablePoliciesListType value) {
        this.acceptablePolicySet = value;
    }

    /**
     * Gets the value of the nameConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link NameConstraintsType }
     *     
     */
    public NameConstraintsType getNameConstraints() {
        return nameConstraints;
    }

    /**
     * Sets the value of the nameConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameConstraintsType }
     *     
     */
    public void setNameConstraints(NameConstraintsType value) {
        this.nameConstraints = value;
    }

    /**
     * Gets the value of the policyConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyConstraintsType }
     *     
     */
    public PolicyConstraintsType getPolicyConstraints() {
        return policyConstraints;
    }

    /**
     * Sets the value of the policyConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyConstraintsType }
     *     
     */
    public void setPolicyConstraints(PolicyConstraintsType value) {
        this.policyConstraints = value;
    }

    /**
     * Gets the value of the useCertPath property.
     * 
     * @return
     *     possible object is
     *     {@link UseCertPath }
     *     
     */
    public UseCertPath getUseCertPath() {
        return useCertPath;
    }

    /**
     * Sets the value of the useCertPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseCertPath }
     *     
     */
    public void setUseCertPath(UseCertPath value) {
        this.useCertPath = value;
    }

}
