package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for BasePagingType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BasePagingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="MaxEntriesReturned" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasePagingType")
@XmlSeeAlso({
    FractionalPageViewType.class,
    SeekToConditionPageViewType.class,
    IndexedPageViewType.class,
    CalendarViewType.class,
    ContactsViewType.class
})
public abstract class BasePagingType {

    @XmlAttribute(name = "MaxEntriesReturned")
    protected Integer maxEntriesReturned;

    /**
     * Gets the value of the maxEntriesReturned property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getMaxEntriesReturned() {
        return maxEntriesReturned;
    }

    /**
     * Sets the value of the maxEntriesReturned property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setMaxEntriesReturned(Integer value) {
        this.maxEntriesReturned = value;
    }
}
