package com.microsoft.schemas.exchange.services._2006.messages;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for AddImGroupType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AddImGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "AddImGroupType",
        propOrder = {"displayName"})
public class AddImGroupType extends BaseRequestType {

    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;

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
