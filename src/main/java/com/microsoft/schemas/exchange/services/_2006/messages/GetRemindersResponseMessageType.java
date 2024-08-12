package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.ArrayOfRemindersType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for GetRemindersResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetRemindersResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="Reminders" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRemindersType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetRemindersResponseMessageType",
        propOrder = {"reminders"})
public class GetRemindersResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "Reminders", required = true)
    protected ArrayOfRemindersType reminders;

    /**
     * Gets the value of the reminders property.
     *
     * @return possible object is {@link ArrayOfRemindersType }
     */
    public ArrayOfRemindersType getReminders() {
        return reminders;
    }

    /**
     * Sets the value of the reminders property.
     *
     * @param value allowed object is {@link ArrayOfRemindersType }
     */
    public void setReminders(ArrayOfRemindersType value) {
        this.reminders = value;
    }
}
