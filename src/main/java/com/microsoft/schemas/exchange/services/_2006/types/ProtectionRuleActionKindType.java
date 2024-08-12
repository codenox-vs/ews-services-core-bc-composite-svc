package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ProtectionRuleActionKindType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="ProtectionRuleActionKindType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RightsProtectMessage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ProtectionRuleActionKindType")
@XmlEnum
public enum ProtectionRuleActionKindType {
    @XmlEnumValue("RightsProtectMessage")
    RIGHTS_PROTECT_MESSAGE("RightsProtectMessage");
    private final String value;

    ProtectionRuleActionKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProtectionRuleActionKindType fromValue(String v) {
        for (ProtectionRuleActionKindType c : ProtectionRuleActionKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
