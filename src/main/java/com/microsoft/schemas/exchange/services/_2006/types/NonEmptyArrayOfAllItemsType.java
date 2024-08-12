package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for NonEmptyArrayOfAllItemsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfAllItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="Item" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemType"/>
 *           &lt;element name="Message" type="{http://schemas.microsoft.com/exchange/services/2006/types}MessageType"/>
 *           &lt;element name="CalendarItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}CalendarItemType"/>
 *           &lt;element name="Contact" type="{http://schemas.microsoft.com/exchange/services/2006/types}ContactItemType"/>
 *           &lt;element name="DistributionList" type="{http://schemas.microsoft.com/exchange/services/2006/types}DistributionListType"/>
 *           &lt;element name="MeetingMessage" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingMessageType"/>
 *           &lt;element name="MeetingRequest" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingRequestMessageType"/>
 *           &lt;element name="MeetingResponse" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingResponseMessageType"/>
 *           &lt;element name="MeetingCancellation" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingCancellationMessageType"/>
 *           &lt;element name="Task" type="{http://schemas.microsoft.com/exchange/services/2006/types}TaskType"/>
 *           &lt;element name="PostItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}PostItemType"/>
 *           &lt;element name="ReplyToItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}ReplyToItemType"/>
 *           &lt;element name="ForwardItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}ForwardItemType"/>
 *           &lt;element name="ReplyAllToItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}ReplyAllToItemType"/>
 *           &lt;element name="AcceptItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}AcceptItemType"/>
 *           &lt;element name="TentativelyAcceptItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}TentativelyAcceptItemType"/>
 *           &lt;element name="DeclineItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}DeclineItemType"/>
 *           &lt;element name="CancelCalendarItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}CancelCalendarItemType"/>
 *           &lt;element name="RemoveItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}RemoveItemType"/>
 *           &lt;element name="SuppressReadReceipt" type="{http://schemas.microsoft.com/exchange/services/2006/types}SuppressReadReceiptType"/>
 *           &lt;element name="PostReplyItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}PostReplyItemType"/>
 *           &lt;element name="AcceptSharingInvitation" type="{http://schemas.microsoft.com/exchange/services/2006/types}AcceptSharingInvitationType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NonEmptyArrayOfAllItemsType",
        propOrder = {"itemOrMessageOrCalendarItem"})
public class NonEmptyArrayOfAllItemsType {

    @XmlElements({
        @XmlElement(name = "Task", type = TaskType.class),
        @XmlElement(name = "DistributionList", type = DistributionListType.class),
        @XmlElement(name = "RemoveItem", type = RemoveItemType.class),
        @XmlElement(name = "Contact", type = ContactItemType.class),
        @XmlElement(name = "MeetingCancellation", type = MeetingCancellationMessageType.class),
        @XmlElement(name = "TentativelyAcceptItem", type = TentativelyAcceptItemType.class),
        @XmlElement(name = "AcceptSharingInvitation", type = AcceptSharingInvitationType.class),
        @XmlElement(name = "DeclineItem", type = DeclineItemType.class),
        @XmlElement(name = "AcceptItem", type = AcceptItemType.class),
        @XmlElement(name = "Item"),
        @XmlElement(name = "ForwardItem", type = ForwardItemType.class),
        @XmlElement(name = "MeetingMessage", type = MeetingMessageType.class),
        @XmlElement(name = "MeetingResponse", type = MeetingResponseMessageType.class),
        @XmlElement(name = "PostReplyItem", type = PostReplyItemType.class),
        @XmlElement(name = "PostItem", type = PostItemType.class),
        @XmlElement(name = "CancelCalendarItem", type = CancelCalendarItemType.class),
        @XmlElement(name = "Message", type = MessageType.class),
        @XmlElement(name = "SuppressReadReceipt", type = SuppressReadReceiptType.class),
        @XmlElement(name = "ReplyToItem", type = ReplyToItemType.class),
        @XmlElement(name = "ReplyAllToItem", type = ReplyAllToItemType.class),
        @XmlElement(name = "CalendarItem", type = CalendarItemType.class),
        @XmlElement(name = "MeetingRequest", type = MeetingRequestMessageType.class)
    })
    protected List<ItemType> itemOrMessageOrCalendarItem;

    /**
     * Gets the value of the itemOrMessageOrCalendarItem property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the itemOrMessageOrCalendarItem property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getItemOrMessageOrCalendarItem().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link TaskType } {@link
     * DistributionListType } {@link RemoveItemType } {@link ContactItemType } {@link
     * MeetingCancellationMessageType } {@link TentativelyAcceptItemType } {@link
     * AcceptSharingInvitationType } {@link DeclineItemType } {@link AcceptItemType } {@link
     * ItemType } {@link ForwardItemType } {@link MeetingMessageType } {@link
     * MeetingResponseMessageType } {@link PostReplyItemType } {@link PostItemType } {@link
     * CancelCalendarItemType } {@link MessageType } {@link SuppressReadReceiptType } {@link
     * ReplyToItemType } {@link ReplyAllToItemType } {@link CalendarItemType } {@link
     * MeetingRequestMessageType }
     */
    public List<ItemType> getItemOrMessageOrCalendarItem() {
        if (itemOrMessageOrCalendarItem == null) {
            itemOrMessageOrCalendarItem = new ArrayList<ItemType>();
        }
        return this.itemOrMessageOrCalendarItem;
    }
}
