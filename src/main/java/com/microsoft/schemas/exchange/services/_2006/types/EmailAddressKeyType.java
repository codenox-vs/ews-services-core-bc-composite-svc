package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for EmailAddressKeyType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="EmailAddressKeyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EmailAddress1"/>
 *     &lt;enumeration value="EmailAddress2"/>
 *     &lt;enumeration value="EmailAddress3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "EmailAddressKeyType")
@XmlEnum
public enum EmailAddressKeyType {
    @XmlEnumValue("EmailAddress1")
    EMAIL_ADDRESS_1("EmailAddress1"),
    @XmlEnumValue("EmailAddress2")
    EMAIL_ADDRESS_2("EmailAddress2"),
    @XmlEnumValue("EmailAddress3")
    EMAIL_ADDRESS_3("EmailAddress3");
    private final String value;

    EmailAddressKeyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailAddressKeyType fromValue(String v) {
        for (EmailAddressKeyType c : EmailAddressKeyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
