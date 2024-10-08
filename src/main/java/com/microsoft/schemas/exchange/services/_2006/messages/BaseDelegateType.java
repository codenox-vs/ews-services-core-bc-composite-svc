package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.EmailAddressType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for BaseDelegateType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BaseDelegateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="Mailbox" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "BaseDelegateType",
        propOrder = {"mailbox"})
@XmlSeeAlso({
    AddDelegateType.class,
    RemoveDelegateType.class,
    UpdateDelegateType.class,
    GetDelegateType.class
})
public abstract class BaseDelegateType extends BaseRequestType {

    @XmlElement(name = "Mailbox", required = true)
    protected EmailAddressType mailbox;

    /**
     * Gets the value of the mailbox property.
     *
     * @return possible object is {@link EmailAddressType }
     */
    public EmailAddressType getMailbox() {
        return mailbox;
    }

    /**
     * Sets the value of the mailbox property.
     *
     * @param value allowed object is {@link EmailAddressType }
     */
    public void setMailbox(EmailAddressType value) {
        this.mailbox = value;
    }
}
