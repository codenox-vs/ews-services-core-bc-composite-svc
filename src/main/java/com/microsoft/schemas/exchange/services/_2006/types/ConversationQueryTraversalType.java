package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ConversationQueryTraversalType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="ConversationQueryTraversalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Shallow"/>
 *     &lt;enumeration value="Deep"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ConversationQueryTraversalType")
@XmlEnum
public enum ConversationQueryTraversalType {
    @XmlEnumValue("Shallow")
    SHALLOW("Shallow"),
    @XmlEnumValue("Deep")
    DEEP("Deep");
    private final String value;

    ConversationQueryTraversalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversationQueryTraversalType fromValue(String v) {
        for (ConversationQueryTraversalType c : ConversationQueryTraversalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
