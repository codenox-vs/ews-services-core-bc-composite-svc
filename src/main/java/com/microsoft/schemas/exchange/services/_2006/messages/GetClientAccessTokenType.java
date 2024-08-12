package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.NonEmptyArrayOfClientAccessTokenRequestsType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for GetClientAccessTokenType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetClientAccessTokenType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="TokenRequests" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfClientAccessTokenRequestsType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetClientAccessTokenType",
        propOrder = {"tokenRequests"})
public class GetClientAccessTokenType extends BaseRequestType {

    @XmlElement(name = "TokenRequests", required = true)
    protected NonEmptyArrayOfClientAccessTokenRequestsType tokenRequests;

    /**
     * Gets the value of the tokenRequests property.
     *
     * @return possible object is {@link NonEmptyArrayOfClientAccessTokenRequestsType }
     */
    public NonEmptyArrayOfClientAccessTokenRequestsType getTokenRequests() {
        return tokenRequests;
    }

    /**
     * Sets the value of the tokenRequests property.
     *
     * @param value allowed object is {@link NonEmptyArrayOfClientAccessTokenRequestsType }
     */
    public void setTokenRequests(NonEmptyArrayOfClientAccessTokenRequestsType value) {
        this.tokenRequests = value;
    }
}
