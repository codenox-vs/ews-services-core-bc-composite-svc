package com.microsoft.schemas.exchange.services._2006.messages;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import java.util.List;

import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface
 * generated in the com.microsoft.schemas.exchange.services._2006.messages package.
 *
 * <p>An ObjectFactory allows you to programatically construct new instances of the Java
 * representation for XML content. The Java representation of XML content can consist of schema
 * derived interfaces and classes representing the binding of schema type definitions, element
 * declarations and model groups. Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _GetServiceConfiguration_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetServiceConfiguration");
    private static final QName _DeleteAttachment_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "DeleteAttachment");
    private static final QName _ExportItems_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages", "ExportItems");
    private static final QName _SendNotificationResult_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SendNotificationResult");
    private static final QName _DeleteItem_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "DeleteItem");
    private static final QName _FindPeople_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "FindPeople");
    private static final QName _EmptyFolder_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages", "EmptyFolder");
    private static final QName _RemoveContactFromImList_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "RemoveContactFromImList");
    private static final QName _UnsubscribeResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UnsubscribeResponse");
    private static final QName _GetUserOofSettingsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUserOofSettingsResponse");
    private static final QName _GetMailTips_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages", "GetMailTips");
    private static final QName _GetUMCallDataRecords_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUMCallDataRecords");
    private static final QName _FindMessageTrackingReport_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "FindMessageTrackingReport");
    private static final QName _CreateUMPrompt_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CreateUMPrompt");
    private static final QName _AddDelegateResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "AddDelegateResponse");
    private static final QName _RemoveContactFromImListResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "RemoveContactFromImListResponse");
    private static final QName _GetUserPhoto_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages", "GetUserPhoto");
    private static final QName _CopyFolderResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CopyFolderResponse");
    private static final QName _ApplyConversationAction_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "ApplyConversationAction");
    private static final QName _GetConversationItemsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetConversationItemsResponse");
    private static final QName _GetSharingMetadataResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetSharingMetadataResponse");
    private static final QName _SetUserOofSettingsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SetUserOofSettingsResponse");
    private static final QName _SetImGroupResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SetImGroupResponse");
    private static final QName _GetPersonaResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetPersonaResponseMessage");
    private static final QName _SyncFolderHierarchy_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SyncFolderHierarchy");
    private static final QName _Unsubscribe_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages", "Unsubscribe");
    private static final QName _GetClientAccessToken_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetClientAccessToken");
    private static final QName _GetAttachment_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetAttachment");
    private static final QName _DisableAppResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "DisableAppResponse");
    private static final QName _SetImGroup_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "SetImGroup");
    private static final QName _AddImContactToGroup_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "AddImContactToGroup");
    private static final QName _GetUMCallSummary_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUMCallSummary");
    private static final QName _RemoveDelegate_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "RemoveDelegate");
    private static final QName _GetRoomsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetRoomsResponse");
    private static final QName _CreateUMPromptResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CreateUMPromptResponse");
    private static final QName _MarkAllItemsAsRead_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "MarkAllItemsAsRead");
    private static final QName _UpdateFolder_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages", "UpdateFolder");
    private static final QName _GetClientIntent_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetClientIntent");
    private static final QName _DeleteUserConfigurationResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "DeleteUserConfigurationResponse");
    private static final QName _GetEvents_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "GetEvents");
    private static final QName _FindFolderResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "FindFolderResponse");
    private static final QName _RemoveImGroup_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "RemoveImGroup");
    private static final QName _CopyItemResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CopyItemResponse");
    private static final QName _UnpinTeamMailbox_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UnpinTeamMailbox");
    private static final QName _SaveUMPin_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "SaveUMPin");
    private static final QName _MarkAsJunkResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "MarkAsJunkResponse");
    private static final QName _SetClientExtension_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SetClientExtension");
    private static final QName _UpdateUserConfiguration_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UpdateUserConfiguration");
    private static final QName _GetDiscoverySearchConfiguration_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetDiscoverySearchConfiguration");
    private static final QName _FindMailboxStatisticsByKeywords_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "FindMailboxStatisticsByKeywords");
    private static final QName _SubscribeResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SubscribeResponse");
    private static final QName _GetUMPromptResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUMPromptResponse");
    private static final QName _GetMessageTrackingReport_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetMessageTrackingReport");
    private static final QName _SearchMailboxes_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SearchMailboxes");
    private static final QName _GetRoomListsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetRoomListsResponse");
    private static final QName _DeleteItemResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "DeleteItemResponse");
    private static final QName _PerformReminderAction_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "PerformReminderAction");
    private static final QName _CreateAttachment_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CreateAttachment");
    private static final QName _GetUMPromptNamesResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUMPromptNamesResponse");
    private static final QName _AddNewTelUriContactToGroup_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "AddNewTelUriContactToGroup");
    private static final QName _CreateManagedFolder_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CreateManagedFolder");
    private static final QName _GetSharingFolderResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetSharingFolderResponse");
    private static final QName _GetNonIndexableItemStatisticsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetNonIndexableItemStatisticsResponse");
    private static final QName _ResetUMMailbox_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "ResetUMMailbox");
    private static final QName _FindMailboxStatisticsByKeywordsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "FindMailboxStatisticsByKeywordsResponse");
    private static final QName _DeleteUserConfiguration_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "DeleteUserConfiguration");
    private static final QName _GetFolderResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetFolderResponse");
    private static final QName _DisconnectPhoneCall_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "DisconnectPhoneCall");
    private static final QName _GetSharingFolder_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetSharingFolder");
    private static final QName _GetSharingMetadata_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetSharingMetadata");
    private static final QName _DisconnectPhoneCallResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "DisconnectPhoneCallResponse");
    private static final QName _CreateUMCallDataRecord_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CreateUMCallDataRecord");
    private static final QName _GetReminders_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages", "GetReminders");
    private static final QName _GetDiscoverySearchConfigurationResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetDiscoverySearchConfigurationResponse");
    private static final QName _RemoveDelegateResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "RemoveDelegateResponse");
    private static final QName _FindPeopleResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "FindPeopleResponse");
    private static final QName _GetPhoneCallInformation_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetPhoneCallInformation");
    private static final QName _GetUMSubscriberCallAnsweringDataResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUMSubscriberCallAnsweringDataResponseMessage");
    private static final QName _RefreshSharingFolder_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "RefreshSharingFolder");
    private static final QName _SyncFolderItems_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SyncFolderItems");
    private static final QName _GetPasswordExpirationDateResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetPasswordExpirationDateResponse");
    private static final QName _GetAppMarketplaceUrl_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetAppMarketplaceUrl");
    private static final QName _GetHoldOnMailboxes_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetHoldOnMailboxes");
    private static final QName _GetServerTimeZones_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetServerTimeZones");
    private static final QName _DeleteFolderResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "DeleteFolderResponse");
    private static final QName _CreateAttachmentResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CreateAttachmentResponse");
    private static final QName _AddNewTelUriContactToGroupResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "AddNewTelUriContactToGroupResponse");
    private static final QName _RemoveDistributionGroupFromImList_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "RemoveDistributionGroupFromImList");
    private static final QName _GetUserAvailabilityResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUserAvailabilityResponse");
    private static final QName _GetUMPrompt_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages", "GetUMPrompt");
    private static final QName _SetHoldOnMailboxesResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SetHoldOnMailboxesResponse");
    private static final QName _GetAppManifestsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetAppManifestsResponse");
    private static final QName _ResolveNames_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages", "ResolveNames");
    private static final QName _FindConversation_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "FindConversation");
    private static final QName _MarkAsJunk_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "MarkAsJunk");
    private static final QName _GetAttachmentResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetAttachmentResponse");
    private static final QName _GetRemindersResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetRemindersResponse");
    private static final QName _GetSearchableMailboxes_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetSearchableMailboxes");
    private static final QName _GetDelegateResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetDelegateResponse");
    private static final QName _InitUMMailbox_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "InitUMMailbox");
    private static final QName _CreateFolderPathResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CreateFolderPathResponse");
    private static final QName _InstallAppResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "InstallAppResponse");
    private static final QName _GetUMCallSummaryResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUMCallSummaryResponseMessage");
    private static final QName _Subscribe_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "Subscribe");
    private static final QName _AddDelegate_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages", "AddDelegate");
    private static final QName _CreateItem_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "CreateItem");
    private static final QName _MoveItemResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "MoveItemResponse");
    private static final QName _DeleteAttachmentResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "DeleteAttachmentResponse");
    private static final QName _AddImGroup_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "AddImGroup");
    private static final QName _GetUserRetentionPolicyTags_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUserRetentionPolicyTags");
    private static final QName _DeleteUMPrompts_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "DeleteUMPrompts");
    private static final QName _GetClientExtensionResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetClientExtensionResponse");
    private static final QName _InstallApp_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "InstallApp");
    private static final QName _GetUserRetentionPolicyTagsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUserRetentionPolicyTagsResponse");
    private static final QName _GetConversationItems_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetConversationItems");
    private static final QName _DeleteFolder_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages", "DeleteFolder");
    private static final QName _GetServerTimeZonesResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetServerTimeZonesResponse");
    private static final QName _ConvertId_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "ConvertId");
    private static final QName _PerformReminderActionResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "PerformReminderActionResponse");
    private static final QName _DisableApp_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "DisableApp");
    private static final QName _UpdateItemResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UpdateItemResponse");
    private static final QName _GetMailTipsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetMailTipsResponse");
    private static final QName _GetImItemList_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetImItemList");
    private static final QName _GetUMCallDataRecordsResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUMCallDataRecordsResponseMessage");
    private static final QName _UpdateItemInRecoverableItemsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UpdateItemInRecoverableItemsResponse");
    private static final QName _GetEventsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetEventsResponse");
    private static final QName _SetHoldOnMailboxes_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SetHoldOnMailboxes");
    private static final QName _MoveFolder_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "MoveFolder");
    private static final QName _GetStreamingEventsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetStreamingEventsResponse");
    private static final QName _GetUserAvailabilityRequest_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUserAvailabilityRequest");
    private static final QName _StartFindInGALSpeechRecognition_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "StartFindInGALSpeechRecognition");
    private static final QName _AddImContactToGroupResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "AddImContactToGroupResponse");
    private static final QName _SetTeamMailboxResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SetTeamMailboxResponse");
    private static final QName _GetUserConfiguration_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUserConfiguration");
    private static final QName _FindConversationResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "FindConversationResponse");
    private static final QName _UploadItemsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UploadItemsResponse");
    private static final QName _CreateFolderResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CreateFolderResponse");
    private static final QName _MoveFolderResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "MoveFolderResponse");
    private static final QName _PlayOnPhone_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages", "PlayOnPhone");
    private static final QName _RemoveImContactFromGroup_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "RemoveImContactFromGroup");
    private static final QName _GetAppManifests_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetAppManifests");
    private static final QName _ResetUMMailboxResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "ResetUMMailboxResponseMessage");
    private static final QName _RefreshSharingFolderResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "RefreshSharingFolderResponse");
    private static final QName _SetTeamMailbox_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SetTeamMailbox");
    private static final QName _ArchiveItem_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages", "ArchiveItem");
    private static final QName _GetDelegate_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages", "GetDelegate");
    private static final QName _EmptyFolderResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "EmptyFolderResponse");
    private static final QName _FindItemResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "FindItemResponse");
    private static final QName _MoveItem_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "MoveItem");
    private static final QName _ArchiveItemResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "ArchiveItemResponse");
    private static final QName _ResolveNamesResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "ResolveNamesResponse");
    private static final QName _GetServiceConfigurationResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetServiceConfigurationResponse");
    private static final QName _FindItem_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "FindItem");
    private static final QName _StartFindInGALSpeechRecognitionResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "StartFindInGALSpeechRecognitionResponse");
    private static final QName _AddImGroupResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "AddImGroupResponse");
    private static final QName _AddDistributionGroupToImListResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "AddDistributionGroupToImListResponse");
    private static final QName _InitUMMailboxResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "InitUMMailboxResponseMessage");
    private static final QName _CreateUMCallDataRecordResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CreateUMCallDataRecordResponse");
    private static final QName _CopyFolder_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "CopyFolder");
    private static final QName _GetMessageTrackingReportResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetMessageTrackingReportResponse");
    private static final QName _UpdateItemInRecoverableItems_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UpdateItemInRecoverableItems");
    private static final QName _SetClientExtensionResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SetClientExtensionResponse");
    private static final QName _CreateFolderPath_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CreateFolderPath");
    private static final QName _GetItemResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetItemResponse");
    private static final QName _SetUserOofSettingsRequest_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SetUserOofSettingsRequest");
    private static final QName _ExpandDL_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "ExpandDL");
    private static final QName _GetSearchableMailboxesResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetSearchableMailboxesResponse");
    private static final QName _GetNonIndexableItemDetails_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetNonIndexableItemDetails");
    private static final QName _CopyItem_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "CopyItem");
    private static final QName _SaveUMPinResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SaveUMPinResponseMessage");
    private static final QName _MarkAllItemsAsReadResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "MarkAllItemsAsReadResponse");
    private static final QName _UninstallAppResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UninstallAppResponse");
    private static final QName _DeleteUMPromptsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "DeleteUMPromptsResponse");
    private static final QName _GetUMSubscriberCallAnsweringData_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUMSubscriberCallAnsweringData");
    private static final QName _SetImListMigrationCompleted_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SetImListMigrationCompleted");
    private static final QName _GetUMPinResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUMPinResponseMessage");
    private static final QName _GetStreamingEvents_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetStreamingEvents");
    private static final QName _ExportItemsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "ExportItemsResponse");
    private static final QName _GetClientIntentResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetClientIntentResponseMessage");
    private static final QName _UpdateInboxRulesResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UpdateInboxRulesResponse");
    private static final QName _SyncFolderItemsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SyncFolderItemsResponse");
    private static final QName _UpdateUserConfigurationResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UpdateUserConfigurationResponse");
    private static final QName _SendItem_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "SendItem");
    private static final QName _RemoveImGroupResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "RemoveImGroupResponse");
    private static final QName _GetUMPin_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "GetUMPin");
    private static final QName _ExpandDLResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "ExpandDLResponse");
    private static final QName _CreateItemResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CreateItemResponse");
    private static final QName _ValidateUMPin_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "ValidateUMPin");
    private static final QName _GetRooms_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "GetRooms");
    private static final QName _GetImItems_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "GetImItems");
    private static final QName _GetClientExtension_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetClientExtension");
    private static final QName _SyncFolderHierarchyResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SyncFolderHierarchyResponse");
    private static final QName _AddDistributionGroupToImList_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "AddDistributionGroupToImList");
    private static final QName _SendNotification_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SendNotification");
    private static final QName _FindMessageTrackingReportResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "FindMessageTrackingReportResponse");
    private static final QName _GetImItemListResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetImItemListResponse");
    private static final QName _GetPasswordExpirationDate_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetPasswordExpirationDate");
    private static final QName _GetUserPhotoResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUserPhotoResponse");
    private static final QName _GetHoldOnMailboxesResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetHoldOnMailboxesResponse");
    private static final QName _RemoveDistributionGroupFromImListResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "RemoveDistributionGroupFromImListResponse");
    private static final QName _SearchMailboxesResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SearchMailboxesResponse");
    private static final QName _CreateFolder_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages", "CreateFolder");
    private static final QName _GetImItemsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetImItemsResponse");
    private static final QName _RemoveImContactFromGroupResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "RemoveImContactFromGroupResponse");
    private static final QName _GetItem_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "GetItem");
    private static final QName _UpdateDelegate_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UpdateDelegate");
    private static final QName _ApplyConversationActionResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "ApplyConversationActionResponse");
    private static final QName _GetPhoneCallInformationResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetPhoneCallInformationResponse");
    private static final QName _GetClientAccessTokenResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetClientAccessTokenResponse");
    private static final QName _GetUserConfigurationResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUserConfigurationResponse");
    private static final QName _CompleteFindInGALSpeechRecognitionResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CompleteFindInGALSpeechRecognitionResponse");
    private static final QName _GetFolder_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "GetFolder");
    private static final QName _UnpinTeamMailboxResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UnpinTeamMailboxResponse");
    private static final QName _ValidateUMPinResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "ValidateUMPinResponseMessage");
    private static final QName _CompleteFindInGALSpeechRecognition_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CompleteFindInGALSpeechRecognition");
    private static final QName _GetUMPromptNames_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUMPromptNames");
    private static final QName _SendItemResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SendItemResponse");
    private static final QName _UpdateInboxRules_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UpdateInboxRules");
    private static final QName _AddNewImContactToGroup_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "AddNewImContactToGroup");
    private static final QName _FindFolder_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "FindFolder");
    private static final QName _GetInboxRulesResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetInboxRulesResponse");
    private static final QName _PlayOnPhoneResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "PlayOnPhoneResponse");
    private static final QName _CreateUserConfigurationResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CreateUserConfigurationResponse");
    private static final QName _SetImListMigrationCompletedResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SetImListMigrationCompletedResponse");
    private static final QName _GetPersona_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "GetPersona");
    private static final QName _GetNonIndexableItemDetailsResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetNonIndexableItemDetailsResponse");
    private static final QName _AddNewImContactToGroupResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "AddNewImContactToGroupResponse");
    private static final QName _UploadItems_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages", "UploadItems");
    private static final QName _UpdateFolderResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UpdateFolderResponse");
    private static final QName _GetUserOofSettingsRequest_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUserOofSettingsRequest");
    private static final QName _UpdateDelegateResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UpdateDelegateResponse");
    private static final QName _GetNonIndexableItemStatistics_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetNonIndexableItemStatistics");
    private static final QName _GetInboxRules_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetInboxRules");
    private static final QName _CreateManagedFolderResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CreateManagedFolderResponse");
    private static final QName _UpdateItem_QNAME =
            new QName("http://schemas.microsoft.com/exchange/services/2006/messages", "UpdateItem");
    private static final QName _GetRoomLists_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages", "GetRoomLists");
    private static final QName _ConvertIdResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "ConvertIdResponse");
    private static final QName _CreateUserConfiguration_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CreateUserConfiguration");
    private static final QName _GetAppMarketplaceUrlResponse_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetAppMarketplaceUrlResponse");
    private static final QName _UninstallApp_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages", "UninstallApp");
    private static final QName _ArrayOfServiceConfigurationTypeConfigurationName_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "ConfigurationName");
    private static final QName _ArrayOfResponseMessagesTypeSubscribeResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SubscribeResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeFindItemResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "FindItemResponseMessage");
    private static final QName
            _ArrayOfResponseMessagesTypeGetClientAccessTokenResponseMessage_QNAME =
                    new QName(
                            "http://schemas.microsoft.com/exchange/services/2006/messages",
                            "GetClientAccessTokenResponseMessage");
    private static final QName
            _ArrayOfResponseMessagesTypeGetConversationItemsResponseMessage_QNAME =
                    new QName(
                            "http://schemas.microsoft.com/exchange/services/2006/messages",
                            "GetConversationItemsResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeDeleteAttachmentResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "DeleteAttachmentResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeExportItemsResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "ExportItemsResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeUpdateFolderResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UpdateFolderResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeGetClientExtensionResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetClientExtensionResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeGetHoldOnMailboxesResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetHoldOnMailboxesResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeCreateFolderResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CreateFolderResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeMarkAllItemsAsReadResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "MarkAllItemsAsReadResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeCopyItemResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CopyItemResponseMessage");
    private static final QName
            _ArrayOfResponseMessagesTypeGetSearchableMailboxesResponseMessage_QNAME =
                    new QName(
                            "http://schemas.microsoft.com/exchange/services/2006/messages",
                            "GetSearchableMailboxesResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeGetAppManifestsResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetAppManifestsResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeSyncFolderItemsResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SyncFolderItemsResponseMessage");
    private static final QName
            _ArrayOfResponseMessagesTypeGetNonIndexableItemDetailsResponseMessage_QNAME =
                    new QName(
                            "http://schemas.microsoft.com/exchange/services/2006/messages",
                            "GetNonIndexableItemDetailsResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeGetUserPhotoResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetUserPhotoResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeExpandDLResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "ExpandDLResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeCreateFolderPathResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CreateFolderPathResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeSearchMailboxesResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SearchMailboxesResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeMarkAsJunkResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "MarkAsJunkResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeEmptyFolderResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "EmptyFolderResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeGetItemResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetItemResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeGetSharingMetadataResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetSharingMetadataResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeMoveFolderResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "MoveFolderResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeMoveItemResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "MoveItemResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeSetHoldOnMailboxesResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SetHoldOnMailboxesResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeFindFolderResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "FindFolderResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeGetServerTimeZonesResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetServerTimeZonesResponseMessage");
    private static final QName
            _ArrayOfResponseMessagesTypeGetNonIndexableItemStatisticsResponseMessage_QNAME =
                    new QName(
                            "http://schemas.microsoft.com/exchange/services/2006/messages",
                            "GetNonIndexableItemStatisticsResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeArchiveItemResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "ArchiveItemResponseMessage");
    private static final QName
            _ArrayOfResponseMessagesTypeGetUserRetentionPolicyTagsResponseMessage_QNAME =
                    new QName(
                            "http://schemas.microsoft.com/exchange/services/2006/messages",
                            "GetUserRetentionPolicyTagsResponseMessage");
    private static final QName
            _ArrayOfResponseMessagesTypeCreateManagedFolderResponseMessage_QNAME =
                    new QName(
                            "http://schemas.microsoft.com/exchange/services/2006/messages",
                            "CreateManagedFolderResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeCreateAttachmentResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CreateAttachmentResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeDeleteItemResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "DeleteItemResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeFindPeopleResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "FindPeopleResponseMessage");
    private static final QName
            _ArrayOfResponseMessagesTypeFindMailboxStatisticsByKeywordsResponseMessage_QNAME =
                    new QName(
                            "http://schemas.microsoft.com/exchange/services/2006/messages",
                            "FindMailboxStatisticsByKeywordsResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeGetEventsResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetEventsResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeSendItemResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SendItemResponseMessage");
    private static final QName
            _ArrayOfResponseMessagesTypeCreateUserConfigurationResponseMessage_QNAME =
                    new QName(
                            "http://schemas.microsoft.com/exchange/services/2006/messages",
                            "CreateUserConfigurationResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeResolveNamesResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "ResolveNamesResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeSetClientExtensionResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SetClientExtensionResponseMessage");
    private static final QName
            _ArrayOfResponseMessagesTypeGetUserConfigurationResponseMessage_QNAME =
                    new QName(
                            "http://schemas.microsoft.com/exchange/services/2006/messages",
                            "GetUserConfigurationResponseMessage");
    private static final QName
            _ArrayOfResponseMessagesTypeApplyConversationActionResponseMessage_QNAME =
                    new QName(
                            "http://schemas.microsoft.com/exchange/services/2006/messages",
                            "ApplyConversationActionResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeCopyFolderResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CopyFolderResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeConvertIdResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "ConvertIdResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeUpdateItemResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UpdateItemResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeGetStreamingEventsResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetStreamingEventsResponseMessage");
    private static final QName
            _ArrayOfResponseMessagesTypeRefreshSharingFolderResponseMessage_QNAME =
                    new QName(
                            "http://schemas.microsoft.com/exchange/services/2006/messages",
                            "RefreshSharingFolderResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeSendNotificationResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "SendNotificationResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeGetAttachmentResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetAttachmentResponseMessage");
    private static final QName
            _ArrayOfResponseMessagesTypeUpdateItemInRecoverableItemsResponseMessage_QNAME =
                    new QName(
                            "http://schemas.microsoft.com/exchange/services/2006/messages",
                            "UpdateItemInRecoverableItemsResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeGetFolderResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetFolderResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeUploadItemsResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UploadItemsResponseMessage");
    private static final QName
            _ArrayOfResponseMessagesTypeUpdateUserConfigurationResponseMessage_QNAME =
                    new QName(
                            "http://schemas.microsoft.com/exchange/services/2006/messages",
                            "UpdateUserConfigurationResponseMessage");
    private static final QName
            _ArrayOfResponseMessagesTypeSyncFolderHierarchyResponseMessage_QNAME =
                    new QName(
                            "http://schemas.microsoft.com/exchange/services/2006/messages",
                            "SyncFolderHierarchyResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeGetSharingFolderResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "GetSharingFolderResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeCreateItemResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "CreateItemResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeUnsubscribeResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "UnsubscribeResponseMessage");
    private static final QName _ArrayOfResponseMessagesTypeDeleteFolderResponseMessage_QNAME =
            new QName(
                    "http://schemas.microsoft.com/exchange/services/2006/messages",
                    "DeleteFolderResponseMessage");
    private static final QName
            _ArrayOfResponseMessagesTypeGetDiscoverySearchConfigurationResponseMessage_QNAME =
                    new QName(
                            "http://schemas.microsoft.com/exchange/services/2006/messages",
                            "GetDiscoverySearchConfigurationResponseMessage");
    private static final QName
            _ArrayOfResponseMessagesTypeDeleteUserConfigurationResponseMessage_QNAME =
                    new QName(
                            "http://schemas.microsoft.com/exchange/services/2006/messages",
                            "DeleteUserConfigurationResponseMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes
     * for package: com.microsoft.schemas.exchange.services._2006.messages
     */
    public ObjectFactory() {}

    /** Create an instance of {@link GetEventsResponseType } */
    public GetEventsResponseType createGetEventsResponseType() {
        return new GetEventsResponseType();
    }

    /** Create an instance of {@link GetConversationItemsType } */
    public GetConversationItemsType createGetConversationItemsType() {
        return new GetConversationItemsType();
    }

    /** Create an instance of {@link SendItemType } */
    public SendItemType createSendItemType() {
        return new SendItemType();
    }

    /** Create an instance of {@link CreateUMPromptResponseMessageType } */
    public CreateUMPromptResponseMessageType createCreateUMPromptResponseMessageType() {
        return new CreateUMPromptResponseMessageType();
    }

    /** Create an instance of {@link GetUMPromptResponseMessageType } */
    public GetUMPromptResponseMessageType createGetUMPromptResponseMessageType() {
        return new GetUMPromptResponseMessageType();
    }

    /** Create an instance of {@link GetAppMarketplaceUrlResponseMessageType } */
    public GetAppMarketplaceUrlResponseMessageType createGetAppMarketplaceUrlResponseMessageType() {
        return new GetAppMarketplaceUrlResponseMessageType();
    }

    /** Create an instance of {@link SendNotificationResponseType } */
    public SendNotificationResponseType createSendNotificationResponseType() {
        return new SendNotificationResponseType();
    }

    /** Create an instance of {@link CreateManagedFolderRequestType } */
    public CreateManagedFolderRequestType createCreateManagedFolderRequestType() {
        return new CreateManagedFolderRequestType();
    }

    /** Create an instance of {@link SendNotificationResponseMessageType } */
    public SendNotificationResponseMessageType createSendNotificationResponseMessageType() {
        return new SendNotificationResponseMessageType();
    }

    /** Create an instance of {@link AddImGroupResponseMessageType } */
    public AddImGroupResponseMessageType createAddImGroupResponseMessageType() {
        return new AddImGroupResponseMessageType();
    }

    /** Create an instance of {@link DisconnectPhoneCallType } */
    public DisconnectPhoneCallType createDisconnectPhoneCallType() {
        return new DisconnectPhoneCallType();
    }

    /** Create an instance of {@link GetNonIndexableItemDetailsType } */
    public GetNonIndexableItemDetailsType createGetNonIndexableItemDetailsType() {
        return new GetNonIndexableItemDetailsType();
    }

    /** Create an instance of {@link AddNewTelUriContactToGroupType } */
    public AddNewTelUriContactToGroupType createAddNewTelUriContactToGroupType() {
        return new AddNewTelUriContactToGroupType();
    }

    /** Create an instance of {@link CompleteFindInGALSpeechRecognitionResponseMessageType } */
    public CompleteFindInGALSpeechRecognitionResponseMessageType
            createCompleteFindInGALSpeechRecognitionResponseMessageType() {
        return new CompleteFindInGALSpeechRecognitionResponseMessageType();
    }

    /** Create an instance of {@link ResetUMMailboxResponseMessageType } */
    public ResetUMMailboxResponseMessageType createResetUMMailboxResponseMessageType() {
        return new ResetUMMailboxResponseMessageType();
    }

    /** Create an instance of {@link SyncFolderItemsResponseType } */
    public SyncFolderItemsResponseType createSyncFolderItemsResponseType() {
        return new SyncFolderItemsResponseType();
    }

    /** Create an instance of {@link EmptyFolderType } */
    public EmptyFolderType createEmptyFolderType() {
        return new EmptyFolderType();
    }

    /** Create an instance of {@link MarkAsJunkResponseMessageType } */
    public MarkAsJunkResponseMessageType createMarkAsJunkResponseMessageType() {
        return new MarkAsJunkResponseMessageType();
    }

    /** Create an instance of {@link SaveUMPinResponseMessageType } */
    public SaveUMPinResponseMessageType createSaveUMPinResponseMessageType() {
        return new SaveUMPinResponseMessageType();
    }

    /** Create an instance of {@link GetStreamingEventsResponseMessageType } */
    public GetStreamingEventsResponseMessageType createGetStreamingEventsResponseMessageType() {
        return new GetStreamingEventsResponseMessageType();
    }

    /** Create an instance of {@link CreateUMCallDataRecordResponseMessageType } */
    public CreateUMCallDataRecordResponseMessageType
            createCreateUMCallDataRecordResponseMessageType() {
        return new CreateUMCallDataRecordResponseMessageType();
    }

    /** Create an instance of {@link DeleteAttachmentResponseMessageType } */
    public DeleteAttachmentResponseMessageType createDeleteAttachmentResponseMessageType() {
        return new DeleteAttachmentResponseMessageType();
    }

    /** Create an instance of {@link CreateFolderResponseType } */
    public CreateFolderResponseType createCreateFolderResponseType() {
        return new CreateFolderResponseType();
    }

    /** Create an instance of {@link RemoveContactFromImListType } */
    public RemoveContactFromImListType createRemoveContactFromImListType() {
        return new RemoveContactFromImListType();
    }

    /** Create an instance of {@link ConvertIdType } */
    public ConvertIdType createConvertIdType() {
        return new ConvertIdType();
    }

    /** Create an instance of {@link ResolveNamesResponseMessageType } */
    public ResolveNamesResponseMessageType createResolveNamesResponseMessageType() {
        return new ResolveNamesResponseMessageType();
    }

    /** Create an instance of {@link UpdateItemInRecoverableItemsResponseType } */
    public UpdateItemInRecoverableItemsResponseType
            createUpdateItemInRecoverableItemsResponseType() {
        return new UpdateItemInRecoverableItemsResponseType();
    }

    /** Create an instance of {@link GetClientAccessTokenResponseType } */
    public GetClientAccessTokenResponseType createGetClientAccessTokenResponseType() {
        return new GetClientAccessTokenResponseType();
    }

    /** Create an instance of {@link GetItemType } */
    public GetItemType createGetItemType() {
        return new GetItemType();
    }

    /** Create an instance of {@link DeleteItemResponseType } */
    public DeleteItemResponseType createDeleteItemResponseType() {
        return new DeleteItemResponseType();
    }

    /** Create an instance of {@link RemoveDelegateResponseMessageType } */
    public RemoveDelegateResponseMessageType createRemoveDelegateResponseMessageType() {
        return new RemoveDelegateResponseMessageType();
    }

    /** Create an instance of {@link RemoveDelegateType } */
    public RemoveDelegateType createRemoveDelegateType() {
        return new RemoveDelegateType();
    }

    /** Create an instance of {@link UnpinTeamMailboxRequestType } */
    public UnpinTeamMailboxRequestType createUnpinTeamMailboxRequestType() {
        return new UnpinTeamMailboxRequestType();
    }

    /** Create an instance of {@link ExpandDLResponseMessageType } */
    public ExpandDLResponseMessageType createExpandDLResponseMessageType() {
        return new ExpandDLResponseMessageType();
    }

    /** Create an instance of {@link GetMailTipsResponseMessageType } */
    public GetMailTipsResponseMessageType createGetMailTipsResponseMessageType() {
        return new GetMailTipsResponseMessageType();
    }

    /** Create an instance of {@link ResolveNamesResponseType } */
    public ResolveNamesResponseType createResolveNamesResponseType() {
        return new ResolveNamesResponseType();
    }

    /** Create an instance of {@link CopyItemResponseType } */
    public CopyItemResponseType createCopyItemResponseType() {
        return new CopyItemResponseType();
    }

    /** Create an instance of {@link QueryStringType } */
    public QueryStringType createQueryStringType() {
        return new QueryStringType();
    }

    /** Create an instance of {@link UninstallAppType } */
    public UninstallAppType createUninstallAppType() {
        return new UninstallAppType();
    }

    /** Create an instance of {@link ExportItemsResponseMessageType } */
    public ExportItemsResponseMessageType createExportItemsResponseMessageType() {
        return new ExportItemsResponseMessageType();
    }

    /** Create an instance of {@link ValidateUMPinType } */
    public ValidateUMPinType createValidateUMPinType() {
        return new ValidateUMPinType();
    }

    /** Create an instance of {@link GetNonIndexableItemDetailsResponseMessageType } */
    public GetNonIndexableItemDetailsResponseMessageType
            createGetNonIndexableItemDetailsResponseMessageType() {
        return new GetNonIndexableItemDetailsResponseMessageType();
    }

    /** Create an instance of {@link BaseMoveCopyFolderType } */
    public BaseMoveCopyFolderType createBaseMoveCopyFolderType() {
        return new BaseMoveCopyFolderType();
    }

    /** Create an instance of {@link DeleteFolderType } */
    public DeleteFolderType createDeleteFolderType() {
        return new DeleteFolderType();
    }

    /** Create an instance of {@link GetFolderType } */
    public GetFolderType createGetFolderType() {
        return new GetFolderType();
    }

    /** Create an instance of {@link StartFindInGALSpeechRecognitionType } */
    public StartFindInGALSpeechRecognitionType createStartFindInGALSpeechRecognitionType() {
        return new StartFindInGALSpeechRecognitionType();
    }

    /** Create an instance of {@link RemoveDistributionGroupFromImListResponseMessageType } */
    public RemoveDistributionGroupFromImListResponseMessageType
            createRemoveDistributionGroupFromImListResponseMessageType() {
        return new RemoveDistributionGroupFromImListResponseMessageType();
    }

    /** Create an instance of {@link UpdateDelegateType } */
    public UpdateDelegateType createUpdateDelegateType() {
        return new UpdateDelegateType();
    }

    /** Create an instance of {@link MarkAsJunkResponseType } */
    public MarkAsJunkResponseType createMarkAsJunkResponseType() {
        return new MarkAsJunkResponseType();
    }

    /** Create an instance of {@link GetInboxRulesResponseType } */
    public GetInboxRulesResponseType createGetInboxRulesResponseType() {
        return new GetInboxRulesResponseType();
    }

    /** Create an instance of {@link CreateItemType } */
    public CreateItemType createCreateItemType() {
        return new CreateItemType();
    }

    /** Create an instance of {@link GetAttachmentResponseType } */
    public GetAttachmentResponseType createGetAttachmentResponseType() {
        return new GetAttachmentResponseType();
    }

    /** Create an instance of {@link EmptyFolderResponseType } */
    public EmptyFolderResponseType createEmptyFolderResponseType() {
        return new EmptyFolderResponseType();
    }

    /** Create an instance of {@link FolderInfoResponseMessageType } */
    public FolderInfoResponseMessageType createFolderInfoResponseMessageType() {
        return new FolderInfoResponseMessageType();
    }

    /** Create an instance of {@link CreateUserConfigurationResponseType } */
    public CreateUserConfigurationResponseType createCreateUserConfigurationResponseType() {
        return new CreateUserConfigurationResponseType();
    }

    /** Create an instance of {@link SetImGroupType } */
    public SetImGroupType createSetImGroupType() {
        return new SetImGroupType();
    }

    /** Create an instance of {@link UploadItemsType } */
    public UploadItemsType createUploadItemsType() {
        return new UploadItemsType();
    }

    /** Create an instance of {@link ArrayOfAppManifestsType } */
    public ArrayOfAppManifestsType createArrayOfAppManifestsType() {
        return new ArrayOfAppManifestsType();
    }

    /** Create an instance of {@link CreateManagedFolderResponseType } */
    public CreateManagedFolderResponseType createCreateManagedFolderResponseType() {
        return new CreateManagedFolderResponseType();
    }

    /** Create an instance of {@link ConvertIdResponseMessageType } */
    public ConvertIdResponseMessageType createConvertIdResponseMessageType() {
        return new ConvertIdResponseMessageType();
    }

    /** Create an instance of {@link GetClientExtensionType } */
    public GetClientExtensionType createGetClientExtensionType() {
        return new GetClientExtensionType();
    }

    /** Create an instance of {@link GetServerTimeZonesResponseType } */
    public GetServerTimeZonesResponseType createGetServerTimeZonesResponseType() {
        return new GetServerTimeZonesResponseType();
    }

    /** Create an instance of {@link DeleteItemType } */
    public DeleteItemType createDeleteItemType() {
        return new DeleteItemType();
    }

    /** Create an instance of {@link GetAttachmentType } */
    public GetAttachmentType createGetAttachmentType() {
        return new GetAttachmentType();
    }

    /** Create an instance of {@link GetSharingFolderResponseMessageType } */
    public GetSharingFolderResponseMessageType createGetSharingFolderResponseMessageType() {
        return new GetSharingFolderResponseMessageType();
    }

    /** Create an instance of {@link GetHoldOnMailboxesType } */
    public GetHoldOnMailboxesType createGetHoldOnMailboxesType() {
        return new GetHoldOnMailboxesType();
    }

    /** Create an instance of {@link ItemInfoResponseMessageType } */
    public ItemInfoResponseMessageType createItemInfoResponseMessageType() {
        return new ItemInfoResponseMessageType();
    }

    /** Create an instance of {@link GetSharingFolderType } */
    public GetSharingFolderType createGetSharingFolderType() {
        return new GetSharingFolderType();
    }

    /** Create an instance of {@link SetHoldOnMailboxesResponseMessageType } */
    public SetHoldOnMailboxesResponseMessageType createSetHoldOnMailboxesResponseMessageType() {
        return new SetHoldOnMailboxesResponseMessageType();
    }

    /** Create an instance of {@link UpdateItemType } */
    public UpdateItemType createUpdateItemType() {
        return new UpdateItemType();
    }

    /** Create an instance of {@link SaveUMPinType } */
    public SaveUMPinType createSaveUMPinType() {
        return new SaveUMPinType();
    }

    /** Create an instance of {@link FreeBusyResponseType } */
    public FreeBusyResponseType createFreeBusyResponseType() {
        return new FreeBusyResponseType();
    }

    /** Create an instance of {@link GetPersonaResponseMessageType } */
    public GetPersonaResponseMessageType createGetPersonaResponseMessageType() {
        return new GetPersonaResponseMessageType();
    }

    /** Create an instance of {@link PerformReminderActionResponseMessageType } */
    public PerformReminderActionResponseMessageType
            createPerformReminderActionResponseMessageType() {
        return new PerformReminderActionResponseMessageType();
    }

    /** Create an instance of {@link FindPeopleResponseMessageType } */
    public FindPeopleResponseMessageType createFindPeopleResponseMessageType() {
        return new FindPeopleResponseMessageType();
    }

    /** Create an instance of {@link CopyFolderType } */
    public CopyFolderType createCopyFolderType() {
        return new CopyFolderType();
    }

    /** Create an instance of {@link SearchMailboxesResponseType } */
    public SearchMailboxesResponseType createSearchMailboxesResponseType() {
        return new SearchMailboxesResponseType();
    }

    /** Create an instance of {@link GetUserRetentionPolicyTagsResponseMessageType } */
    public GetUserRetentionPolicyTagsResponseMessageType
            createGetUserRetentionPolicyTagsResponseMessageType() {
        return new GetUserRetentionPolicyTagsResponseMessageType();
    }

    /** Create an instance of {@link SearchMailboxesResponseMessageType } */
    public SearchMailboxesResponseMessageType createSearchMailboxesResponseMessageType() {
        return new SearchMailboxesResponseMessageType();
    }

    /** Create an instance of {@link UnsubscribeType } */
    public UnsubscribeType createUnsubscribeType() {
        return new UnsubscribeType();
    }

    /** Create an instance of {@link GetServiceConfigurationResponseMessageType } */
    public GetServiceConfigurationResponseMessageType
            createGetServiceConfigurationResponseMessageType() {
        return new GetServiceConfigurationResponseMessageType();
    }

    /** Create an instance of {@link GetUserRetentionPolicyTagsType } */
    public GetUserRetentionPolicyTagsType createGetUserRetentionPolicyTagsType() {
        return new GetUserRetentionPolicyTagsType();
    }

    /** Create an instance of {@link FindMailboxStatisticsByKeywordsType } */
    public FindMailboxStatisticsByKeywordsType createFindMailboxStatisticsByKeywordsType() {
        return new FindMailboxStatisticsByKeywordsType();
    }

    /** Create an instance of {@link ArchiveItemType } */
    public ArchiveItemType createArchiveItemType() {
        return new ArchiveItemType();
    }

    /** Create an instance of {@link SetClientExtensionResponseType } */
    public SetClientExtensionResponseType createSetClientExtensionResponseType() {
        return new SetClientExtensionResponseType();
    }

    /** Create an instance of {@link SetUserOofSettingsRequest } */
    public SetUserOofSettingsRequest createSetUserOofSettingsRequest() {
        return new SetUserOofSettingsRequest();
    }

    /** Create an instance of {@link ArrayOfFreeBusyResponse } */
    public ArrayOfFreeBusyResponse createArrayOfFreeBusyResponse() {
        return new ArrayOfFreeBusyResponse();
    }

    /** Create an instance of {@link UpdateInboxRulesRequestType } */
    public UpdateInboxRulesRequestType createUpdateInboxRulesRequestType() {
        return new UpdateInboxRulesRequestType();
    }

    /** Create an instance of {@link DisableAppType } */
    public DisableAppType createDisableAppType() {
        return new DisableAppType();
    }

    /** Create an instance of {@link GetSearchableMailboxesType } */
    public GetSearchableMailboxesType createGetSearchableMailboxesType() {
        return new GetSearchableMailboxesType();
    }

    /** Create an instance of {@link ArrayOfServiceConfigurationType } */
    public ArrayOfServiceConfigurationType createArrayOfServiceConfigurationType() {
        return new ArrayOfServiceConfigurationType();
    }

    /** Create an instance of {@link GetUMCallDataRecordsType } */
    public GetUMCallDataRecordsType createGetUMCallDataRecordsType() {
        return new GetUMCallDataRecordsType();
    }

    /** Create an instance of {@link SetUserOofSettingsResponse } */
    public SetUserOofSettingsResponse createSetUserOofSettingsResponse() {
        return new SetUserOofSettingsResponse();
    }

    /** Create an instance of {@link AddDelegateType } */
    public AddDelegateType createAddDelegateType() {
        return new AddDelegateType();
    }

    /** Create an instance of {@link CreateUserConfigurationType } */
    public CreateUserConfigurationType createCreateUserConfigurationType() {
        return new CreateUserConfigurationType();
    }

    /** Create an instance of {@link ServiceConfigurationResponseMessageType } */
    public ServiceConfigurationResponseMessageType createServiceConfigurationResponseMessageType() {
        return new ServiceConfigurationResponseMessageType();
    }

    /** Create an instance of {@link RemoveImContactFromGroupType } */
    public RemoveImContactFromGroupType createRemoveImContactFromGroupType() {
        return new RemoveImContactFromGroupType();
    }

    /** Create an instance of {@link SetHoldOnMailboxesType } */
    public SetHoldOnMailboxesType createSetHoldOnMailboxesType() {
        return new SetHoldOnMailboxesType();
    }

    /** Create an instance of {@link GetUMPinResponseMessageType } */
    public GetUMPinResponseMessageType createGetUMPinResponseMessageType() {
        return new GetUMPinResponseMessageType();
    }

    /** Create an instance of {@link GetAppManifestsType } */
    public GetAppManifestsType createGetAppManifestsType() {
        return new GetAppManifestsType();
    }

    /** Create an instance of {@link GetConversationItemsResponseType } */
    public GetConversationItemsResponseType createGetConversationItemsResponseType() {
        return new GetConversationItemsResponseType();
    }

    /** Create an instance of {@link UpdateItemInRecoverableItemsType } */
    public UpdateItemInRecoverableItemsType createUpdateItemInRecoverableItemsType() {
        return new UpdateItemInRecoverableItemsType();
    }

    /** Create an instance of {@link GetRoomsType } */
    public GetRoomsType createGetRoomsType() {
        return new GetRoomsType();
    }

    /** Create an instance of {@link RefreshSharingFolderType } */
    public RefreshSharingFolderType createRefreshSharingFolderType() {
        return new RefreshSharingFolderType();
    }

    /** Create an instance of {@link GetEventsType } */
    public GetEventsType createGetEventsType() {
        return new GetEventsType();
    }

    /** Create an instance of {@link GetRemindersResponseMessageType } */
    public GetRemindersResponseMessageType createGetRemindersResponseMessageType() {
        return new GetRemindersResponseMessageType();
    }

    /** Create an instance of {@link AttachmentInfoResponseMessageType } */
    public AttachmentInfoResponseMessageType createAttachmentInfoResponseMessageType() {
        return new AttachmentInfoResponseMessageType();
    }

    /** Create an instance of {@link AddImGroupType } */
    public AddImGroupType createAddImGroupType() {
        return new AddImGroupType();
    }

    /** Create an instance of {@link InitUMMailboxResponseMessageType } */
    public InitUMMailboxResponseMessageType createInitUMMailboxResponseMessageType() {
        return new InitUMMailboxResponseMessageType();
    }

    /** Create an instance of {@link GetFolderResponseType } */
    public GetFolderResponseType createGetFolderResponseType() {
        return new GetFolderResponseType();
    }

    /** Create an instance of {@link AddDistributionGroupToImListType } */
    public AddDistributionGroupToImListType createAddDistributionGroupToImListType() {
        return new AddDistributionGroupToImListType();
    }

    /** Create an instance of {@link GetUMPromptNamesType } */
    public GetUMPromptNamesType createGetUMPromptNamesType() {
        return new GetUMPromptNamesType();
    }

    /** Create an instance of {@link GetMessageTrackingReportRequestType } */
    public GetMessageTrackingReportRequestType createGetMessageTrackingReportRequestType() {
        return new GetMessageTrackingReportRequestType();
    }

    /** Create an instance of {@link SearchMailboxesType } */
    public SearchMailboxesType createSearchMailboxesType() {
        return new SearchMailboxesType();
    }

    /** Create an instance of {@link GetUserConfigurationResponseType } */
    public GetUserConfigurationResponseType createGetUserConfigurationResponseType() {
        return new GetUserConfigurationResponseType();
    }

    /** Create an instance of {@link DisconnectPhoneCallResponseMessageType } */
    public DisconnectPhoneCallResponseMessageType createDisconnectPhoneCallResponseMessageType() {
        return new DisconnectPhoneCallResponseMessageType();
    }

    /** Create an instance of {@link MoveItemResponseType } */
    public MoveItemResponseType createMoveItemResponseType() {
        return new MoveItemResponseType();
    }

    /** Create an instance of {@link ApplyConversationActionType } */
    public ApplyConversationActionType createApplyConversationActionType() {
        return new ApplyConversationActionType();
    }

    /** Create an instance of {@link MoveFolderResponseType } */
    public MoveFolderResponseType createMoveFolderResponseType() {
        return new MoveFolderResponseType();
    }

    /** Create an instance of {@link AddNewTelUriContactToGroupResponseMessageType } */
    public AddNewTelUriContactToGroupResponseMessageType
            createAddNewTelUriContactToGroupResponseMessageType() {
        return new AddNewTelUriContactToGroupResponseMessageType();
    }

    /** Create an instance of {@link ApplyConversationActionResponseType } */
    public ApplyConversationActionResponseType createApplyConversationActionResponseType() {
        return new ApplyConversationActionResponseType();
    }

    /** Create an instance of {@link InstallAppType } */
    public InstallAppType createInstallAppType() {
        return new InstallAppType();
    }

    /** Create an instance of {@link GetUserOofSettingsRequest } */
    public GetUserOofSettingsRequest createGetUserOofSettingsRequest() {
        return new GetUserOofSettingsRequest();
    }

    /** Create an instance of {@link GetClientIntentType } */
    public GetClientIntentType createGetClientIntentType() {
        return new GetClientIntentType();
    }

    /** Create an instance of {@link GetRoomListsType } */
    public GetRoomListsType createGetRoomListsType() {
        return new GetRoomListsType();
    }

    /** Create an instance of {@link ArrayOfDelegateUserResponseMessageType } */
    public ArrayOfDelegateUserResponseMessageType createArrayOfDelegateUserResponseMessageType() {
        return new ArrayOfDelegateUserResponseMessageType();
    }

    /** Create an instance of {@link DeleteFolderResponseType } */
    public DeleteFolderResponseType createDeleteFolderResponseType() {
        return new DeleteFolderResponseType();
    }

    /** Create an instance of {@link FindItemResponseMessageType } */
    public FindItemResponseMessageType createFindItemResponseMessageType() {
        return new FindItemResponseMessageType();
    }

    /** Create an instance of {@link DelegateUserResponseMessageType } */
    public DelegateUserResponseMessageType createDelegateUserResponseMessageType() {
        return new DelegateUserResponseMessageType();
    }

    /** Create an instance of {@link GetUserConfigurationResponseMessageType } */
    public GetUserConfigurationResponseMessageType createGetUserConfigurationResponseMessageType() {
        return new GetUserConfigurationResponseMessageType();
    }

    /** Create an instance of {@link RemoveContactFromImListResponseMessageType } */
    public RemoveContactFromImListResponseMessageType
            createRemoveContactFromImListResponseMessageType() {
        return new RemoveContactFromImListResponseMessageType();
    }

    /** Create an instance of {@link ResetUMMailboxType } */
    public ResetUMMailboxType createResetUMMailboxType() {
        return new ResetUMMailboxType();
    }

    /** Create an instance of {@link GetDelegateResponseMessageType } */
    public GetDelegateResponseMessageType createGetDelegateResponseMessageType() {
        return new GetDelegateResponseMessageType();
    }

    /** Create an instance of {@link GetPasswordExpirationDateType } */
    public GetPasswordExpirationDateType createGetPasswordExpirationDateType() {
        return new GetPasswordExpirationDateType();
    }

    /** Create an instance of {@link CreateFolderType } */
    public CreateFolderType createCreateFolderType() {
        return new CreateFolderType();
    }

    /** Create an instance of {@link GetUserPhotoResponseType } */
    public GetUserPhotoResponseType createGetUserPhotoResponseType() {
        return new GetUserPhotoResponseType();
    }

    /** Create an instance of {@link RefreshSharingFolderResponseMessageType } */
    public RefreshSharingFolderResponseMessageType createRefreshSharingFolderResponseMessageType() {
        return new RefreshSharingFolderResponseMessageType();
    }

    /** Create an instance of {@link ConvertIdResponseType } */
    public ConvertIdResponseType createConvertIdResponseType() {
        return new ConvertIdResponseType();
    }

    /** Create an instance of {@link UpdateFolderResponseType } */
    public UpdateFolderResponseType createUpdateFolderResponseType() {
        return new UpdateFolderResponseType();
    }

    /** Create an instance of {@link ExpandDLResponseType } */
    public ExpandDLResponseType createExpandDLResponseType() {
        return new ExpandDLResponseType();
    }

    /** Create an instance of {@link GetUMPromptNamesResponseMessageType } */
    public GetUMPromptNamesResponseMessageType createGetUMPromptNamesResponseMessageType() {
        return new GetUMPromptNamesResponseMessageType();
    }

    /** Create an instance of {@link MoveItemType } */
    public MoveItemType createMoveItemType() {
        return new MoveItemType();
    }

    /** Create an instance of {@link CreateFolderPathResponseType } */
    public CreateFolderPathResponseType createCreateFolderPathResponseType() {
        return new CreateFolderPathResponseType();
    }

    /** Create an instance of {@link SubscribeResponseType } */
    public SubscribeResponseType createSubscribeResponseType() {
        return new SubscribeResponseType();
    }

    /** Create an instance of {@link GetPhoneCallInformationType } */
    public GetPhoneCallInformationType createGetPhoneCallInformationType() {
        return new GetPhoneCallInformationType();
    }

    /** Create an instance of {@link GetPasswordExpirationDateResponseMessageType } */
    public GetPasswordExpirationDateResponseMessageType
            createGetPasswordExpirationDateResponseMessageType() {
        return new GetPasswordExpirationDateResponseMessageType();
    }

    /** Create an instance of {@link GetSearchableMailboxesResponseMessageType } */
    public GetSearchableMailboxesResponseMessageType
            createGetSearchableMailboxesResponseMessageType() {
        return new GetSearchableMailboxesResponseMessageType();
    }

    /** Create an instance of {@link MoveFolderType } */
    public MoveFolderType createMoveFolderType() {
        return new MoveFolderType();
    }

    /** Create an instance of {@link GetUserPhotoResponseMessageType } */
    public GetUserPhotoResponseMessageType createGetUserPhotoResponseMessageType() {
        return new GetUserPhotoResponseMessageType();
    }

    /** Create an instance of {@link UploadItemsResponseMessageType } */
    public UploadItemsResponseMessageType createUploadItemsResponseMessageType() {
        return new UploadItemsResponseMessageType();
    }

    /** Create an instance of {@link GetSharingMetadataResponseMessageType } */
    public GetSharingMetadataResponseMessageType createGetSharingMetadataResponseMessageType() {
        return new GetSharingMetadataResponseMessageType();
    }

    /** Create an instance of {@link AddNewImContactToGroupResponseMessageType } */
    public AddNewImContactToGroupResponseMessageType
            createAddNewImContactToGroupResponseMessageType() {
        return new AddNewImContactToGroupResponseMessageType();
    }

    /** Create an instance of {@link ArrayOfMailTipsResponseMessageType } */
    public ArrayOfMailTipsResponseMessageType createArrayOfMailTipsResponseMessageType() {
        return new ArrayOfMailTipsResponseMessageType();
    }

    /** Create an instance of {@link ClientExtensionResponseType } */
    public ClientExtensionResponseType createClientExtensionResponseType() {
        return new ClientExtensionResponseType();
    }

    /** Create an instance of {@link FindMailboxStatisticsByKeywordsResponseMessageType } */
    public FindMailboxStatisticsByKeywordsResponseMessageType
            createFindMailboxStatisticsByKeywordsResponseMessageType() {
        return new FindMailboxStatisticsByKeywordsResponseMessageType();
    }

    /** Create an instance of {@link AddImContactToGroupResponseMessageType } */
    public AddImContactToGroupResponseMessageType createAddImContactToGroupResponseMessageType() {
        return new AddImContactToGroupResponseMessageType();
    }

    /** Create an instance of {@link RemoveDistributionGroupFromImListType } */
    public RemoveDistributionGroupFromImListType createRemoveDistributionGroupFromImListType() {
        return new RemoveDistributionGroupFromImListType();
    }

    /** Create an instance of {@link GetNonIndexableItemStatisticsType } */
    public GetNonIndexableItemStatisticsType createGetNonIndexableItemStatisticsType() {
        return new GetNonIndexableItemStatisticsType();
    }

    /** Create an instance of {@link DeleteUserConfigurationResponseType } */
    public DeleteUserConfigurationResponseType createDeleteUserConfigurationResponseType() {
        return new DeleteUserConfigurationResponseType();
    }

    /** Create an instance of {@link GetMessageTrackingReportResponseMessageType } */
    public GetMessageTrackingReportResponseMessageType
            createGetMessageTrackingReportResponseMessageType() {
        return new GetMessageTrackingReportResponseMessageType();
    }

    /** Create an instance of {@link UpdateUserConfigurationType } */
    public UpdateUserConfigurationType createUpdateUserConfigurationType() {
        return new UpdateUserConfigurationType();
    }

    /** Create an instance of {@link FindMessageTrackingReportResponseMessageType } */
    public FindMessageTrackingReportResponseMessageType
            createFindMessageTrackingReportResponseMessageType() {
        return new FindMessageTrackingReportResponseMessageType();
    }

    /** Create an instance of {@link GetServerTimeZonesResponseMessageType } */
    public GetServerTimeZonesResponseMessageType createGetServerTimeZonesResponseMessageType() {
        return new GetServerTimeZonesResponseMessageType();
    }

    /** Create an instance of {@link GetUMCallSummaryType } */
    public GetUMCallSummaryType createGetUMCallSummaryType() {
        return new GetUMCallSummaryType();
    }

    /** Create an instance of {@link GetNonIndexableItemStatisticsResponseMessageType } */
    public GetNonIndexableItemStatisticsResponseMessageType
            createGetNonIndexableItemStatisticsResponseMessageType() {
        return new GetNonIndexableItemStatisticsResponseMessageType();
    }

    /** Create an instance of {@link ArchiveItemResponseType } */
    public ArchiveItemResponseType createArchiveItemResponseType() {
        return new ArchiveItemResponseType();
    }

    /** Create an instance of {@link GetUserAvailabilityResponseType } */
    public GetUserAvailabilityResponseType createGetUserAvailabilityResponseType() {
        return new GetUserAvailabilityResponseType();
    }

    /** Create an instance of {@link ValidateUMPinResponseMessageType } */
    public ValidateUMPinResponseMessageType createValidateUMPinResponseMessageType() {
        return new ValidateUMPinResponseMessageType();
    }

    /** Create an instance of {@link GetUserOofSettingsResponse } */
    public GetUserOofSettingsResponse createGetUserOofSettingsResponse() {
        return new GetUserOofSettingsResponse();
    }

    /** Create an instance of {@link GetConversationItemsResponseMessageType } */
    public GetConversationItemsResponseMessageType createGetConversationItemsResponseMessageType() {
        return new GetConversationItemsResponseMessageType();
    }

    /** Create an instance of {@link FindPeopleType } */
    public FindPeopleType createFindPeopleType() {
        return new FindPeopleType();
    }

    /** Create an instance of {@link SyncFolderItemsType } */
    public SyncFolderItemsType createSyncFolderItemsType() {
        return new SyncFolderItemsType();
    }

    /** Create an instance of {@link CreateUMPromptType } */
    public CreateUMPromptType createCreateUMPromptType() {
        return new CreateUMPromptType();
    }

    /** Create an instance of {@link UpdateItemResponseMessageType } */
    public UpdateItemResponseMessageType createUpdateItemResponseMessageType() {
        return new UpdateItemResponseMessageType();
    }

    /** Create an instance of {@link GetDiscoverySearchConfigurationResponseMessageType } */
    public GetDiscoverySearchConfigurationResponseMessageType
            createGetDiscoverySearchConfigurationResponseMessageType() {
        return new GetDiscoverySearchConfigurationResponseMessageType();
    }

    /** Create an instance of {@link AddDistributionGroupToImListResponseMessageType } */
    public AddDistributionGroupToImListResponseMessageType
            createAddDistributionGroupToImListResponseMessageType() {
        return new AddDistributionGroupToImListResponseMessageType();
    }

    /** Create an instance of {@link GetRoomListsResponseMessageType } */
    public GetRoomListsResponseMessageType createGetRoomListsResponseMessageType() {
        return new GetRoomListsResponseMessageType();
    }

    /** Create an instance of {@link FindItemType } */
    public FindItemType createFindItemType() {
        return new FindItemType();
    }

    /** Create an instance of {@link AddDelegateResponseMessageType } */
    public AddDelegateResponseMessageType createAddDelegateResponseMessageType() {
        return new AddDelegateResponseMessageType();
    }

    /** Create an instance of {@link SetTeamMailboxResponseMessageType } */
    public SetTeamMailboxResponseMessageType createSetTeamMailboxResponseMessageType() {
        return new SetTeamMailboxResponseMessageType();
    }

    /** Create an instance of {@link UnpinTeamMailboxResponseMessageType } */
    public UnpinTeamMailboxResponseMessageType createUnpinTeamMailboxResponseMessageType() {
        return new UnpinTeamMailboxResponseMessageType();
    }

    /** Create an instance of {@link GetStreamingEventsResponseType } */
    public GetStreamingEventsResponseType createGetStreamingEventsResponseType() {
        return new GetStreamingEventsResponseType();
    }

    /** Create an instance of {@link FindFolderResponseMessageType } */
    public FindFolderResponseMessageType createFindFolderResponseMessageType() {
        return new FindFolderResponseMessageType();
    }

    /** Create an instance of {@link ArrayOfServiceConfigurationResponseMessageType } */
    public ArrayOfServiceConfigurationResponseMessageType
            createArrayOfServiceConfigurationResponseMessageType() {
        return new ArrayOfServiceConfigurationResponseMessageType();
    }

    /** Create an instance of {@link CreateItemResponseType } */
    public CreateItemResponseType createCreateItemResponseType() {
        return new CreateItemResponseType();
    }

    /** Create an instance of {@link ResolveNamesType } */
    public ResolveNamesType createResolveNamesType() {
        return new ResolveNamesType();
    }

    /** Create an instance of {@link CreateAttachmentResponseType } */
    public CreateAttachmentResponseType createCreateAttachmentResponseType() {
        return new CreateAttachmentResponseType();
    }

    /** Create an instance of {@link GetStreamingEventsType } */
    public GetStreamingEventsType createGetStreamingEventsType() {
        return new GetStreamingEventsType();
    }

    /** Create an instance of {@link GetClientAccessTokenResponseMessageType } */
    public GetClientAccessTokenResponseMessageType createGetClientAccessTokenResponseMessageType() {
        return new GetClientAccessTokenResponseMessageType();
    }

    /** Create an instance of {@link GetImItemListResponseMessageType } */
    public GetImItemListResponseMessageType createGetImItemListResponseMessageType() {
        return new GetImItemListResponseMessageType();
    }

    /** Create an instance of {@link SyncFolderItemsResponseMessageType } */
    public SyncFolderItemsResponseMessageType createSyncFolderItemsResponseMessageType() {
        return new SyncFolderItemsResponseMessageType();
    }

    /** Create an instance of {@link SetClientExtensionType } */
    public SetClientExtensionType createSetClientExtensionType() {
        return new SetClientExtensionType();
    }

    /** Create an instance of {@link UpdateItemInRecoverableItemsResponseMessageType } */
    public UpdateItemInRecoverableItemsResponseMessageType
            createUpdateItemInRecoverableItemsResponseMessageType() {
        return new UpdateItemInRecoverableItemsResponseMessageType();
    }

    /** Create an instance of {@link DeleteUMPromptsType } */
    public DeleteUMPromptsType createDeleteUMPromptsType() {
        return new DeleteUMPromptsType();
    }

    /** Create an instance of {@link DeleteAttachmentResponseType } */
    public DeleteAttachmentResponseType createDeleteAttachmentResponseType() {
        return new DeleteAttachmentResponseType();
    }

    /** Create an instance of {@link GetRoomsResponseMessageType } */
    public GetRoomsResponseMessageType createGetRoomsResponseMessageType() {
        return new GetRoomsResponseMessageType();
    }

    /** Create an instance of {@link UpdateItemResponseType } */
    public UpdateItemResponseType createUpdateItemResponseType() {
        return new UpdateItemResponseType();
    }

    /** Create an instance of {@link GetAppMarketplaceUrlType } */
    public GetAppMarketplaceUrlType createGetAppMarketplaceUrlType() {
        return new GetAppMarketplaceUrlType();
    }

    /** Create an instance of {@link SuggestionsResponseType } */
    public SuggestionsResponseType createSuggestionsResponseType() {
        return new SuggestionsResponseType();
    }

    /** Create an instance of {@link GetServiceConfigurationType } */
    public GetServiceConfigurationType createGetServiceConfigurationType() {
        return new GetServiceConfigurationType();
    }

    /** Create an instance of {@link UninstallAppResponseType } */
    public UninstallAppResponseType createUninstallAppResponseType() {
        return new UninstallAppResponseType();
    }

    /** Create an instance of {@link SendItemResponseType } */
    public SendItemResponseType createSendItemResponseType() {
        return new SendItemResponseType();
    }

    /** Create an instance of {@link RemoveImContactFromGroupResponseMessageType } */
    public RemoveImContactFromGroupResponseMessageType
            createRemoveImContactFromGroupResponseMessageType() {
        return new RemoveImContactFromGroupResponseMessageType();
    }

    /** Create an instance of {@link DeleteAttachmentType } */
    public DeleteAttachmentType createDeleteAttachmentType() {
        return new DeleteAttachmentType();
    }

    /** Create an instance of {@link UpdateFolderType } */
    public UpdateFolderType createUpdateFolderType() {
        return new UpdateFolderType();
    }

    /** Create an instance of {@link MarkAsJunkType } */
    public MarkAsJunkType createMarkAsJunkType() {
        return new MarkAsJunkType();
    }

    /** Create an instance of {@link UploadItemsResponseType } */
    public UploadItemsResponseType createUploadItemsResponseType() {
        return new UploadItemsResponseType();
    }

    /** Create an instance of {@link InstallAppResponseType } */
    public InstallAppResponseType createInstallAppResponseType() {
        return new InstallAppResponseType();
    }

    /** Create an instance of {@link SyncFolderHierarchyResponseType } */
    public SyncFolderHierarchyResponseType createSyncFolderHierarchyResponseType() {
        return new SyncFolderHierarchyResponseType();
    }

    /** Create an instance of {@link GetUMCallSummaryResponseMessageType } */
    public GetUMCallSummaryResponseMessageType createGetUMCallSummaryResponseMessageType() {
        return new GetUMCallSummaryResponseMessageType();
    }

    /** Create an instance of {@link GetClientAccessTokenType } */
    public GetClientAccessTokenType createGetClientAccessTokenType() {
        return new GetClientAccessTokenType();
    }

    /** Create an instance of {@link GetHoldOnMailboxesResponseMessageType } */
    public GetHoldOnMailboxesResponseMessageType createGetHoldOnMailboxesResponseMessageType() {
        return new GetHoldOnMailboxesResponseMessageType();
    }

    /** Create an instance of {@link GetClientIntentResponseMessageType } */
    public GetClientIntentResponseMessageType createGetClientIntentResponseMessageType() {
        return new GetClientIntentResponseMessageType();
    }

    /** Create an instance of {@link GetImItemsType } */
    public GetImItemsType createGetImItemsType() {
        return new GetImItemsType();
    }

    /** Create an instance of {@link GetDiscoverySearchConfigurationType } */
    public GetDiscoverySearchConfigurationType createGetDiscoverySearchConfigurationType() {
        return new GetDiscoverySearchConfigurationType();
    }

    /** Create an instance of {@link SubscribeResponseMessageType } */
    public SubscribeResponseMessageType createSubscribeResponseMessageType() {
        return new SubscribeResponseMessageType();
    }

    /** Create an instance of {@link SetImGroupResponseMessageType } */
    public SetImGroupResponseMessageType createSetImGroupResponseMessageType() {
        return new SetImGroupResponseMessageType();
    }

    /** Create an instance of {@link FindConversationResponseMessageType } */
    public FindConversationResponseMessageType createFindConversationResponseMessageType() {
        return new FindConversationResponseMessageType();
    }

    /** Create an instance of {@link ArrayOfResponseMessagesType } */
    public ArrayOfResponseMessagesType createArrayOfResponseMessagesType() {
        return new ArrayOfResponseMessagesType();
    }

    /** Create an instance of {@link FindMailboxStatisticsByKeywordsResponseType } */
    public FindMailboxStatisticsByKeywordsResponseType
            createFindMailboxStatisticsByKeywordsResponseType() {
        return new FindMailboxStatisticsByKeywordsResponseType();
    }

    /** Create an instance of {@link PlayOnPhoneResponseMessageType } */
    public PlayOnPhoneResponseMessageType createPlayOnPhoneResponseMessageType() {
        return new PlayOnPhoneResponseMessageType();
    }

    /** Create an instance of {@link GetSharingMetadataType } */
    public GetSharingMetadataType createGetSharingMetadataType() {
        return new GetSharingMetadataType();
    }

    /** Create an instance of {@link CreateFolderPathType } */
    public CreateFolderPathType createCreateFolderPathType() {
        return new CreateFolderPathType();
    }

    /** Create an instance of {@link PlayOnPhoneType } */
    public PlayOnPhoneType createPlayOnPhoneType() {
        return new PlayOnPhoneType();
    }

    /** Create an instance of {@link FindMessageTrackingReportRequestType } */
    public FindMessageTrackingReportRequestType createFindMessageTrackingReportRequestType() {
        return new FindMessageTrackingReportRequestType();
    }

    /** Create an instance of {@link GetMailTipsType } */
    public GetMailTipsType createGetMailTipsType() {
        return new GetMailTipsType();
    }

    /** Create an instance of {@link UpdateDelegateResponseMessageType } */
    public UpdateDelegateResponseMessageType createUpdateDelegateResponseMessageType() {
        return new UpdateDelegateResponseMessageType();
    }

    /** Create an instance of {@link CreateAttachmentType } */
    public CreateAttachmentType createCreateAttachmentType() {
        return new CreateAttachmentType();
    }

    /** Create an instance of {@link UpdateInboxRulesResponseType } */
    public UpdateInboxRulesResponseType createUpdateInboxRulesResponseType() {
        return new UpdateInboxRulesResponseType();
    }

    /** Create an instance of {@link MarkAllItemsAsReadType } */
    public MarkAllItemsAsReadType createMarkAllItemsAsReadType() {
        return new MarkAllItemsAsReadType();
    }

    /** Create an instance of {@link SetTeamMailboxRequestType } */
    public SetTeamMailboxRequestType createSetTeamMailboxRequestType() {
        return new SetTeamMailboxRequestType();
    }

    /** Create an instance of {@link FindConversationType } */
    public FindConversationType createFindConversationType() {
        return new FindConversationType();
    }

    /** Create an instance of {@link GetImItemListType } */
    public GetImItemListType createGetImItemListType() {
        return new GetImItemListType();
    }

    /** Create an instance of {@link FindFolderResponseType } */
    public FindFolderResponseType createFindFolderResponseType() {
        return new FindFolderResponseType();
    }

    /** Create an instance of {@link GetServerTimeZonesType } */
    public GetServerTimeZonesType createGetServerTimeZonesType() {
        return new GetServerTimeZonesType();
    }

    /** Create an instance of {@link GetUMPromptType } */
    public GetUMPromptType createGetUMPromptType() {
        return new GetUMPromptType();
    }

    /** Create an instance of {@link GetPersonaType } */
    public GetPersonaType createGetPersonaType() {
        return new GetPersonaType();
    }

    /** Create an instance of {@link AddNewImContactToGroupType } */
    public AddNewImContactToGroupType createAddNewImContactToGroupType() {
        return new AddNewImContactToGroupType();
    }

    /** Create an instance of {@link BaseResponseMessageType } */
    public BaseResponseMessageType createBaseResponseMessageType() {
        return new BaseResponseMessageType();
    }

    /** Create an instance of {@link UpdateUserConfigurationResponseType } */
    public UpdateUserConfigurationResponseType createUpdateUserConfigurationResponseType() {
        return new UpdateUserConfigurationResponseType();
    }

    /** Create an instance of {@link SendNotificationResultType } */
    public SendNotificationResultType createSendNotificationResultType() {
        return new SendNotificationResultType();
    }

    /** Create an instance of {@link AddImContactToGroupType } */
    public AddImContactToGroupType createAddImContactToGroupType() {
        return new AddImContactToGroupType();
    }

    /** Create an instance of {@link InitUMMailboxType } */
    public InitUMMailboxType createInitUMMailboxType() {
        return new InitUMMailboxType();
    }

    /** Create an instance of {@link DeleteUMPromptsResponseMessageType } */
    public DeleteUMPromptsResponseMessageType createDeleteUMPromptsResponseMessageType() {
        return new DeleteUMPromptsResponseMessageType();
    }

    /** Create an instance of {@link SetImListMigrationCompletedResponseMessageType } */
    public SetImListMigrationCompletedResponseMessageType
            createSetImListMigrationCompletedResponseMessageType() {
        return new SetImListMigrationCompletedResponseMessageType();
    }

    /** Create an instance of {@link CreateUMCallDataRecordType } */
    public CreateUMCallDataRecordType createCreateUMCallDataRecordType() {
        return new CreateUMCallDataRecordType();
    }

    /** Create an instance of {@link GetUMSubscriberCallAnsweringDataType } */
    public GetUMSubscriberCallAnsweringDataType createGetUMSubscriberCallAnsweringDataType() {
        return new GetUMSubscriberCallAnsweringDataType();
    }

    /** Create an instance of {@link GetUserPhotoType } */
    public GetUserPhotoType createGetUserPhotoType() {
        return new GetUserPhotoType();
    }

    /** Create an instance of {@link GetImItemsResponseMessageType } */
    public GetImItemsResponseMessageType createGetImItemsResponseMessageType() {
        return new GetImItemsResponseMessageType();
    }

    /** Create an instance of {@link RemoveImGroupType } */
    public RemoveImGroupType createRemoveImGroupType() {
        return new RemoveImGroupType();
    }

    /** Create an instance of {@link MarkAllItemsAsReadResponseType } */
    public MarkAllItemsAsReadResponseType createMarkAllItemsAsReadResponseType() {
        return new MarkAllItemsAsReadResponseType();
    }

    /** Create an instance of {@link GetUMCallDataRecordsResponseMessageType } */
    public GetUMCallDataRecordsResponseMessageType createGetUMCallDataRecordsResponseMessageType() {
        return new GetUMCallDataRecordsResponseMessageType();
    }

    /** Create an instance of {@link SubscribeType } */
    public SubscribeType createSubscribeType() {
        return new SubscribeType();
    }

    /** Create an instance of {@link PerformReminderActionType } */
    public PerformReminderActionType createPerformReminderActionType() {
        return new PerformReminderActionType();
    }

    /** Create an instance of {@link DeleteUserConfigurationType } */
    public DeleteUserConfigurationType createDeleteUserConfigurationType() {
        return new DeleteUserConfigurationType();
    }

    /** Create an instance of {@link CopyFolderResponseType } */
    public CopyFolderResponseType createCopyFolderResponseType() {
        return new CopyFolderResponseType();
    }

    /** Create an instance of {@link ExpandDLType } */
    public ExpandDLType createExpandDLType() {
        return new ExpandDLType();
    }

    /** Create an instance of {@link ExportItemsType } */
    public ExportItemsType createExportItemsType() {
        return new ExportItemsType();
    }

    /** Create an instance of {@link GetUMSubscriberCallAnsweringDataResponseMessageType } */
    public GetUMSubscriberCallAnsweringDataResponseMessageType
            createGetUMSubscriberCallAnsweringDataResponseMessageType() {
        return new GetUMSubscriberCallAnsweringDataResponseMessageType();
    }

    /** Create an instance of {@link MailTipsResponseMessageType } */
    public MailTipsResponseMessageType createMailTipsResponseMessageType() {
        return new MailTipsResponseMessageType();
    }

    /** Create an instance of {@link FindFolderType } */
    public FindFolderType createFindFolderType() {
        return new FindFolderType();
    }

    /** Create an instance of {@link DisableAppResponseType } */
    public DisableAppResponseType createDisableAppResponseType() {
        return new DisableAppResponseType();
    }

    /** Create an instance of {@link FindItemResponseType } */
    public FindItemResponseType createFindItemResponseType() {
        return new FindItemResponseType();
    }

    /** Create an instance of {@link ResponseMessageType } */
    public ResponseMessageType createResponseMessageType() {
        return new ResponseMessageType();
    }

    /** Create an instance of {@link StartFindInGALSpeechRecognitionResponseMessageType } */
    public StartFindInGALSpeechRecognitionResponseMessageType
            createStartFindInGALSpeechRecognitionResponseMessageType() {
        return new StartFindInGALSpeechRecognitionResponseMessageType();
    }

    /** Create an instance of {@link SetImListMigrationCompletedType } */
    public SetImListMigrationCompletedType createSetImListMigrationCompletedType() {
        return new SetImListMigrationCompletedType();
    }

    /** Create an instance of {@link GetUserAvailabilityRequestType } */
    public GetUserAvailabilityRequestType createGetUserAvailabilityRequestType() {
        return new GetUserAvailabilityRequestType();
    }

    /** Create an instance of {@link SyncFolderHierarchyResponseMessageType } */
    public SyncFolderHierarchyResponseMessageType createSyncFolderHierarchyResponseMessageType() {
        return new SyncFolderHierarchyResponseMessageType();
    }

    /** Create an instance of {@link GetEventsResponseMessageType } */
    public GetEventsResponseMessageType createGetEventsResponseMessageType() {
        return new GetEventsResponseMessageType();
    }

    /** Create an instance of {@link ResponseMessageType.MessageXml } */
    public ResponseMessageType.MessageXml createResponseMessageTypeMessageXml() {
        return new ResponseMessageType.MessageXml();
    }

    /** Create an instance of {@link GetPhoneCallInformationResponseMessageType } */
    public GetPhoneCallInformationResponseMessageType
            createGetPhoneCallInformationResponseMessageType() {
        return new GetPhoneCallInformationResponseMessageType();
    }

    /** Create an instance of {@link RemoveImGroupResponseMessageType } */
    public RemoveImGroupResponseMessageType createRemoveImGroupResponseMessageType() {
        return new RemoveImGroupResponseMessageType();
    }

    /** Create an instance of {@link GetRemindersType } */
    public GetRemindersType createGetRemindersType() {
        return new GetRemindersType();
    }

    /** Create an instance of {@link GetAppManifestsResponseType } */
    public GetAppManifestsResponseType createGetAppManifestsResponseType() {
        return new GetAppManifestsResponseType();
    }

    /** Create an instance of {@link GetItemResponseType } */
    public GetItemResponseType createGetItemResponseType() {
        return new GetItemResponseType();
    }

    /** Create an instance of {@link UnsubscribeResponseType } */
    public UnsubscribeResponseType createUnsubscribeResponseType() {
        return new UnsubscribeResponseType();
    }

    /** Create an instance of {@link GetUserConfigurationType } */
    public GetUserConfigurationType createGetUserConfigurationType() {
        return new GetUserConfigurationType();
    }

    /** Create an instance of {@link BaseMoveCopyItemType } */
    public BaseMoveCopyItemType createBaseMoveCopyItemType() {
        return new BaseMoveCopyItemType();
    }

    /** Create an instance of {@link GetInboxRulesRequestType } */
    public GetInboxRulesRequestType createGetInboxRulesRequestType() {
        return new GetInboxRulesRequestType();
    }

    /** Create an instance of {@link ExportItemsResponseType } */
    public ExportItemsResponseType createExportItemsResponseType() {
        return new ExportItemsResponseType();
    }

    /** Create an instance of {@link CopyItemType } */
    public CopyItemType createCopyItemType() {
        return new CopyItemType();
    }

    /** Create an instance of {@link SyncFolderHierarchyType } */
    public SyncFolderHierarchyType createSyncFolderHierarchyType() {
        return new SyncFolderHierarchyType();
    }

    /** Create an instance of {@link GetDelegateType } */
    public GetDelegateType createGetDelegateType() {
        return new GetDelegateType();
    }

    /** Create an instance of {@link GetUMPinType } */
    public GetUMPinType createGetUMPinType() {
        return new GetUMPinType();
    }

    /** Create an instance of {@link CompleteFindInGALSpeechRecognitionType } */
    public CompleteFindInGALSpeechRecognitionType createCompleteFindInGALSpeechRecognitionType() {
        return new CompleteFindInGALSpeechRecognitionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceConfigurationType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetServiceConfiguration")
    public JAXBElement<GetServiceConfigurationType> createGetServiceConfiguration(
            GetServiceConfigurationType value) {
        return new JAXBElement<GetServiceConfigurationType>(
                _GetServiceConfiguration_QNAME, GetServiceConfigurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAttachmentType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "DeleteAttachment")
    public JAXBElement<DeleteAttachmentType> createDeleteAttachment(DeleteAttachmentType value) {
        return new JAXBElement<DeleteAttachmentType>(
                _DeleteAttachment_QNAME, DeleteAttachmentType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ExportItemsType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ExportItems")
    public JAXBElement<ExportItemsType> createExportItems(ExportItemsType value) {
        return new JAXBElement<ExportItemsType>(
                _ExportItems_QNAME, ExportItemsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNotificationResultType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SendNotificationResult")
    public JAXBElement<SendNotificationResultType> createSendNotificationResult(
            SendNotificationResultType value) {
        return new JAXBElement<SendNotificationResultType>(
                _SendNotificationResult_QNAME, SendNotificationResultType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link DeleteItemType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "DeleteItem")
    public JAXBElement<DeleteItemType> createDeleteItem(DeleteItemType value) {
        return new JAXBElement<DeleteItemType>(
                _DeleteItem_QNAME, DeleteItemType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link FindPeopleType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "FindPeople")
    public JAXBElement<FindPeopleType> createFindPeople(FindPeopleType value) {
        return new JAXBElement<FindPeopleType>(
                _FindPeople_QNAME, FindPeopleType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link EmptyFolderType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "EmptyFolder")
    public JAXBElement<EmptyFolderType> createEmptyFolder(EmptyFolderType value) {
        return new JAXBElement<EmptyFolderType>(
                _EmptyFolder_QNAME, EmptyFolderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveContactFromImListType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "RemoveContactFromImList")
    public JAXBElement<RemoveContactFromImListType> createRemoveContactFromImList(
            RemoveContactFromImListType value) {
        return new JAXBElement<RemoveContactFromImListType>(
                _RemoveContactFromImList_QNAME, RemoveContactFromImListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsubscribeResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UnsubscribeResponse")
    public JAXBElement<UnsubscribeResponseType> createUnsubscribeResponse(
            UnsubscribeResponseType value) {
        return new JAXBElement<UnsubscribeResponseType>(
                _UnsubscribeResponse_QNAME, UnsubscribeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserOofSettingsResponse }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUserOofSettingsResponse")
    public JAXBElement<GetUserOofSettingsResponse> createGetUserOofSettingsResponse(
            GetUserOofSettingsResponse value) {
        return new JAXBElement<GetUserOofSettingsResponse>(
                _GetUserOofSettingsResponse_QNAME, GetUserOofSettingsResponse.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GetMailTipsType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetMailTips")
    public JAXBElement<GetMailTipsType> createGetMailTips(GetMailTipsType value) {
        return new JAXBElement<GetMailTipsType>(
                _GetMailTips_QNAME, GetMailTipsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUMCallDataRecordsType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUMCallDataRecords")
    public JAXBElement<GetUMCallDataRecordsType> createGetUMCallDataRecords(
            GetUMCallDataRecordsType value) {
        return new JAXBElement<GetUMCallDataRecordsType>(
                _GetUMCallDataRecords_QNAME, GetUMCallDataRecordsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * FindMessageTrackingReportRequestType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "FindMessageTrackingReport")
    public JAXBElement<FindMessageTrackingReportRequestType> createFindMessageTrackingReport(
            FindMessageTrackingReportRequestType value) {
        return new JAXBElement<FindMessageTrackingReportRequestType>(
                _FindMessageTrackingReport_QNAME,
                FindMessageTrackingReportRequestType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link CreateUMPromptType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateUMPrompt")
    public JAXBElement<CreateUMPromptType> createCreateUMPrompt(CreateUMPromptType value) {
        return new JAXBElement<CreateUMPromptType>(
                _CreateUMPrompt_QNAME, CreateUMPromptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDelegateResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "AddDelegateResponse")
    public JAXBElement<AddDelegateResponseMessageType> createAddDelegateResponse(
            AddDelegateResponseMessageType value) {
        return new JAXBElement<AddDelegateResponseMessageType>(
                _AddDelegateResponse_QNAME, AddDelegateResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * RemoveContactFromImListResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "RemoveContactFromImListResponse")
    public JAXBElement<RemoveContactFromImListResponseMessageType>
            createRemoveContactFromImListResponse(
                    RemoveContactFromImListResponseMessageType value) {
        return new JAXBElement<RemoveContactFromImListResponseMessageType>(
                _RemoveContactFromImListResponse_QNAME,
                RemoveContactFromImListResponseMessageType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GetUserPhotoType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUserPhoto")
    public JAXBElement<GetUserPhotoType> createGetUserPhoto(GetUserPhotoType value) {
        return new JAXBElement<GetUserPhotoType>(
                _GetUserPhoto_QNAME, GetUserPhotoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyFolderResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CopyFolderResponse")
    public JAXBElement<CopyFolderResponseType> createCopyFolderResponse(
            CopyFolderResponseType value) {
        return new JAXBElement<CopyFolderResponseType>(
                _CopyFolderResponse_QNAME, CopyFolderResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplyConversationActionType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ApplyConversationAction")
    public JAXBElement<ApplyConversationActionType> createApplyConversationAction(
            ApplyConversationActionType value) {
        return new JAXBElement<ApplyConversationActionType>(
                _ApplyConversationAction_QNAME, ApplyConversationActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConversationItemsResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetConversationItemsResponse")
    public JAXBElement<GetConversationItemsResponseType> createGetConversationItemsResponse(
            GetConversationItemsResponseType value) {
        return new JAXBElement<GetConversationItemsResponseType>(
                _GetConversationItemsResponse_QNAME,
                GetConversationItemsResponseType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetSharingMetadataResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetSharingMetadataResponse")
    public JAXBElement<GetSharingMetadataResponseMessageType> createGetSharingMetadataResponse(
            GetSharingMetadataResponseMessageType value) {
        return new JAXBElement<GetSharingMetadataResponseMessageType>(
                _GetSharingMetadataResponse_QNAME,
                GetSharingMetadataResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUserOofSettingsResponse }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SetUserOofSettingsResponse")
    public JAXBElement<SetUserOofSettingsResponse> createSetUserOofSettingsResponse(
            SetUserOofSettingsResponse value) {
        return new JAXBElement<SetUserOofSettingsResponse>(
                _SetUserOofSettingsResponse_QNAME, SetUserOofSettingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetImGroupResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SetImGroupResponse")
    public JAXBElement<SetImGroupResponseMessageType> createSetImGroupResponse(
            SetImGroupResponseMessageType value) {
        return new JAXBElement<SetImGroupResponseMessageType>(
                _SetImGroupResponse_QNAME, SetImGroupResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonaResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetPersonaResponseMessage")
    public JAXBElement<GetPersonaResponseMessageType> createGetPersonaResponseMessage(
            GetPersonaResponseMessageType value) {
        return new JAXBElement<GetPersonaResponseMessageType>(
                _GetPersonaResponseMessage_QNAME, GetPersonaResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncFolderHierarchyType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SyncFolderHierarchy")
    public JAXBElement<SyncFolderHierarchyType> createSyncFolderHierarchy(
            SyncFolderHierarchyType value) {
        return new JAXBElement<SyncFolderHierarchyType>(
                _SyncFolderHierarchy_QNAME, SyncFolderHierarchyType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link UnsubscribeType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "Unsubscribe")
    public JAXBElement<UnsubscribeType> createUnsubscribe(UnsubscribeType value) {
        return new JAXBElement<UnsubscribeType>(
                _Unsubscribe_QNAME, UnsubscribeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientAccessTokenType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetClientAccessToken")
    public JAXBElement<GetClientAccessTokenType> createGetClientAccessToken(
            GetClientAccessTokenType value) {
        return new JAXBElement<GetClientAccessTokenType>(
                _GetClientAccessToken_QNAME, GetClientAccessTokenType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GetAttachmentType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetAttachment")
    public JAXBElement<GetAttachmentType> createGetAttachment(GetAttachmentType value) {
        return new JAXBElement<GetAttachmentType>(
                _GetAttachment_QNAME, GetAttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisableAppResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "DisableAppResponse")
    public JAXBElement<DisableAppResponseType> createDisableAppResponse(
            DisableAppResponseType value) {
        return new JAXBElement<DisableAppResponseType>(
                _DisableAppResponse_QNAME, DisableAppResponseType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link SetImGroupType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SetImGroup")
    public JAXBElement<SetImGroupType> createSetImGroup(SetImGroupType value) {
        return new JAXBElement<SetImGroupType>(
                _SetImGroup_QNAME, SetImGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddImContactToGroupType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "AddImContactToGroup")
    public JAXBElement<AddImContactToGroupType> createAddImContactToGroup(
            AddImContactToGroupType value) {
        return new JAXBElement<AddImContactToGroupType>(
                _AddImContactToGroup_QNAME, AddImContactToGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUMCallSummaryType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUMCallSummary")
    public JAXBElement<GetUMCallSummaryType> createGetUMCallSummary(GetUMCallSummaryType value) {
        return new JAXBElement<GetUMCallSummaryType>(
                _GetUMCallSummary_QNAME, GetUMCallSummaryType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link RemoveDelegateType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "RemoveDelegate")
    public JAXBElement<RemoveDelegateType> createRemoveDelegate(RemoveDelegateType value) {
        return new JAXBElement<RemoveDelegateType>(
                _RemoveDelegate_QNAME, RemoveDelegateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomsResponseMessageType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetRoomsResponse")
    public JAXBElement<GetRoomsResponseMessageType> createGetRoomsResponse(
            GetRoomsResponseMessageType value) {
        return new JAXBElement<GetRoomsResponseMessageType>(
                _GetRoomsResponse_QNAME, GetRoomsResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUMPromptResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateUMPromptResponse")
    public JAXBElement<CreateUMPromptResponseMessageType> createCreateUMPromptResponse(
            CreateUMPromptResponseMessageType value) {
        return new JAXBElement<CreateUMPromptResponseMessageType>(
                _CreateUMPromptResponse_QNAME,
                CreateUMPromptResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkAllItemsAsReadType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "MarkAllItemsAsRead")
    public JAXBElement<MarkAllItemsAsReadType> createMarkAllItemsAsRead(
            MarkAllItemsAsReadType value) {
        return new JAXBElement<MarkAllItemsAsReadType>(
                _MarkAllItemsAsRead_QNAME, MarkAllItemsAsReadType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link UpdateFolderType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UpdateFolder")
    public JAXBElement<UpdateFolderType> createUpdateFolder(UpdateFolderType value) {
        return new JAXBElement<UpdateFolderType>(
                _UpdateFolder_QNAME, UpdateFolderType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GetClientIntentType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetClientIntent")
    public JAXBElement<GetClientIntentType> createGetClientIntent(GetClientIntentType value) {
        return new JAXBElement<GetClientIntentType>(
                _GetClientIntent_QNAME, GetClientIntentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserConfigurationResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "DeleteUserConfigurationResponse")
    public JAXBElement<DeleteUserConfigurationResponseType> createDeleteUserConfigurationResponse(
            DeleteUserConfigurationResponseType value) {
        return new JAXBElement<DeleteUserConfigurationResponseType>(
                _DeleteUserConfigurationResponse_QNAME,
                DeleteUserConfigurationResponseType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GetEventsType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetEvents")
    public JAXBElement<GetEventsType> createGetEvents(GetEventsType value) {
        return new JAXBElement<GetEventsType>(_GetEvents_QNAME, GetEventsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFolderResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "FindFolderResponse")
    public JAXBElement<FindFolderResponseType> createFindFolderResponse(
            FindFolderResponseType value) {
        return new JAXBElement<FindFolderResponseType>(
                _FindFolderResponse_QNAME, FindFolderResponseType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link RemoveImGroupType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "RemoveImGroup")
    public JAXBElement<RemoveImGroupType> createRemoveImGroup(RemoveImGroupType value) {
        return new JAXBElement<RemoveImGroupType>(
                _RemoveImGroup_QNAME, RemoveImGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyItemResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CopyItemResponse")
    public JAXBElement<CopyItemResponseType> createCopyItemResponse(CopyItemResponseType value) {
        return new JAXBElement<CopyItemResponseType>(
                _CopyItemResponse_QNAME, CopyItemResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnpinTeamMailboxRequestType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UnpinTeamMailbox")
    public JAXBElement<UnpinTeamMailboxRequestType> createUnpinTeamMailbox(
            UnpinTeamMailboxRequestType value) {
        return new JAXBElement<UnpinTeamMailboxRequestType>(
                _UnpinTeamMailbox_QNAME, UnpinTeamMailboxRequestType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link SaveUMPinType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SaveUMPin")
    public JAXBElement<SaveUMPinType> createSaveUMPin(SaveUMPinType value) {
        return new JAXBElement<SaveUMPinType>(_SaveUMPin_QNAME, SaveUMPinType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkAsJunkResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "MarkAsJunkResponse")
    public JAXBElement<MarkAsJunkResponseType> createMarkAsJunkResponse(
            MarkAsJunkResponseType value) {
        return new JAXBElement<MarkAsJunkResponseType>(
                _MarkAsJunkResponse_QNAME, MarkAsJunkResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetClientExtensionType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SetClientExtension")
    public JAXBElement<SetClientExtensionType> createSetClientExtension(
            SetClientExtensionType value) {
        return new JAXBElement<SetClientExtensionType>(
                _SetClientExtension_QNAME, SetClientExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserConfigurationType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UpdateUserConfiguration")
    public JAXBElement<UpdateUserConfigurationType> createUpdateUserConfiguration(
            UpdateUserConfigurationType value) {
        return new JAXBElement<UpdateUserConfigurationType>(
                _UpdateUserConfiguration_QNAME, UpdateUserConfigurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDiscoverySearchConfigurationType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetDiscoverySearchConfiguration")
    public JAXBElement<GetDiscoverySearchConfigurationType> createGetDiscoverySearchConfiguration(
            GetDiscoverySearchConfigurationType value) {
        return new JAXBElement<GetDiscoverySearchConfigurationType>(
                _GetDiscoverySearchConfiguration_QNAME,
                GetDiscoverySearchConfigurationType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMailboxStatisticsByKeywordsType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "FindMailboxStatisticsByKeywords")
    public JAXBElement<FindMailboxStatisticsByKeywordsType> createFindMailboxStatisticsByKeywords(
            FindMailboxStatisticsByKeywordsType value) {
        return new JAXBElement<FindMailboxStatisticsByKeywordsType>(
                _FindMailboxStatisticsByKeywords_QNAME,
                FindMailboxStatisticsByKeywordsType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribeResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SubscribeResponse")
    public JAXBElement<SubscribeResponseType> createSubscribeResponse(SubscribeResponseType value) {
        return new JAXBElement<SubscribeResponseType>(
                _SubscribeResponse_QNAME, SubscribeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUMPromptResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUMPromptResponse")
    public JAXBElement<GetUMPromptResponseMessageType> createGetUMPromptResponse(
            GetUMPromptResponseMessageType value) {
        return new JAXBElement<GetUMPromptResponseMessageType>(
                _GetUMPromptResponse_QNAME, GetUMPromptResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageTrackingReportRequestType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetMessageTrackingReport")
    public JAXBElement<GetMessageTrackingReportRequestType> createGetMessageTrackingReport(
            GetMessageTrackingReportRequestType value) {
        return new JAXBElement<GetMessageTrackingReportRequestType>(
                _GetMessageTrackingReport_QNAME,
                GetMessageTrackingReportRequestType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link SearchMailboxesType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SearchMailboxes")
    public JAXBElement<SearchMailboxesType> createSearchMailboxes(SearchMailboxesType value) {
        return new JAXBElement<SearchMailboxesType>(
                _SearchMailboxes_QNAME, SearchMailboxesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomListsResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetRoomListsResponse")
    public JAXBElement<GetRoomListsResponseMessageType> createGetRoomListsResponse(
            GetRoomListsResponseMessageType value) {
        return new JAXBElement<GetRoomListsResponseMessageType>(
                _GetRoomListsResponse_QNAME, GetRoomListsResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteItemResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "DeleteItemResponse")
    public JAXBElement<DeleteItemResponseType> createDeleteItemResponse(
            DeleteItemResponseType value) {
        return new JAXBElement<DeleteItemResponseType>(
                _DeleteItemResponse_QNAME, DeleteItemResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformReminderActionType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "PerformReminderAction")
    public JAXBElement<PerformReminderActionType> createPerformReminderAction(
            PerformReminderActionType value) {
        return new JAXBElement<PerformReminderActionType>(
                _PerformReminderAction_QNAME, PerformReminderActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAttachmentType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateAttachment")
    public JAXBElement<CreateAttachmentType> createCreateAttachment(CreateAttachmentType value) {
        return new JAXBElement<CreateAttachmentType>(
                _CreateAttachment_QNAME, CreateAttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUMPromptNamesResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUMPromptNamesResponse")
    public JAXBElement<GetUMPromptNamesResponseMessageType> createGetUMPromptNamesResponse(
            GetUMPromptNamesResponseMessageType value) {
        return new JAXBElement<GetUMPromptNamesResponseMessageType>(
                _GetUMPromptNamesResponse_QNAME,
                GetUMPromptNamesResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewTelUriContactToGroupType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "AddNewTelUriContactToGroup")
    public JAXBElement<AddNewTelUriContactToGroupType> createAddNewTelUriContactToGroup(
            AddNewTelUriContactToGroupType value) {
        return new JAXBElement<AddNewTelUriContactToGroupType>(
                _AddNewTelUriContactToGroup_QNAME,
                AddNewTelUriContactToGroupType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateManagedFolderRequestType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateManagedFolder")
    public JAXBElement<CreateManagedFolderRequestType> createCreateManagedFolder(
            CreateManagedFolderRequestType value) {
        return new JAXBElement<CreateManagedFolderRequestType>(
                _CreateManagedFolder_QNAME, CreateManagedFolderRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSharingFolderResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetSharingFolderResponse")
    public JAXBElement<GetSharingFolderResponseMessageType> createGetSharingFolderResponse(
            GetSharingFolderResponseMessageType value) {
        return new JAXBElement<GetSharingFolderResponseMessageType>(
                _GetSharingFolderResponse_QNAME,
                GetSharingFolderResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetNonIndexableItemStatisticsResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetNonIndexableItemStatisticsResponse")
    public JAXBElement<GetNonIndexableItemStatisticsResponseMessageType>
            createGetNonIndexableItemStatisticsResponse(
                    GetNonIndexableItemStatisticsResponseMessageType value) {
        return new JAXBElement<GetNonIndexableItemStatisticsResponseMessageType>(
                _GetNonIndexableItemStatisticsResponse_QNAME,
                GetNonIndexableItemStatisticsResponseMessageType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ResetUMMailboxType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ResetUMMailbox")
    public JAXBElement<ResetUMMailboxType> createResetUMMailbox(ResetUMMailboxType value) {
        return new JAXBElement<ResetUMMailboxType>(
                _ResetUMMailbox_QNAME, ResetUMMailboxType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * FindMailboxStatisticsByKeywordsResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "FindMailboxStatisticsByKeywordsResponse")
    public JAXBElement<FindMailboxStatisticsByKeywordsResponseType>
            createFindMailboxStatisticsByKeywordsResponse(
                    FindMailboxStatisticsByKeywordsResponseType value) {
        return new JAXBElement<FindMailboxStatisticsByKeywordsResponseType>(
                _FindMailboxStatisticsByKeywordsResponse_QNAME,
                FindMailboxStatisticsByKeywordsResponseType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserConfigurationType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "DeleteUserConfiguration")
    public JAXBElement<DeleteUserConfigurationType> createDeleteUserConfiguration(
            DeleteUserConfigurationType value) {
        return new JAXBElement<DeleteUserConfigurationType>(
                _DeleteUserConfiguration_QNAME, DeleteUserConfigurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFolderResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetFolderResponse")
    public JAXBElement<GetFolderResponseType> createGetFolderResponse(GetFolderResponseType value) {
        return new JAXBElement<GetFolderResponseType>(
                _GetFolderResponse_QNAME, GetFolderResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisconnectPhoneCallType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "DisconnectPhoneCall")
    public JAXBElement<DisconnectPhoneCallType> createDisconnectPhoneCall(
            DisconnectPhoneCallType value) {
        return new JAXBElement<DisconnectPhoneCallType>(
                _DisconnectPhoneCall_QNAME, DisconnectPhoneCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSharingFolderType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetSharingFolder")
    public JAXBElement<GetSharingFolderType> createGetSharingFolder(GetSharingFolderType value) {
        return new JAXBElement<GetSharingFolderType>(
                _GetSharingFolder_QNAME, GetSharingFolderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSharingMetadataType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetSharingMetadata")
    public JAXBElement<GetSharingMetadataType> createGetSharingMetadata(
            GetSharingMetadataType value) {
        return new JAXBElement<GetSharingMetadataType>(
                _GetSharingMetadata_QNAME, GetSharingMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * DisconnectPhoneCallResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "DisconnectPhoneCallResponse")
    public JAXBElement<DisconnectPhoneCallResponseMessageType> createDisconnectPhoneCallResponse(
            DisconnectPhoneCallResponseMessageType value) {
        return new JAXBElement<DisconnectPhoneCallResponseMessageType>(
                _DisconnectPhoneCallResponse_QNAME,
                DisconnectPhoneCallResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUMCallDataRecordType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateUMCallDataRecord")
    public JAXBElement<CreateUMCallDataRecordType> createCreateUMCallDataRecord(
            CreateUMCallDataRecordType value) {
        return new JAXBElement<CreateUMCallDataRecordType>(
                _CreateUMCallDataRecord_QNAME, CreateUMCallDataRecordType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GetRemindersType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetReminders")
    public JAXBElement<GetRemindersType> createGetReminders(GetRemindersType value) {
        return new JAXBElement<GetRemindersType>(
                _GetReminders_QNAME, GetRemindersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetDiscoverySearchConfigurationResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetDiscoverySearchConfigurationResponse")
    public JAXBElement<GetDiscoverySearchConfigurationResponseMessageType>
            createGetDiscoverySearchConfigurationResponse(
                    GetDiscoverySearchConfigurationResponseMessageType value) {
        return new JAXBElement<GetDiscoverySearchConfigurationResponseMessageType>(
                _GetDiscoverySearchConfigurationResponse_QNAME,
                GetDiscoverySearchConfigurationResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveDelegateResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "RemoveDelegateResponse")
    public JAXBElement<RemoveDelegateResponseMessageType> createRemoveDelegateResponse(
            RemoveDelegateResponseMessageType value) {
        return new JAXBElement<RemoveDelegateResponseMessageType>(
                _RemoveDelegateResponse_QNAME,
                RemoveDelegateResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPeopleResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "FindPeopleResponse")
    public JAXBElement<FindPeopleResponseMessageType> createFindPeopleResponse(
            FindPeopleResponseMessageType value) {
        return new JAXBElement<FindPeopleResponseMessageType>(
                _FindPeopleResponse_QNAME, FindPeopleResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPhoneCallInformationType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetPhoneCallInformation")
    public JAXBElement<GetPhoneCallInformationType> createGetPhoneCallInformation(
            GetPhoneCallInformationType value) {
        return new JAXBElement<GetPhoneCallInformationType>(
                _GetPhoneCallInformation_QNAME, GetPhoneCallInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetUMSubscriberCallAnsweringDataResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUMSubscriberCallAnsweringDataResponseMessage")
    public JAXBElement<GetUMSubscriberCallAnsweringDataResponseMessageType>
            createGetUMSubscriberCallAnsweringDataResponseMessage(
                    GetUMSubscriberCallAnsweringDataResponseMessageType value) {
        return new JAXBElement<GetUMSubscriberCallAnsweringDataResponseMessageType>(
                _GetUMSubscriberCallAnsweringDataResponseMessage_QNAME,
                GetUMSubscriberCallAnsweringDataResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefreshSharingFolderType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "RefreshSharingFolder")
    public JAXBElement<RefreshSharingFolderType> createRefreshSharingFolder(
            RefreshSharingFolderType value) {
        return new JAXBElement<RefreshSharingFolderType>(
                _RefreshSharingFolder_QNAME, RefreshSharingFolderType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link SyncFolderItemsType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SyncFolderItems")
    public JAXBElement<SyncFolderItemsType> createSyncFolderItems(SyncFolderItemsType value) {
        return new JAXBElement<SyncFolderItemsType>(
                _SyncFolderItems_QNAME, SyncFolderItemsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetPasswordExpirationDateResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetPasswordExpirationDateResponse")
    public JAXBElement<GetPasswordExpirationDateResponseMessageType>
            createGetPasswordExpirationDateResponse(
                    GetPasswordExpirationDateResponseMessageType value) {
        return new JAXBElement<GetPasswordExpirationDateResponseMessageType>(
                _GetPasswordExpirationDateResponse_QNAME,
                GetPasswordExpirationDateResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppMarketplaceUrlType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetAppMarketplaceUrl")
    public JAXBElement<GetAppMarketplaceUrlType> createGetAppMarketplaceUrl(
            GetAppMarketplaceUrlType value) {
        return new JAXBElement<GetAppMarketplaceUrlType>(
                _GetAppMarketplaceUrl_QNAME, GetAppMarketplaceUrlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHoldOnMailboxesType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetHoldOnMailboxes")
    public JAXBElement<GetHoldOnMailboxesType> createGetHoldOnMailboxes(
            GetHoldOnMailboxesType value) {
        return new JAXBElement<GetHoldOnMailboxesType>(
                _GetHoldOnMailboxes_QNAME, GetHoldOnMailboxesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerTimeZonesType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetServerTimeZones")
    public JAXBElement<GetServerTimeZonesType> createGetServerTimeZones(
            GetServerTimeZonesType value) {
        return new JAXBElement<GetServerTimeZonesType>(
                _GetServerTimeZones_QNAME, GetServerTimeZonesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFolderResponseType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "DeleteFolderResponse")
    public JAXBElement<DeleteFolderResponseType> createDeleteFolderResponse(
            DeleteFolderResponseType value) {
        return new JAXBElement<DeleteFolderResponseType>(
                _DeleteFolderResponse_QNAME, DeleteFolderResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAttachmentResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateAttachmentResponse")
    public JAXBElement<CreateAttachmentResponseType> createCreateAttachmentResponse(
            CreateAttachmentResponseType value) {
        return new JAXBElement<CreateAttachmentResponseType>(
                _CreateAttachmentResponse_QNAME, CreateAttachmentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * AddNewTelUriContactToGroupResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "AddNewTelUriContactToGroupResponse")
    public JAXBElement<AddNewTelUriContactToGroupResponseMessageType>
            createAddNewTelUriContactToGroupResponse(
                    AddNewTelUriContactToGroupResponseMessageType value) {
        return new JAXBElement<AddNewTelUriContactToGroupResponseMessageType>(
                _AddNewTelUriContactToGroupResponse_QNAME,
                AddNewTelUriContactToGroupResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * RemoveDistributionGroupFromImListType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "RemoveDistributionGroupFromImList")
    public JAXBElement<RemoveDistributionGroupFromImListType>
            createRemoveDistributionGroupFromImList(RemoveDistributionGroupFromImListType value) {
        return new JAXBElement<RemoveDistributionGroupFromImListType>(
                _RemoveDistributionGroupFromImList_QNAME,
                RemoveDistributionGroupFromImListType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserAvailabilityResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUserAvailabilityResponse")
    public JAXBElement<GetUserAvailabilityResponseType> createGetUserAvailabilityResponse(
            GetUserAvailabilityResponseType value) {
        return new JAXBElement<GetUserAvailabilityResponseType>(
                _GetUserAvailabilityResponse_QNAME,
                GetUserAvailabilityResponseType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GetUMPromptType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUMPrompt")
    public JAXBElement<GetUMPromptType> createGetUMPrompt(GetUMPromptType value) {
        return new JAXBElement<GetUMPromptType>(
                _GetUMPrompt_QNAME, GetUMPromptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * SetHoldOnMailboxesResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SetHoldOnMailboxesResponse")
    public JAXBElement<SetHoldOnMailboxesResponseMessageType> createSetHoldOnMailboxesResponse(
            SetHoldOnMailboxesResponseMessageType value) {
        return new JAXBElement<SetHoldOnMailboxesResponseMessageType>(
                _SetHoldOnMailboxesResponse_QNAME,
                SetHoldOnMailboxesResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppManifestsResponseType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetAppManifestsResponse")
    public JAXBElement<GetAppManifestsResponseType> createGetAppManifestsResponse(
            GetAppManifestsResponseType value) {
        return new JAXBElement<GetAppManifestsResponseType>(
                _GetAppManifestsResponse_QNAME, GetAppManifestsResponseType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ResolveNamesType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ResolveNames")
    public JAXBElement<ResolveNamesType> createResolveNames(ResolveNamesType value) {
        return new JAXBElement<ResolveNamesType>(
                _ResolveNames_QNAME, ResolveNamesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindConversationType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "FindConversation")
    public JAXBElement<FindConversationType> createFindConversation(FindConversationType value) {
        return new JAXBElement<FindConversationType>(
                _FindConversation_QNAME, FindConversationType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link MarkAsJunkType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "MarkAsJunk")
    public JAXBElement<MarkAsJunkType> createMarkAsJunk(MarkAsJunkType value) {
        return new JAXBElement<MarkAsJunkType>(
                _MarkAsJunk_QNAME, MarkAsJunkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAttachmentResponseType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetAttachmentResponse")
    public JAXBElement<GetAttachmentResponseType> createGetAttachmentResponse(
            GetAttachmentResponseType value) {
        return new JAXBElement<GetAttachmentResponseType>(
                _GetAttachmentResponse_QNAME, GetAttachmentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRemindersResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetRemindersResponse")
    public JAXBElement<GetRemindersResponseMessageType> createGetRemindersResponse(
            GetRemindersResponseMessageType value) {
        return new JAXBElement<GetRemindersResponseMessageType>(
                _GetRemindersResponse_QNAME, GetRemindersResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSearchableMailboxesType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetSearchableMailboxes")
    public JAXBElement<GetSearchableMailboxesType> createGetSearchableMailboxes(
            GetSearchableMailboxesType value) {
        return new JAXBElement<GetSearchableMailboxesType>(
                _GetSearchableMailboxes_QNAME, GetSearchableMailboxesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDelegateResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetDelegateResponse")
    public JAXBElement<GetDelegateResponseMessageType> createGetDelegateResponse(
            GetDelegateResponseMessageType value) {
        return new JAXBElement<GetDelegateResponseMessageType>(
                _GetDelegateResponse_QNAME, GetDelegateResponseMessageType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link InitUMMailboxType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "InitUMMailbox")
    public JAXBElement<InitUMMailboxType> createInitUMMailbox(InitUMMailboxType value) {
        return new JAXBElement<InitUMMailboxType>(
                _InitUMMailbox_QNAME, InitUMMailboxType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFolderPathResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateFolderPathResponse")
    public JAXBElement<CreateFolderPathResponseType> createCreateFolderPathResponse(
            CreateFolderPathResponseType value) {
        return new JAXBElement<CreateFolderPathResponseType>(
                _CreateFolderPathResponse_QNAME, CreateFolderPathResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstallAppResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "InstallAppResponse")
    public JAXBElement<InstallAppResponseType> createInstallAppResponse(
            InstallAppResponseType value) {
        return new JAXBElement<InstallAppResponseType>(
                _InstallAppResponse_QNAME, InstallAppResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUMCallSummaryResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUMCallSummaryResponseMessage")
    public JAXBElement<GetUMCallSummaryResponseMessageType> createGetUMCallSummaryResponseMessage(
            GetUMCallSummaryResponseMessageType value) {
        return new JAXBElement<GetUMCallSummaryResponseMessageType>(
                _GetUMCallSummaryResponseMessage_QNAME,
                GetUMCallSummaryResponseMessageType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link SubscribeType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "Subscribe")
    public JAXBElement<SubscribeType> createSubscribe(SubscribeType value) {
        return new JAXBElement<SubscribeType>(_Subscribe_QNAME, SubscribeType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link AddDelegateType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "AddDelegate")
    public JAXBElement<AddDelegateType> createAddDelegate(AddDelegateType value) {
        return new JAXBElement<AddDelegateType>(
                _AddDelegate_QNAME, AddDelegateType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link CreateItemType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateItem")
    public JAXBElement<CreateItemType> createCreateItem(CreateItemType value) {
        return new JAXBElement<CreateItemType>(
                _CreateItem_QNAME, CreateItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveItemResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "MoveItemResponse")
    public JAXBElement<MoveItemResponseType> createMoveItemResponse(MoveItemResponseType value) {
        return new JAXBElement<MoveItemResponseType>(
                _MoveItemResponse_QNAME, MoveItemResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAttachmentResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "DeleteAttachmentResponse")
    public JAXBElement<DeleteAttachmentResponseType> createDeleteAttachmentResponse(
            DeleteAttachmentResponseType value) {
        return new JAXBElement<DeleteAttachmentResponseType>(
                _DeleteAttachmentResponse_QNAME, DeleteAttachmentResponseType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link AddImGroupType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "AddImGroup")
    public JAXBElement<AddImGroupType> createAddImGroup(AddImGroupType value) {
        return new JAXBElement<AddImGroupType>(
                _AddImGroup_QNAME, AddImGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserRetentionPolicyTagsType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUserRetentionPolicyTags")
    public JAXBElement<GetUserRetentionPolicyTagsType> createGetUserRetentionPolicyTags(
            GetUserRetentionPolicyTagsType value) {
        return new JAXBElement<GetUserRetentionPolicyTagsType>(
                _GetUserRetentionPolicyTags_QNAME,
                GetUserRetentionPolicyTagsType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link DeleteUMPromptsType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "DeleteUMPrompts")
    public JAXBElement<DeleteUMPromptsType> createDeleteUMPrompts(DeleteUMPromptsType value) {
        return new JAXBElement<DeleteUMPromptsType>(
                _DeleteUMPrompts_QNAME, DeleteUMPromptsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientExtensionResponseType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetClientExtensionResponse")
    public JAXBElement<ClientExtensionResponseType> createGetClientExtensionResponse(
            ClientExtensionResponseType value) {
        return new JAXBElement<ClientExtensionResponseType>(
                _GetClientExtensionResponse_QNAME, ClientExtensionResponseType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link InstallAppType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "InstallApp")
    public JAXBElement<InstallAppType> createInstallApp(InstallAppType value) {
        return new JAXBElement<InstallAppType>(
                _InstallApp_QNAME, InstallAppType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetUserRetentionPolicyTagsResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUserRetentionPolicyTagsResponse")
    public JAXBElement<GetUserRetentionPolicyTagsResponseMessageType>
            createGetUserRetentionPolicyTagsResponse(
                    GetUserRetentionPolicyTagsResponseMessageType value) {
        return new JAXBElement<GetUserRetentionPolicyTagsResponseMessageType>(
                _GetUserRetentionPolicyTagsResponse_QNAME,
                GetUserRetentionPolicyTagsResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConversationItemsType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetConversationItems")
    public JAXBElement<GetConversationItemsType> createGetConversationItems(
            GetConversationItemsType value) {
        return new JAXBElement<GetConversationItemsType>(
                _GetConversationItems_QNAME, GetConversationItemsType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link DeleteFolderType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "DeleteFolder")
    public JAXBElement<DeleteFolderType> createDeleteFolder(DeleteFolderType value) {
        return new JAXBElement<DeleteFolderType>(
                _DeleteFolder_QNAME, DeleteFolderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerTimeZonesResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetServerTimeZonesResponse")
    public JAXBElement<GetServerTimeZonesResponseType> createGetServerTimeZonesResponse(
            GetServerTimeZonesResponseType value) {
        return new JAXBElement<GetServerTimeZonesResponseType>(
                _GetServerTimeZonesResponse_QNAME,
                GetServerTimeZonesResponseType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ConvertIdType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ConvertId")
    public JAXBElement<ConvertIdType> createConvertId(ConvertIdType value) {
        return new JAXBElement<ConvertIdType>(_ConvertId_QNAME, ConvertIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * PerformReminderActionResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "PerformReminderActionResponse")
    public JAXBElement<PerformReminderActionResponseMessageType>
            createPerformReminderActionResponse(PerformReminderActionResponseMessageType value) {
        return new JAXBElement<PerformReminderActionResponseMessageType>(
                _PerformReminderActionResponse_QNAME,
                PerformReminderActionResponseMessageType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link DisableAppType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "DisableApp")
    public JAXBElement<DisableAppType> createDisableApp(DisableAppType value) {
        return new JAXBElement<DisableAppType>(
                _DisableApp_QNAME, DisableAppType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateItemResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UpdateItemResponse")
    public JAXBElement<UpdateItemResponseType> createUpdateItemResponse(
            UpdateItemResponseType value) {
        return new JAXBElement<UpdateItemResponseType>(
                _UpdateItemResponse_QNAME, UpdateItemResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailTipsResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetMailTipsResponse")
    public JAXBElement<GetMailTipsResponseMessageType> createGetMailTipsResponse(
            GetMailTipsResponseMessageType value) {
        return new JAXBElement<GetMailTipsResponseMessageType>(
                _GetMailTipsResponse_QNAME, GetMailTipsResponseMessageType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GetImItemListType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetImItemList")
    public JAXBElement<GetImItemListType> createGetImItemList(GetImItemListType value) {
        return new JAXBElement<GetImItemListType>(
                _GetImItemList_QNAME, GetImItemListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetUMCallDataRecordsResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUMCallDataRecordsResponseMessage")
    public JAXBElement<GetUMCallDataRecordsResponseMessageType>
            createGetUMCallDataRecordsResponseMessage(
                    GetUMCallDataRecordsResponseMessageType value) {
        return new JAXBElement<GetUMCallDataRecordsResponseMessageType>(
                _GetUMCallDataRecordsResponseMessage_QNAME,
                GetUMCallDataRecordsResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * UpdateItemInRecoverableItemsResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UpdateItemInRecoverableItemsResponse")
    public JAXBElement<UpdateItemInRecoverableItemsResponseType>
            createUpdateItemInRecoverableItemsResponse(
                    UpdateItemInRecoverableItemsResponseType value) {
        return new JAXBElement<UpdateItemInRecoverableItemsResponseType>(
                _UpdateItemInRecoverableItemsResponse_QNAME,
                UpdateItemInRecoverableItemsResponseType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventsResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetEventsResponse")
    public JAXBElement<GetEventsResponseType> createGetEventsResponse(GetEventsResponseType value) {
        return new JAXBElement<GetEventsResponseType>(
                _GetEventsResponse_QNAME, GetEventsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetHoldOnMailboxesType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SetHoldOnMailboxes")
    public JAXBElement<SetHoldOnMailboxesType> createSetHoldOnMailboxes(
            SetHoldOnMailboxesType value) {
        return new JAXBElement<SetHoldOnMailboxesType>(
                _SetHoldOnMailboxes_QNAME, SetHoldOnMailboxesType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link MoveFolderType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "MoveFolder")
    public JAXBElement<MoveFolderType> createMoveFolder(MoveFolderType value) {
        return new JAXBElement<MoveFolderType>(
                _MoveFolder_QNAME, MoveFolderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStreamingEventsResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetStreamingEventsResponse")
    public JAXBElement<GetStreamingEventsResponseType> createGetStreamingEventsResponse(
            GetStreamingEventsResponseType value) {
        return new JAXBElement<GetStreamingEventsResponseType>(
                _GetStreamingEventsResponse_QNAME,
                GetStreamingEventsResponseType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserAvailabilityRequestType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUserAvailabilityRequest")
    public JAXBElement<GetUserAvailabilityRequestType> createGetUserAvailabilityRequest(
            GetUserAvailabilityRequestType value) {
        return new JAXBElement<GetUserAvailabilityRequestType>(
                _GetUserAvailabilityRequest_QNAME,
                GetUserAvailabilityRequestType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartFindInGALSpeechRecognitionType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "StartFindInGALSpeechRecognition")
    public JAXBElement<StartFindInGALSpeechRecognitionType> createStartFindInGALSpeechRecognition(
            StartFindInGALSpeechRecognitionType value) {
        return new JAXBElement<StartFindInGALSpeechRecognitionType>(
                _StartFindInGALSpeechRecognition_QNAME,
                StartFindInGALSpeechRecognitionType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * AddImContactToGroupResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "AddImContactToGroupResponse")
    public JAXBElement<AddImContactToGroupResponseMessageType> createAddImContactToGroupResponse(
            AddImContactToGroupResponseMessageType value) {
        return new JAXBElement<AddImContactToGroupResponseMessageType>(
                _AddImContactToGroupResponse_QNAME,
                AddImContactToGroupResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetTeamMailboxResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SetTeamMailboxResponse")
    public JAXBElement<SetTeamMailboxResponseMessageType> createSetTeamMailboxResponse(
            SetTeamMailboxResponseMessageType value) {
        return new JAXBElement<SetTeamMailboxResponseMessageType>(
                _SetTeamMailboxResponse_QNAME,
                SetTeamMailboxResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserConfigurationType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUserConfiguration")
    public JAXBElement<GetUserConfigurationType> createGetUserConfiguration(
            GetUserConfigurationType value) {
        return new JAXBElement<GetUserConfigurationType>(
                _GetUserConfiguration_QNAME, GetUserConfigurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindConversationResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "FindConversationResponse")
    public JAXBElement<FindConversationResponseMessageType> createFindConversationResponse(
            FindConversationResponseMessageType value) {
        return new JAXBElement<FindConversationResponseMessageType>(
                _FindConversationResponse_QNAME,
                FindConversationResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadItemsResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UploadItemsResponse")
    public JAXBElement<UploadItemsResponseType> createUploadItemsResponse(
            UploadItemsResponseType value) {
        return new JAXBElement<UploadItemsResponseType>(
                _UploadItemsResponse_QNAME, UploadItemsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFolderResponseType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateFolderResponse")
    public JAXBElement<CreateFolderResponseType> createCreateFolderResponse(
            CreateFolderResponseType value) {
        return new JAXBElement<CreateFolderResponseType>(
                _CreateFolderResponse_QNAME, CreateFolderResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveFolderResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "MoveFolderResponse")
    public JAXBElement<MoveFolderResponseType> createMoveFolderResponse(
            MoveFolderResponseType value) {
        return new JAXBElement<MoveFolderResponseType>(
                _MoveFolderResponse_QNAME, MoveFolderResponseType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link PlayOnPhoneType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "PlayOnPhone")
    public JAXBElement<PlayOnPhoneType> createPlayOnPhone(PlayOnPhoneType value) {
        return new JAXBElement<PlayOnPhoneType>(
                _PlayOnPhone_QNAME, PlayOnPhoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveImContactFromGroupType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "RemoveImContactFromGroup")
    public JAXBElement<RemoveImContactFromGroupType> createRemoveImContactFromGroup(
            RemoveImContactFromGroupType value) {
        return new JAXBElement<RemoveImContactFromGroupType>(
                _RemoveImContactFromGroup_QNAME, RemoveImContactFromGroupType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GetAppManifestsType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetAppManifests")
    public JAXBElement<GetAppManifestsType> createGetAppManifests(GetAppManifestsType value) {
        return new JAXBElement<GetAppManifestsType>(
                _GetAppManifests_QNAME, GetAppManifestsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetUMMailboxResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ResetUMMailboxResponseMessage")
    public JAXBElement<ResetUMMailboxResponseMessageType> createResetUMMailboxResponseMessage(
            ResetUMMailboxResponseMessageType value) {
        return new JAXBElement<ResetUMMailboxResponseMessageType>(
                _ResetUMMailboxResponseMessage_QNAME,
                ResetUMMailboxResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * RefreshSharingFolderResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "RefreshSharingFolderResponse")
    public JAXBElement<RefreshSharingFolderResponseMessageType> createRefreshSharingFolderResponse(
            RefreshSharingFolderResponseMessageType value) {
        return new JAXBElement<RefreshSharingFolderResponseMessageType>(
                _RefreshSharingFolderResponse_QNAME,
                RefreshSharingFolderResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetTeamMailboxRequestType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SetTeamMailbox")
    public JAXBElement<SetTeamMailboxRequestType> createSetTeamMailbox(
            SetTeamMailboxRequestType value) {
        return new JAXBElement<SetTeamMailboxRequestType>(
                _SetTeamMailbox_QNAME, SetTeamMailboxRequestType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ArchiveItemType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ArchiveItem")
    public JAXBElement<ArchiveItemType> createArchiveItem(ArchiveItemType value) {
        return new JAXBElement<ArchiveItemType>(
                _ArchiveItem_QNAME, ArchiveItemType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GetDelegateType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetDelegate")
    public JAXBElement<GetDelegateType> createGetDelegate(GetDelegateType value) {
        return new JAXBElement<GetDelegateType>(
                _GetDelegate_QNAME, GetDelegateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyFolderResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "EmptyFolderResponse")
    public JAXBElement<EmptyFolderResponseType> createEmptyFolderResponse(
            EmptyFolderResponseType value) {
        return new JAXBElement<EmptyFolderResponseType>(
                _EmptyFolderResponse_QNAME, EmptyFolderResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindItemResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "FindItemResponse")
    public JAXBElement<FindItemResponseType> createFindItemResponse(FindItemResponseType value) {
        return new JAXBElement<FindItemResponseType>(
                _FindItemResponse_QNAME, FindItemResponseType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link MoveItemType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "MoveItem")
    public JAXBElement<MoveItemType> createMoveItem(MoveItemType value) {
        return new JAXBElement<MoveItemType>(_MoveItem_QNAME, MoveItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiveItemResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ArchiveItemResponse")
    public JAXBElement<ArchiveItemResponseType> createArchiveItemResponse(
            ArchiveItemResponseType value) {
        return new JAXBElement<ArchiveItemResponseType>(
                _ArchiveItemResponse_QNAME, ArchiveItemResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResolveNamesResponseType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ResolveNamesResponse")
    public JAXBElement<ResolveNamesResponseType> createResolveNamesResponse(
            ResolveNamesResponseType value) {
        return new JAXBElement<ResolveNamesResponseType>(
                _ResolveNamesResponse_QNAME, ResolveNamesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetServiceConfigurationResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetServiceConfigurationResponse")
    public JAXBElement<GetServiceConfigurationResponseMessageType>
            createGetServiceConfigurationResponse(
                    GetServiceConfigurationResponseMessageType value) {
        return new JAXBElement<GetServiceConfigurationResponseMessageType>(
                _GetServiceConfigurationResponse_QNAME,
                GetServiceConfigurationResponseMessageType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link FindItemType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "FindItem")
    public JAXBElement<FindItemType> createFindItem(FindItemType value) {
        return new JAXBElement<FindItemType>(_FindItem_QNAME, FindItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * StartFindInGALSpeechRecognitionResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "StartFindInGALSpeechRecognitionResponse")
    public JAXBElement<StartFindInGALSpeechRecognitionResponseMessageType>
            createStartFindInGALSpeechRecognitionResponse(
                    StartFindInGALSpeechRecognitionResponseMessageType value) {
        return new JAXBElement<StartFindInGALSpeechRecognitionResponseMessageType>(
                _StartFindInGALSpeechRecognitionResponse_QNAME,
                StartFindInGALSpeechRecognitionResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddImGroupResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "AddImGroupResponse")
    public JAXBElement<AddImGroupResponseMessageType> createAddImGroupResponse(
            AddImGroupResponseMessageType value) {
        return new JAXBElement<AddImGroupResponseMessageType>(
                _AddImGroupResponse_QNAME, AddImGroupResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * AddDistributionGroupToImListResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "AddDistributionGroupToImListResponse")
    public JAXBElement<AddDistributionGroupToImListResponseMessageType>
            createAddDistributionGroupToImListResponse(
                    AddDistributionGroupToImListResponseMessageType value) {
        return new JAXBElement<AddDistributionGroupToImListResponseMessageType>(
                _AddDistributionGroupToImListResponse_QNAME,
                AddDistributionGroupToImListResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitUMMailboxResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "InitUMMailboxResponseMessage")
    public JAXBElement<InitUMMailboxResponseMessageType> createInitUMMailboxResponseMessage(
            InitUMMailboxResponseMessageType value) {
        return new JAXBElement<InitUMMailboxResponseMessageType>(
                _InitUMMailboxResponseMessage_QNAME,
                InitUMMailboxResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * CreateUMCallDataRecordResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateUMCallDataRecordResponse")
    public JAXBElement<CreateUMCallDataRecordResponseMessageType>
            createCreateUMCallDataRecordResponse(CreateUMCallDataRecordResponseMessageType value) {
        return new JAXBElement<CreateUMCallDataRecordResponseMessageType>(
                _CreateUMCallDataRecordResponse_QNAME,
                CreateUMCallDataRecordResponseMessageType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link CopyFolderType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CopyFolder")
    public JAXBElement<CopyFolderType> createCopyFolder(CopyFolderType value) {
        return new JAXBElement<CopyFolderType>(
                _CopyFolder_QNAME, CopyFolderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetMessageTrackingReportResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetMessageTrackingReportResponse")
    public JAXBElement<GetMessageTrackingReportResponseMessageType>
            createGetMessageTrackingReportResponse(
                    GetMessageTrackingReportResponseMessageType value) {
        return new JAXBElement<GetMessageTrackingReportResponseMessageType>(
                _GetMessageTrackingReportResponse_QNAME,
                GetMessageTrackingReportResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateItemInRecoverableItemsType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UpdateItemInRecoverableItems")
    public JAXBElement<UpdateItemInRecoverableItemsType> createUpdateItemInRecoverableItems(
            UpdateItemInRecoverableItemsType value) {
        return new JAXBElement<UpdateItemInRecoverableItemsType>(
                _UpdateItemInRecoverableItems_QNAME,
                UpdateItemInRecoverableItemsType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetClientExtensionResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SetClientExtensionResponse")
    public JAXBElement<SetClientExtensionResponseType> createSetClientExtensionResponse(
            SetClientExtensionResponseType value) {
        return new JAXBElement<SetClientExtensionResponseType>(
                _SetClientExtensionResponse_QNAME,
                SetClientExtensionResponseType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFolderPathType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateFolderPath")
    public JAXBElement<CreateFolderPathType> createCreateFolderPath(CreateFolderPathType value) {
        return new JAXBElement<CreateFolderPathType>(
                _CreateFolderPath_QNAME, CreateFolderPathType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GetItemResponseType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetItemResponse")
    public JAXBElement<GetItemResponseType> createGetItemResponse(GetItemResponseType value) {
        return new JAXBElement<GetItemResponseType>(
                _GetItemResponse_QNAME, GetItemResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUserOofSettingsRequest }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SetUserOofSettingsRequest")
    public JAXBElement<SetUserOofSettingsRequest> createSetUserOofSettingsRequest(
            SetUserOofSettingsRequest value) {
        return new JAXBElement<SetUserOofSettingsRequest>(
                _SetUserOofSettingsRequest_QNAME, SetUserOofSettingsRequest.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ExpandDLType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ExpandDL")
    public JAXBElement<ExpandDLType> createExpandDL(ExpandDLType value) {
        return new JAXBElement<ExpandDLType>(_ExpandDL_QNAME, ExpandDLType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetSearchableMailboxesResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetSearchableMailboxesResponse")
    public JAXBElement<GetSearchableMailboxesResponseMessageType>
            createGetSearchableMailboxesResponse(GetSearchableMailboxesResponseMessageType value) {
        return new JAXBElement<GetSearchableMailboxesResponseMessageType>(
                _GetSearchableMailboxesResponse_QNAME,
                GetSearchableMailboxesResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNonIndexableItemDetailsType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetNonIndexableItemDetails")
    public JAXBElement<GetNonIndexableItemDetailsType> createGetNonIndexableItemDetails(
            GetNonIndexableItemDetailsType value) {
        return new JAXBElement<GetNonIndexableItemDetailsType>(
                _GetNonIndexableItemDetails_QNAME,
                GetNonIndexableItemDetailsType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link CopyItemType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CopyItem")
    public JAXBElement<CopyItemType> createCopyItem(CopyItemType value) {
        return new JAXBElement<CopyItemType>(_CopyItem_QNAME, CopyItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveUMPinResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SaveUMPinResponseMessage")
    public JAXBElement<SaveUMPinResponseMessageType> createSaveUMPinResponseMessage(
            SaveUMPinResponseMessageType value) {
        return new JAXBElement<SaveUMPinResponseMessageType>(
                _SaveUMPinResponseMessage_QNAME, SaveUMPinResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkAllItemsAsReadResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "MarkAllItemsAsReadResponse")
    public JAXBElement<MarkAllItemsAsReadResponseType> createMarkAllItemsAsReadResponse(
            MarkAllItemsAsReadResponseType value) {
        return new JAXBElement<MarkAllItemsAsReadResponseType>(
                _MarkAllItemsAsReadResponse_QNAME,
                MarkAllItemsAsReadResponseType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UninstallAppResponseType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UninstallAppResponse")
    public JAXBElement<UninstallAppResponseType> createUninstallAppResponse(
            UninstallAppResponseType value) {
        return new JAXBElement<UninstallAppResponseType>(
                _UninstallAppResponse_QNAME, UninstallAppResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUMPromptsResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "DeleteUMPromptsResponse")
    public JAXBElement<DeleteUMPromptsResponseMessageType> createDeleteUMPromptsResponse(
            DeleteUMPromptsResponseMessageType value) {
        return new JAXBElement<DeleteUMPromptsResponseMessageType>(
                _DeleteUMPromptsResponse_QNAME,
                DeleteUMPromptsResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetUMSubscriberCallAnsweringDataType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUMSubscriberCallAnsweringData")
    public JAXBElement<GetUMSubscriberCallAnsweringDataType> createGetUMSubscriberCallAnsweringData(
            GetUMSubscriberCallAnsweringDataType value) {
        return new JAXBElement<GetUMSubscriberCallAnsweringDataType>(
                _GetUMSubscriberCallAnsweringData_QNAME,
                GetUMSubscriberCallAnsweringDataType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetImListMigrationCompletedType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SetImListMigrationCompleted")
    public JAXBElement<SetImListMigrationCompletedType> createSetImListMigrationCompleted(
            SetImListMigrationCompletedType value) {
        return new JAXBElement<SetImListMigrationCompletedType>(
                _SetImListMigrationCompleted_QNAME,
                SetImListMigrationCompletedType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUMPinResponseMessageType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUMPinResponseMessage")
    public JAXBElement<GetUMPinResponseMessageType> createGetUMPinResponseMessage(
            GetUMPinResponseMessageType value) {
        return new JAXBElement<GetUMPinResponseMessageType>(
                _GetUMPinResponseMessage_QNAME, GetUMPinResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStreamingEventsType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetStreamingEvents")
    public JAXBElement<GetStreamingEventsType> createGetStreamingEvents(
            GetStreamingEventsType value) {
        return new JAXBElement<GetStreamingEventsType>(
                _GetStreamingEvents_QNAME, GetStreamingEventsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportItemsResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ExportItemsResponse")
    public JAXBElement<ExportItemsResponseType> createExportItemsResponse(
            ExportItemsResponseType value) {
        return new JAXBElement<ExportItemsResponseType>(
                _ExportItemsResponse_QNAME, ExportItemsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientIntentResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetClientIntentResponseMessage")
    public JAXBElement<GetClientIntentResponseMessageType> createGetClientIntentResponseMessage(
            GetClientIntentResponseMessageType value) {
        return new JAXBElement<GetClientIntentResponseMessageType>(
                _GetClientIntentResponseMessage_QNAME,
                GetClientIntentResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInboxRulesResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UpdateInboxRulesResponse")
    public JAXBElement<UpdateInboxRulesResponseType> createUpdateInboxRulesResponse(
            UpdateInboxRulesResponseType value) {
        return new JAXBElement<UpdateInboxRulesResponseType>(
                _UpdateInboxRulesResponse_QNAME, UpdateInboxRulesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncFolderItemsResponseType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SyncFolderItemsResponse")
    public JAXBElement<SyncFolderItemsResponseType> createSyncFolderItemsResponse(
            SyncFolderItemsResponseType value) {
        return new JAXBElement<SyncFolderItemsResponseType>(
                _SyncFolderItemsResponse_QNAME, SyncFolderItemsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserConfigurationResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UpdateUserConfigurationResponse")
    public JAXBElement<UpdateUserConfigurationResponseType> createUpdateUserConfigurationResponse(
            UpdateUserConfigurationResponseType value) {
        return new JAXBElement<UpdateUserConfigurationResponseType>(
                _UpdateUserConfigurationResponse_QNAME,
                UpdateUserConfigurationResponseType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link SendItemType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SendItem")
    public JAXBElement<SendItemType> createSendItem(SendItemType value) {
        return new JAXBElement<SendItemType>(_SendItem_QNAME, SendItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveImGroupResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "RemoveImGroupResponse")
    public JAXBElement<RemoveImGroupResponseMessageType> createRemoveImGroupResponse(
            RemoveImGroupResponseMessageType value) {
        return new JAXBElement<RemoveImGroupResponseMessageType>(
                _RemoveImGroupResponse_QNAME, RemoveImGroupResponseMessageType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GetUMPinType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUMPin")
    public JAXBElement<GetUMPinType> createGetUMPin(GetUMPinType value) {
        return new JAXBElement<GetUMPinType>(_GetUMPin_QNAME, GetUMPinType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpandDLResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ExpandDLResponse")
    public JAXBElement<ExpandDLResponseType> createExpandDLResponse(ExpandDLResponseType value) {
        return new JAXBElement<ExpandDLResponseType>(
                _ExpandDLResponse_QNAME, ExpandDLResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateItemResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateItemResponse")
    public JAXBElement<CreateItemResponseType> createCreateItemResponse(
            CreateItemResponseType value) {
        return new JAXBElement<CreateItemResponseType>(
                _CreateItemResponse_QNAME, CreateItemResponseType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ValidateUMPinType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ValidateUMPin")
    public JAXBElement<ValidateUMPinType> createValidateUMPin(ValidateUMPinType value) {
        return new JAXBElement<ValidateUMPinType>(
                _ValidateUMPin_QNAME, ValidateUMPinType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GetRoomsType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetRooms")
    public JAXBElement<GetRoomsType> createGetRooms(GetRoomsType value) {
        return new JAXBElement<GetRoomsType>(_GetRooms_QNAME, GetRoomsType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GetImItemsType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetImItems")
    public JAXBElement<GetImItemsType> createGetImItems(GetImItemsType value) {
        return new JAXBElement<GetImItemsType>(
                _GetImItems_QNAME, GetImItemsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientExtensionType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetClientExtension")
    public JAXBElement<GetClientExtensionType> createGetClientExtension(
            GetClientExtensionType value) {
        return new JAXBElement<GetClientExtensionType>(
                _GetClientExtension_QNAME, GetClientExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncFolderHierarchyResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SyncFolderHierarchyResponse")
    public JAXBElement<SyncFolderHierarchyResponseType> createSyncFolderHierarchyResponse(
            SyncFolderHierarchyResponseType value) {
        return new JAXBElement<SyncFolderHierarchyResponseType>(
                _SyncFolderHierarchyResponse_QNAME,
                SyncFolderHierarchyResponseType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDistributionGroupToImListType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "AddDistributionGroupToImList")
    public JAXBElement<AddDistributionGroupToImListType> createAddDistributionGroupToImList(
            AddDistributionGroupToImListType value) {
        return new JAXBElement<AddDistributionGroupToImListType>(
                _AddDistributionGroupToImList_QNAME,
                AddDistributionGroupToImListType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNotificationResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SendNotification")
    public JAXBElement<SendNotificationResponseType> createSendNotification(
            SendNotificationResponseType value) {
        return new JAXBElement<SendNotificationResponseType>(
                _SendNotification_QNAME, SendNotificationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * FindMessageTrackingReportResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "FindMessageTrackingReportResponse")
    public JAXBElement<FindMessageTrackingReportResponseMessageType>
            createFindMessageTrackingReportResponse(
                    FindMessageTrackingReportResponseMessageType value) {
        return new JAXBElement<FindMessageTrackingReportResponseMessageType>(
                _FindMessageTrackingReportResponse_QNAME,
                FindMessageTrackingReportResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImItemListResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetImItemListResponse")
    public JAXBElement<GetImItemListResponseMessageType> createGetImItemListResponse(
            GetImItemListResponseMessageType value) {
        return new JAXBElement<GetImItemListResponseMessageType>(
                _GetImItemListResponse_QNAME, GetImItemListResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPasswordExpirationDateType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetPasswordExpirationDate")
    public JAXBElement<GetPasswordExpirationDateType> createGetPasswordExpirationDate(
            GetPasswordExpirationDateType value) {
        return new JAXBElement<GetPasswordExpirationDateType>(
                _GetPasswordExpirationDate_QNAME, GetPasswordExpirationDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserPhotoResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUserPhotoResponse")
    public JAXBElement<GetUserPhotoResponseMessageType> createGetUserPhotoResponse(
            GetUserPhotoResponseMessageType value) {
        return new JAXBElement<GetUserPhotoResponseMessageType>(
                _GetUserPhotoResponse_QNAME, GetUserPhotoResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetHoldOnMailboxesResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetHoldOnMailboxesResponse")
    public JAXBElement<GetHoldOnMailboxesResponseMessageType> createGetHoldOnMailboxesResponse(
            GetHoldOnMailboxesResponseMessageType value) {
        return new JAXBElement<GetHoldOnMailboxesResponseMessageType>(
                _GetHoldOnMailboxesResponse_QNAME,
                GetHoldOnMailboxesResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * RemoveDistributionGroupFromImListResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "RemoveDistributionGroupFromImListResponse")
    public JAXBElement<RemoveDistributionGroupFromImListResponseMessageType>
            createRemoveDistributionGroupFromImListResponse(
                    RemoveDistributionGroupFromImListResponseMessageType value) {
        return new JAXBElement<RemoveDistributionGroupFromImListResponseMessageType>(
                _RemoveDistributionGroupFromImListResponse_QNAME,
                RemoveDistributionGroupFromImListResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchMailboxesResponseType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SearchMailboxesResponse")
    public JAXBElement<SearchMailboxesResponseType> createSearchMailboxesResponse(
            SearchMailboxesResponseType value) {
        return new JAXBElement<SearchMailboxesResponseType>(
                _SearchMailboxesResponse_QNAME, SearchMailboxesResponseType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link CreateFolderType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateFolder")
    public JAXBElement<CreateFolderType> createCreateFolder(CreateFolderType value) {
        return new JAXBElement<CreateFolderType>(
                _CreateFolder_QNAME, CreateFolderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImItemsResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetImItemsResponse")
    public JAXBElement<GetImItemsResponseMessageType> createGetImItemsResponse(
            GetImItemsResponseMessageType value) {
        return new JAXBElement<GetImItemsResponseMessageType>(
                _GetImItemsResponse_QNAME, GetImItemsResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * RemoveImContactFromGroupResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "RemoveImContactFromGroupResponse")
    public JAXBElement<RemoveImContactFromGroupResponseMessageType>
            createRemoveImContactFromGroupResponse(
                    RemoveImContactFromGroupResponseMessageType value) {
        return new JAXBElement<RemoveImContactFromGroupResponseMessageType>(
                _RemoveImContactFromGroupResponse_QNAME,
                RemoveImContactFromGroupResponseMessageType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GetItemType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetItem")
    public JAXBElement<GetItemType> createGetItem(GetItemType value) {
        return new JAXBElement<GetItemType>(_GetItem_QNAME, GetItemType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link UpdateDelegateType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UpdateDelegate")
    public JAXBElement<UpdateDelegateType> createUpdateDelegate(UpdateDelegateType value) {
        return new JAXBElement<UpdateDelegateType>(
                _UpdateDelegate_QNAME, UpdateDelegateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplyConversationActionResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ApplyConversationActionResponse")
    public JAXBElement<ApplyConversationActionResponseType> createApplyConversationActionResponse(
            ApplyConversationActionResponseType value) {
        return new JAXBElement<ApplyConversationActionResponseType>(
                _ApplyConversationActionResponse_QNAME,
                ApplyConversationActionResponseType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetPhoneCallInformationResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetPhoneCallInformationResponse")
    public JAXBElement<GetPhoneCallInformationResponseMessageType>
            createGetPhoneCallInformationResponse(
                    GetPhoneCallInformationResponseMessageType value) {
        return new JAXBElement<GetPhoneCallInformationResponseMessageType>(
                _GetPhoneCallInformationResponse_QNAME,
                GetPhoneCallInformationResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientAccessTokenResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetClientAccessTokenResponse")
    public JAXBElement<GetClientAccessTokenResponseType> createGetClientAccessTokenResponse(
            GetClientAccessTokenResponseType value) {
        return new JAXBElement<GetClientAccessTokenResponseType>(
                _GetClientAccessTokenResponse_QNAME,
                GetClientAccessTokenResponseType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserConfigurationResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUserConfigurationResponse")
    public JAXBElement<GetUserConfigurationResponseType> createGetUserConfigurationResponse(
            GetUserConfigurationResponseType value) {
        return new JAXBElement<GetUserConfigurationResponseType>(
                _GetUserConfigurationResponse_QNAME,
                GetUserConfigurationResponseType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * CompleteFindInGALSpeechRecognitionResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CompleteFindInGALSpeechRecognitionResponse")
    public JAXBElement<CompleteFindInGALSpeechRecognitionResponseMessageType>
            createCompleteFindInGALSpeechRecognitionResponse(
                    CompleteFindInGALSpeechRecognitionResponseMessageType value) {
        return new JAXBElement<CompleteFindInGALSpeechRecognitionResponseMessageType>(
                _CompleteFindInGALSpeechRecognitionResponse_QNAME,
                CompleteFindInGALSpeechRecognitionResponseMessageType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GetFolderType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetFolder")
    public JAXBElement<GetFolderType> createGetFolder(GetFolderType value) {
        return new JAXBElement<GetFolderType>(_GetFolder_QNAME, GetFolderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnpinTeamMailboxResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UnpinTeamMailboxResponse")
    public JAXBElement<UnpinTeamMailboxResponseMessageType> createUnpinTeamMailboxResponse(
            UnpinTeamMailboxResponseMessageType value) {
        return new JAXBElement<UnpinTeamMailboxResponseMessageType>(
                _UnpinTeamMailboxResponse_QNAME,
                UnpinTeamMailboxResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateUMPinResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ValidateUMPinResponseMessage")
    public JAXBElement<ValidateUMPinResponseMessageType> createValidateUMPinResponseMessage(
            ValidateUMPinResponseMessageType value) {
        return new JAXBElement<ValidateUMPinResponseMessageType>(
                _ValidateUMPinResponseMessage_QNAME,
                ValidateUMPinResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * CompleteFindInGALSpeechRecognitionType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CompleteFindInGALSpeechRecognition")
    public JAXBElement<CompleteFindInGALSpeechRecognitionType>
            createCompleteFindInGALSpeechRecognition(CompleteFindInGALSpeechRecognitionType value) {
        return new JAXBElement<CompleteFindInGALSpeechRecognitionType>(
                _CompleteFindInGALSpeechRecognition_QNAME,
                CompleteFindInGALSpeechRecognitionType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUMPromptNamesType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUMPromptNames")
    public JAXBElement<GetUMPromptNamesType> createGetUMPromptNames(GetUMPromptNamesType value) {
        return new JAXBElement<GetUMPromptNamesType>(
                _GetUMPromptNames_QNAME, GetUMPromptNamesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendItemResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SendItemResponse")
    public JAXBElement<SendItemResponseType> createSendItemResponse(SendItemResponseType value) {
        return new JAXBElement<SendItemResponseType>(
                _SendItemResponse_QNAME, SendItemResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInboxRulesRequestType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UpdateInboxRules")
    public JAXBElement<UpdateInboxRulesRequestType> createUpdateInboxRules(
            UpdateInboxRulesRequestType value) {
        return new JAXBElement<UpdateInboxRulesRequestType>(
                _UpdateInboxRules_QNAME, UpdateInboxRulesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewImContactToGroupType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "AddNewImContactToGroup")
    public JAXBElement<AddNewImContactToGroupType> createAddNewImContactToGroup(
            AddNewImContactToGroupType value) {
        return new JAXBElement<AddNewImContactToGroupType>(
                _AddNewImContactToGroup_QNAME, AddNewImContactToGroupType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link FindFolderType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "FindFolder")
    public JAXBElement<FindFolderType> createFindFolder(FindFolderType value) {
        return new JAXBElement<FindFolderType>(
                _FindFolder_QNAME, FindFolderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInboxRulesResponseType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetInboxRulesResponse")
    public JAXBElement<GetInboxRulesResponseType> createGetInboxRulesResponse(
            GetInboxRulesResponseType value) {
        return new JAXBElement<GetInboxRulesResponseType>(
                _GetInboxRulesResponse_QNAME, GetInboxRulesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayOnPhoneResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "PlayOnPhoneResponse")
    public JAXBElement<PlayOnPhoneResponseMessageType> createPlayOnPhoneResponse(
            PlayOnPhoneResponseMessageType value) {
        return new JAXBElement<PlayOnPhoneResponseMessageType>(
                _PlayOnPhoneResponse_QNAME, PlayOnPhoneResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserConfigurationResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateUserConfigurationResponse")
    public JAXBElement<CreateUserConfigurationResponseType> createCreateUserConfigurationResponse(
            CreateUserConfigurationResponseType value) {
        return new JAXBElement<CreateUserConfigurationResponseType>(
                _CreateUserConfigurationResponse_QNAME,
                CreateUserConfigurationResponseType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * SetImListMigrationCompletedResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SetImListMigrationCompletedResponse")
    public JAXBElement<SetImListMigrationCompletedResponseMessageType>
            createSetImListMigrationCompletedResponse(
                    SetImListMigrationCompletedResponseMessageType value) {
        return new JAXBElement<SetImListMigrationCompletedResponseMessageType>(
                _SetImListMigrationCompletedResponse_QNAME,
                SetImListMigrationCompletedResponseMessageType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GetPersonaType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetPersona")
    public JAXBElement<GetPersonaType> createGetPersona(GetPersonaType value) {
        return new JAXBElement<GetPersonaType>(
                _GetPersona_QNAME, GetPersonaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetNonIndexableItemDetailsResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetNonIndexableItemDetailsResponse")
    public JAXBElement<GetNonIndexableItemDetailsResponseMessageType>
            createGetNonIndexableItemDetailsResponse(
                    GetNonIndexableItemDetailsResponseMessageType value) {
        return new JAXBElement<GetNonIndexableItemDetailsResponseMessageType>(
                _GetNonIndexableItemDetailsResponse_QNAME,
                GetNonIndexableItemDetailsResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * AddNewImContactToGroupResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "AddNewImContactToGroupResponse")
    public JAXBElement<AddNewImContactToGroupResponseMessageType>
            createAddNewImContactToGroupResponse(AddNewImContactToGroupResponseMessageType value) {
        return new JAXBElement<AddNewImContactToGroupResponseMessageType>(
                _AddNewImContactToGroupResponse_QNAME,
                AddNewImContactToGroupResponseMessageType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link UploadItemsType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UploadItems")
    public JAXBElement<UploadItemsType> createUploadItems(UploadItemsType value) {
        return new JAXBElement<UploadItemsType>(
                _UploadItems_QNAME, UploadItemsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFolderResponseType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UpdateFolderResponse")
    public JAXBElement<UpdateFolderResponseType> createUpdateFolderResponse(
            UpdateFolderResponseType value) {
        return new JAXBElement<UpdateFolderResponseType>(
                _UpdateFolderResponse_QNAME, UpdateFolderResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserOofSettingsRequest }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUserOofSettingsRequest")
    public JAXBElement<GetUserOofSettingsRequest> createGetUserOofSettingsRequest(
            GetUserOofSettingsRequest value) {
        return new JAXBElement<GetUserOofSettingsRequest>(
                _GetUserOofSettingsRequest_QNAME, GetUserOofSettingsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDelegateResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UpdateDelegateResponse")
    public JAXBElement<UpdateDelegateResponseMessageType> createUpdateDelegateResponse(
            UpdateDelegateResponseMessageType value) {
        return new JAXBElement<UpdateDelegateResponseMessageType>(
                _UpdateDelegateResponse_QNAME,
                UpdateDelegateResponseMessageType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNonIndexableItemStatisticsType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetNonIndexableItemStatistics")
    public JAXBElement<GetNonIndexableItemStatisticsType> createGetNonIndexableItemStatistics(
            GetNonIndexableItemStatisticsType value) {
        return new JAXBElement<GetNonIndexableItemStatisticsType>(
                _GetNonIndexableItemStatistics_QNAME,
                GetNonIndexableItemStatisticsType.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInboxRulesRequestType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetInboxRules")
    public JAXBElement<GetInboxRulesRequestType> createGetInboxRules(
            GetInboxRulesRequestType value) {
        return new JAXBElement<GetInboxRulesRequestType>(
                _GetInboxRules_QNAME, GetInboxRulesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateManagedFolderResponseType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateManagedFolderResponse")
    public JAXBElement<CreateManagedFolderResponseType> createCreateManagedFolderResponse(
            CreateManagedFolderResponseType value) {
        return new JAXBElement<CreateManagedFolderResponseType>(
                _CreateManagedFolderResponse_QNAME,
                CreateManagedFolderResponseType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link UpdateItemType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UpdateItem")
    public JAXBElement<UpdateItemType> createUpdateItem(UpdateItemType value) {
        return new JAXBElement<UpdateItemType>(
                _UpdateItem_QNAME, UpdateItemType.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GetRoomListsType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetRoomLists")
    public JAXBElement<GetRoomListsType> createGetRoomLists(GetRoomListsType value) {
        return new JAXBElement<GetRoomListsType>(
                _GetRoomLists_QNAME, GetRoomListsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertIdResponseType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ConvertIdResponse")
    public JAXBElement<ConvertIdResponseType> createConvertIdResponse(ConvertIdResponseType value) {
        return new JAXBElement<ConvertIdResponseType>(
                _ConvertIdResponse_QNAME, ConvertIdResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserConfigurationType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateUserConfiguration")
    public JAXBElement<CreateUserConfigurationType> createCreateUserConfiguration(
            CreateUserConfigurationType value) {
        return new JAXBElement<CreateUserConfigurationType>(
                _CreateUserConfiguration_QNAME, CreateUserConfigurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetAppMarketplaceUrlResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetAppMarketplaceUrlResponse")
    public JAXBElement<GetAppMarketplaceUrlResponseMessageType> createGetAppMarketplaceUrlResponse(
            GetAppMarketplaceUrlResponseMessageType value) {
        return new JAXBElement<GetAppMarketplaceUrlResponseMessageType>(
                _GetAppMarketplaceUrlResponse_QNAME,
                GetAppMarketplaceUrlResponseMessageType.class,
                null,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link UninstallAppType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UninstallApp")
    public JAXBElement<UninstallAppType> createUninstallApp(UninstallAppType value) {
        return new JAXBElement<UninstallAppType>(
                _UninstallApp_QNAME, UninstallAppType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String
     * }{@code >}{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ConfigurationName",
            scope = ArrayOfServiceConfigurationType.class)
    public JAXBElement<List<String>> createArrayOfServiceConfigurationTypeConfigurationName(
            List<String> value) {
        return new JAXBElement<List<String>>(
                _ArrayOfServiceConfigurationTypeConfigurationName_QNAME,
                ((Class) List.class),
                ArrayOfServiceConfigurationType.class,
                ((List<String>) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribeResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SubscribeResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<SubscribeResponseMessageType>
            createArrayOfResponseMessagesTypeSubscribeResponseMessage(
                    SubscribeResponseMessageType value) {
        return new JAXBElement<SubscribeResponseMessageType>(
                _ArrayOfResponseMessagesTypeSubscribeResponseMessage_QNAME,
                SubscribeResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindItemResponseMessageType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "FindItemResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<FindItemResponseMessageType>
            createArrayOfResponseMessagesTypeFindItemResponseMessage(
                    FindItemResponseMessageType value) {
        return new JAXBElement<FindItemResponseMessageType>(
                _ArrayOfResponseMessagesTypeFindItemResponseMessage_QNAME,
                FindItemResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetClientAccessTokenResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetClientAccessTokenResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetClientAccessTokenResponseMessageType>
            createArrayOfResponseMessagesTypeGetClientAccessTokenResponseMessage(
                    GetClientAccessTokenResponseMessageType value) {
        return new JAXBElement<GetClientAccessTokenResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetClientAccessTokenResponseMessage_QNAME,
                GetClientAccessTokenResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetConversationItemsResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetConversationItemsResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetConversationItemsResponseMessageType>
            createArrayOfResponseMessagesTypeGetConversationItemsResponseMessage(
                    GetConversationItemsResponseMessageType value) {
        return new JAXBElement<GetConversationItemsResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetConversationItemsResponseMessage_QNAME,
                GetConversationItemsResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAttachmentResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "DeleteAttachmentResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<DeleteAttachmentResponseMessageType>
            createArrayOfResponseMessagesTypeDeleteAttachmentResponseMessage(
                    DeleteAttachmentResponseMessageType value) {
        return new JAXBElement<DeleteAttachmentResponseMessageType>(
                _ArrayOfResponseMessagesTypeDeleteAttachmentResponseMessage_QNAME,
                DeleteAttachmentResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportItemsResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ExportItemsResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ExportItemsResponseMessageType>
            createArrayOfResponseMessagesTypeExportItemsResponseMessage(
                    ExportItemsResponseMessageType value) {
        return new JAXBElement<ExportItemsResponseMessageType>(
                _ArrayOfResponseMessagesTypeExportItemsResponseMessage_QNAME,
                ExportItemsResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UpdateFolderResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<FolderInfoResponseMessageType>
            createArrayOfResponseMessagesTypeUpdateFolderResponseMessage(
                    FolderInfoResponseMessageType value) {
        return new JAXBElement<FolderInfoResponseMessageType>(
                _ArrayOfResponseMessagesTypeUpdateFolderResponseMessage_QNAME,
                FolderInfoResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetClientExtensionResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ResponseMessageType>
            createArrayOfResponseMessagesTypeGetClientExtensionResponseMessage(
                    ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetClientExtensionResponseMessage_QNAME,
                ResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetHoldOnMailboxesResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetHoldOnMailboxesResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetHoldOnMailboxesResponseMessageType>
            createArrayOfResponseMessagesTypeGetHoldOnMailboxesResponseMessage(
                    GetHoldOnMailboxesResponseMessageType value) {
        return new JAXBElement<GetHoldOnMailboxesResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetHoldOnMailboxesResponseMessage_QNAME,
                GetHoldOnMailboxesResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateFolderResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<FolderInfoResponseMessageType>
            createArrayOfResponseMessagesTypeCreateFolderResponseMessage(
                    FolderInfoResponseMessageType value) {
        return new JAXBElement<FolderInfoResponseMessageType>(
                _ArrayOfResponseMessagesTypeCreateFolderResponseMessage_QNAME,
                FolderInfoResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "MarkAllItemsAsReadResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ResponseMessageType>
            createArrayOfResponseMessagesTypeMarkAllItemsAsReadResponseMessage(
                    ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(
                _ArrayOfResponseMessagesTypeMarkAllItemsAsReadResponseMessage_QNAME,
                ResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemInfoResponseMessageType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CopyItemResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ItemInfoResponseMessageType>
            createArrayOfResponseMessagesTypeCopyItemResponseMessage(
                    ItemInfoResponseMessageType value) {
        return new JAXBElement<ItemInfoResponseMessageType>(
                _ArrayOfResponseMessagesTypeCopyItemResponseMessage_QNAME,
                ItemInfoResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetSearchableMailboxesResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetSearchableMailboxesResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetSearchableMailboxesResponseMessageType>
            createArrayOfResponseMessagesTypeGetSearchableMailboxesResponseMessage(
                    GetSearchableMailboxesResponseMessageType value) {
        return new JAXBElement<GetSearchableMailboxesResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetSearchableMailboxesResponseMessage_QNAME,
                GetSearchableMailboxesResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetAppManifestsResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ResponseMessageType>
            createArrayOfResponseMessagesTypeGetAppManifestsResponseMessage(
                    ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetAppManifestsResponseMessage_QNAME,
                ResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncFolderItemsResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SyncFolderItemsResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<SyncFolderItemsResponseMessageType>
            createArrayOfResponseMessagesTypeSyncFolderItemsResponseMessage(
                    SyncFolderItemsResponseMessageType value) {
        return new JAXBElement<SyncFolderItemsResponseMessageType>(
                _ArrayOfResponseMessagesTypeSyncFolderItemsResponseMessage_QNAME,
                SyncFolderItemsResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetNonIndexableItemDetailsResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetNonIndexableItemDetailsResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetNonIndexableItemDetailsResponseMessageType>
            createArrayOfResponseMessagesTypeGetNonIndexableItemDetailsResponseMessage(
                    GetNonIndexableItemDetailsResponseMessageType value) {
        return new JAXBElement<GetNonIndexableItemDetailsResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetNonIndexableItemDetailsResponseMessage_QNAME,
                GetNonIndexableItemDetailsResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetPasswordExpirationDateResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetPasswordExpirationDateResponse",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetPasswordExpirationDateResponseMessageType>
            createArrayOfResponseMessagesTypeGetPasswordExpirationDateResponse(
                    GetPasswordExpirationDateResponseMessageType value) {
        return new JAXBElement<GetPasswordExpirationDateResponseMessageType>(
                _GetPasswordExpirationDateResponse_QNAME,
                GetPasswordExpirationDateResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserPhotoResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUserPhotoResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetUserPhotoResponseMessageType>
            createArrayOfResponseMessagesTypeGetUserPhotoResponseMessage(
                    GetUserPhotoResponseMessageType value) {
        return new JAXBElement<GetUserPhotoResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetUserPhotoResponseMessage_QNAME,
                GetUserPhotoResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpandDLResponseMessageType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ExpandDLResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ExpandDLResponseMessageType>
            createArrayOfResponseMessagesTypeExpandDLResponseMessage(
                    ExpandDLResponseMessageType value) {
        return new JAXBElement<ExpandDLResponseMessageType>(
                _ArrayOfResponseMessagesTypeExpandDLResponseMessage_QNAME,
                ExpandDLResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateFolderPathResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<FolderInfoResponseMessageType>
            createArrayOfResponseMessagesTypeCreateFolderPathResponseMessage(
                    FolderInfoResponseMessageType value) {
        return new JAXBElement<FolderInfoResponseMessageType>(
                _ArrayOfResponseMessagesTypeCreateFolderPathResponseMessage_QNAME,
                FolderInfoResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchMailboxesResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SearchMailboxesResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<SearchMailboxesResponseMessageType>
            createArrayOfResponseMessagesTypeSearchMailboxesResponseMessage(
                    SearchMailboxesResponseMessageType value) {
        return new JAXBElement<SearchMailboxesResponseMessageType>(
                _ArrayOfResponseMessagesTypeSearchMailboxesResponseMessage_QNAME,
                SearchMailboxesResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkAsJunkResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "MarkAsJunkResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<MarkAsJunkResponseMessageType>
            createArrayOfResponseMessagesTypeMarkAsJunkResponseMessage(
                    MarkAsJunkResponseMessageType value) {
        return new JAXBElement<MarkAsJunkResponseMessageType>(
                _ArrayOfResponseMessagesTypeMarkAsJunkResponseMessage_QNAME,
                MarkAsJunkResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "EmptyFolderResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ResponseMessageType>
            createArrayOfResponseMessagesTypeEmptyFolderResponseMessage(ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(
                _ArrayOfResponseMessagesTypeEmptyFolderResponseMessage_QNAME,
                ResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemInfoResponseMessageType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetItemResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ItemInfoResponseMessageType>
            createArrayOfResponseMessagesTypeGetItemResponseMessage(
                    ItemInfoResponseMessageType value) {
        return new JAXBElement<ItemInfoResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetItemResponseMessage_QNAME,
                ItemInfoResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonaResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetPersonaResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetPersonaResponseMessageType>
            createArrayOfResponseMessagesTypeGetPersonaResponseMessage(
                    GetPersonaResponseMessageType value) {
        return new JAXBElement<GetPersonaResponseMessageType>(
                _GetPersonaResponseMessage_QNAME,
                GetPersonaResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetSharingMetadataResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetSharingMetadataResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetSharingMetadataResponseMessageType>
            createArrayOfResponseMessagesTypeGetSharingMetadataResponseMessage(
                    GetSharingMetadataResponseMessageType value) {
        return new JAXBElement<GetSharingMetadataResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetSharingMetadataResponseMessage_QNAME,
                GetSharingMetadataResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "MoveFolderResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<FolderInfoResponseMessageType>
            createArrayOfResponseMessagesTypeMoveFolderResponseMessage(
                    FolderInfoResponseMessageType value) {
        return new JAXBElement<FolderInfoResponseMessageType>(
                _ArrayOfResponseMessagesTypeMoveFolderResponseMessage_QNAME,
                FolderInfoResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemInfoResponseMessageType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "MoveItemResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ItemInfoResponseMessageType>
            createArrayOfResponseMessagesTypeMoveItemResponseMessage(
                    ItemInfoResponseMessageType value) {
        return new JAXBElement<ItemInfoResponseMessageType>(
                _ArrayOfResponseMessagesTypeMoveItemResponseMessage_QNAME,
                ItemInfoResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * SetHoldOnMailboxesResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SetHoldOnMailboxesResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<SetHoldOnMailboxesResponseMessageType>
            createArrayOfResponseMessagesTypeSetHoldOnMailboxesResponseMessage(
                    SetHoldOnMailboxesResponseMessageType value) {
        return new JAXBElement<SetHoldOnMailboxesResponseMessageType>(
                _ArrayOfResponseMessagesTypeSetHoldOnMailboxesResponseMessage_QNAME,
                SetHoldOnMailboxesResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFolderResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "FindFolderResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<FindFolderResponseMessageType>
            createArrayOfResponseMessagesTypeFindFolderResponseMessage(
                    FindFolderResponseMessageType value) {
        return new JAXBElement<FindFolderResponseMessageType>(
                _ArrayOfResponseMessagesTypeFindFolderResponseMessage_QNAME,
                FindFolderResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetServerTimeZonesResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetServerTimeZonesResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetServerTimeZonesResponseMessageType>
            createArrayOfResponseMessagesTypeGetServerTimeZonesResponseMessage(
                    GetServerTimeZonesResponseMessageType value) {
        return new JAXBElement<GetServerTimeZonesResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetServerTimeZonesResponseMessage_QNAME,
                GetServerTimeZonesResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetNonIndexableItemStatisticsResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetNonIndexableItemStatisticsResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetNonIndexableItemStatisticsResponseMessageType>
            createArrayOfResponseMessagesTypeGetNonIndexableItemStatisticsResponseMessage(
                    GetNonIndexableItemStatisticsResponseMessageType value) {
        return new JAXBElement<GetNonIndexableItemStatisticsResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetNonIndexableItemStatisticsResponseMessage_QNAME,
                GetNonIndexableItemStatisticsResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemInfoResponseMessageType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ArchiveItemResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ItemInfoResponseMessageType>
            createArrayOfResponseMessagesTypeArchiveItemResponseMessage(
                    ItemInfoResponseMessageType value) {
        return new JAXBElement<ItemInfoResponseMessageType>(
                _ArrayOfResponseMessagesTypeArchiveItemResponseMessage_QNAME,
                ItemInfoResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetUserRetentionPolicyTagsResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUserRetentionPolicyTagsResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetUserRetentionPolicyTagsResponseMessageType>
            createArrayOfResponseMessagesTypeGetUserRetentionPolicyTagsResponseMessage(
                    GetUserRetentionPolicyTagsResponseMessageType value) {
        return new JAXBElement<GetUserRetentionPolicyTagsResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetUserRetentionPolicyTagsResponseMessage_QNAME,
                GetUserRetentionPolicyTagsResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateManagedFolderResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<FolderInfoResponseMessageType>
            createArrayOfResponseMessagesTypeCreateManagedFolderResponseMessage(
                    FolderInfoResponseMessageType value) {
        return new JAXBElement<FolderInfoResponseMessageType>(
                _ArrayOfResponseMessagesTypeCreateManagedFolderResponseMessage_QNAME,
                FolderInfoResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRemindersResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetRemindersResponse",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetRemindersResponseMessageType>
            createArrayOfResponseMessagesTypeGetRemindersResponse(
                    GetRemindersResponseMessageType value) {
        return new JAXBElement<GetRemindersResponseMessageType>(
                _GetRemindersResponse_QNAME,
                GetRemindersResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentInfoResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateAttachmentResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<AttachmentInfoResponseMessageType>
            createArrayOfResponseMessagesTypeCreateAttachmentResponseMessage(
                    AttachmentInfoResponseMessageType value) {
        return new JAXBElement<AttachmentInfoResponseMessageType>(
                _ArrayOfResponseMessagesTypeCreateAttachmentResponseMessage_QNAME,
                AttachmentInfoResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "DeleteItemResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ResponseMessageType>
            createArrayOfResponseMessagesTypeDeleteItemResponseMessage(ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(
                _ArrayOfResponseMessagesTypeDeleteItemResponseMessage_QNAME,
                ResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPeopleResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "FindPeopleResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<FindPeopleResponseMessageType>
            createArrayOfResponseMessagesTypeFindPeopleResponseMessage(
                    FindPeopleResponseMessageType value) {
        return new JAXBElement<FindPeopleResponseMessageType>(
                _ArrayOfResponseMessagesTypeFindPeopleResponseMessage_QNAME,
                FindPeopleResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * FindMailboxStatisticsByKeywordsResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "FindMailboxStatisticsByKeywordsResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<FindMailboxStatisticsByKeywordsResponseMessageType>
            createArrayOfResponseMessagesTypeFindMailboxStatisticsByKeywordsResponseMessage(
                    FindMailboxStatisticsByKeywordsResponseMessageType value) {
        return new JAXBElement<FindMailboxStatisticsByKeywordsResponseMessageType>(
                _ArrayOfResponseMessagesTypeFindMailboxStatisticsByKeywordsResponseMessage_QNAME,
                FindMailboxStatisticsByKeywordsResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomsResponseMessageType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetRoomsResponse",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetRoomsResponseMessageType>
            createArrayOfResponseMessagesTypeGetRoomsResponse(GetRoomsResponseMessageType value) {
        return new JAXBElement<GetRoomsResponseMessageType>(
                _GetRoomsResponse_QNAME,
                GetRoomsResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventsResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetEventsResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetEventsResponseMessageType>
            createArrayOfResponseMessagesTypeGetEventsResponseMessage(
                    GetEventsResponseMessageType value) {
        return new JAXBElement<GetEventsResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetEventsResponseMessage_QNAME,
                GetEventsResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SendItemResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ResponseMessageType>
            createArrayOfResponseMessagesTypeSendItemResponseMessage(ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(
                _ArrayOfResponseMessagesTypeSendItemResponseMessage_QNAME,
                ResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateUserConfigurationResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ResponseMessageType>
            createArrayOfResponseMessagesTypeCreateUserConfigurationResponseMessage(
                    ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(
                _ArrayOfResponseMessagesTypeCreateUserConfigurationResponseMessage_QNAME,
                ResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResolveNamesResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ResolveNamesResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ResolveNamesResponseMessageType>
            createArrayOfResponseMessagesTypeResolveNamesResponseMessage(
                    ResolveNamesResponseMessageType value) {
        return new JAXBElement<ResolveNamesResponseMessageType>(
                _ArrayOfResponseMessagesTypeResolveNamesResponseMessage_QNAME,
                ResolveNamesResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SetClientExtensionResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ResponseMessageType>
            createArrayOfResponseMessagesTypeSetClientExtensionResponseMessage(
                    ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(
                _ArrayOfResponseMessagesTypeSetClientExtensionResponseMessage_QNAME,
                ResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetUserConfigurationResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetUserConfigurationResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetUserConfigurationResponseMessageType>
            createArrayOfResponseMessagesTypeGetUserConfigurationResponseMessage(
                    GetUserConfigurationResponseMessageType value) {
        return new JAXBElement<GetUserConfigurationResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetUserConfigurationResponseMessage_QNAME,
                GetUserConfigurationResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ApplyConversationActionResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ResponseMessageType>
            createArrayOfResponseMessagesTypeApplyConversationActionResponseMessage(
                    ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(
                _ArrayOfResponseMessagesTypeApplyConversationActionResponseMessage_QNAME,
                ResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CopyFolderResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<FolderInfoResponseMessageType>
            createArrayOfResponseMessagesTypeCopyFolderResponseMessage(
                    FolderInfoResponseMessageType value) {
        return new JAXBElement<FolderInfoResponseMessageType>(
                _ArrayOfResponseMessagesTypeCopyFolderResponseMessage_QNAME,
                FolderInfoResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertIdResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "ConvertIdResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ConvertIdResponseMessageType>
            createArrayOfResponseMessagesTypeConvertIdResponseMessage(
                    ConvertIdResponseMessageType value) {
        return new JAXBElement<ConvertIdResponseMessageType>(
                _ArrayOfResponseMessagesTypeConvertIdResponseMessage_QNAME,
                ConvertIdResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateItemResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UpdateItemResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<UpdateItemResponseMessageType>
            createArrayOfResponseMessagesTypeUpdateItemResponseMessage(
                    UpdateItemResponseMessageType value) {
        return new JAXBElement<UpdateItemResponseMessageType>(
                _ArrayOfResponseMessagesTypeUpdateItemResponseMessage_QNAME,
                UpdateItemResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetStreamingEventsResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetStreamingEventsResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetStreamingEventsResponseMessageType>
            createArrayOfResponseMessagesTypeGetStreamingEventsResponseMessage(
                    GetStreamingEventsResponseMessageType value) {
        return new JAXBElement<GetStreamingEventsResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetStreamingEventsResponseMessage_QNAME,
                GetStreamingEventsResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * RefreshSharingFolderResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "RefreshSharingFolderResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<RefreshSharingFolderResponseMessageType>
            createArrayOfResponseMessagesTypeRefreshSharingFolderResponseMessage(
                    RefreshSharingFolderResponseMessageType value) {
        return new JAXBElement<RefreshSharingFolderResponseMessageType>(
                _ArrayOfResponseMessagesTypeRefreshSharingFolderResponseMessage_QNAME,
                RefreshSharingFolderResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNotificationResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SendNotificationResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<SendNotificationResponseMessageType>
            createArrayOfResponseMessagesTypeSendNotificationResponseMessage(
                    SendNotificationResponseMessageType value) {
        return new JAXBElement<SendNotificationResponseMessageType>(
                _ArrayOfResponseMessagesTypeSendNotificationResponseMessage_QNAME,
                SendNotificationResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentInfoResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetAttachmentResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<AttachmentInfoResponseMessageType>
            createArrayOfResponseMessagesTypeGetAttachmentResponseMessage(
                    AttachmentInfoResponseMessageType value) {
        return new JAXBElement<AttachmentInfoResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetAttachmentResponseMessage_QNAME,
                AttachmentInfoResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * UpdateItemInRecoverableItemsResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UpdateItemInRecoverableItemsResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<UpdateItemInRecoverableItemsResponseMessageType>
            createArrayOfResponseMessagesTypeUpdateItemInRecoverableItemsResponseMessage(
                    UpdateItemInRecoverableItemsResponseMessageType value) {
        return new JAXBElement<UpdateItemInRecoverableItemsResponseMessageType>(
                _ArrayOfResponseMessagesTypeUpdateItemInRecoverableItemsResponseMessage_QNAME,
                UpdateItemInRecoverableItemsResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderInfoResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetFolderResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<FolderInfoResponseMessageType>
            createArrayOfResponseMessagesTypeGetFolderResponseMessage(
                    FolderInfoResponseMessageType value) {
        return new JAXBElement<FolderInfoResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetFolderResponseMessage_QNAME,
                FolderInfoResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomListsResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetRoomListsResponse",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetRoomListsResponseMessageType>
            createArrayOfResponseMessagesTypeGetRoomListsResponse(
                    GetRoomListsResponseMessageType value) {
        return new JAXBElement<GetRoomListsResponseMessageType>(
                _GetRoomListsResponse_QNAME,
                GetRoomListsResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadItemsResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UploadItemsResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<UploadItemsResponseMessageType>
            createArrayOfResponseMessagesTypeUploadItemsResponseMessage(
                    UploadItemsResponseMessageType value) {
        return new JAXBElement<UploadItemsResponseMessageType>(
                _ArrayOfResponseMessagesTypeUploadItemsResponseMessage_QNAME,
                UploadItemsResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * PerformReminderActionResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "PerformReminderActionResponse",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<PerformReminderActionResponseMessageType>
            createArrayOfResponseMessagesTypePerformReminderActionResponse(
                    PerformReminderActionResponseMessageType value) {
        return new JAXBElement<PerformReminderActionResponseMessageType>(
                _PerformReminderActionResponse_QNAME,
                PerformReminderActionResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UpdateUserConfigurationResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ResponseMessageType>
            createArrayOfResponseMessagesTypeUpdateUserConfigurationResponseMessage(
                    ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(
                _ArrayOfResponseMessagesTypeUpdateUserConfigurationResponseMessage_QNAME,
                ResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * SyncFolderHierarchyResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "SyncFolderHierarchyResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<SyncFolderHierarchyResponseMessageType>
            createArrayOfResponseMessagesTypeSyncFolderHierarchyResponseMessage(
                    SyncFolderHierarchyResponseMessageType value) {
        return new JAXBElement<SyncFolderHierarchyResponseMessageType>(
                _ArrayOfResponseMessagesTypeSyncFolderHierarchyResponseMessage_QNAME,
                SyncFolderHierarchyResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSharingFolderResponseMessageType
     * }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetSharingFolderResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetSharingFolderResponseMessageType>
            createArrayOfResponseMessagesTypeGetSharingFolderResponseMessage(
                    GetSharingFolderResponseMessageType value) {
        return new JAXBElement<GetSharingFolderResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetSharingFolderResponseMessage_QNAME,
                GetSharingFolderResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemInfoResponseMessageType }{@code
     * >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "CreateItemResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ItemInfoResponseMessageType>
            createArrayOfResponseMessagesTypeCreateItemResponseMessage(
                    ItemInfoResponseMessageType value) {
        return new JAXBElement<ItemInfoResponseMessageType>(
                _ArrayOfResponseMessagesTypeCreateItemResponseMessage_QNAME,
                ItemInfoResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "UnsubscribeResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ResponseMessageType>
            createArrayOfResponseMessagesTypeUnsubscribeResponseMessage(ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(
                _ArrayOfResponseMessagesTypeUnsubscribeResponseMessage_QNAME,
                ResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "DeleteFolderResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ResponseMessageType>
            createArrayOfResponseMessagesTypeDeleteFolderResponseMessage(
                    ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(
                _ArrayOfResponseMessagesTypeDeleteFolderResponseMessage_QNAME,
                ResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link
     * GetDiscoverySearchConfigurationResponseMessageType }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "GetDiscoverySearchConfigurationResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<GetDiscoverySearchConfigurationResponseMessageType>
            createArrayOfResponseMessagesTypeGetDiscoverySearchConfigurationResponseMessage(
                    GetDiscoverySearchConfigurationResponseMessageType value) {
        return new JAXBElement<GetDiscoverySearchConfigurationResponseMessageType>(
                _ArrayOfResponseMessagesTypeGetDiscoverySearchConfigurationResponseMessage_QNAME,
                GetDiscoverySearchConfigurationResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}} */
    @XmlElementDecl(
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            name = "DeleteUserConfigurationResponseMessage",
            scope = ArrayOfResponseMessagesType.class)
    public JAXBElement<ResponseMessageType>
            createArrayOfResponseMessagesTypeDeleteUserConfigurationResponseMessage(
                    ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(
                _ArrayOfResponseMessagesTypeDeleteUserConfigurationResponseMessage_QNAME,
                ResponseMessageType.class,
                ArrayOfResponseMessagesType.class,
                value);
    }
}
