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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyRuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://uri.etsi.org/19172/v1.1.1#}CommitmentRules"/&gt;
 *         &lt;group ref="{http://uri.etsi.org/19172/v1.1.1#}BasicRule"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="RecommendedScope" type="{http://uri.etsi.org/19172/v1.1.1#}ScopeListType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyRuleType", propOrder = {
    "commitmentRules",
    "dataToBeSignedRules",
    "sigToDTBSRelationRules",
    "sigFormatsAndLevels",
    "augmentationRules",
    "signingCertRules",
    "timeEvidencesRules",
    "signerAttributesConstraints",
    "qualifyingPropertiesRules",
    "scdLoARules",
    "cryptoSuitesRules",
    "otherRule"
})
public class PolicyRuleType {

    @XmlElement(name = "CommitmentRules")
    protected CommitmentRulesType commitmentRules;
    @XmlElement(name = "DataToBeSignedRules")
    protected DataToBeSignedRulesType dataToBeSignedRules;
    @XmlElement(name = "SigToDTBSRelationRules")
    protected SigToDTBSRelationRulesType sigToDTBSRelationRules;
    @XmlElement(name = "SigFormatsAndLevels")
    protected SigFormatsAndLevelsType sigFormatsAndLevels;
    @XmlElement(name = "AugmentationRules")
    protected AugmentationRulesType augmentationRules;
    @XmlElement(name = "SigningCertRules")
    protected SigningCertRulesType signingCertRules;
    @XmlElement(name = "TimeEvidencesRules")
    protected TimeEvidencesRulesType timeEvidencesRules;
    @XmlElement(name = "SignerAttributesConstraints")
    protected SignerAttributesConstraintsType signerAttributesConstraints;
    @XmlElement(name = "QualifyingPropertiesRules")
    protected QualifyingPropertiesRulesType qualifyingPropertiesRules;
    @XmlElement(name = "SCDLoARules")
    @XmlSchemaType(name = "anyURI")
    protected String scdLoARules;
    @XmlElement(name = "CryptoSuitesRules")
    protected CryptoSuiteRulesType cryptoSuitesRules;
    @XmlElement(name = "OtherRule")
    protected AnyType otherRule;
    @XmlAttribute(name = "RecommendedScope")
    protected List<ScopeType> recommendedScope;

    /**
     * Gets the value of the commitmentRules property.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentRulesType }
     *     
     */
    public CommitmentRulesType getCommitmentRules() {
        return commitmentRules;
    }

    /**
     * Sets the value of the commitmentRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentRulesType }
     *     
     */
    public void setCommitmentRules(CommitmentRulesType value) {
        this.commitmentRules = value;
    }

    /**
     * Gets the value of the dataToBeSignedRules property.
     * 
     * @return
     *     possible object is
     *     {@link DataToBeSignedRulesType }
     *     
     */
    public DataToBeSignedRulesType getDataToBeSignedRules() {
        return dataToBeSignedRules;
    }

    /**
     * Sets the value of the dataToBeSignedRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataToBeSignedRulesType }
     *     
     */
    public void setDataToBeSignedRules(DataToBeSignedRulesType value) {
        this.dataToBeSignedRules = value;
    }

    /**
     * Gets the value of the sigToDTBSRelationRules property.
     * 
     * @return
     *     possible object is
     *     {@link SigToDTBSRelationRulesType }
     *     
     */
    public SigToDTBSRelationRulesType getSigToDTBSRelationRules() {
        return sigToDTBSRelationRules;
    }

    /**
     * Sets the value of the sigToDTBSRelationRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigToDTBSRelationRulesType }
     *     
     */
    public void setSigToDTBSRelationRules(SigToDTBSRelationRulesType value) {
        this.sigToDTBSRelationRules = value;
    }

    /**
     * Gets the value of the sigFormatsAndLevels property.
     * 
     * @return
     *     possible object is
     *     {@link SigFormatsAndLevelsType }
     *     
     */
    public SigFormatsAndLevelsType getSigFormatsAndLevels() {
        return sigFormatsAndLevels;
    }

    /**
     * Sets the value of the sigFormatsAndLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigFormatsAndLevelsType }
     *     
     */
    public void setSigFormatsAndLevels(SigFormatsAndLevelsType value) {
        this.sigFormatsAndLevels = value;
    }

    /**
     * Gets the value of the augmentationRules property.
     * 
     * @return
     *     possible object is
     *     {@link AugmentationRulesType }
     *     
     */
    public AugmentationRulesType getAugmentationRules() {
        return augmentationRules;
    }

    /**
     * Sets the value of the augmentationRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link AugmentationRulesType }
     *     
     */
    public void setAugmentationRules(AugmentationRulesType value) {
        this.augmentationRules = value;
    }

    /**
     * Gets the value of the signingCertRules property.
     * 
     * @return
     *     possible object is
     *     {@link SigningCertRulesType }
     *     
     */
    public SigningCertRulesType getSigningCertRules() {
        return signingCertRules;
    }

    /**
     * Sets the value of the signingCertRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigningCertRulesType }
     *     
     */
    public void setSigningCertRules(SigningCertRulesType value) {
        this.signingCertRules = value;
    }

    /**
     * Gets the value of the timeEvidencesRules property.
     * 
     * @return
     *     possible object is
     *     {@link TimeEvidencesRulesType }
     *     
     */
    public TimeEvidencesRulesType getTimeEvidencesRules() {
        return timeEvidencesRules;
    }

    /**
     * Sets the value of the timeEvidencesRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEvidencesRulesType }
     *     
     */
    public void setTimeEvidencesRules(TimeEvidencesRulesType value) {
        this.timeEvidencesRules = value;
    }

    /**
     * Gets the value of the signerAttributesConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link SignerAttributesConstraintsType }
     *     
     */
    public SignerAttributesConstraintsType getSignerAttributesConstraints() {
        return signerAttributesConstraints;
    }

    /**
     * Sets the value of the signerAttributesConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignerAttributesConstraintsType }
     *     
     */
    public void setSignerAttributesConstraints(SignerAttributesConstraintsType value) {
        this.signerAttributesConstraints = value;
    }

    /**
     * Gets the value of the qualifyingPropertiesRules property.
     * 
     * @return
     *     possible object is
     *     {@link QualifyingPropertiesRulesType }
     *     
     */
    public QualifyingPropertiesRulesType getQualifyingPropertiesRules() {
        return qualifyingPropertiesRules;
    }

    /**
     * Sets the value of the qualifyingPropertiesRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifyingPropertiesRulesType }
     *     
     */
    public void setQualifyingPropertiesRules(QualifyingPropertiesRulesType value) {
        this.qualifyingPropertiesRules = value;
    }

    /**
     * Gets the value of the scdLoARules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCDLoARules() {
        return scdLoARules;
    }

    /**
     * Sets the value of the scdLoARules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCDLoARules(String value) {
        this.scdLoARules = value;
    }

    /**
     * Gets the value of the cryptoSuitesRules property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoSuiteRulesType }
     *     
     */
    public CryptoSuiteRulesType getCryptoSuitesRules() {
        return cryptoSuitesRules;
    }

    /**
     * Sets the value of the cryptoSuitesRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoSuiteRulesType }
     *     
     */
    public void setCryptoSuitesRules(CryptoSuiteRulesType value) {
        this.cryptoSuitesRules = value;
    }

    /**
     * Gets the value of the otherRule property.
     * 
     * @return
     *     possible object is
     *     {@link AnyType }
     *     
     */
    public AnyType getOtherRule() {
        return otherRule;
    }

    /**
     * Sets the value of the otherRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType }
     *     
     */
    public void setOtherRule(AnyType value) {
        this.otherRule = value;
    }

    /**
     * Gets the value of the recommendedScope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recommendedScope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecommendedScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScopeType }
     * 
     * 
     */
    public List<ScopeType> getRecommendedScope() {
        if (recommendedScope == null) {
            recommendedScope = new ArrayList<ScopeType>();
        }
        return this.recommendedScope;
    }

}