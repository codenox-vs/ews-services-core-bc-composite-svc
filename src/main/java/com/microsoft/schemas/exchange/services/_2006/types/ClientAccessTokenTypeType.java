package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ClientAccessTokenTypeType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="ClientAccessTokenTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CallerIdentity"/>
 *     &lt;enumeration value="ExtensionCallback"/>
 *     &lt;enumeration value="ScopedToken"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ClientAccessTokenTypeType")
@XmlEnum
public enum ClientAccessTokenTypeType {
    @XmlEnumValue("CallerIdentity")
    CALLER_IDENTITY("CallerIdentity"),
    @XmlEnumValue("ExtensionCallback")
    EXTENSION_CALLBACK("ExtensionCallback"),
    @XmlEnumValue("ScopedToken")
    SCOPED_TOKEN("ScopedToken");
    private final String value;

    ClientAccessTokenTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientAccessTokenTypeType fromValue(String v) {
        for (ClientAccessTokenTypeType c : ClientAccessTokenTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
