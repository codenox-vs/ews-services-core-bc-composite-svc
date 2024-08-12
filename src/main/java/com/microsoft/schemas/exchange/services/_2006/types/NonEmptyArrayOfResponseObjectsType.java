package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for NonEmptyArrayOfResponseObjectsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfResponseObjectsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="AcceptItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}AcceptItemType"/>
 *         &lt;element name="TentativelyAcceptItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}TentativelyAcceptItemType"/>
 *         &lt;element name="DeclineItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}DeclineItemType"/>
 *         &lt;element name="ReplyToItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}ReplyToItemType"/>
 *         &lt;element name="ForwardItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}ForwardItemType"/>
 *         &lt;element name="ReplyAllToItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}ReplyAllToItemType"/>
 *         &lt;element name="CancelCalendarItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}CancelCalendarItemType"/>
 *         &lt;element name="RemoveItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}RemoveItemType"/>
 *         &lt;element name="SuppressReadReceipt" type="{http://schemas.microsoft.com/exchange/services/2006/types}SuppressReadReceiptType"/>
 *         &lt;element name="PostReplyItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}PostReplyItemType"/>
 *         &lt;element name="AcceptSharingInvitation" type="{http://schemas.microsoft.com/exchange/services/2006/types}AcceptSharingInvitationType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NonEmptyArrayOfResponseObjectsType",
        propOrder = {"acceptItemOrTentativelyAcceptItemOrDeclineItem"})
public class NonEmptyArrayOfResponseObjectsType {

    @XmlElements({
        @XmlElement(name = "DeclineItem", type = DeclineItemType.class),
        @XmlElement(name = "CancelCalendarItem", type = CancelCalendarItemType.class),
        @XmlElement(name = "SuppressReadReceipt", type = SuppressReadReceiptType.class),
        @XmlElement(name = "ForwardItem", type = ForwardItemType.class),
        @XmlElement(name = "TentativelyAcceptItem", type = TentativelyAcceptItemType.class),
        @XmlElement(name = "PostReplyItem", type = PostReplyItemType.class),
        @XmlElement(name = "ReplyAllToItem", type = ReplyAllToItemType.class),
        @XmlElement(name = "AcceptItem", type = AcceptItemType.class),
        @XmlElement(name = "RemoveItem", type = RemoveItemType.class),
        @XmlElement(name = "AcceptSharingInvitation", type = AcceptSharingInvitationType.class),
        @XmlElement(name = "ReplyToItem", type = ReplyToItemType.class)
    })
    protected List<ResponseObjectType> acceptItemOrTentativelyAcceptItemOrDeclineItem;

    /**
     * Gets the value of the acceptItemOrTentativelyAcceptItemOrDeclineItem property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the
     * acceptItemOrTentativelyAcceptItemOrDeclineItem property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getAcceptItemOrTentativelyAcceptItemOrDeclineItem().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link DeclineItemType } {@link
     * CancelCalendarItemType } {@link SuppressReadReceiptType } {@link ForwardItemType } {@link
     * TentativelyAcceptItemType } {@link PostReplyItemType } {@link ReplyAllToItemType } {@link
     * AcceptItemType } {@link RemoveItemType } {@link AcceptSharingInvitationType } {@link
     * ReplyToItemType }
     */
    public List<ResponseObjectType> getAcceptItemOrTentativelyAcceptItemOrDeclineItem() {
        if (acceptItemOrTentativelyAcceptItemOrDeclineItem == null) {
            acceptItemOrTentativelyAcceptItemOrDeclineItem = new ArrayList<ResponseObjectType>();
        }
        return this.acceptItemOrTentativelyAcceptItemOrDeclineItem;
    }
}
