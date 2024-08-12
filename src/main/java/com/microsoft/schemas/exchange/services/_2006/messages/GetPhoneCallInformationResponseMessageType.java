package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.PhoneCallInformationType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for GetPhoneCallInformationResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetPhoneCallInformationResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="PhoneCallInformation" type="{http://schemas.microsoft.com/exchange/services/2006/types}PhoneCallInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetPhoneCallInformationResponseMessageType",
        propOrder = {"phoneCallInformation"})
public class GetPhoneCallInformationResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "PhoneCallInformation")
    protected PhoneCallInformationType phoneCallInformation;

    /**
     * Gets the value of the phoneCallInformation property.
     *
     * @return possible object is {@link PhoneCallInformationType }
     */
    public PhoneCallInformationType getPhoneCallInformation() {
        return phoneCallInformation;
    }

    /**
     * Sets the value of the phoneCallInformation property.
     *
     * @param value allowed object is {@link PhoneCallInformationType }
     */
    public void setPhoneCallInformation(PhoneCallInformationType value) {
        this.phoneCallInformation = value;
    }
}
