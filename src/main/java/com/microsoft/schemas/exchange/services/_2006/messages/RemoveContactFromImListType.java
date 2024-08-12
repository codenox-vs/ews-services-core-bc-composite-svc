package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.ItemIdType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for RemoveContactFromImListType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RemoveContactFromImListType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ContactId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "RemoveContactFromImListType",
        propOrder = {"contactId"})
public class RemoveContactFromImListType extends BaseRequestType {

    @XmlElement(name = "ContactId", required = true)
    protected ItemIdType contactId;

    /**
     * Gets the value of the contactId property.
     *
     * @return possible object is {@link ItemIdType }
     */
    public ItemIdType getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     *
     * @param value allowed object is {@link ItemIdType }
     */
    public void setContactId(ItemIdType value) {
        this.contactId = value;
    }
}
