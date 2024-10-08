package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for PullSubscriptionRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PullSubscriptionRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseSubscriptionRequestType">
 *       &lt;sequence>
 *         &lt;element name="Timeout" type="{http://schemas.microsoft.com/exchange/services/2006/types}SubscriptionTimeoutType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "PullSubscriptionRequestType",
        propOrder = {"timeout"})
public class PullSubscriptionRequestType extends BaseSubscriptionRequestType {

    @XmlElement(name = "Timeout")
    protected int timeout;

    /** Gets the value of the timeout property. */
    public int getTimeout() {
        return timeout;
    }

    /** Sets the value of the timeout property. */
    public void setTimeout(int value) {
        this.timeout = value;
    }
}
