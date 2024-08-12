package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for ArrayOfExtendedPropertyAttributedValueType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfExtendedPropertyAttributedValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtendedPropertyAttributedValue" type="{http://schemas.microsoft.com/exchange/services/2006/types}ExtendedPropertyAttributedValueType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ArrayOfExtendedPropertyAttributedValueType",
        propOrder = {"extendedPropertyAttributedValue"})
public class ArrayOfExtendedPropertyAttributedValueType {

    @XmlElement(name = "ExtendedPropertyAttributedValue")
    protected List<ExtendedPropertyAttributedValueType> extendedPropertyAttributedValue;

    /**
     * Gets the value of the extendedPropertyAttributedValue property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the extendedPropertyAttributedValue property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getExtendedPropertyAttributedValue().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link
     * ExtendedPropertyAttributedValueType }
     */
    public List<ExtendedPropertyAttributedValueType> getExtendedPropertyAttributedValue() {
        if (extendedPropertyAttributedValue == null) {
            extendedPropertyAttributedValue = new ArrayList<ExtendedPropertyAttributedValueType>();
        }
        return this.extendedPropertyAttributedValue;
    }
}
