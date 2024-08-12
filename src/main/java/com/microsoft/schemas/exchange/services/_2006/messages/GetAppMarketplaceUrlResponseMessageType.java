package com.microsoft.schemas.exchange.services._2006.messages;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for GetAppMarketplaceUrlResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetAppMarketplaceUrlResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="AppMarketplaceUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetAppMarketplaceUrlResponseMessageType",
        propOrder = {"appMarketplaceUrl"})
public class GetAppMarketplaceUrlResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "AppMarketplaceUrl")
    protected String appMarketplaceUrl;

    /**
     * Gets the value of the appMarketplaceUrl property.
     *
     * @return possible object is {@link String }
     */
    public String getAppMarketplaceUrl() {
        return appMarketplaceUrl;
    }

    /**
     * Sets the value of the appMarketplaceUrl property.
     *
     * @param value allowed object is {@link String }
     */
    public void setAppMarketplaceUrl(String value) {
        this.appMarketplaceUrl = value;
    }
}
