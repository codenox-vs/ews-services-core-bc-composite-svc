package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ResolveNamesSearchScopeType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="ResolveNamesSearchScopeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ActiveDirectory"/>
 *     &lt;enumeration value="ActiveDirectoryContacts"/>
 *     &lt;enumeration value="Contacts"/>
 *     &lt;enumeration value="ContactsActiveDirectory"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ResolveNamesSearchScopeType")
@XmlEnum
public enum ResolveNamesSearchScopeType {
    @XmlEnumValue("ActiveDirectory")
    ACTIVE_DIRECTORY("ActiveDirectory"),
    @XmlEnumValue("ActiveDirectoryContacts")
    ACTIVE_DIRECTORY_CONTACTS("ActiveDirectoryContacts"),
    @XmlEnumValue("Contacts")
    CONTACTS("Contacts"),
    @XmlEnumValue("ContactsActiveDirectory")
    CONTACTS_ACTIVE_DIRECTORY("ContactsActiveDirectory");
    private final String value;

    ResolveNamesSearchScopeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResolveNamesSearchScopeType fromValue(String v) {
        for (ResolveNamesSearchScopeType c : ResolveNamesSearchScopeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
