package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for CalendarItemTypeType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="CalendarItemTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Single"/>
 *     &lt;enumeration value="Occurrence"/>
 *     &lt;enumeration value="Exception"/>
 *     &lt;enumeration value="RecurringMaster"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "CalendarItemTypeType")
@XmlEnum
public enum CalendarItemTypeType {
    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("Occurrence")
    OCCURRENCE("Occurrence"),
    @XmlEnumValue("Exception")
    EXCEPTION("Exception"),
    @XmlEnumValue("RecurringMaster")
    RECURRING_MASTER("RecurringMaster");
    private final String value;

    CalendarItemTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarItemTypeType fromValue(String v) {
        for (CalendarItemTypeType c : CalendarItemTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
