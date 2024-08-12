package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for RecognitionIdType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RecognitionIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="RequestId" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecognitionIdType")
public class RecognitionIdType {

    @XmlAttribute(name = "RequestId", required = true)
    protected String requestId;

    /**
     * Gets the value of the requestId property.
     *
     * @return possible object is {@link String }
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }
}
