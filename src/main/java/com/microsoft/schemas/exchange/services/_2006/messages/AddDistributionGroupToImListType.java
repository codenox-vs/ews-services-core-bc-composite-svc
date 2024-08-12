package com.microsoft.schemas.exchange.services._2006.messages;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for AddDistributionGroupToImListType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AddDistributionGroupToImListType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="SmtpAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/>
 *         &lt;element name="DisplayName" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "AddDistributionGroupToImListType",
        propOrder = {"smtpAddress", "displayName"})
public class AddDistributionGroupToImListType extends BaseRequestType {

    @XmlElement(name = "SmtpAddress", required = true)
    protected String smtpAddress;

    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;

    /**
     * Gets the value of the smtpAddress property.
     *
     * @return possible object is {@link String }
     */
    public String getSmtpAddress() {
        return smtpAddress;
    }

    /**
     * Sets the value of the smtpAddress property.
     *
     * @param value allowed object is {@link String }
     */
    public void setSmtpAddress(String value) {
        this.smtpAddress = value;
    }

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
}
