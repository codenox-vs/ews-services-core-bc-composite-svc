package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for VotingOptionDataType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="VotingOptionDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendPrompt" type="{http://schemas.microsoft.com/exchange/services/2006/types}SendPromptType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "VotingOptionDataType",
        propOrder = {"displayName", "sendPrompt"})
public class VotingOptionDataType {

    @XmlElement(name = "DisplayName")
    protected String displayName;

    @XmlElement(name = "SendPrompt")
    protected SendPromptType sendPrompt;

    /**
     * Gets the value of the displayName property.
     *
     * @return possible object is {@link String }
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the sendPrompt property.
     *
     * @return possible object is {@link SendPromptType }
     */
    public SendPromptType getSendPrompt() {
        return sendPrompt;
    }

    /**
     * Sets the value of the sendPrompt property.
     *
     * @param value allowed object is {@link SendPromptType }
     */
    public void setSendPrompt(SendPromptType value) {
        this.sendPrompt = value;
    }
}
