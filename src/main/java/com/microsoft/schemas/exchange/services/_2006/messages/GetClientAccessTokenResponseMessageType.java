package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.ClientAccessTokenType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for GetClientAccessTokenResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetClientAccessTokenResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="Token" type="{http://schemas.microsoft.com/exchange/services/2006/types}ClientAccessTokenType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetClientAccessTokenResponseMessageType",
        propOrder = {"token"})
public class GetClientAccessTokenResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "Token")
    protected ClientAccessTokenType token;

    /**
     * Gets the value of the token property.
     *
     * @return possible object is {@link ClientAccessTokenType }
     */
    public ClientAccessTokenType getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     *
     * @param value allowed object is {@link ClientAccessTokenType }
     */
    public void setToken(ClientAccessTokenType value) {
        this.token = value;
    }
}
