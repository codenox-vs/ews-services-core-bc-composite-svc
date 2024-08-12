package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;

/**
 * Java class for NormalizedBodyType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NormalizedBodyType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="NormalizedBodyType" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}BodyTypeType" />
 *       &lt;attribute name="IsTruncated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NormalizedBodyType",
        propOrder = {"value"})
public class NormalizedBodyType {

    @XmlValue protected String value;

    @XmlAttribute(name = "NormalizedBodyType", required = true)
    protected BodyTypeType normalizedBodyType;

    @XmlAttribute(name = "IsTruncated")
    protected Boolean isTruncated;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the normalizedBodyType property.
     *
     * @return possible object is {@link BodyTypeType }
     */
    public BodyTypeType getNormalizedBodyType() {
        return normalizedBodyType;
    }

    /**
     * Sets the value of the normalizedBodyType property.
     *
     * @param value allowed object is {@link BodyTypeType }
     */
    public void setNormalizedBodyType(BodyTypeType value) {
        this.normalizedBodyType = value;
    }

    /**
     * Gets the value of the isTruncated property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * Sets the value of the isTruncated property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIsTruncated(Boolean value) {
        this.isTruncated = value;
    }
}
