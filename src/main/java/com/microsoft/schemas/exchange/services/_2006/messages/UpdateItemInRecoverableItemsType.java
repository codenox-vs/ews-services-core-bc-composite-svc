package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.ItemIdType;
import com.microsoft.schemas.exchange.services._2006.types.NonEmptyArrayOfAttachmentsType;
import com.microsoft.schemas.exchange.services._2006.types.NonEmptyArrayOfItemChangeDescriptionsType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for UpdateItemInRecoverableItemsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UpdateItemInRecoverableItemsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/>
 *         &lt;element name="Updates" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfItemChangeDescriptionsType" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfAttachmentsType" minOccurs="0"/>
 *         &lt;element name="MakeItemImmutable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "UpdateItemInRecoverableItemsType",
        propOrder = {"itemId", "updates", "attachments", "makeItemImmutable"})
public class UpdateItemInRecoverableItemsType extends BaseRequestType {

    @XmlElement(name = "ItemId", required = true)
    protected ItemIdType itemId;

    @XmlElement(name = "Updates")
    protected NonEmptyArrayOfItemChangeDescriptionsType updates;

    @XmlElement(name = "Attachments")
    protected NonEmptyArrayOfAttachmentsType attachments;

    @XmlElement(name = "MakeItemImmutable")
    protected Boolean makeItemImmutable;

    /**
     * Gets the value of the itemId property.
     *
     * @return possible object is {@link ItemIdType }
     */
    public ItemIdType getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     *
     * @param value allowed object is {@link ItemIdType }
     */
    public void setItemId(ItemIdType value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the updates property.
     *
     * @return possible object is {@link NonEmptyArrayOfItemChangeDescriptionsType }
     */
    public NonEmptyArrayOfItemChangeDescriptionsType getUpdates() {
        return updates;
    }

    /**
     * Sets the value of the updates property.
     *
     * @param value allowed object is {@link NonEmptyArrayOfItemChangeDescriptionsType }
     */
    public void setUpdates(NonEmptyArrayOfItemChangeDescriptionsType value) {
        this.updates = value;
    }

    /**
     * Gets the value of the attachments property.
     *
     * @return possible object is {@link NonEmptyArrayOfAttachmentsType }
     */
    public NonEmptyArrayOfAttachmentsType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     *
     * @param value allowed object is {@link NonEmptyArrayOfAttachmentsType }
     */
    public void setAttachments(NonEmptyArrayOfAttachmentsType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the makeItemImmutable property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isMakeItemImmutable() {
        return makeItemImmutable;
    }

    /**
     * Sets the value of the makeItemImmutable property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setMakeItemImmutable(Boolean value) {
        this.makeItemImmutable = value;
    }
}
