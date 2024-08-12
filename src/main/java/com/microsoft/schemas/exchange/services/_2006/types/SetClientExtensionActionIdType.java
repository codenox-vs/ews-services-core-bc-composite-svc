package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for SetClientExtensionActionIdType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="SetClientExtensionActionIdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Install"/>
 *     &lt;enumeration value="Uninstall"/>
 *     &lt;enumeration value="Configure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "SetClientExtensionActionIdType")
@XmlEnum
public enum SetClientExtensionActionIdType {
    @XmlEnumValue("Install")
    INSTALL("Install"),
    @XmlEnumValue("Uninstall")
    UNINSTALL("Uninstall"),
    @XmlEnumValue("Configure")
    CONFIGURE("Configure");
    private final String value;

    SetClientExtensionActionIdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SetClientExtensionActionIdType fromValue(String v) {
        for (SetClientExtensionActionIdType c : SetClientExtensionActionIdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
