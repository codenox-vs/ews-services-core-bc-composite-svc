package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.NonEmptyArrayOfApplyConversationActionType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ApplyConversationActionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ApplyConversationActionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ConversationActions" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfApplyConversationActionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ApplyConversationActionType",
        propOrder = {"conversationActions"})
public class ApplyConversationActionType extends BaseRequestType {

    @XmlElement(name = "ConversationActions", required = true)
    protected NonEmptyArrayOfApplyConversationActionType conversationActions;

    /**
     * Gets the value of the conversationActions property.
     *
     * @return possible object is {@link NonEmptyArrayOfApplyConversationActionType }
     */
    public NonEmptyArrayOfApplyConversationActionType getConversationActions() {
        return conversationActions;
    }

    /**
     * Sets the value of the conversationActions property.
     *
     * @param value allowed object is {@link NonEmptyArrayOfApplyConversationActionType }
     */
    public void setConversationActions(NonEmptyArrayOfApplyConversationActionType value) {
        this.conversationActions = value;
    }
}
