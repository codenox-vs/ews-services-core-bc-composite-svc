package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.ArrayOfRecipientsType;
import com.microsoft.schemas.exchange.services._2006.types.EmailAddressType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for GetMailTipsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetMailTipsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="SendingAs" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressType"/>
 *         &lt;element name="Recipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRecipientsType"/>
 *         &lt;element name="MailTipsRequested" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailTipTypes"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetMailTipsType",
        propOrder = {"sendingAs", "recipients", "mailTipsRequested"})
public class GetMailTipsType extends BaseRequestType {

    @XmlElement(name = "SendingAs", required = true)
    protected EmailAddressType sendingAs;

    @XmlElement(name = "Recipients", required = true)
    protected ArrayOfRecipientsType recipients;

    @XmlList
    @XmlElement(name = "MailTipsRequested", required = true)
    protected List<String> mailTipsRequested;

    /**
     * Gets the value of the sendingAs property.
     *
     * @return possible object is {@link EmailAddressType }
     */
    public EmailAddressType getSendingAs() {
        return sendingAs;
    }

    /**
     * Sets the value of the sendingAs property.
     *
     * @param value allowed object is {@link EmailAddressType }
     */
    public void setSendingAs(EmailAddressType value) {
        this.sendingAs = value;
    }

    /**
     * Gets the value of the recipients property.
     *
     * @return possible object is {@link ArrayOfRecipientsType }
     */
    public ArrayOfRecipientsType getRecipients() {
        return recipients;
    }

    /**
     * Sets the value of the recipients property.
     *
     * @param value allowed object is {@link ArrayOfRecipientsType }
     */
    public void setRecipients(ArrayOfRecipientsType value) {
        this.recipients = value;
    }

    /**
     * Gets the value of the mailTipsRequested property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the mailTipsRequested property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getMailTipsRequested().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getMailTipsRequested() {
        if (mailTipsRequested == null) {
            mailTipsRequested = new ArrayList<String>();
        }
        return this.mailTipsRequested;
    }
}
