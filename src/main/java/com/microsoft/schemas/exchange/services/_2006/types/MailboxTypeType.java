package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for MailboxTypeType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="MailboxTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="OneOff"/>
 *     &lt;enumeration value="Mailbox"/>
 *     &lt;enumeration value="PublicDL"/>
 *     &lt;enumeration value="PrivateDL"/>
 *     &lt;enumeration value="Contact"/>
 *     &lt;enumeration value="PublicFolder"/>
 *     &lt;enumeration value="GroupMailbox"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "MailboxTypeType")
@XmlEnum
public enum MailboxTypeType {
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("OneOff")
    ONE_OFF("OneOff"),
    @XmlEnumValue("Mailbox")
    MAILBOX("Mailbox"),
    @XmlEnumValue("PublicDL")
    PUBLIC_DL("PublicDL"),
    @XmlEnumValue("PrivateDL")
    PRIVATE_DL("PrivateDL"),
    @XmlEnumValue("Contact")
    CONTACT("Contact"),
    @XmlEnumValue("PublicFolder")
    PUBLIC_FOLDER("PublicFolder"),
    @XmlEnumValue("GroupMailbox")
    GROUP_MAILBOX("GroupMailbox");
    private final String value;

    MailboxTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailboxTypeType fromValue(String v) {
        for (MailboxTypeType c : MailboxTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
