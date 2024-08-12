package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for PredictedActionReasonType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="PredictedActionReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="ConversationStarterIsYou"/>
 *     &lt;enumeration value="OnlyRecipient"/>
 *     &lt;enumeration value="ConversationContributions"/>
 *     &lt;enumeration value="MarkedImportantBySender"/>
 *     &lt;enumeration value="SenderIsManager"/>
 *     &lt;enumeration value="SenderIsInManagementChain"/>
 *     &lt;enumeration value="SenderIsDirectReport"/>
 *     &lt;enumeration value="ActionBasedOnSender"/>
 *     &lt;enumeration value="NameOnToLine"/>
 *     &lt;enumeration value="NameOnCcLine"/>
 *     &lt;enumeration value="ManagerPosition"/>
 *     &lt;enumeration value="ReplyToAMessageFromMe"/>
 *     &lt;enumeration value="PreviouslyFlagged"/>
 *     &lt;enumeration value="ActionBasedOnRecipients"/>
 *     &lt;enumeration value="ActionBasedOnSubjectWords"/>
 *     &lt;enumeration value="ActionBasedOnBasedOnBodyWords"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "PredictedActionReasonType")
@XmlEnum
public enum PredictedActionReasonType {
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ConversationStarterIsYou")
    CONVERSATION_STARTER_IS_YOU("ConversationStarterIsYou"),
    @XmlEnumValue("OnlyRecipient")
    ONLY_RECIPIENT("OnlyRecipient"),
    @XmlEnumValue("ConversationContributions")
    CONVERSATION_CONTRIBUTIONS("ConversationContributions"),
    @XmlEnumValue("MarkedImportantBySender")
    MARKED_IMPORTANT_BY_SENDER("MarkedImportantBySender"),
    @XmlEnumValue("SenderIsManager")
    SENDER_IS_MANAGER("SenderIsManager"),
    @XmlEnumValue("SenderIsInManagementChain")
    SENDER_IS_IN_MANAGEMENT_CHAIN("SenderIsInManagementChain"),
    @XmlEnumValue("SenderIsDirectReport")
    SENDER_IS_DIRECT_REPORT("SenderIsDirectReport"),
    @XmlEnumValue("ActionBasedOnSender")
    ACTION_BASED_ON_SENDER("ActionBasedOnSender"),
    @XmlEnumValue("NameOnToLine")
    NAME_ON_TO_LINE("NameOnToLine"),
    @XmlEnumValue("NameOnCcLine")
    NAME_ON_CC_LINE("NameOnCcLine"),
    @XmlEnumValue("ManagerPosition")
    MANAGER_POSITION("ManagerPosition"),
    @XmlEnumValue("ReplyToAMessageFromMe")
    REPLY_TO_A_MESSAGE_FROM_ME("ReplyToAMessageFromMe"),
    @XmlEnumValue("PreviouslyFlagged")
    PREVIOUSLY_FLAGGED("PreviouslyFlagged"),
    @XmlEnumValue("ActionBasedOnRecipients")
    ACTION_BASED_ON_RECIPIENTS("ActionBasedOnRecipients"),
    @XmlEnumValue("ActionBasedOnSubjectWords")
    ACTION_BASED_ON_SUBJECT_WORDS("ActionBasedOnSubjectWords"),
    @XmlEnumValue("ActionBasedOnBasedOnBodyWords")
    ACTION_BASED_ON_BASED_ON_BODY_WORDS("ActionBasedOnBasedOnBodyWords");
    private final String value;

    PredictedActionReasonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PredictedActionReasonType fromValue(String v) {
        for (PredictedActionReasonType c : PredictedActionReasonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
