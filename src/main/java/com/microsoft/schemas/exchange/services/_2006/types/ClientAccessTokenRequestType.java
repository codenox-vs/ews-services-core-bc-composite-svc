package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ClientAccessTokenRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ClientAccessTokenRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TokenType" type="{http://schemas.microsoft.com/exchange/services/2006/types}ClientAccessTokenTypeType"/>
 *         &lt;element name="Scope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ClientAccessTokenRequestType",
        propOrder = {"id", "tokenType", "scope"})
public class ClientAccessTokenRequestType {

    @XmlElement(name = "Id", required = true)
    protected String id;

    @XmlElement(name = "TokenType", required = true)
    protected ClientAccessTokenTypeType tokenType;

    @XmlElement(name = "Scope")
    protected String scope;

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the tokenType property.
     *
     * @return possible object is {@link ClientAccessTokenTypeType }
     */
    public ClientAccessTokenTypeType getTokenType() {
        return tokenType;
    }

    /**
     * Sets the value of the tokenType property.
     *
     * @param value allowed object is {@link ClientAccessTokenTypeType }
     */
    public void setTokenType(ClientAccessTokenTypeType value) {
        this.tokenType = value;
    }

    /**
     * Gets the value of the scope property.
     *
     * @return possible object is {@link String }
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     *
     * @param value allowed object is {@link String }
     */
    public void setScope(String value) {
        this.scope = value;
    }
}
