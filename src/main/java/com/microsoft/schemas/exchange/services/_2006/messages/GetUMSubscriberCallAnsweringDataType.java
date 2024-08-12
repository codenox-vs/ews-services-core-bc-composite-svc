package com.microsoft.schemas.exchange.services._2006.messages;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.Duration;

/**
 * Java class for GetUMSubscriberCallAnsweringDataType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetUMSubscriberCallAnsweringDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="Timeout" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetUMSubscriberCallAnsweringDataType",
        propOrder = {"timeout"})
public class GetUMSubscriberCallAnsweringDataType extends BaseRequestType {

    @XmlElement(name = "Timeout", required = true)
    protected Duration timeout;

    /**
     * Gets the value of the timeout property.
     *
     * @return possible object is {@link Duration }
     */
    public Duration getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     *
     * @param value allowed object is {@link Duration }
     */
    public void setTimeout(Duration value) {
        this.timeout = value;
    }
}
