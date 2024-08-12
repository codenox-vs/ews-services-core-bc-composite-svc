package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ConnectionFailureCauseType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="ConnectionFailureCauseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="UserBusy"/>
 *     &lt;enumeration value="NoAnswer"/>
 *     &lt;enumeration value="Unavailable"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ConnectionFailureCauseType")
@XmlEnum
public enum ConnectionFailureCauseType {
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("UserBusy")
    USER_BUSY("UserBusy"),
    @XmlEnumValue("NoAnswer")
    NO_ANSWER("NoAnswer"),
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ConnectionFailureCauseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectionFailureCauseType fromValue(String v) {
        for (ConnectionFailureCauseType c : ConnectionFailureCauseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
