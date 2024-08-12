package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for RetentionType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="RetentionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Archive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "RetentionType")
@XmlEnum
public enum RetentionType {
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Archive")
    ARCHIVE("Archive");
    private final String value;

    RetentionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RetentionType fromValue(String v) {
        for (RetentionType c : RetentionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
