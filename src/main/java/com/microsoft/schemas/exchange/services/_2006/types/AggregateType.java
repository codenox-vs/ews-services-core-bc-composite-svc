package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for AggregateType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="AggregateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Minimum"/>
 *     &lt;enumeration value="Maximum"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "AggregateType")
@XmlEnum
public enum AggregateType {
    @XmlEnumValue("Minimum")
    MINIMUM("Minimum"),
    @XmlEnumValue("Maximum")
    MAXIMUM("Maximum");
    private final String value;

    AggregateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AggregateType fromValue(String v) {
        for (AggregateType c : AggregateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
