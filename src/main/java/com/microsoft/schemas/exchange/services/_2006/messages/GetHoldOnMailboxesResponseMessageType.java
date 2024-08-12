package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.MailboxHoldResultType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Response message type for the GetHoldOnMailboxes web method.
 *
 * <p>Java class for GetHoldOnMailboxesResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetHoldOnMailboxesResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="MailboxHoldResult" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailboxHoldResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetHoldOnMailboxesResponseMessageType",
        propOrder = {"mailboxHoldResult"})
public class GetHoldOnMailboxesResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "MailboxHoldResult")
    protected MailboxHoldResultType mailboxHoldResult;

    /**
     * Gets the value of the mailboxHoldResult property.
     *
     * @return possible object is {@link MailboxHoldResultType }
     */
    public MailboxHoldResultType getMailboxHoldResult() {
        return mailboxHoldResult;
    }

    /**
     * Sets the value of the mailboxHoldResult property.
     *
     * @param value allowed object is {@link MailboxHoldResultType }
     */
    public void setMailboxHoldResult(MailboxHoldResultType value) {
        this.mailboxHoldResult = value;
    }
}
