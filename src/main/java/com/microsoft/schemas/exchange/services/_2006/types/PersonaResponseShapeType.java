package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for PersonaResponseShapeType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PersonaResponseShapeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}DefaultShapeNamesType"/>
 *         &lt;element name="AdditionalProperties" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfPathsToElementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "PersonaResponseShapeType",
        propOrder = {"baseShape", "additionalProperties"})
public class PersonaResponseShapeType {

    @XmlElement(name = "BaseShape", required = true)
    protected DefaultShapeNamesType baseShape;

    @XmlElement(name = "AdditionalProperties")
    protected NonEmptyArrayOfPathsToElementType additionalProperties;

    /**
     * Gets the value of the baseShape property.
     *
     * @return possible object is {@link DefaultShapeNamesType }
     */
    public DefaultShapeNamesType getBaseShape() {
        return baseShape;
    }

    /**
     * Sets the value of the baseShape property.
     *
     * @param value allowed object is {@link DefaultShapeNamesType }
     */
    public void setBaseShape(DefaultShapeNamesType value) {
        this.baseShape = value;
    }

    /**
     * Gets the value of the additionalProperties property.
     *
     * @return possible object is {@link NonEmptyArrayOfPathsToElementType }
     */
    public NonEmptyArrayOfPathsToElementType getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Sets the value of the additionalProperties property.
     *
     * @param value allowed object is {@link NonEmptyArrayOfPathsToElementType }
     */
    public void setAdditionalProperties(NonEmptyArrayOfPathsToElementType value) {
        this.additionalProperties = value;
    }
}
