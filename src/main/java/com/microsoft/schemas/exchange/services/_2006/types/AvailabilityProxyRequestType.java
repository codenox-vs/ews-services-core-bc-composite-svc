package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for AvailabilityProxyRequestType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="AvailabilityProxyRequestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CrossSite"/>
 *     &lt;enumeration value="CrossForest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "AvailabilityProxyRequestType")
@XmlEnum
public enum AvailabilityProxyRequestType {
    @XmlEnumValue("CrossSite")
    CROSS_SITE("CrossSite"),
    @XmlEnumValue("CrossForest")
    CROSS_FOREST("CrossForest");
    private final String value;

    AvailabilityProxyRequestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvailabilityProxyRequestType fromValue(String v) {
        for (AvailabilityProxyRequestType c : AvailabilityProxyRequestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
