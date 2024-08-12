package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for DateTimePrecisionType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="DateTimePrecisionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Seconds"/>
 *     &lt;enumeration value="Milliseconds"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "DateTimePrecisionType")
@XmlEnum
public enum DateTimePrecisionType {
    @XmlEnumValue("Seconds")
    SECONDS("Seconds"),
    @XmlEnumValue("Milliseconds")
    MILLISECONDS("Milliseconds");
    private final String value;

    DateTimePrecisionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateTimePrecisionType fromValue(String v) {
        for (DateTimePrecisionType c : DateTimePrecisionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
