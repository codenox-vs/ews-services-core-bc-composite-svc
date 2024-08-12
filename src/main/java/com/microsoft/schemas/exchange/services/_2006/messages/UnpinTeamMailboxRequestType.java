package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.EmailAddressType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for UnpinTeamMailboxRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UnpinTeamMailboxRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="EmailAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "UnpinTeamMailboxRequestType",
        propOrder = {"emailAddress"})
public class UnpinTeamMailboxRequestType extends BaseRequestType {

    @XmlElement(name = "EmailAddress", required = true)
    protected EmailAddressType emailAddress;

    /**
     * Gets the value of the emailAddress property.
     *
     * @return possible object is {@link EmailAddressType }
     */
    public EmailAddressType getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     *
     * @param value allowed object is {@link EmailAddressType }
     */
    public void setEmailAddress(EmailAddressType value) {
        this.emailAddress = value;
    }
}
