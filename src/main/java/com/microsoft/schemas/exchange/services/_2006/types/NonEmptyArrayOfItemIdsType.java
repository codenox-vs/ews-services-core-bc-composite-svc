package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for NonEmptyArrayOfItemIdsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfItemIdsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NonEmptyArrayOfItemIdsType",
        propOrder = {"itemId"})
public class NonEmptyArrayOfItemIdsType {

    @XmlElement(name = "ItemId", required = true)
    protected List<ItemIdType> itemId;

    /**
     * Gets the value of the itemId property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the itemId property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getItemId().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link ItemIdType }
     */
    public List<ItemIdType> getItemId() {
        if (itemId == null) {
            itemId = new ArrayList<ItemIdType>();
        }
        return this.itemId;
    }
}
