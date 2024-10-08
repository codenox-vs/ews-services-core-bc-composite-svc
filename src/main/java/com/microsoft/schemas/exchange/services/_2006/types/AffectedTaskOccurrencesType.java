package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for AffectedTaskOccurrencesType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="AffectedTaskOccurrencesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AllOccurrences"/>
 *     &lt;enumeration value="SpecifiedOccurrenceOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "AffectedTaskOccurrencesType")
@XmlEnum
public enum AffectedTaskOccurrencesType {
    @XmlEnumValue("AllOccurrences")
    ALL_OCCURRENCES("AllOccurrences"),
    @XmlEnumValue("SpecifiedOccurrenceOnly")
    SPECIFIED_OCCURRENCE_ONLY("SpecifiedOccurrenceOnly");
    private final String value;

    AffectedTaskOccurrencesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AffectedTaskOccurrencesType fromValue(String v) {
        for (AffectedTaskOccurrencesType c : AffectedTaskOccurrencesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
