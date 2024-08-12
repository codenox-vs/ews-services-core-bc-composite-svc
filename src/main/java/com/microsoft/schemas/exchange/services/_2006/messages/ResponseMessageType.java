package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.ResponseClassType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for ResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ResponseMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="MessageText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseCode" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseCodeType" minOccurs="0"/>
 *         &lt;element name="DescriptiveLinkKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MessageXml" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ResponseClass" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}ResponseClassType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ResponseMessageType",
        propOrder = {"messageText", "responseCode", "descriptiveLinkKey", "messageXml"})
@XmlSeeAlso({
    ClientExtensionResponseType.class,
    GetUMCallSummaryResponseMessageType.class,
    InstallAppResponseType.class,
    GetMailTipsResponseMessageType.class,
    GetUMCallDataRecordsResponseMessageType.class,
    GetUserRetentionPolicyTagsResponseMessageType.class,
    PerformReminderActionResponseMessageType.class,
    FindPeopleResponseMessageType.class,
    GetUMSubscriberCallAnsweringDataResponseMessageType.class,
    GetPasswordExpirationDateResponseMessageType.class,
    DisconnectPhoneCallResponseMessageType.class,
    GetDiscoverySearchConfigurationResponseMessageType.class,
    GetRemindersResponseMessageType.class,
    AddNewTelUriContactToGroupResponseMessageType.class,
    SetHoldOnMailboxesResponseMessageType.class,
    GetAppManifestsResponseType.class,
    GetSharingFolderResponseMessageType.class,
    GetNonIndexableItemStatisticsResponseMessageType.class,
    GetRoomListsResponseMessageType.class,
    GetUMPromptResponseMessageType.class,
    GetUMPromptNamesResponseMessageType.class,
    RemoveContactFromImListResponseMessageType.class,
    GetRoomsResponseMessageType.class,
    CreateUMPromptResponseMessageType.class,
    GetSharingMetadataResponseMessageType.class,
    GetPersonaResponseMessageType.class,
    SetImGroupResponseMessageType.class,
    DisableAppResponseType.class,
    ValidateUMPinResponseMessageType.class,
    GetInboxRulesResponseType.class,
    GetPhoneCallInformationResponseMessageType.class,
    CompleteFindInGALSpeechRecognitionResponseMessageType.class,
    UnpinTeamMailboxResponseMessageType.class,
    GetAppMarketplaceUrlResponseMessageType.class,
    PlayOnPhoneResponseMessageType.class,
    AddNewImContactToGroupResponseMessageType.class,
    SetImListMigrationCompletedResponseMessageType.class,
    GetNonIndexableItemDetailsResponseMessageType.class,
    FindMessageTrackingReportResponseMessageType.class,
    RemoveImGroupResponseMessageType.class,
    GetImItemsResponseMessageType.class,
    RemoveImContactFromGroupResponseMessageType.class,
    GetUserPhotoResponseMessageType.class,
    GetHoldOnMailboxesResponseMessageType.class,
    GetImItemListResponseMessageType.class,
    RemoveDistributionGroupFromImListResponseMessageType.class,
    CreateUMCallDataRecordResponseMessageType.class,
    GetMessageTrackingReportResponseMessageType.class,
    GetServiceConfigurationResponseMessageType.class,
    StartFindInGALSpeechRecognitionResponseMessageType.class,
    AddDistributionGroupToImListResponseMessageType.class,
    AddImGroupResponseMessageType.class,
    InitUMMailboxResponseMessageType.class,
    SaveUMPinResponseMessageType.class,
    UninstallAppResponseType.class,
    GetUMPinResponseMessageType.class,
    DeleteUMPromptsResponseMessageType.class,
    GetClientIntentResponseMessageType.class,
    UpdateInboxRulesResponseType.class,
    GetSearchableMailboxesResponseMessageType.class,
    SetTeamMailboxResponseMessageType.class,
    FindConversationResponseMessageType.class,
    AddImContactToGroupResponseMessageType.class,
    RefreshSharingFolderResponseMessageType.class,
    ResetUMMailboxResponseMessageType.class,
    GetClientAccessTokenResponseMessageType.class,
    FindItemResponseMessageType.class,
    UploadItemsResponseMessageType.class,
    SyncFolderHierarchyResponseMessageType.class,
    SearchMailboxesResponseMessageType.class,
    GetStreamingEventsResponseMessageType.class,
    GetUserConfigurationResponseMessageType.class,
    GetEventsResponseMessageType.class,
    SendNotificationResponseMessageType.class,
    SyncFolderItemsResponseMessageType.class,
    GetConversationItemsResponseMessageType.class,
    AttachmentInfoResponseMessageType.class,
    FolderInfoResponseMessageType.class,
    SubscribeResponseMessageType.class,
    FindMailboxStatisticsByKeywordsResponseMessageType.class,
    ConvertIdResponseMessageType.class,
    ResolveNamesResponseMessageType.class,
    DelegateUserResponseMessageType.class,
    BaseDelegateResponseMessageType.class,
    ServiceConfigurationResponseMessageType.class,
    MarkAsJunkResponseMessageType.class,
    ExportItemsResponseMessageType.class,
    DeleteAttachmentResponseMessageType.class,
    MailTipsResponseMessageType.class,
    GetServerTimeZonesResponseMessageType.class,
    FindFolderResponseMessageType.class,
    ItemInfoResponseMessageType.class,
    ExpandDLResponseMessageType.class
})
public class ResponseMessageType {

    @XmlElement(name = "MessageText")
    protected String messageText;

    @XmlElement(name = "ResponseCode")
    protected ResponseCodeType responseCode;

    @XmlElement(name = "DescriptiveLinkKey")
    protected Integer descriptiveLinkKey;

    @XmlElement(name = "MessageXml")
    protected ResponseMessageType.MessageXml messageXml;

    @XmlAttribute(name = "ResponseClass", required = true)
    protected ResponseClassType responseClass;

    /**
     * Gets the value of the messageText property.
     *
     * @return possible object is {@link String }
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * Sets the value of the messageText property.
     *
     * @param value allowed object is {@link String }
     */
    public void setMessageText(String value) {
        this.messageText = value;
    }

    /**
     * Gets the value of the responseCode property.
     *
     * @return possible object is {@link ResponseCodeType }
     */
    public ResponseCodeType getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     *
     * @param value allowed object is {@link ResponseCodeType }
     */
    public void setResponseCode(ResponseCodeType value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the descriptiveLinkKey property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getDescriptiveLinkKey() {
        return descriptiveLinkKey;
    }

    /**
     * Sets the value of the descriptiveLinkKey property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setDescriptiveLinkKey(Integer value) {
        this.descriptiveLinkKey = value;
    }

    /**
     * Gets the value of the messageXml property.
     *
     * @return possible object is {@link ResponseMessageType.MessageXml }
     */
    public ResponseMessageType.MessageXml getMessageXml() {
        return messageXml;
    }

    /**
     * Sets the value of the messageXml property.
     *
     * @param value allowed object is {@link ResponseMessageType.MessageXml }
     */
    public void setMessageXml(ResponseMessageType.MessageXml value) {
        this.messageXml = value;
    }

    /**
     * Gets the value of the responseClass property.
     *
     * @return possible object is {@link ResponseClassType }
     */
    public ResponseClassType getResponseClass() {
        return responseClass;
    }

    /**
     * Sets the value of the responseClass property.
     *
     * @param value allowed object is {@link ResponseClassType }
     */
    public void setResponseClass(ResponseClassType value) {
        this.responseClass = value;
    }

    /**
     * Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"any"})
    public static class MessageXml {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         *
         * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore
         * any modification you make to the returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         *
         * <p>For example, to add a new item, do as follows:
         *
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         *
         * <p>Objects of the following type(s) are allowed in the list {@link Element } {@link
         * Object }
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }
    }
}
