package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.UserConfigurationType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for UpdateUserConfigurationType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UpdateUserConfigurationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="UserConfiguration" type="{http://schemas.microsoft.com/exchange/services/2006/types}UserConfigurationType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "UpdateUserConfigurationType",
        propOrder = {"userConfiguration"})
public class UpdateUserConfigurationType extends BaseRequestType {

    @XmlElement(name = "UserConfiguration", required = true)
    protected UserConfigurationType userConfiguration;

    /**
     * Gets the value of the userConfiguration property.
     *
     * @return possible object is {@link UserConfigurationType }
     */
    public UserConfigurationType getUserConfiguration() {
        return userConfiguration;
    }

    /**
     * Sets the value of the userConfiguration property.
     *
     * @param value allowed object is {@link UserConfigurationType }
     */
    public void setUserConfiguration(UserConfigurationType value) {
        this.userConfiguration = value;
    }
}
