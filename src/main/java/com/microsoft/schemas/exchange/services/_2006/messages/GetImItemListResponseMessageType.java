package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.ImItemListType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for GetImItemListResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetImItemListResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="ImItemList" type="{http://schemas.microsoft.com/exchange/services/2006/types}ImItemListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetImItemListResponseMessageType",
        propOrder = {"imItemList"})
public class GetImItemListResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "ImItemList")
    protected ImItemListType imItemList;

    /**
     * Gets the value of the imItemList property.
     *
     * @return possible object is {@link ImItemListType }
     */
    public ImItemListType getImItemList() {
        return imItemList;
    }

    /**
     * Sets the value of the imItemList property.
     *
     * @param value allowed object is {@link ImItemListType }
     */
    public void setImItemList(ImItemListType value) {
        this.imItemList = value;
    }
}
