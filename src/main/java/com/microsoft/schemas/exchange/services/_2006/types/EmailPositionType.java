package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for EmailPositionType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="EmailPositionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LatestReply"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Subject"/>
 *     &lt;enumeration value="Signature"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "EmailPositionType")
@XmlEnum
public enum EmailPositionType {
    @XmlEnumValue("LatestReply")
    LATEST_REPLY("LatestReply"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Subject")
    SUBJECT("Subject"),
    @XmlEnumValue("Signature")
    SIGNATURE("Signature");
    private final String value;

    EmailPositionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailPositionType fromValue(String v) {
        for (EmailPositionType c : EmailPositionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
