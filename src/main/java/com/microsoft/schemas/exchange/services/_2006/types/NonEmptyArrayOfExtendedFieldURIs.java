package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for NonEmptyArrayOfExtendedFieldURIs complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfExtendedFieldURIs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="ExtendedProperty" type="{http://schemas.microsoft.com/exchange/services/2006/types}PathToExtendedFieldType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NonEmptyArrayOfExtendedFieldURIs",
        propOrder = {"extendedProperty"})
public class NonEmptyArrayOfExtendedFieldURIs {

    @XmlElement(name = "ExtendedProperty")
    protected List<PathToExtendedFieldType> extendedProperty;

    /**
     * Gets the value of the extendedProperty property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the extendedProperty property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getExtendedProperty().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link PathToExtendedFieldType }
     */
    public List<PathToExtendedFieldType> getExtendedProperty() {
        if (extendedProperty == null) {
            extendedProperty = new ArrayList<PathToExtendedFieldType>();
        }
        return this.extendedProperty;
    }
}
