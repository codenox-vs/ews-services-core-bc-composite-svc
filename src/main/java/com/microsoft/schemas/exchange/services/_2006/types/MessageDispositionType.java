package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for MessageDispositionType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="MessageDispositionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SaveOnly"/>
 *     &lt;enumeration value="SendOnly"/>
 *     &lt;enumeration value="SendAndSaveCopy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "MessageDispositionType")
@XmlEnum
public enum MessageDispositionType {
    @XmlEnumValue("SaveOnly")
    SAVE_ONLY("SaveOnly"),
    @XmlEnumValue("SendOnly")
    SEND_ONLY("SendOnly"),
    @XmlEnumValue("SendAndSaveCopy")
    SEND_AND_SAVE_COPY("SendAndSaveCopy");
    private final String value;

    MessageDispositionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageDispositionType fromValue(String v) {
        for (MessageDispositionType c : MessageDispositionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
