package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for SearchResultType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="SearchResultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="StatisticsOnly"/>
 *     &lt;enumeration value="PreviewOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "SearchResultType")
@XmlEnum
public enum SearchResultType {
    @XmlEnumValue("StatisticsOnly")
    STATISTICS_ONLY("StatisticsOnly"),
    @XmlEnumValue("PreviewOnly")
    PREVIEW_ONLY("PreviewOnly");
    private final String value;

    SearchResultType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchResultType fromValue(String v) {
        for (SearchResultType c : SearchResultType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
