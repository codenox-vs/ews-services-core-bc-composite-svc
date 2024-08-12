package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ConnectionStatusType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="ConnectionStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Closed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ConnectionStatusType")
@XmlEnum
public enum ConnectionStatusType {
    OK("OK"),
    @XmlEnumValue("Closed")
    CLOSED("Closed");
    private final String value;

    ConnectionStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectionStatusType fromValue(String v) {
        for (ConnectionStatusType c : ConnectionStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
