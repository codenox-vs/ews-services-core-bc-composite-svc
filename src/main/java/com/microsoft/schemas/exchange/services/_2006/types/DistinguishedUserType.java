package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for DistinguishedUserType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="DistinguishedUserType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Anonymous"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "DistinguishedUserType")
@XmlEnum
public enum DistinguishedUserType {
    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Anonymous")
    ANONYMOUS("Anonymous");
    private final String value;

    DistinguishedUserType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistinguishedUserType fromValue(String v) {
        for (DistinguishedUserType c : DistinguishedUserType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
