package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Java class for ApprovalRequestDataType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ApprovalRequestDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsUndecidedApprovalRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApprovalDecision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ApprovalDecisionMaker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovalDecisionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ApprovalRequestDataType",
        propOrder = {
            "isUndecidedApprovalRequest",
            "approvalDecision",
            "approvalDecisionMaker",
            "approvalDecisionTime"
        })
public class ApprovalRequestDataType {

    @XmlElement(name = "IsUndecidedApprovalRequest")
    protected Boolean isUndecidedApprovalRequest;

    @XmlElement(name = "ApprovalDecision")
    protected Integer approvalDecision;

    @XmlElement(name = "ApprovalDecisionMaker")
    protected String approvalDecisionMaker;

    @XmlElement(name = "ApprovalDecisionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvalDecisionTime;

    /**
     * Gets the value of the isUndecidedApprovalRequest property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsUndecidedApprovalRequest() {
        return isUndecidedApprovalRequest;
    }

    /**
     * Sets the value of the isUndecidedApprovalRequest property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIsUndecidedApprovalRequest(Boolean value) {
        this.isUndecidedApprovalRequest = value;
    }

    /**
     * Gets the value of the approvalDecision property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getApprovalDecision() {
        return approvalDecision;
    }

    /**
     * Sets the value of the approvalDecision property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setApprovalDecision(Integer value) {
        this.approvalDecision = value;
    }

    /**
     * Gets the value of the approvalDecisionMaker property.
     *
     * @return possible object is {@link String }
     */
    public String getApprovalDecisionMaker() {
        return approvalDecisionMaker;
    }

    /**
     * Sets the value of the approvalDecisionMaker property.
     *
     * @param value allowed object is {@link String }
     */
    public void setApprovalDecisionMaker(String value) {
        this.approvalDecisionMaker = value;
    }

    /**
     * Gets the value of the approvalDecisionTime property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getApprovalDecisionTime() {
        return approvalDecisionTime;
    }

    /**
     * Sets the value of the approvalDecisionTime property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setApprovalDecisionTime(XMLGregorianCalendar value) {
        this.approvalDecisionTime = value;
    }
}
