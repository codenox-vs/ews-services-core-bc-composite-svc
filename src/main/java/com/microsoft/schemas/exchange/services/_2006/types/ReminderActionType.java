package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ReminderActionType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="ReminderActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Dismiss"/>
 *     &lt;enumeration value="Snooze"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ReminderActionType")
@XmlEnum
public enum ReminderActionType {
    @XmlEnumValue("Dismiss")
    DISMISS("Dismiss"),
    @XmlEnumValue("Snooze")
    SNOOZE("Snooze");
    private final String value;

    ReminderActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReminderActionType fromValue(String v) {
        for (ReminderActionType c : ReminderActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
