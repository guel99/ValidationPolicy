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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceHistoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}ServiceHistoryInstance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceHistoryType", namespace = "http://uri.etsi.org/02231/v2#", propOrder = {
    "serviceHistoryInstance"
})
public class ServiceHistoryType {

    @XmlElement(name = "ServiceHistoryInstance")
    protected List<ServiceHistoryInstanceType> serviceHistoryInstance;

    /**
     * Gets the value of the serviceHistoryInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceHistoryInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceHistoryInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceHistoryInstanceType }
     * 
     * 
     */
    public List<ServiceHistoryInstanceType> getServiceHistoryInstance() {
        if (serviceHistoryInstance == null) {
            serviceHistoryInstance = new ArrayList<ServiceHistoryInstanceType>();
        }
        return this.serviceHistoryInstance;
    }

}
