package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.ArrayOfClientExtensionsType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ClientExtensionResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ClientExtensionResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="ClientExtensions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfClientExtensionsType" minOccurs="0"/>
 *         &lt;element name="RawMasterTableXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ClientExtensionResponseType",
        propOrder = {"clientExtensions", "rawMasterTableXml"})
public class ClientExtensionResponseType extends ResponseMessageType {

    @XmlElement(name = "ClientExtensions")
    protected ArrayOfClientExtensionsType clientExtensions;

    @XmlElement(name = "RawMasterTableXml")
    protected String rawMasterTableXml;

    /**
     * Gets the value of the clientExtensions property.
     *
     * @return possible object is {@link ArrayOfClientExtensionsType }
     */
    public ArrayOfClientExtensionsType getClientExtensions() {
        return clientExtensions;
    }

    /**
     * Sets the value of the clientExtensions property.
     *
     * @param value allowed object is {@link ArrayOfClientExtensionsType }
     */
    public void setClientExtensions(ArrayOfClientExtensionsType value) {
        this.clientExtensions = value;
    }

    /**
     * Gets the value of the rawMasterTableXml property.
     *
     * @return possible object is {@link String }
     */
    public String getRawMasterTableXml() {
        return rawMasterTableXml;
    }

    /**
     * Sets the value of the rawMasterTableXml property.
     *
     * @param value allowed object is {@link String }
     */
    public void setRawMasterTableXml(String value) {
        this.rawMasterTableXml = value;
    }
}
