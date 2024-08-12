package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for CreateActionType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="CreateActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CreateNew"/>
 *     &lt;enumeration value="Update"/>
 *     &lt;enumeration value="UpdateOrCreate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "CreateActionType")
@XmlEnum
public enum CreateActionType {
    @XmlEnumValue("CreateNew")
    CREATE_NEW("CreateNew"),
    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("UpdateOrCreate")
    UPDATE_OR_CREATE("UpdateOrCreate");
    private final String value;

    CreateActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreateActionType fromValue(String v) {
        for (CreateActionType c : CreateActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
