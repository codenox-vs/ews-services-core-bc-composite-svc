package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.NonIndexableItemDetailResultType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Response message type for the GetNonIndexableItemDetails web method.
 *
 * <p>Java class for GetNonIndexableItemDetailsResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetNonIndexableItemDetailsResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="NonIndexableItemDetailsResult" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonIndexableItemDetailResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetNonIndexableItemDetailsResponseMessageType",
        propOrder = {"nonIndexableItemDetailsResult"})
public class GetNonIndexableItemDetailsResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "NonIndexableItemDetailsResult")
    protected NonIndexableItemDetailResultType nonIndexableItemDetailsResult;

    /**
     * Gets the value of the nonIndexableItemDetailsResult property.
     *
     * @return possible object is {@link NonIndexableItemDetailResultType }
     */
    public NonIndexableItemDetailResultType getNonIndexableItemDetailsResult() {
        return nonIndexableItemDetailsResult;
    }

    /**
     * Sets the value of the nonIndexableItemDetailsResult property.
     *
     * @param value allowed object is {@link NonIndexableItemDetailResultType }
     */
    public void setNonIndexableItemDetailsResult(NonIndexableItemDetailResultType value) {
        this.nonIndexableItemDetailsResult = value;
    }
}
