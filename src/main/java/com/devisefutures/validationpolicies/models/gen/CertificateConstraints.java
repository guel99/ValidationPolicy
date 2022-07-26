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
 * Group of checks related to a certificate
 * 
 * <p>Java class for CertificateConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateConstraints"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Recognition" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="Signature" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="NotExpired" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="AuthorityInfoAccessPresent" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="RevocationInfoAccessPresent" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="RevocationDataAvailable" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="AcceptableRevocationDataFound" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="CRLNextUpdatePresent" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="OCSPNextUpdatePresent" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="RevocationFreshness" type="{http://dss.esig.europa.eu/validation/policy}TimeConstraint" minOccurs="0"/&gt;
 *         &lt;element name="RevocationFreshnessNextUpdate" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="KeyUsage" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedKeyUsage" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="Surname" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="CommonName" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="Pseudonym" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationUnit" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationName" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumberPresent" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="NotRevoked" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="NotOnHold" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="RevocationIssuerNotExpired" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="SelfSigned" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="NotSelfSigned" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="PolicyIds" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="PolicyQualificationIds" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="PolicySupportedByQSCDIds" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="QcCompliance" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="QcEuLimitValueCurrency" type="{http://dss.esig.europa.eu/validation/policy}ValueConstraint" minOccurs="0"/&gt;
 *         &lt;element name="MinQcEuLimitValue" type="{http://dss.esig.europa.eu/validation/policy}IntValueConstraint" minOccurs="0"/&gt;
 *         &lt;element name="MinQcEuRetentionPeriod" type="{http://dss.esig.europa.eu/validation/policy}IntValueConstraint" minOccurs="0"/&gt;
 *         &lt;element name="QcSSCD" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="QcEuPDSLocation" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="QcType" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="QcLegislationCountryCodes" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="IssuedToNaturalPerson" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="IssuedToLegalPerson" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="SemanticsIdentifier" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="PSD2QcTypeRolesOfPSP" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="PSD2QcCompetentAuthorityName" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="PSD2QcCompetentAuthorityId" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="UsePseudonym" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="Cryptographic" type="{http://dss.esig.europa.eu/validation/policy}CryptographicConstraint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateConstraints", namespace = "http://dss.esig.europa.eu/validation/policy", propOrder = {
    "recognition",
    "signature",
    "notExpired",
    "authorityInfoAccessPresent",
    "revocationInfoAccessPresent",
    "revocationDataAvailable",
    "acceptableRevocationDataFound",
    "crlNextUpdatePresent",
    "ocspNextUpdatePresent",
    "revocationFreshness",
    "revocationFreshnessNextUpdate",
    "keyUsage",
    "extendedKeyUsage",
    "surname",
    "givenName",
    "commonName",
    "pseudonym",
    "organizationUnit",
    "organizationName",
    "country",
    "serialNumberPresent",
    "notRevoked",
    "notOnHold",
    "revocationIssuerNotExpired",
    "selfSigned",
    "notSelfSigned",
    "policyIds",
    "policyQualificationIds",
    "policySupportedByQSCDIds",
    "qcCompliance",
    "qcEuLimitValueCurrency",
    "minQcEuLimitValue",
    "minQcEuRetentionPeriod",
    "qcSSCD",
    "qcEuPDSLocation",
    "qcType",
    "qcLegislationCountryCodes",
    "issuedToNaturalPerson",
    "issuedToLegalPerson",
    "semanticsIdentifier",
    "psd2QcTypeRolesOfPSP",
    "psd2QcCompetentAuthorityName",
    "psd2QcCompetentAuthorityId",
    "usePseudonym",
    "cryptographic"
})
public class CertificateConstraints {

    @XmlElement(name = "Recognition")
    protected LevelConstraint recognition;
    @XmlElement(name = "Signature")
    protected LevelConstraint signature;
    @XmlElement(name = "NotExpired")
    protected LevelConstraint notExpired;
    @XmlElement(name = "AuthorityInfoAccessPresent")
    protected LevelConstraint authorityInfoAccessPresent;
    @XmlElement(name = "RevocationInfoAccessPresent")
    protected LevelConstraint revocationInfoAccessPresent;
    @XmlElement(name = "RevocationDataAvailable")
    protected LevelConstraint revocationDataAvailable;
    @XmlElement(name = "AcceptableRevocationDataFound")
    protected LevelConstraint acceptableRevocationDataFound;
    @XmlElement(name = "CRLNextUpdatePresent")
    protected LevelConstraint crlNextUpdatePresent;
    @XmlElement(name = "OCSPNextUpdatePresent")
    protected LevelConstraint ocspNextUpdatePresent;
    @XmlElement(name = "RevocationFreshness")
    protected TimeConstraint revocationFreshness;
    @XmlElement(name = "RevocationFreshnessNextUpdate")
    protected LevelConstraint revocationFreshnessNextUpdate;
    @XmlElement(name = "KeyUsage")
    protected MultiValuesConstraint keyUsage;
    @XmlElement(name = "ExtendedKeyUsage")
    protected MultiValuesConstraint extendedKeyUsage;
    @XmlElement(name = "Surname")
    protected MultiValuesConstraint surname;
    @XmlElement(name = "GivenName")
    protected MultiValuesConstraint givenName;
    @XmlElement(name = "CommonName")
    protected MultiValuesConstraint commonName;
    @XmlElement(name = "Pseudonym")
    protected MultiValuesConstraint pseudonym;
    @XmlElement(name = "OrganizationUnit")
    protected MultiValuesConstraint organizationUnit;
    @XmlElement(name = "OrganizationName")
    protected MultiValuesConstraint organizationName;
    @XmlElement(name = "Country")
    protected MultiValuesConstraint country;
    @XmlElement(name = "SerialNumberPresent")
    protected LevelConstraint serialNumberPresent;
    @XmlElement(name = "NotRevoked")
    protected LevelConstraint notRevoked;
    @XmlElement(name = "NotOnHold")
    protected LevelConstraint notOnHold;
    @XmlElement(name = "RevocationIssuerNotExpired")
    protected LevelConstraint revocationIssuerNotExpired;
    @XmlElement(name = "SelfSigned")
    protected LevelConstraint selfSigned;
    @XmlElement(name = "NotSelfSigned")
    protected LevelConstraint notSelfSigned;
    @XmlElement(name = "PolicyIds")
    protected MultiValuesConstraint policyIds;
    @XmlElement(name = "PolicyQualificationIds")
    protected LevelConstraint policyQualificationIds;
    @XmlElement(name = "PolicySupportedByQSCDIds")
    protected LevelConstraint policySupportedByQSCDIds;
    @XmlElement(name = "QcCompliance")
    protected LevelConstraint qcCompliance;
    @XmlElement(name = "QcEuLimitValueCurrency")
    protected ValueConstraint qcEuLimitValueCurrency;
    @XmlElement(name = "MinQcEuLimitValue")
    protected IntValueConstraint minQcEuLimitValue;
    @XmlElement(name = "MinQcEuRetentionPeriod")
    protected IntValueConstraint minQcEuRetentionPeriod;
    @XmlElement(name = "QcSSCD")
    protected LevelConstraint qcSSCD;
    @XmlElement(name = "QcEuPDSLocation")
    protected MultiValuesConstraint qcEuPDSLocation;
    @XmlElement(name = "QcType")
    protected MultiValuesConstraint qcType;
    @XmlElement(name = "QcLegislationCountryCodes")
    protected MultiValuesConstraint qcLegislationCountryCodes;
    @XmlElement(name = "IssuedToNaturalPerson")
    protected LevelConstraint issuedToNaturalPerson;
    @XmlElement(name = "IssuedToLegalPerson")
    protected LevelConstraint issuedToLegalPerson;
    @XmlElement(name = "SemanticsIdentifier")
    protected MultiValuesConstraint semanticsIdentifier;
    @XmlElement(name = "PSD2QcTypeRolesOfPSP")
    protected MultiValuesConstraint psd2QcTypeRolesOfPSP;
    @XmlElement(name = "PSD2QcCompetentAuthorityName")
    protected MultiValuesConstraint psd2QcCompetentAuthorityName;
    @XmlElement(name = "PSD2QcCompetentAuthorityId")
    protected MultiValuesConstraint psd2QcCompetentAuthorityId;
    @XmlElement(name = "UsePseudonym")
    protected LevelConstraint usePseudonym;
    @XmlElement(name = "Cryptographic")
    protected CryptographicConstraint cryptographic;

    /**
     * Gets the value of the recognition property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getRecognition() {
        return recognition;
    }

    /**
     * Sets the value of the recognition property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setRecognition(LevelConstraint value) {
        this.recognition = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSignature(LevelConstraint value) {
        this.signature = value;
    }

    /**
     * Gets the value of the notExpired property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getNotExpired() {
        return notExpired;
    }

    /**
     * Sets the value of the notExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setNotExpired(LevelConstraint value) {
        this.notExpired = value;
    }

    /**
     * Gets the value of the authorityInfoAccessPresent property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getAuthorityInfoAccessPresent() {
        return authorityInfoAccessPresent;
    }

    /**
     * Sets the value of the authorityInfoAccessPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setAuthorityInfoAccessPresent(LevelConstraint value) {
        this.authorityInfoAccessPresent = value;
    }

    /**
     * Gets the value of the revocationInfoAccessPresent property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getRevocationInfoAccessPresent() {
        return revocationInfoAccessPresent;
    }

    /**
     * Sets the value of the revocationInfoAccessPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setRevocationInfoAccessPresent(LevelConstraint value) {
        this.revocationInfoAccessPresent = value;
    }

    /**
     * Gets the value of the revocationDataAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getRevocationDataAvailable() {
        return revocationDataAvailable;
    }

    /**
     * Sets the value of the revocationDataAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setRevocationDataAvailable(LevelConstraint value) {
        this.revocationDataAvailable = value;
    }

    /**
     * Gets the value of the acceptableRevocationDataFound property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getAcceptableRevocationDataFound() {
        return acceptableRevocationDataFound;
    }

    /**
     * Sets the value of the acceptableRevocationDataFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setAcceptableRevocationDataFound(LevelConstraint value) {
        this.acceptableRevocationDataFound = value;
    }

    /**
     * Gets the value of the crlNextUpdatePresent property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getCRLNextUpdatePresent() {
        return crlNextUpdatePresent;
    }

    /**
     * Sets the value of the crlNextUpdatePresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setCRLNextUpdatePresent(LevelConstraint value) {
        this.crlNextUpdatePresent = value;
    }

    /**
     * Gets the value of the ocspNextUpdatePresent property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getOCSPNextUpdatePresent() {
        return ocspNextUpdatePresent;
    }

    /**
     * Sets the value of the ocspNextUpdatePresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setOCSPNextUpdatePresent(LevelConstraint value) {
        this.ocspNextUpdatePresent = value;
    }

    /**
     * Gets the value of the revocationFreshness property.
     * 
     * @return
     *     possible object is
     *     {@link TimeConstraint }
     *     
     */
    public TimeConstraint getRevocationFreshness() {
        return revocationFreshness;
    }

    /**
     * Sets the value of the revocationFreshness property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeConstraint }
     *     
     */
    public void setRevocationFreshness(TimeConstraint value) {
        this.revocationFreshness = value;
    }

    /**
     * Gets the value of the revocationFreshnessNextUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getRevocationFreshnessNextUpdate() {
        return revocationFreshnessNextUpdate;
    }

    /**
     * Sets the value of the revocationFreshnessNextUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setRevocationFreshnessNextUpdate(LevelConstraint value) {
        this.revocationFreshnessNextUpdate = value;
    }

    /**
     * Gets the value of the keyUsage property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getKeyUsage() {
        return keyUsage;
    }

    /**
     * Sets the value of the keyUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setKeyUsage(MultiValuesConstraint value) {
        this.keyUsage = value;
    }

    /**
     * Gets the value of the extendedKeyUsage property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getExtendedKeyUsage() {
        return extendedKeyUsage;
    }

    /**
     * Sets the value of the extendedKeyUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setExtendedKeyUsage(MultiValuesConstraint value) {
        this.extendedKeyUsage = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setSurname(MultiValuesConstraint value) {
        this.surname = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setGivenName(MultiValuesConstraint value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the commonName property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getCommonName() {
        return commonName;
    }

    /**
     * Sets the value of the commonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setCommonName(MultiValuesConstraint value) {
        this.commonName = value;
    }

    /**
     * Gets the value of the pseudonym property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getPseudonym() {
        return pseudonym;
    }

    /**
     * Sets the value of the pseudonym property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setPseudonym(MultiValuesConstraint value) {
        this.pseudonym = value;
    }

    /**
     * Gets the value of the organizationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getOrganizationUnit() {
        return organizationUnit;
    }

    /**
     * Sets the value of the organizationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setOrganizationUnit(MultiValuesConstraint value) {
        this.organizationUnit = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setOrganizationName(MultiValuesConstraint value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setCountry(MultiValuesConstraint value) {
        this.country = value;
    }

    /**
     * Gets the value of the serialNumberPresent property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSerialNumberPresent() {
        return serialNumberPresent;
    }

    /**
     * Sets the value of the serialNumberPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSerialNumberPresent(LevelConstraint value) {
        this.serialNumberPresent = value;
    }

    /**
     * Gets the value of the notRevoked property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getNotRevoked() {
        return notRevoked;
    }

    /**
     * Sets the value of the notRevoked property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setNotRevoked(LevelConstraint value) {
        this.notRevoked = value;
    }

    /**
     * Gets the value of the notOnHold property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getNotOnHold() {
        return notOnHold;
    }

    /**
     * Sets the value of the notOnHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setNotOnHold(LevelConstraint value) {
        this.notOnHold = value;
    }

    /**
     * Gets the value of the revocationIssuerNotExpired property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getRevocationIssuerNotExpired() {
        return revocationIssuerNotExpired;
    }

    /**
     * Sets the value of the revocationIssuerNotExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setRevocationIssuerNotExpired(LevelConstraint value) {
        this.revocationIssuerNotExpired = value;
    }

    /**
     * Gets the value of the selfSigned property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSelfSigned() {
        return selfSigned;
    }

    /**
     * Sets the value of the selfSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSelfSigned(LevelConstraint value) {
        this.selfSigned = value;
    }

    /**
     * Gets the value of the notSelfSigned property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getNotSelfSigned() {
        return notSelfSigned;
    }

    /**
     * Sets the value of the notSelfSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setNotSelfSigned(LevelConstraint value) {
        this.notSelfSigned = value;
    }

    /**
     * Gets the value of the policyIds property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getPolicyIds() {
        return policyIds;
    }

    /**
     * Sets the value of the policyIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setPolicyIds(MultiValuesConstraint value) {
        this.policyIds = value;
    }

    /**
     * Gets the value of the policyQualificationIds property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getPolicyQualificationIds() {
        return policyQualificationIds;
    }

    /**
     * Sets the value of the policyQualificationIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setPolicyQualificationIds(LevelConstraint value) {
        this.policyQualificationIds = value;
    }

    /**
     * Gets the value of the policySupportedByQSCDIds property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getPolicySupportedByQSCDIds() {
        return policySupportedByQSCDIds;
    }

    /**
     * Sets the value of the policySupportedByQSCDIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setPolicySupportedByQSCDIds(LevelConstraint value) {
        this.policySupportedByQSCDIds = value;
    }

    /**
     * Gets the value of the qcCompliance property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getQcCompliance() {
        return qcCompliance;
    }

    /**
     * Sets the value of the qcCompliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setQcCompliance(LevelConstraint value) {
        this.qcCompliance = value;
    }

    /**
     * Gets the value of the qcEuLimitValueCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link ValueConstraint }
     *     
     */
    public ValueConstraint getQcEuLimitValueCurrency() {
        return qcEuLimitValueCurrency;
    }

    /**
     * Sets the value of the qcEuLimitValueCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueConstraint }
     *     
     */
    public void setQcEuLimitValueCurrency(ValueConstraint value) {
        this.qcEuLimitValueCurrency = value;
    }

    /**
     * Gets the value of the minQcEuLimitValue property.
     * 
     * @return
     *     possible object is
     *     {@link IntValueConstraint }
     *     
     */
    public IntValueConstraint getMinQcEuLimitValue() {
        return minQcEuLimitValue;
    }

    /**
     * Sets the value of the minQcEuLimitValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntValueConstraint }
     *     
     */
    public void setMinQcEuLimitValue(IntValueConstraint value) {
        this.minQcEuLimitValue = value;
    }

    /**
     * Gets the value of the minQcEuRetentionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link IntValueConstraint }
     *     
     */
    public IntValueConstraint getMinQcEuRetentionPeriod() {
        return minQcEuRetentionPeriod;
    }

    /**
     * Sets the value of the minQcEuRetentionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntValueConstraint }
     *     
     */
    public void setMinQcEuRetentionPeriod(IntValueConstraint value) {
        this.minQcEuRetentionPeriod = value;
    }

    /**
     * Gets the value of the qcSSCD property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getQcSSCD() {
        return qcSSCD;
    }

    /**
     * Sets the value of the qcSSCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setQcSSCD(LevelConstraint value) {
        this.qcSSCD = value;
    }

    /**
     * Gets the value of the qcEuPDSLocation property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getQcEuPDSLocation() {
        return qcEuPDSLocation;
    }

    /**
     * Sets the value of the qcEuPDSLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setQcEuPDSLocation(MultiValuesConstraint value) {
        this.qcEuPDSLocation = value;
    }

    /**
     * Gets the value of the qcType property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getQcType() {
        return qcType;
    }

    /**
     * Sets the value of the qcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setQcType(MultiValuesConstraint value) {
        this.qcType = value;
    }

    /**
     * Gets the value of the qcLegislationCountryCodes property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getQcLegislationCountryCodes() {
        return qcLegislationCountryCodes;
    }

    /**
     * Sets the value of the qcLegislationCountryCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setQcLegislationCountryCodes(MultiValuesConstraint value) {
        this.qcLegislationCountryCodes = value;
    }

    /**
     * Gets the value of the issuedToNaturalPerson property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getIssuedToNaturalPerson() {
        return issuedToNaturalPerson;
    }

    /**
     * Sets the value of the issuedToNaturalPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setIssuedToNaturalPerson(LevelConstraint value) {
        this.issuedToNaturalPerson = value;
    }

    /**
     * Gets the value of the issuedToLegalPerson property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getIssuedToLegalPerson() {
        return issuedToLegalPerson;
    }

    /**
     * Sets the value of the issuedToLegalPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setIssuedToLegalPerson(LevelConstraint value) {
        this.issuedToLegalPerson = value;
    }

    /**
     * Gets the value of the semanticsIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getSemanticsIdentifier() {
        return semanticsIdentifier;
    }

    /**
     * Sets the value of the semanticsIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setSemanticsIdentifier(MultiValuesConstraint value) {
        this.semanticsIdentifier = value;
    }

    /**
     * Gets the value of the psd2QcTypeRolesOfPSP property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getPSD2QcTypeRolesOfPSP() {
        return psd2QcTypeRolesOfPSP;
    }

    /**
     * Sets the value of the psd2QcTypeRolesOfPSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setPSD2QcTypeRolesOfPSP(MultiValuesConstraint value) {
        this.psd2QcTypeRolesOfPSP = value;
    }

    /**
     * Gets the value of the psd2QcCompetentAuthorityName property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getPSD2QcCompetentAuthorityName() {
        return psd2QcCompetentAuthorityName;
    }

    /**
     * Sets the value of the psd2QcCompetentAuthorityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setPSD2QcCompetentAuthorityName(MultiValuesConstraint value) {
        this.psd2QcCompetentAuthorityName = value;
    }

    /**
     * Gets the value of the psd2QcCompetentAuthorityId property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getPSD2QcCompetentAuthorityId() {
        return psd2QcCompetentAuthorityId;
    }

    /**
     * Sets the value of the psd2QcCompetentAuthorityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setPSD2QcCompetentAuthorityId(MultiValuesConstraint value) {
        this.psd2QcCompetentAuthorityId = value;
    }

    /**
     * Gets the value of the usePseudonym property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getUsePseudonym() {
        return usePseudonym;
    }

    /**
     * Sets the value of the usePseudonym property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setUsePseudonym(LevelConstraint value) {
        this.usePseudonym = value;
    }

    /**
     * Gets the value of the cryptographic property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicConstraint }
     *     
     */
    public CryptographicConstraint getCryptographic() {
        return cryptographic;
    }

    /**
     * Sets the value of the cryptographic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicConstraint }
     *     
     */
    public void setCryptographic(CryptographicConstraint value) {
        this.cryptographic = value;
    }

}
