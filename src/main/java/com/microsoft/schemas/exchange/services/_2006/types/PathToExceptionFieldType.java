package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for PathToExceptionFieldType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PathToExceptionFieldType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BasePathToElementType">
 *       &lt;attribute name="FieldURI" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}ExceptionPropertyURIType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PathToExceptionFieldType")
public class PathToExceptionFieldType extends BasePathToElementType {

    @XmlAttribute(name = "FieldURI", required = true)
    protected ExceptionPropertyURIType fieldURI;

    /**
     * Gets the value of the fieldURI property.
     *
     * @return possible object is {@link ExceptionPropertyURIType }
     */
    public ExceptionPropertyURIType getFieldURI() {
        return fieldURI;
    }

    /**
     * Sets the value of the fieldURI property.
     *
     * @param value allowed object is {@link ExceptionPropertyURIType }
     */
    public void setFieldURI(ExceptionPropertyURIType value) {
        this.fieldURI = value;
    }
}
