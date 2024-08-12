package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for NonEmptyArrayOfApplyConversationActionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfApplyConversationActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConversationAction" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConversationActionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NonEmptyArrayOfApplyConversationActionType",
        propOrder = {"conversationAction"})
public class NonEmptyArrayOfApplyConversationActionType {

    @XmlElement(name = "ConversationAction", required = true)
    protected List<ConversationActionType> conversationAction;

    /**
     * Gets the value of the conversationAction property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the conversationAction property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getConversationAction().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link ConversationActionType }
     */
    public List<ConversationActionType> getConversationAction() {
        if (conversationAction == null) {
            conversationAction = new ArrayList<ConversationActionType>();
        }
        return this.conversationAction;
    }
}
