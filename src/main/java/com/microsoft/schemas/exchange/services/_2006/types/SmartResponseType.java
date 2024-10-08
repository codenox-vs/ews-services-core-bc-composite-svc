package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for SmartResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SmartResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}SmartResponseBaseType">
 *       &lt;sequence>
 *         &lt;element name="NewBodyContent" type="{http://schemas.microsoft.com/exchange/services/2006/types}BodyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SmartResponseType",
        propOrder = {"newBodyContent"})
@XmlSeeAlso({
    ReplyAllToItemType.class,
    ReplyToItemType.class,
    ForwardItemType.class,
    CancelCalendarItemType.class
})
public class SmartResponseType extends SmartResponseBaseType {

    @XmlElement(name = "NewBodyContent")
    protected BodyType newBodyContent;

    /**
     * Gets the value of the newBodyContent property.
     *
     * @return possible object is {@link BodyType }
     */
    public BodyType getNewBodyContent() {
        return newBodyContent;
    }

    /**
     * Sets the value of the newBodyContent property.
     *
     * @param value allowed object is {@link BodyType }
     */
    public void setNewBodyContent(BodyType value) {
        this.newBodyContent = value;
    }
}
