package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.ArrayOfRealItemsType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ItemInfoResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ItemInfoResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="Items" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRealItemsType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ItemInfoResponseMessageType",
        propOrder = {"items"})
@XmlSeeAlso({
    UpdateItemInRecoverableItemsResponseMessageType.class,
    UpdateItemResponseMessageType.class
})
public class ItemInfoResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "Items", required = true)
    protected ArrayOfRealItemsType items;

    /**
     * Gets the value of the items property.
     *
     * @return possible object is {@link ArrayOfRealItemsType }
     */
    public ArrayOfRealItemsType getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     *
     * @param value allowed object is {@link ArrayOfRealItemsType }
     */
    public void setItems(ArrayOfRealItemsType value) {
        this.items = value;
    }
}
