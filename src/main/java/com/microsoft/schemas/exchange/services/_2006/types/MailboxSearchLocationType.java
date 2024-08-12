package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for MailboxSearchLocationType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="MailboxSearchLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PrimaryOnly"/>
 *     &lt;enumeration value="ArchiveOnly"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "MailboxSearchLocationType")
@XmlEnum
public enum MailboxSearchLocationType {
    @XmlEnumValue("PrimaryOnly")
    PRIMARY_ONLY("PrimaryOnly"),
    @XmlEnumValue("ArchiveOnly")
    ARCHIVE_ONLY("ArchiveOnly"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    MailboxSearchLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailboxSearchLocationType fromValue(String v) {
        for (MailboxSearchLocationType c : MailboxSearchLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
