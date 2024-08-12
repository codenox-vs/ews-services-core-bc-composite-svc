package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for NonEmptyArrayOfBaseItemIdsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfBaseItemIdsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/>
 *         &lt;element name="OccurrenceItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}OccurrenceItemIdType"/>
 *         &lt;element name="RecurringMasterItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}RecurringMasterItemIdType"/>
 *         &lt;element name="RecurringMasterItemIdRanges" type="{http://schemas.microsoft.com/exchange/services/2006/types}RecurringMasterItemIdRangesType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NonEmptyArrayOfBaseItemIdsType",
        propOrder = {"itemIdOrOccurrenceItemIdOrRecurringMasterItemId"})
public class NonEmptyArrayOfBaseItemIdsType {

    @XmlElements({
        @XmlElement(name = "OccurrenceItemId", type = OccurrenceItemIdType.class),
        @XmlElement(name = "RecurringMasterItemId", type = RecurringMasterItemIdType.class),
        @XmlElement(name = "ItemId", type = ItemIdType.class),
        @XmlElement(
                name = "RecurringMasterItemIdRanges",
                type = RecurringMasterItemIdRangesType.class)
    })
    protected List<BaseItemIdType> itemIdOrOccurrenceItemIdOrRecurringMasterItemId;

    /**
     * Gets the value of the itemIdOrOccurrenceItemIdOrRecurringMasterItemId property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the
     * itemIdOrOccurrenceItemIdOrRecurringMasterItemId property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getItemIdOrOccurrenceItemIdOrRecurringMasterItemId().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link OccurrenceItemIdType }
     * {@link RecurringMasterItemIdType } {@link ItemIdType } {@link RecurringMasterItemIdRangesType
     * }
     */
    public List<BaseItemIdType> getItemIdOrOccurrenceItemIdOrRecurringMasterItemId() {
        if (itemIdOrOccurrenceItemIdOrRecurringMasterItemId == null) {
            itemIdOrOccurrenceItemIdOrRecurringMasterItemId = new ArrayList<BaseItemIdType>();
        }
        return this.itemIdOrOccurrenceItemIdOrRecurringMasterItemId;
    }
}
