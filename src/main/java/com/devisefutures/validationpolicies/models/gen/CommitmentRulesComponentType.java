//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.25 at 06:33:30 PM BST 
//


package com.devisefutures.validationpolicies.models.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitmentRulesComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitmentRulesComponentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/19172/v1.1.1#}Commitment" maxOccurs="unbounded"/&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://uri.etsi.org/19172/v1.1.1#}BasicRule" maxOccurs="unbounded"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MatchingIndicator" use="required" type="{http://uri.etsi.org/19172/v1.1.1#}MatchingIndicatorType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitmentRulesComponentType", propOrder = {
    "commitment",
    "basicRule"
})
public class CommitmentRulesComponentType {

    @XmlElement(name = "Commitment", required = true)
    protected List<CommitmentDetailsType> commitment;
    @XmlElements({
        @XmlElement(name = "DataToBeSignedRules", type = DataToBeSignedRulesType.class),
        @XmlElement(name = "SigToDTBSRelationRules", type = SigToDTBSRelationRulesType.class),
        @XmlElement(name = "SigFormatsAndLevels", type = SigFormatsAndLevelsType.class),
        @XmlElement(name = "AugmentationRules", type = AugmentationRulesType.class),
        @XmlElement(name = "SigningCertRules", type = SigningCertRulesType.class),
        @XmlElement(name = "TimeEvidencesRules", type = TimeEvidencesRulesType.class),
        @XmlElement(name = "SignerAttributesConstraints", type = SignerAttributesConstraintsType.class),
        @XmlElement(name = "QualifyingPropertiesRules", type = QualifyingPropertiesRulesType.class),
        @XmlElement(name = "SCDLoARules", type = String.class),
        @XmlElement(name = "CryptoSuitesRules", type = CryptoSuiteRulesType.class),
        @XmlElement(name = "OtherRule", type = AnyType.class)
    })
    protected List<Object> basicRule;
    @XmlAttribute(name = "MatchingIndicator", required = true)
    protected MatchingIndicatorType matchingIndicator;

    /**
     * Gets the value of the commitment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commitment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitmentDetailsType }
     * 
     * 
     */
    public List<CommitmentDetailsType> getCommitment() {
        if (commitment == null) {
            commitment = new ArrayList<CommitmentDetailsType>();
        }
        return this.commitment;
    }

    /**
     * Gets the value of the basicRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basicRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasicRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataToBeSignedRulesType }
     * {@link SigToDTBSRelationRulesType }
     * {@link SigFormatsAndLevelsType }
     * {@link AugmentationRulesType }
     * {@link SigningCertRulesType }
     * {@link TimeEvidencesRulesType }
     * {@link SignerAttributesConstraintsType }
     * {@link QualifyingPropertiesRulesType }
     * {@link String }
     * {@link CryptoSuiteRulesType }
     * {@link AnyType }
     * 
     * 
     */
    public List<Object> getBasicRule() {
        if (basicRule == null) {
            basicRule = new ArrayList<Object>();
        }
        return this.basicRule;
    }

    /**
     * Gets the value of the matchingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingIndicatorType }
     *     
     */
    public MatchingIndicatorType getMatchingIndicator() {
        return matchingIndicator;
    }

    /**
     * Sets the value of the matchingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingIndicatorType }
     *     
     */
    public void setMatchingIndicator(MatchingIndicatorType value) {
        this.matchingIndicator = value;
    }

}
