package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for PushSubscriptionRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PushSubscriptionRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseSubscriptionRequestType">
 *       &lt;sequence>
 *         &lt;element name="StatusFrequency" type="{http://schemas.microsoft.com/exchange/services/2006/types}SubscriptionStatusFrequencyType"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CallerData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "PushSubscriptionRequestType",
        propOrder = {"statusFrequency", "url", "callerData"})
public class PushSubscriptionRequestType extends BaseSubscriptionRequestType {

    @XmlElement(name = "StatusFrequency")
    protected int statusFrequency;

    @XmlElement(name = "URL", required = true)
    protected String url;

    @XmlElement(name = "CallerData")
    protected String callerData;

    /** Gets the value of the statusFrequency property. */
    public int getStatusFrequency() {
        return statusFrequency;
    }

    /** Sets the value of the statusFrequency property. */
    public void setStatusFrequency(int value) {
        this.statusFrequency = value;
    }

    /**
     * Gets the value of the url property.
     *
     * @return possible object is {@link String }
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     *
     * @param value allowed object is {@link String }
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the callerData property.
     *
     * @return possible object is {@link String }
     */
    public String getCallerData() {
        return callerData;
    }

    /**
     * Sets the value of the callerData property.
     *
     * @param value allowed object is {@link String }
     */
    public void setCallerData(String value) {
        this.callerData = value;
    }
}
