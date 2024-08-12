package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ReminderGroupType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="ReminderGroupType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Calendar"/>
 *     &lt;enumeration value="Task"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ReminderGroupType")
@XmlEnum
public enum ReminderGroupType {
    @XmlEnumValue("Calendar")
    CALENDAR("Calendar"),
    @XmlEnumValue("Task")
    TASK("Task");
    private final String value;

    ReminderGroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReminderGroupType fromValue(String v) {
        for (ReminderGroupType c : ReminderGroupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
