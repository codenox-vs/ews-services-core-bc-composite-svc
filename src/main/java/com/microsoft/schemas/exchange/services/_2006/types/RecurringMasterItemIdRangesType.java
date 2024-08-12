package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for RecurringMasterItemIdRangesType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RecurringMasterItemIdRangesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType">
 *       &lt;sequence>
 *         &lt;element name="Ranges" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfOccurrenceRangesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "RecurringMasterItemIdRangesType",
        propOrder = {"ranges"})
public class RecurringMasterItemIdRangesType extends ItemIdType {

    @XmlElement(name = "Ranges")
    protected ArrayOfOccurrenceRangesType ranges;

    /**
     * Gets the value of the ranges property.
     *
     * @return possible object is {@link ArrayOfOccurrenceRangesType }
     */
    public ArrayOfOccurrenceRangesType getRanges() {
        return ranges;
    }

    /**
     * Sets the value of the ranges property.
     *
     * @param value allowed object is {@link ArrayOfOccurrenceRangesType }
     */
    public void setRanges(ArrayOfOccurrenceRangesType value) {
        this.ranges = value;
    }
}
