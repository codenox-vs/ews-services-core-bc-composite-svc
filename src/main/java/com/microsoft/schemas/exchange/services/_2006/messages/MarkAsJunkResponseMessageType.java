package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.ItemIdType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for MarkAsJunkResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MarkAsJunkResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="MovedItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "MarkAsJunkResponseMessageType",
        propOrder = {"movedItemId"})
public class MarkAsJunkResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "MovedItemId")
    protected ItemIdType movedItemId;

    /**
     * Gets the value of the movedItemId property.
     *
     * @return possible object is {@link ItemIdType }
     */
    public ItemIdType getMovedItemId() {
        return movedItemId;
    }

    /**
     * Sets the value of the movedItemId property.
     *
     * @param value allowed object is {@link ItemIdType }
     */
    public void setMovedItemId(ItemIdType value) {
        this.movedItemId = value;
    }
}
