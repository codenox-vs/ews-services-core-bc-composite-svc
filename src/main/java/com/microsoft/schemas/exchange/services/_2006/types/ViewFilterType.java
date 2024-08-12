package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ViewFilterType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="ViewFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Flagged"/>
 *     &lt;enumeration value="HasAttachment"/>
 *     &lt;enumeration value="ToOrCcMe"/>
 *     &lt;enumeration value="Unread"/>
 *     &lt;enumeration value="TaskActive"/>
 *     &lt;enumeration value="TaskOverdue"/>
 *     &lt;enumeration value="TaskCompleted"/>
 *     &lt;enumeration value="NoClutter"/>
 *     &lt;enumeration value="Clutter"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ViewFilterType")
@XmlEnum
public enum ViewFilterType {
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Flagged")
    FLAGGED("Flagged"),
    @XmlEnumValue("HasAttachment")
    HAS_ATTACHMENT("HasAttachment"),
    @XmlEnumValue("ToOrCcMe")
    TO_OR_CC_ME("ToOrCcMe"),
    @XmlEnumValue("Unread")
    UNREAD("Unread"),
    @XmlEnumValue("TaskActive")
    TASK_ACTIVE("TaskActive"),
    @XmlEnumValue("TaskOverdue")
    TASK_OVERDUE("TaskOverdue"),
    @XmlEnumValue("TaskCompleted")
    TASK_COMPLETED("TaskCompleted"),
    @XmlEnumValue("NoClutter")
    NO_CLUTTER("NoClutter"),
    @XmlEnumValue("Clutter")
    CLUTTER("Clutter");
    private final String value;

    ViewFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ViewFilterType fromValue(String v) {
        for (ViewFilterType c : ViewFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
