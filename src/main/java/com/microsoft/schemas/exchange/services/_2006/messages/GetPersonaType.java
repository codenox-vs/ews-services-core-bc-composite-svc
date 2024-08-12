package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.EmailAddressType;
import com.microsoft.schemas.exchange.services._2006.types.ItemIdType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for GetPersonaType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetPersonaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="PersonaId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetPersonaType",
        propOrder = {"personaId", "emailAddress"})
public class GetPersonaType extends BaseRequestType {

    @XmlElement(name = "PersonaId")
    protected ItemIdType personaId;

    @XmlElement(name = "EmailAddress")
    protected EmailAddressType emailAddress;

    /**
     * Gets the value of the personaId property.
     *
     * @return possible object is {@link ItemIdType }
     */
    public ItemIdType getPersonaId() {
        return personaId;
    }

    /**
     * Sets the value of the personaId property.
     *
     * @param value allowed object is {@link ItemIdType }
     */
    public void setPersonaId(ItemIdType value) {
        this.personaId = value;
    }

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
