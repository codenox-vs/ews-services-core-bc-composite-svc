package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.NotificationType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for GetEventsResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetEventsResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="Notification" type="{http://schemas.microsoft.com/exchange/services/2006/types}NotificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetEventsResponseMessageType",
        propOrder = {"notification"})
public class GetEventsResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "Notification")
    protected NotificationType notification;

    /**
     * Gets the value of the notification property.
     *
     * @return possible object is {@link NotificationType }
     */
    public NotificationType getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     *
     * @param value allowed object is {@link NotificationType }
     */
    public void setNotification(NotificationType value) {
        this.notification = value;
    }
}
