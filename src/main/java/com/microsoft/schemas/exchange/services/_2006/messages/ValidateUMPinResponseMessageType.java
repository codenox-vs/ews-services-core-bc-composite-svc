package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.PinInfoType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ValidateUMPinResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ValidateUMPinResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="PinInfo" type="{http://schemas.microsoft.com/exchange/services/2006/types}PinInfoType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ValidateUMPinResponseMessageType",
        propOrder = {"pinInfo"})
public class ValidateUMPinResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "PinInfo", required = true)
    protected PinInfoType pinInfo;

    /**
     * Gets the value of the pinInfo property.
     *
     * @return possible object is {@link PinInfoType }
     */
    public PinInfoType getPinInfo() {
        return pinInfo;
    }

    /**
     * Sets the value of the pinInfo property.
     *
     * @param value allowed object is {@link PinInfoType }
     */
    public void setPinInfo(PinInfoType value) {
        this.pinInfo = value;
    }
}
