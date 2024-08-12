package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for UMCDRGroupByType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="UMCDRGroupByType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Day"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Total"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "UMCDRGroupByType")
@XmlEnum
public enum UMCDRGroupByType {
    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Total")
    TOTAL("Total");
    private final String value;

    UMCDRGroupByType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UMCDRGroupByType fromValue(String v) {
        for (UMCDRGroupByType c : UMCDRGroupByType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
