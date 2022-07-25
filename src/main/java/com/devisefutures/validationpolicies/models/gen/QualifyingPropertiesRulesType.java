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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualifyingPropertiesRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualifyingPropertiesRulesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LevelRules" type="{http://uri.etsi.org/19172/v1.1.1#}LevelQualifyingPropertiesRulesType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifyingPropertiesRulesType", propOrder = {
    "levelRules"
})
public class QualifyingPropertiesRulesType {

    @XmlElement(name = "LevelRules", required = true)
    protected List<LevelQualifyingPropertiesRulesType> levelRules;

    /**
     * Gets the value of the levelRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the levelRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevelRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LevelQualifyingPropertiesRulesType }
     * 
     * 
     */
    public List<LevelQualifyingPropertiesRulesType> getLevelRules() {
        if (levelRules == null) {
            levelRules = new ArrayList<LevelQualifyingPropertiesRulesType>();
        }
        return this.levelRules;
    }

}
