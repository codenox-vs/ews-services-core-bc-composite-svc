package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for PresentersType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="PresentersType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="Internal"/>
 *     &lt;enumeration value="Everyone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "PresentersType")
@XmlEnum
public enum PresentersType {
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("Everyone")
    EVERYONE("Everyone");
    private final String value;

    PresentersType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PresentersType fromValue(String v) {
        for (PresentersType c : PresentersType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
