package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.ArrayOfDiscoverySearchConfigurationType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Response message type for the GetDiscoverySearchConfiguration web method.
 *
 * <p>Java class for GetDiscoverySearchConfigurationResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetDiscoverySearchConfigurationResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="DiscoverySearchConfigurations" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfDiscoverySearchConfigurationType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetDiscoverySearchConfigurationResponseMessageType",
        propOrder = {"discoverySearchConfigurations"})
public class GetDiscoverySearchConfigurationResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "DiscoverySearchConfigurations", required = true)
    protected ArrayOfDiscoverySearchConfigurationType discoverySearchConfigurations;

    /**
     * Gets the value of the discoverySearchConfigurations property.
     *
     * @return possible object is {@link ArrayOfDiscoverySearchConfigurationType }
     */
    public ArrayOfDiscoverySearchConfigurationType getDiscoverySearchConfigurations() {
        return discoverySearchConfigurations;
    }

    /**
     * Sets the value of the discoverySearchConfigurations property.
     *
     * @param value allowed object is {@link ArrayOfDiscoverySearchConfigurationType }
     */
    public void setDiscoverySearchConfigurations(ArrayOfDiscoverySearchConfigurationType value) {
        this.discoverySearchConfigurations = value;
    }
}
