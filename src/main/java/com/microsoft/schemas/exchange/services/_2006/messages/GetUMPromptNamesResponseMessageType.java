package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.ArrayOfStringsType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for GetUMPromptNamesResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetUMPromptNamesResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="PromptNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetUMPromptNamesResponseMessageType",
        propOrder = {"promptNames"})
public class GetUMPromptNamesResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "PromptNames")
    protected ArrayOfStringsType promptNames;

    /**
     * Gets the value of the promptNames property.
     *
     * @return possible object is {@link ArrayOfStringsType }
     */
    public ArrayOfStringsType getPromptNames() {
        return promptNames;
    }

    /**
     * Sets the value of the promptNames property.
     *
     * @param value allowed object is {@link ArrayOfStringsType }
     */
    public void setPromptNames(ArrayOfStringsType value) {
        this.promptNames = value;
    }
}
