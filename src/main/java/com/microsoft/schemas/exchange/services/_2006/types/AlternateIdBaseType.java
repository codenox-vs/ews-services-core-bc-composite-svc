package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Surfaces alternate representations of an item or folder id. No change key is included.
 *
 * <p>Java class for AlternateIdBaseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AlternateIdBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Format" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}IdFormatType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateIdBaseType")
@XmlSeeAlso({AlternateIdType.class, AlternatePublicFolderIdType.class})
public abstract class AlternateIdBaseType {

    @XmlAttribute(name = "Format", required = true)
    protected IdFormatType format;

    /**
     * Gets the value of the format property.
     *
     * @return possible object is {@link IdFormatType }
     */
    public IdFormatType getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     *
     * @param value allowed object is {@link IdFormatType }
     */
    public void setFormat(IdFormatType value) {
        this.format = value;
    }
}
