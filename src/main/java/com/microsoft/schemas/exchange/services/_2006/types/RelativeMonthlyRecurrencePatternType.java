package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for RelativeMonthlyRecurrencePatternType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RelativeMonthlyRecurrencePatternType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}IntervalRecurrencePatternBaseType">
 *       &lt;sequence>
 *         &lt;element name="DaysOfWeek" type="{http://schemas.microsoft.com/exchange/services/2006/types}DayOfWeekType"/>
 *         &lt;element name="DayOfWeekIndex" type="{http://schemas.microsoft.com/exchange/services/2006/types}DayOfWeekIndexType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "RelativeMonthlyRecurrencePatternType",
        propOrder = {"daysOfWeek", "dayOfWeekIndex"})
public class RelativeMonthlyRecurrencePatternType extends IntervalRecurrencePatternBaseType {

    @XmlElement(name = "DaysOfWeek", required = true)
    protected DayOfWeekType daysOfWeek;

    @XmlElement(name = "DayOfWeekIndex", required = true)
    protected DayOfWeekIndexType dayOfWeekIndex;

    /**
     * Gets the value of the daysOfWeek property.
     *
     * @return possible object is {@link DayOfWeekType }
     */
    public DayOfWeekType getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * Sets the value of the daysOfWeek property.
     *
     * @param value allowed object is {@link DayOfWeekType }
     */
    public void setDaysOfWeek(DayOfWeekType value) {
        this.daysOfWeek = value;
    }

    /**
     * Gets the value of the dayOfWeekIndex property.
     *
     * @return possible object is {@link DayOfWeekIndexType }
     */
    public DayOfWeekIndexType getDayOfWeekIndex() {
        return dayOfWeekIndex;
    }

    /**
     * Sets the value of the dayOfWeekIndex property.
     *
     * @param value allowed object is {@link DayOfWeekIndexType }
     */
    public void setDayOfWeekIndex(DayOfWeekIndexType value) {
        this.dayOfWeekIndex = value;
    }
}
