package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.ArrayOfAttachmentsType;
import com.microsoft.schemas.exchange.services._2006.types.ConflictResultsType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for UpdateItemInRecoverableItemsResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UpdateItemInRecoverableItemsResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ItemInfoResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="Attachments" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfAttachmentsType" minOccurs="0"/>
 *         &lt;element name="ConflictResults" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConflictResultsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "UpdateItemInRecoverableItemsResponseMessageType",
        propOrder = {"attachments", "conflictResults"})
public class UpdateItemInRecoverableItemsResponseMessageType extends ItemInfoResponseMessageType {

    @XmlElement(name = "Attachments")
    protected ArrayOfAttachmentsType attachments;

    @XmlElement(name = "ConflictResults")
    protected ConflictResultsType conflictResults;

    /**
     * Gets the value of the attachments property.
     *
     * @return possible object is {@link ArrayOfAttachmentsType }
     */
    public ArrayOfAttachmentsType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     *
     * @param value allowed object is {@link ArrayOfAttachmentsType }
     */
    public void setAttachments(ArrayOfAttachmentsType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the conflictResults property.
     *
     * @return possible object is {@link ConflictResultsType }
     */
    public ConflictResultsType getConflictResults() {
        return conflictResults;
    }

    /**
     * Sets the value of the conflictResults property.
     *
     * @param value allowed object is {@link ConflictResultsType }
     */
    public void setConflictResults(ConflictResultsType value) {
        this.conflictResults = value;
    }
}
