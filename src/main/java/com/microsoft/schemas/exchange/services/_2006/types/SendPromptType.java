package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for SendPromptType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="SendPromptType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Send"/>
 *     &lt;enumeration value="VotingOption"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "SendPromptType")
@XmlEnum
public enum SendPromptType {
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Send")
    SEND("Send"),
    @XmlEnumValue("VotingOption")
    VOTING_OPTION("VotingOption");
    private final String value;

    SendPromptType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SendPromptType fromValue(String v) {
        for (SendPromptType c : SendPromptType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
