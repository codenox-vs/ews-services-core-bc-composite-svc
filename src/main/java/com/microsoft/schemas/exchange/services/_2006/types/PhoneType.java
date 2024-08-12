package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for PhoneType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PhoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginalPhoneString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "PhoneType",
        propOrder = {"originalPhoneString", "phoneString", "type"})
public class PhoneType {

    @XmlElement(name = "OriginalPhoneString")
    protected String originalPhoneString;

    @XmlElement(name = "PhoneString")
    protected String phoneString;

    @XmlElement(name = "Type")
    protected String type;

    /**
     * Gets the value of the originalPhoneString property.
     *
     * @return possible object is {@link String }
     */
    public String getOriginalPhoneString() {
        return originalPhoneString;
    }

    /**
     * Sets the value of the originalPhoneString property.
     *
     * @param value allowed object is {@link String }
     */
    public void setOriginalPhoneString(String value) {
        this.originalPhoneString = value;
    }

    /**
     * Gets the value of the phoneString property.
     *
     * @return possible object is {@link String }
     */
    public String getPhoneString() {
        return phoneString;
    }

    /**
     * Sets the value of the phoneString property.
     *
     * @param value allowed object is {@link String }
     */
    public void setPhoneString(String value) {
        this.phoneString = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }
}
