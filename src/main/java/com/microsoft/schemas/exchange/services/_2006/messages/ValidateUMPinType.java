package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.PinInfoType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ValidateUMPinType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ValidateUMPinType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="PinInfo" type="{http://schemas.microsoft.com/exchange/services/2006/types}PinInfoType" minOccurs="0"/>
 *         &lt;element name="UserUMMailboxPolicyGuid" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ValidateUMPinType",
        propOrder = {"pinInfo", "userUMMailboxPolicyGuid"})
public class ValidateUMPinType extends BaseRequestType {

    @XmlElement(name = "PinInfo")
    protected PinInfoType pinInfo;

    @XmlElement(name = "UserUMMailboxPolicyGuid", required = true)
    protected String userUMMailboxPolicyGuid;

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

    /**
     * Gets the value of the userUMMailboxPolicyGuid property.
     *
     * @return possible object is {@link String }
     */
    public String getUserUMMailboxPolicyGuid() {
        return userUMMailboxPolicyGuid;
    }

    /**
     * Sets the value of the userUMMailboxPolicyGuid property.
     *
     * @param value allowed object is {@link String }
     */
    public void setUserUMMailboxPolicyGuid(String value) {
        this.userUMMailboxPolicyGuid = value;
    }
}
