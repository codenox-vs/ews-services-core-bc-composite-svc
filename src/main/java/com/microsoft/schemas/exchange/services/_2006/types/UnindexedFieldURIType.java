package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for UnindexedFieldURIType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="UnindexedFieldURIType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="folder:FolderId"/>
 *     &lt;enumeration value="folder:ParentFolderId"/>
 *     &lt;enumeration value="folder:DisplayName"/>
 *     &lt;enumeration value="folder:UnreadCount"/>
 *     &lt;enumeration value="folder:TotalCount"/>
 *     &lt;enumeration value="folder:ChildFolderCount"/>
 *     &lt;enumeration value="folder:FolderClass"/>
 *     &lt;enumeration value="folder:SearchParameters"/>
 *     &lt;enumeration value="folder:ManagedFolderInformation"/>
 *     &lt;enumeration value="folder:PermissionSet"/>
 *     &lt;enumeration value="folder:EffectiveRights"/>
 *     &lt;enumeration value="folder:SharingEffectiveRights"/>
 *     &lt;enumeration value="folder:DistinguishedFolderId"/>
 *     &lt;enumeration value="folder:PolicyTag"/>
 *     &lt;enumeration value="folder:ArchiveTag"/>
 *     &lt;enumeration value="item:ItemId"/>
 *     &lt;enumeration value="item:ParentFolderId"/>
 *     &lt;enumeration value="item:ItemClass"/>
 *     &lt;enumeration value="item:MimeContent"/>
 *     &lt;enumeration value="item:Attachments"/>
 *     &lt;enumeration value="item:Subject"/>
 *     &lt;enumeration value="item:DateTimeReceived"/>
 *     &lt;enumeration value="item:Size"/>
 *     &lt;enumeration value="item:Categories"/>
 *     &lt;enumeration value="item:HasAttachments"/>
 *     &lt;enumeration value="item:Importance"/>
 *     &lt;enumeration value="item:InReplyTo"/>
 *     &lt;enumeration value="item:InternetMessageHeaders"/>
 *     &lt;enumeration value="item:IsAssociated"/>
 *     &lt;enumeration value="item:IsDraft"/>
 *     &lt;enumeration value="item:IsFromMe"/>
 *     &lt;enumeration value="item:IsResend"/>
 *     &lt;enumeration value="item:IsSubmitted"/>
 *     &lt;enumeration value="item:IsUnmodified"/>
 *     &lt;enumeration value="item:DateTimeSent"/>
 *     &lt;enumeration value="item:DateTimeCreated"/>
 *     &lt;enumeration value="item:Body"/>
 *     &lt;enumeration value="item:ResponseObjects"/>
 *     &lt;enumeration value="item:Sensitivity"/>
 *     &lt;enumeration value="item:ReminderDueBy"/>
 *     &lt;enumeration value="item:ReminderIsSet"/>
 *     &lt;enumeration value="item:ReminderNextTime"/>
 *     &lt;enumeration value="item:ReminderMinutesBeforeStart"/>
 *     &lt;enumeration value="item:DisplayTo"/>
 *     &lt;enumeration value="item:DisplayCc"/>
 *     &lt;enumeration value="item:Culture"/>
 *     &lt;enumeration value="item:EffectiveRights"/>
 *     &lt;enumeration value="item:LastModifiedName"/>
 *     &lt;enumeration value="item:LastModifiedTime"/>
 *     &lt;enumeration value="item:ConversationId"/>
 *     &lt;enumeration value="item:UniqueBody"/>
 *     &lt;enumeration value="item:Flag"/>
 *     &lt;enumeration value="item:StoreEntryId"/>
 *     &lt;enumeration value="item:InstanceKey"/>
 *     &lt;enumeration value="item:NormalizedBody"/>
 *     &lt;enumeration value="item:EntityExtractionResult"/>
 *     &lt;enumeration value="item:PolicyTag"/>
 *     &lt;enumeration value="item:ArchiveTag"/>
 *     &lt;enumeration value="item:RetentionDate"/>
 *     &lt;enumeration value="item:Preview"/>
 *     &lt;enumeration value="item:NextPredictedAction"/>
 *     &lt;enumeration value="item:GroupingAction"/>
 *     &lt;enumeration value="item:PredictedActionReasons"/>
 *     &lt;enumeration value="item:IsClutter"/>
 *     &lt;enumeration value="item:RightsManagementLicenseData"/>
 *     &lt;enumeration value="item:BlockStatus"/>
 *     &lt;enumeration value="item:HasBlockedImages"/>
 *     &lt;enumeration value="item:WebClientReadFormQueryString"/>
 *     &lt;enumeration value="item:WebClientEditFormQueryString"/>
 *     &lt;enumeration value="item:TextBody"/>
 *     &lt;enumeration value="item:IconIndex"/>
 *     &lt;enumeration value="message:ConversationIndex"/>
 *     &lt;enumeration value="message:ConversationTopic"/>
 *     &lt;enumeration value="message:InternetMessageId"/>
 *     &lt;enumeration value="message:IsRead"/>
 *     &lt;enumeration value="message:IsResponseRequested"/>
 *     &lt;enumeration value="message:IsReadReceiptRequested"/>
 *     &lt;enumeration value="message:IsDeliveryReceiptRequested"/>
 *     &lt;enumeration value="message:ReceivedBy"/>
 *     &lt;enumeration value="message:ReceivedRepresenting"/>
 *     &lt;enumeration value="message:References"/>
 *     &lt;enumeration value="message:ReplyTo"/>
 *     &lt;enumeration value="message:From"/>
 *     &lt;enumeration value="message:Sender"/>
 *     &lt;enumeration value="message:ToRecipients"/>
 *     &lt;enumeration value="message:CcRecipients"/>
 *     &lt;enumeration value="message:BccRecipients"/>
 *     &lt;enumeration value="message:ApprovalRequestData"/>
 *     &lt;enumeration value="message:VotingInformation"/>
 *     &lt;enumeration value="meeting:AssociatedCalendarItemId"/>
 *     &lt;enumeration value="meeting:IsDelegated"/>
 *     &lt;enumeration value="meeting:IsOutOfDate"/>
 *     &lt;enumeration value="meeting:HasBeenProcessed"/>
 *     &lt;enumeration value="meeting:ResponseType"/>
 *     &lt;enumeration value="meeting:ProposedStart"/>
 *     &lt;enumeration value="meeting:ProposedEnd"/>
 *     &lt;enumeration value="meetingRequest:MeetingRequestType"/>
 *     &lt;enumeration value="meetingRequest:IntendedFreeBusyStatus"/>
 *     &lt;enumeration value="meetingRequest:ChangeHighlights"/>
 *     &lt;enumeration value="calendar:Start"/>
 *     &lt;enumeration value="calendar:End"/>
 *     &lt;enumeration value="calendar:OriginalStart"/>
 *     &lt;enumeration value="calendar:StartWallClock"/>
 *     &lt;enumeration value="calendar:EndWallClock"/>
 *     &lt;enumeration value="calendar:StartTimeZoneId"/>
 *     &lt;enumeration value="calendar:EndTimeZoneId"/>
 *     &lt;enumeration value="calendar:IsAllDayEvent"/>
 *     &lt;enumeration value="calendar:LegacyFreeBusyStatus"/>
 *     &lt;enumeration value="calendar:Location"/>
 *     &lt;enumeration value="calendar:EnhancedLocation"/>
 *     &lt;enumeration value="calendar:When"/>
 *     &lt;enumeration value="calendar:IsMeeting"/>
 *     &lt;enumeration value="calendar:IsCancelled"/>
 *     &lt;enumeration value="calendar:IsRecurring"/>
 *     &lt;enumeration value="calendar:MeetingRequestWasSent"/>
 *     &lt;enumeration value="calendar:IsResponseRequested"/>
 *     &lt;enumeration value="calendar:CalendarItemType"/>
 *     &lt;enumeration value="calendar:MyResponseType"/>
 *     &lt;enumeration value="calendar:Organizer"/>
 *     &lt;enumeration value="calendar:RequiredAttendees"/>
 *     &lt;enumeration value="calendar:OptionalAttendees"/>
 *     &lt;enumeration value="calendar:Resources"/>
 *     &lt;enumeration value="calendar:ConflictingMeetingCount"/>
 *     &lt;enumeration value="calendar:AdjacentMeetingCount"/>
 *     &lt;enumeration value="calendar:ConflictingMeetings"/>
 *     &lt;enumeration value="calendar:AdjacentMeetings"/>
 *     &lt;enumeration value="calendar:Duration"/>
 *     &lt;enumeration value="calendar:TimeZone"/>
 *     &lt;enumeration value="calendar:AppointmentReplyTime"/>
 *     &lt;enumeration value="calendar:AppointmentSequenceNumber"/>
 *     &lt;enumeration value="calendar:AppointmentState"/>
 *     &lt;enumeration value="calendar:Recurrence"/>
 *     &lt;enumeration value="calendar:FirstOccurrence"/>
 *     &lt;enumeration value="calendar:LastOccurrence"/>
 *     &lt;enumeration value="calendar:ModifiedOccurrences"/>
 *     &lt;enumeration value="calendar:DeletedOccurrences"/>
 *     &lt;enumeration value="calendar:MeetingTimeZone"/>
 *     &lt;enumeration value="calendar:ConferenceType"/>
 *     &lt;enumeration value="calendar:AllowNewTimeProposal"/>
 *     &lt;enumeration value="calendar:IsOnlineMeeting"/>
 *     &lt;enumeration value="calendar:MeetingWorkspaceUrl"/>
 *     &lt;enumeration value="calendar:NetShowUrl"/>
 *     &lt;enumeration value="calendar:UID"/>
 *     &lt;enumeration value="calendar:RecurrenceId"/>
 *     &lt;enumeration value="calendar:DateTimeStamp"/>
 *     &lt;enumeration value="calendar:StartTimeZone"/>
 *     &lt;enumeration value="calendar:EndTimeZone"/>
 *     &lt;enumeration value="calendar:JoinOnlineMeetingUrl"/>
 *     &lt;enumeration value="calendar:OnlineMeetingSettings"/>
 *     &lt;enumeration value="calendar:IsOrganizer"/>
 *     &lt;enumeration value="task:ActualWork"/>
 *     &lt;enumeration value="task:AssignedTime"/>
 *     &lt;enumeration value="task:BillingInformation"/>
 *     &lt;enumeration value="task:ChangeCount"/>
 *     &lt;enumeration value="task:Companies"/>
 *     &lt;enumeration value="task:CompleteDate"/>
 *     &lt;enumeration value="task:Contacts"/>
 *     &lt;enumeration value="task:DelegationState"/>
 *     &lt;enumeration value="task:Delegator"/>
 *     &lt;enumeration value="task:DueDate"/>
 *     &lt;enumeration value="task:IsAssignmentEditable"/>
 *     &lt;enumeration value="task:IsComplete"/>
 *     &lt;enumeration value="task:IsRecurring"/>
 *     &lt;enumeration value="task:IsTeamTask"/>
 *     &lt;enumeration value="task:Mileage"/>
 *     &lt;enumeration value="task:Owner"/>
 *     &lt;enumeration value="task:PercentComplete"/>
 *     &lt;enumeration value="task:Recurrence"/>
 *     &lt;enumeration value="task:StartDate"/>
 *     &lt;enumeration value="task:Status"/>
 *     &lt;enumeration value="task:StatusDescription"/>
 *     &lt;enumeration value="task:TotalWork"/>
 *     &lt;enumeration value="contacts:Alias"/>
 *     &lt;enumeration value="contacts:AssistantName"/>
 *     &lt;enumeration value="contacts:Birthday"/>
 *     &lt;enumeration value="contacts:BusinessHomePage"/>
 *     &lt;enumeration value="contacts:Children"/>
 *     &lt;enumeration value="contacts:Companies"/>
 *     &lt;enumeration value="contacts:CompanyName"/>
 *     &lt;enumeration value="contacts:CompleteName"/>
 *     &lt;enumeration value="contacts:ContactSource"/>
 *     &lt;enumeration value="contacts:Culture"/>
 *     &lt;enumeration value="contacts:Department"/>
 *     &lt;enumeration value="contacts:DisplayName"/>
 *     &lt;enumeration value="contacts:DirectoryId"/>
 *     &lt;enumeration value="contacts:DirectReports"/>
 *     &lt;enumeration value="contacts:EmailAddresses"/>
 *     &lt;enumeration value="contacts:FileAs"/>
 *     &lt;enumeration value="contacts:FileAsMapping"/>
 *     &lt;enumeration value="contacts:Generation"/>
 *     &lt;enumeration value="contacts:GivenName"/>
 *     &lt;enumeration value="contacts:ImAddresses"/>
 *     &lt;enumeration value="contacts:Initials"/>
 *     &lt;enumeration value="contacts:JobTitle"/>
 *     &lt;enumeration value="contacts:Manager"/>
 *     &lt;enumeration value="contacts:ManagerMailbox"/>
 *     &lt;enumeration value="contacts:MiddleName"/>
 *     &lt;enumeration value="contacts:Mileage"/>
 *     &lt;enumeration value="contacts:MSExchangeCertificate"/>
 *     &lt;enumeration value="contacts:Nickname"/>
 *     &lt;enumeration value="contacts:Notes"/>
 *     &lt;enumeration value="contacts:OfficeLocation"/>
 *     &lt;enumeration value="contacts:PhoneNumbers"/>
 *     &lt;enumeration value="contacts:PhoneticFullName"/>
 *     &lt;enumeration value="contacts:PhoneticFirstName"/>
 *     &lt;enumeration value="contacts:PhoneticLastName"/>
 *     &lt;enumeration value="contacts:Photo"/>
 *     &lt;enumeration value="contacts:PhysicalAddresses"/>
 *     &lt;enumeration value="contacts:PostalAddressIndex"/>
 *     &lt;enumeration value="contacts:Profession"/>
 *     &lt;enumeration value="contacts:SpouseName"/>
 *     &lt;enumeration value="contacts:Surname"/>
 *     &lt;enumeration value="contacts:WeddingAnniversary"/>
 *     &lt;enumeration value="contacts:UserSMIMECertificate"/>
 *     &lt;enumeration value="contacts:HasPicture"/>
 *     &lt;enumeration value="distributionlist:Members"/>
 *     &lt;enumeration value="postitem:PostedTime"/>
 *     &lt;enumeration value="conversation:ConversationId"/>
 *     &lt;enumeration value="conversation:ConversationTopic"/>
 *     &lt;enumeration value="conversation:UniqueRecipients"/>
 *     &lt;enumeration value="conversation:GlobalUniqueRecipients"/>
 *     &lt;enumeration value="conversation:UniqueUnreadSenders"/>
 *     &lt;enumeration value="conversation:GlobalUniqueUnreadSenders"/>
 *     &lt;enumeration value="conversation:UniqueSenders"/>
 *     &lt;enumeration value="conversation:GlobalUniqueSenders"/>
 *     &lt;enumeration value="conversation:LastDeliveryTime"/>
 *     &lt;enumeration value="conversation:GlobalLastDeliveryTime"/>
 *     &lt;enumeration value="conversation:Categories"/>
 *     &lt;enumeration value="conversation:GlobalCategories"/>
 *     &lt;enumeration value="conversation:FlagStatus"/>
 *     &lt;enumeration value="conversation:GlobalFlagStatus"/>
 *     &lt;enumeration value="conversation:HasAttachments"/>
 *     &lt;enumeration value="conversation:GlobalHasAttachments"/>
 *     &lt;enumeration value="conversation:HasIrm"/>
 *     &lt;enumeration value="conversation:GlobalHasIrm"/>
 *     &lt;enumeration value="conversation:MessageCount"/>
 *     &lt;enumeration value="conversation:GlobalMessageCount"/>
 *     &lt;enumeration value="conversation:UnreadCount"/>
 *     &lt;enumeration value="conversation:GlobalUnreadCount"/>
 *     &lt;enumeration value="conversation:Size"/>
 *     &lt;enumeration value="conversation:GlobalSize"/>
 *     &lt;enumeration value="conversation:ItemClasses"/>
 *     &lt;enumeration value="conversation:GlobalItemClasses"/>
 *     &lt;enumeration value="conversation:Importance"/>
 *     &lt;enumeration value="conversation:GlobalImportance"/>
 *     &lt;enumeration value="conversation:ItemIds"/>
 *     &lt;enumeration value="conversation:GlobalItemIds"/>
 *     &lt;enumeration value="conversation:LastModifiedTime"/>
 *     &lt;enumeration value="conversation:InstanceKey"/>
 *     &lt;enumeration value="conversation:Preview"/>
 *     &lt;enumeration value="conversation:NextPredictedAction"/>
 *     &lt;enumeration value="conversation:GroupingAction"/>
 *     &lt;enumeration value="conversation:IconIndex"/>
 *     &lt;enumeration value="conversation:GlobalIconIndex"/>
 *     &lt;enumeration value="conversation:DraftItemIds"/>
 *     &lt;enumeration value="conversation:HasClutter"/>
 *     &lt;enumeration value="persona:PersonaId"/>
 *     &lt;enumeration value="persona:PersonaType"/>
 *     &lt;enumeration value="persona:GivenName"/>
 *     &lt;enumeration value="persona:CompanyName"/>
 *     &lt;enumeration value="persona:Surname"/>
 *     &lt;enumeration value="persona:DisplayName"/>
 *     &lt;enumeration value="persona:EmailAddress"/>
 *     &lt;enumeration value="persona:FileAs"/>
 *     &lt;enumeration value="persona:HomeCity"/>
 *     &lt;enumeration value="persona:CreationTime"/>
 *     &lt;enumeration value="persona:RelevanceScore"/>
 *     &lt;enumeration value="persona:WorkCity"/>
 *     &lt;enumeration value="persona:PersonaObjectStatus"/>
 *     &lt;enumeration value="persona:FileAsId"/>
 *     &lt;enumeration value="persona:DisplayNamePrefix"/>
 *     &lt;enumeration value="persona:YomiCompanyName"/>
 *     &lt;enumeration value="persona:YomiFirstName"/>
 *     &lt;enumeration value="persona:YomiLastName"/>
 *     &lt;enumeration value="persona:Title"/>
 *     &lt;enumeration value="persona:EmailAddress"/>
 *     &lt;enumeration value="persona:EmailAddresses"/>
 *     &lt;enumeration value="persona:PhoneNumber"/>
 *     &lt;enumeration value="persona:ImAddress"/>
 *     &lt;enumeration value="persona:ImAddresses"/>
 *     &lt;enumeration value="persona:ImAddresses2"/>
 *     &lt;enumeration value="persona:ImAddresses3"/>
 *     &lt;enumeration value="persona:FolderIds"/>
 *     &lt;enumeration value="persona:Attributions"/>
 *     &lt;enumeration value="persona:DisplayNames"/>
 *     &lt;enumeration value="persona:Initials"/>
 *     &lt;enumeration value="persona:FileAses"/>
 *     &lt;enumeration value="persona:FileAsIds"/>
 *     &lt;enumeration value="persona:DisplayNamePrefixes"/>
 *     &lt;enumeration value="persona:GivenNames"/>
 *     &lt;enumeration value="persona:MiddleNames"/>
 *     &lt;enumeration value="persona:Surnames"/>
 *     &lt;enumeration value="persona:Generations"/>
 *     &lt;enumeration value="persona:Nicknames"/>
 *     &lt;enumeration value="persona:YomiCompanyNames"/>
 *     &lt;enumeration value="persona:YomiFirstNames"/>
 *     &lt;enumeration value="persona:YomiLastNames"/>
 *     &lt;enumeration value="persona:BusinessPhoneNumbers"/>
 *     &lt;enumeration value="persona:BusinessPhoneNumbers2"/>
 *     &lt;enumeration value="persona:HomePhones"/>
 *     &lt;enumeration value="persona:HomePhones2"/>
 *     &lt;enumeration value="persona:MobilePhones"/>
 *     &lt;enumeration value="persona:MobilePhones2"/>
 *     &lt;enumeration value="persona:AssistantPhoneNumbers"/>
 *     &lt;enumeration value="persona:CallbackPhones"/>
 *     &lt;enumeration value="persona:CarPhones"/>
 *     &lt;enumeration value="persona:HomeFaxes"/>
 *     &lt;enumeration value="persona:OrganizationMainPhones"/>
 *     &lt;enumeration value="persona:OtherFaxes"/>
 *     &lt;enumeration value="persona:OtherTelephones"/>
 *     &lt;enumeration value="persona:OtherPhones2"/>
 *     &lt;enumeration value="persona:Pagers"/>
 *     &lt;enumeration value="persona:RadioPhones"/>
 *     &lt;enumeration value="persona:TelexNumbers"/>
 *     &lt;enumeration value="persona:WorkFaxes"/>
 *     &lt;enumeration value="persona:Emails1"/>
 *     &lt;enumeration value="persona:Emails2"/>
 *     &lt;enumeration value="persona:Emails3"/>
 *     &lt;enumeration value="persona:BusinessHomePages"/>
 *     &lt;enumeration value="persona:School"/>
 *     &lt;enumeration value="persona:PersonalHomePages"/>
 *     &lt;enumeration value="persona:OfficeLocations"/>
 *     &lt;enumeration value="persona:BusinessAddresses"/>
 *     &lt;enumeration value="persona:HomeAddresses"/>
 *     &lt;enumeration value="persona:OtherAddresses"/>
 *     &lt;enumeration value="persona:Titles"/>
 *     &lt;enumeration value="persona:Departments"/>
 *     &lt;enumeration value="persona:CompanyNames"/>
 *     &lt;enumeration value="persona:Managers"/>
 *     &lt;enumeration value="persona:AssistantNames"/>
 *     &lt;enumeration value="persona:Professions"/>
 *     &lt;enumeration value="persona:SpouseNames"/>
 *     &lt;enumeration value="persona:Hobbies"/>
 *     &lt;enumeration value="persona:WeddingAnniversaries"/>
 *     &lt;enumeration value="persona:Birthdays"/>
 *     &lt;enumeration value="persona:Children"/>
 *     &lt;enumeration value="persona:Locations"/>
 *     &lt;enumeration value="persona:ExtendedProperties"/>
 *     &lt;enumeration value="persona:PostalAddress"/>
 *     &lt;enumeration value="persona:Bodies"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "UnindexedFieldURIType")
@XmlEnum
public enum UnindexedFieldURIType {
    @XmlEnumValue("folder:FolderId")
    FOLDER_FOLDER_ID("folder:FolderId"),
    @XmlEnumValue("folder:ParentFolderId")
    FOLDER_PARENT_FOLDER_ID("folder:ParentFolderId"),
    @XmlEnumValue("folder:DisplayName")
    FOLDER_DISPLAY_NAME("folder:DisplayName"),
    @XmlEnumValue("folder:UnreadCount")
    FOLDER_UNREAD_COUNT("folder:UnreadCount"),
    @XmlEnumValue("folder:TotalCount")
    FOLDER_TOTAL_COUNT("folder:TotalCount"),
    @XmlEnumValue("folder:ChildFolderCount")
    FOLDER_CHILD_FOLDER_COUNT("folder:ChildFolderCount"),
    @XmlEnumValue("folder:FolderClass")
    FOLDER_FOLDER_CLASS("folder:FolderClass"),
    @XmlEnumValue("folder:SearchParameters")
    FOLDER_SEARCH_PARAMETERS("folder:SearchParameters"),
    @XmlEnumValue("folder:ManagedFolderInformation")
    FOLDER_MANAGED_FOLDER_INFORMATION("folder:ManagedFolderInformation"),
    @XmlEnumValue("folder:PermissionSet")
    FOLDER_PERMISSION_SET("folder:PermissionSet"),
    @XmlEnumValue("folder:EffectiveRights")
    FOLDER_EFFECTIVE_RIGHTS("folder:EffectiveRights"),
    @XmlEnumValue("folder:SharingEffectiveRights")
    FOLDER_SHARING_EFFECTIVE_RIGHTS("folder:SharingEffectiveRights"),
    @XmlEnumValue("folder:DistinguishedFolderId")
    FOLDER_DISTINGUISHED_FOLDER_ID("folder:DistinguishedFolderId"),
    @XmlEnumValue("folder:PolicyTag")
    FOLDER_POLICY_TAG("folder:PolicyTag"),
    @XmlEnumValue("folder:ArchiveTag")
    FOLDER_ARCHIVE_TAG("folder:ArchiveTag"),
    @XmlEnumValue("item:ItemId")
    ITEM_ITEM_ID("item:ItemId"),
    @XmlEnumValue("item:ParentFolderId")
    ITEM_PARENT_FOLDER_ID("item:ParentFolderId"),
    @XmlEnumValue("item:ItemClass")
    ITEM_ITEM_CLASS("item:ItemClass"),
    @XmlEnumValue("item:MimeContent")
    ITEM_MIME_CONTENT("item:MimeContent"),
    @XmlEnumValue("item:Attachments")
    ITEM_ATTACHMENTS("item:Attachments"),
    @XmlEnumValue("item:Subject")
    ITEM_SUBJECT("item:Subject"),
    @XmlEnumValue("item:DateTimeReceived")
    ITEM_DATE_TIME_RECEIVED("item:DateTimeReceived"),
    @XmlEnumValue("item:Size")
    ITEM_SIZE("item:Size"),
    @XmlEnumValue("item:Categories")
    ITEM_CATEGORIES("item:Categories"),
    @XmlEnumValue("item:HasAttachments")
    ITEM_HAS_ATTACHMENTS("item:HasAttachments"),
    @XmlEnumValue("item:Importance")
    ITEM_IMPORTANCE("item:Importance"),
    @XmlEnumValue("item:InReplyTo")
    ITEM_IN_REPLY_TO("item:InReplyTo"),
    @XmlEnumValue("item:InternetMessageHeaders")
    ITEM_INTERNET_MESSAGE_HEADERS("item:InternetMessageHeaders"),
    @XmlEnumValue("item:IsAssociated")
    ITEM_IS_ASSOCIATED("item:IsAssociated"),
    @XmlEnumValue("item:IsDraft")
    ITEM_IS_DRAFT("item:IsDraft"),
    @XmlEnumValue("item:IsFromMe")
    ITEM_IS_FROM_ME("item:IsFromMe"),
    @XmlEnumValue("item:IsResend")
    ITEM_IS_RESEND("item:IsResend"),
    @XmlEnumValue("item:IsSubmitted")
    ITEM_IS_SUBMITTED("item:IsSubmitted"),
    @XmlEnumValue("item:IsUnmodified")
    ITEM_IS_UNMODIFIED("item:IsUnmodified"),
    @XmlEnumValue("item:DateTimeSent")
    ITEM_DATE_TIME_SENT("item:DateTimeSent"),
    @XmlEnumValue("item:DateTimeCreated")
    ITEM_DATE_TIME_CREATED("item:DateTimeCreated"),
    @XmlEnumValue("item:Body")
    ITEM_BODY("item:Body"),
    @XmlEnumValue("item:ResponseObjects")
    ITEM_RESPONSE_OBJECTS("item:ResponseObjects"),
    @XmlEnumValue("item:Sensitivity")
    ITEM_SENSITIVITY("item:Sensitivity"),
    @XmlEnumValue("item:ReminderDueBy")
    ITEM_REMINDER_DUE_BY("item:ReminderDueBy"),
    @XmlEnumValue("item:ReminderIsSet")
    ITEM_REMINDER_IS_SET("item:ReminderIsSet"),
    @XmlEnumValue("item:ReminderNextTime")
    ITEM_REMINDER_NEXT_TIME("item:ReminderNextTime"),
    @XmlEnumValue("item:ReminderMinutesBeforeStart")
    ITEM_REMINDER_MINUTES_BEFORE_START("item:ReminderMinutesBeforeStart"),
    @XmlEnumValue("item:DisplayTo")
    ITEM_DISPLAY_TO("item:DisplayTo"),
    @XmlEnumValue("item:DisplayCc")
    ITEM_DISPLAY_CC("item:DisplayCc"),
    @XmlEnumValue("item:Culture")
    ITEM_CULTURE("item:Culture"),
    @XmlEnumValue("item:EffectiveRights")
    ITEM_EFFECTIVE_RIGHTS("item:EffectiveRights"),
    @XmlEnumValue("item:LastModifiedName")
    ITEM_LAST_MODIFIED_NAME("item:LastModifiedName"),
    @XmlEnumValue("item:LastModifiedTime")
    ITEM_LAST_MODIFIED_TIME("item:LastModifiedTime"),
    @XmlEnumValue("item:ConversationId")
    ITEM_CONVERSATION_ID("item:ConversationId"),
    @XmlEnumValue("item:UniqueBody")
    ITEM_UNIQUE_BODY("item:UniqueBody"),
    @XmlEnumValue("item:Flag")
    ITEM_FLAG("item:Flag"),
    @XmlEnumValue("item:StoreEntryId")
    ITEM_STORE_ENTRY_ID("item:StoreEntryId"),
    @XmlEnumValue("item:InstanceKey")
    ITEM_INSTANCE_KEY("item:InstanceKey"),
    @XmlEnumValue("item:NormalizedBody")
    ITEM_NORMALIZED_BODY("item:NormalizedBody"),
    @XmlEnumValue("item:EntityExtractionResult")
    ITEM_ENTITY_EXTRACTION_RESULT("item:EntityExtractionResult"),
    @XmlEnumValue("item:PolicyTag")
    ITEM_POLICY_TAG("item:PolicyTag"),
    @XmlEnumValue("item:ArchiveTag")
    ITEM_ARCHIVE_TAG("item:ArchiveTag"),
    @XmlEnumValue("item:RetentionDate")
    ITEM_RETENTION_DATE("item:RetentionDate"),
    @XmlEnumValue("item:Preview")
    ITEM_PREVIEW("item:Preview"),
    @XmlEnumValue("item:NextPredictedAction")
    ITEM_NEXT_PREDICTED_ACTION("item:NextPredictedAction"),
    @XmlEnumValue("item:GroupingAction")
    ITEM_GROUPING_ACTION("item:GroupingAction"),
    @XmlEnumValue("item:PredictedActionReasons")
    ITEM_PREDICTED_ACTION_REASONS("item:PredictedActionReasons"),
    @XmlEnumValue("item:IsClutter")
    ITEM_IS_CLUTTER("item:IsClutter"),
    @XmlEnumValue("item:RightsManagementLicenseData")
    ITEM_RIGHTS_MANAGEMENT_LICENSE_DATA("item:RightsManagementLicenseData"),
    @XmlEnumValue("item:BlockStatus")
    ITEM_BLOCK_STATUS("item:BlockStatus"),
    @XmlEnumValue("item:HasBlockedImages")
    ITEM_HAS_BLOCKED_IMAGES("item:HasBlockedImages"),
    @XmlEnumValue("item:WebClientReadFormQueryString")
    ITEM_WEB_CLIENT_READ_FORM_QUERY_STRING("item:WebClientReadFormQueryString"),
    @XmlEnumValue("item:WebClientEditFormQueryString")
    ITEM_WEB_CLIENT_EDIT_FORM_QUERY_STRING("item:WebClientEditFormQueryString"),
    @XmlEnumValue("item:TextBody")
    ITEM_TEXT_BODY("item:TextBody"),
    @XmlEnumValue("item:IconIndex")
    ITEM_ICON_INDEX("item:IconIndex"),
    @XmlEnumValue("message:ConversationIndex")
    MESSAGE_CONVERSATION_INDEX("message:ConversationIndex"),
    @XmlEnumValue("message:ConversationTopic")
    MESSAGE_CONVERSATION_TOPIC("message:ConversationTopic"),
    @XmlEnumValue("message:InternetMessageId")
    MESSAGE_INTERNET_MESSAGE_ID("message:InternetMessageId"),
    @XmlEnumValue("message:IsRead")
    MESSAGE_IS_READ("message:IsRead"),
    @XmlEnumValue("message:IsResponseRequested")
    MESSAGE_IS_RESPONSE_REQUESTED("message:IsResponseRequested"),
    @XmlEnumValue("message:IsReadReceiptRequested")
    MESSAGE_IS_READ_RECEIPT_REQUESTED("message:IsReadReceiptRequested"),
    @XmlEnumValue("message:IsDeliveryReceiptRequested")
    MESSAGE_IS_DELIVERY_RECEIPT_REQUESTED("message:IsDeliveryReceiptRequested"),
    @XmlEnumValue("message:ReceivedBy")
    MESSAGE_RECEIVED_BY("message:ReceivedBy"),
    @XmlEnumValue("message:ReceivedRepresenting")
    MESSAGE_RECEIVED_REPRESENTING("message:ReceivedRepresenting"),
    @XmlEnumValue("message:References")
    MESSAGE_REFERENCES("message:References"),
    @XmlEnumValue("message:ReplyTo")
    MESSAGE_REPLY_TO("message:ReplyTo"),
    @XmlEnumValue("message:From")
    MESSAGE_FROM("message:From"),
    @XmlEnumValue("message:Sender")
    MESSAGE_SENDER("message:Sender"),
    @XmlEnumValue("message:ToRecipients")
    MESSAGE_TO_RECIPIENTS("message:ToRecipients"),
    @XmlEnumValue("message:CcRecipients")
    MESSAGE_CC_RECIPIENTS("message:CcRecipients"),
    @XmlEnumValue("message:BccRecipients")
    MESSAGE_BCC_RECIPIENTS("message:BccRecipients"),
    @XmlEnumValue("message:ApprovalRequestData")
    MESSAGE_APPROVAL_REQUEST_DATA("message:ApprovalRequestData"),
    @XmlEnumValue("message:VotingInformation")
    MESSAGE_VOTING_INFORMATION("message:VotingInformation"),
    @XmlEnumValue("meeting:AssociatedCalendarItemId")
    MEETING_ASSOCIATED_CALENDAR_ITEM_ID("meeting:AssociatedCalendarItemId"),
    @XmlEnumValue("meeting:IsDelegated")
    MEETING_IS_DELEGATED("meeting:IsDelegated"),
    @XmlEnumValue("meeting:IsOutOfDate")
    MEETING_IS_OUT_OF_DATE("meeting:IsOutOfDate"),
    @XmlEnumValue("meeting:HasBeenProcessed")
    MEETING_HAS_BEEN_PROCESSED("meeting:HasBeenProcessed"),
    @XmlEnumValue("meeting:ResponseType")
    MEETING_RESPONSE_TYPE("meeting:ResponseType"),
    @XmlEnumValue("meeting:ProposedStart")
    MEETING_PROPOSED_START("meeting:ProposedStart"),
    @XmlEnumValue("meeting:ProposedEnd")
    MEETING_PROPOSED_END("meeting:ProposedEnd"),
    @XmlEnumValue("meetingRequest:MeetingRequestType")
    MEETING_REQUEST_MEETING_REQUEST_TYPE("meetingRequest:MeetingRequestType"),
    @XmlEnumValue("meetingRequest:IntendedFreeBusyStatus")
    MEETING_REQUEST_INTENDED_FREE_BUSY_STATUS("meetingRequest:IntendedFreeBusyStatus"),
    @XmlEnumValue("meetingRequest:ChangeHighlights")
    MEETING_REQUEST_CHANGE_HIGHLIGHTS("meetingRequest:ChangeHighlights"),
    @XmlEnumValue("calendar:Start")
    CALENDAR_START("calendar:Start"),
    @XmlEnumValue("calendar:End")
    CALENDAR_END("calendar:End"),
    @XmlEnumValue("calendar:OriginalStart")
    CALENDAR_ORIGINAL_START("calendar:OriginalStart"),
    @XmlEnumValue("calendar:StartWallClock")
    CALENDAR_START_WALL_CLOCK("calendar:StartWallClock"),
    @XmlEnumValue("calendar:EndWallClock")
    CALENDAR_END_WALL_CLOCK("calendar:EndWallClock"),
    @XmlEnumValue("calendar:StartTimeZoneId")
    CALENDAR_START_TIME_ZONE_ID("calendar:StartTimeZoneId"),
    @XmlEnumValue("calendar:EndTimeZoneId")
    CALENDAR_END_TIME_ZONE_ID("calendar:EndTimeZoneId"),
    @XmlEnumValue("calendar:IsAllDayEvent")
    CALENDAR_IS_ALL_DAY_EVENT("calendar:IsAllDayEvent"),
    @XmlEnumValue("calendar:LegacyFreeBusyStatus")
    CALENDAR_LEGACY_FREE_BUSY_STATUS("calendar:LegacyFreeBusyStatus"),
    @XmlEnumValue("calendar:Location")
    CALENDAR_LOCATION("calendar:Location"),
    @XmlEnumValue("calendar:EnhancedLocation")
    CALENDAR_ENHANCED_LOCATION("calendar:EnhancedLocation"),
    @XmlEnumValue("calendar:When")
    CALENDAR_WHEN("calendar:When"),
    @XmlEnumValue("calendar:IsMeeting")
    CALENDAR_IS_MEETING("calendar:IsMeeting"),
    @XmlEnumValue("calendar:IsCancelled")
    CALENDAR_IS_CANCELLED("calendar:IsCancelled"),
    @XmlEnumValue("calendar:IsRecurring")
    CALENDAR_IS_RECURRING("calendar:IsRecurring"),
    @XmlEnumValue("calendar:MeetingRequestWasSent")
    CALENDAR_MEETING_REQUEST_WAS_SENT("calendar:MeetingRequestWasSent"),
    @XmlEnumValue("calendar:IsResponseRequested")
    CALENDAR_IS_RESPONSE_REQUESTED("calendar:IsResponseRequested"),
    @XmlEnumValue("calendar:CalendarItemType")
    CALENDAR_CALENDAR_ITEM_TYPE("calendar:CalendarItemType"),
    @XmlEnumValue("calendar:MyResponseType")
    CALENDAR_MY_RESPONSE_TYPE("calendar:MyResponseType"),
    @XmlEnumValue("calendar:Organizer")
    CALENDAR_ORGANIZER("calendar:Organizer"),
    @XmlEnumValue("calendar:RequiredAttendees")
    CALENDAR_REQUIRED_ATTENDEES("calendar:RequiredAttendees"),
    @XmlEnumValue("calendar:OptionalAttendees")
    CALENDAR_OPTIONAL_ATTENDEES("calendar:OptionalAttendees"),
    @XmlEnumValue("calendar:Resources")
    CALENDAR_RESOURCES("calendar:Resources"),
    @XmlEnumValue("calendar:ConflictingMeetingCount")
    CALENDAR_CONFLICTING_MEETING_COUNT("calendar:ConflictingMeetingCount"),
    @XmlEnumValue("calendar:AdjacentMeetingCount")
    CALENDAR_ADJACENT_MEETING_COUNT("calendar:AdjacentMeetingCount"),
    @XmlEnumValue("calendar:ConflictingMeetings")
    CALENDAR_CONFLICTING_MEETINGS("calendar:ConflictingMeetings"),
    @XmlEnumValue("calendar:AdjacentMeetings")
    CALENDAR_ADJACENT_MEETINGS("calendar:AdjacentMeetings"),
    @XmlEnumValue("calendar:Duration")
    CALENDAR_DURATION("calendar:Duration"),
    @XmlEnumValue("calendar:TimeZone")
    CALENDAR_TIME_ZONE("calendar:TimeZone"),
    @XmlEnumValue("calendar:AppointmentReplyTime")
    CALENDAR_APPOINTMENT_REPLY_TIME("calendar:AppointmentReplyTime"),
    @XmlEnumValue("calendar:AppointmentSequenceNumber")
    CALENDAR_APPOINTMENT_SEQUENCE_NUMBER("calendar:AppointmentSequenceNumber"),
    @XmlEnumValue("calendar:AppointmentState")
    CALENDAR_APPOINTMENT_STATE("calendar:AppointmentState"),
    @XmlEnumValue("calendar:Recurrence")
    CALENDAR_RECURRENCE("calendar:Recurrence"),
    @XmlEnumValue("calendar:FirstOccurrence")
    CALENDAR_FIRST_OCCURRENCE("calendar:FirstOccurrence"),
    @XmlEnumValue("calendar:LastOccurrence")
    CALENDAR_LAST_OCCURRENCE("calendar:LastOccurrence"),
    @XmlEnumValue("calendar:ModifiedOccurrences")
    CALENDAR_MODIFIED_OCCURRENCES("calendar:ModifiedOccurrences"),
    @XmlEnumValue("calendar:DeletedOccurrences")
    CALENDAR_DELETED_OCCURRENCES("calendar:DeletedOccurrences"),
    @XmlEnumValue("calendar:MeetingTimeZone")
    CALENDAR_MEETING_TIME_ZONE("calendar:MeetingTimeZone"),
    @XmlEnumValue("calendar:ConferenceType")
    CALENDAR_CONFERENCE_TYPE("calendar:ConferenceType"),
    @XmlEnumValue("calendar:AllowNewTimeProposal")
    CALENDAR_ALLOW_NEW_TIME_PROPOSAL("calendar:AllowNewTimeProposal"),
    @XmlEnumValue("calendar:IsOnlineMeeting")
    CALENDAR_IS_ONLINE_MEETING("calendar:IsOnlineMeeting"),
    @XmlEnumValue("calendar:MeetingWorkspaceUrl")
    CALENDAR_MEETING_WORKSPACE_URL("calendar:MeetingWorkspaceUrl"),
    @XmlEnumValue("calendar:NetShowUrl")
    CALENDAR_NET_SHOW_URL("calendar:NetShowUrl"),
    @XmlEnumValue("calendar:UID")
    CALENDAR_UID("calendar:UID"),
    @XmlEnumValue("calendar:RecurrenceId")
    CALENDAR_RECURRENCE_ID("calendar:RecurrenceId"),
    @XmlEnumValue("calendar:DateTimeStamp")
    CALENDAR_DATE_TIME_STAMP("calendar:DateTimeStamp"),
    @XmlEnumValue("calendar:StartTimeZone")
    CALENDAR_START_TIME_ZONE("calendar:StartTimeZone"),
    @XmlEnumValue("calendar:EndTimeZone")
    CALENDAR_END_TIME_ZONE("calendar:EndTimeZone"),
    @XmlEnumValue("calendar:JoinOnlineMeetingUrl")
    CALENDAR_JOIN_ONLINE_MEETING_URL("calendar:JoinOnlineMeetingUrl"),
    @XmlEnumValue("calendar:OnlineMeetingSettings")
    CALENDAR_ONLINE_MEETING_SETTINGS("calendar:OnlineMeetingSettings"),
    @XmlEnumValue("calendar:IsOrganizer")
    CALENDAR_IS_ORGANIZER("calendar:IsOrganizer"),
    @XmlEnumValue("task:ActualWork")
    TASK_ACTUAL_WORK("task:ActualWork"),
    @XmlEnumValue("task:AssignedTime")
    TASK_ASSIGNED_TIME("task:AssignedTime"),
    @XmlEnumValue("task:BillingInformation")
    TASK_BILLING_INFORMATION("task:BillingInformation"),
    @XmlEnumValue("task:ChangeCount")
    TASK_CHANGE_COUNT("task:ChangeCount"),
    @XmlEnumValue("task:Companies")
    TASK_COMPANIES("task:Companies"),
    @XmlEnumValue("task:CompleteDate")
    TASK_COMPLETE_DATE("task:CompleteDate"),
    @XmlEnumValue("task:Contacts")
    TASK_CONTACTS("task:Contacts"),
    @XmlEnumValue("task:DelegationState")
    TASK_DELEGATION_STATE("task:DelegationState"),
    @XmlEnumValue("task:Delegator")
    TASK_DELEGATOR("task:Delegator"),
    @XmlEnumValue("task:DueDate")
    TASK_DUE_DATE("task:DueDate"),
    @XmlEnumValue("task:IsAssignmentEditable")
    TASK_IS_ASSIGNMENT_EDITABLE("task:IsAssignmentEditable"),
    @XmlEnumValue("task:IsComplete")
    TASK_IS_COMPLETE("task:IsComplete"),
    @XmlEnumValue("task:IsRecurring")
    TASK_IS_RECURRING("task:IsRecurring"),
    @XmlEnumValue("task:IsTeamTask")
    TASK_IS_TEAM_TASK("task:IsTeamTask"),
    @XmlEnumValue("task:Mileage")
    TASK_MILEAGE("task:Mileage"),
    @XmlEnumValue("task:Owner")
    TASK_OWNER("task:Owner"),
    @XmlEnumValue("task:PercentComplete")
    TASK_PERCENT_COMPLETE("task:PercentComplete"),
    @XmlEnumValue("task:Recurrence")
    TASK_RECURRENCE("task:Recurrence"),
    @XmlEnumValue("task:StartDate")
    TASK_START_DATE("task:StartDate"),
    @XmlEnumValue("task:Status")
    TASK_STATUS("task:Status"),
    @XmlEnumValue("task:StatusDescription")
    TASK_STATUS_DESCRIPTION("task:StatusDescription"),
    @XmlEnumValue("task:TotalWork")
    TASK_TOTAL_WORK("task:TotalWork"),
    @XmlEnumValue("contacts:Alias")
    CONTACTS_ALIAS("contacts:Alias"),
    @XmlEnumValue("contacts:AssistantName")
    CONTACTS_ASSISTANT_NAME("contacts:AssistantName"),
    @XmlEnumValue("contacts:Birthday")
    CONTACTS_BIRTHDAY("contacts:Birthday"),
    @XmlEnumValue("contacts:BusinessHomePage")
    CONTACTS_BUSINESS_HOME_PAGE("contacts:BusinessHomePage"),
    @XmlEnumValue("contacts:Children")
    CONTACTS_CHILDREN("contacts:Children"),
    @XmlEnumValue("contacts:Companies")
    CONTACTS_COMPANIES("contacts:Companies"),
    @XmlEnumValue("contacts:CompanyName")
    CONTACTS_COMPANY_NAME("contacts:CompanyName"),
    @XmlEnumValue("contacts:CompleteName")
    CONTACTS_COMPLETE_NAME("contacts:CompleteName"),
    @XmlEnumValue("contacts:ContactSource")
    CONTACTS_CONTACT_SOURCE("contacts:ContactSource"),
    @XmlEnumValue("contacts:Culture")
    CONTACTS_CULTURE("contacts:Culture"),
    @XmlEnumValue("contacts:Department")
    CONTACTS_DEPARTMENT("contacts:Department"),
    @XmlEnumValue("contacts:DisplayName")
    CONTACTS_DISPLAY_NAME("contacts:DisplayName"),
    @XmlEnumValue("contacts:DirectoryId")
    CONTACTS_DIRECTORY_ID("contacts:DirectoryId"),
    @XmlEnumValue("contacts:DirectReports")
    CONTACTS_DIRECT_REPORTS("contacts:DirectReports"),
    @XmlEnumValue("contacts:EmailAddresses")
    CONTACTS_EMAIL_ADDRESSES("contacts:EmailAddresses"),
    @XmlEnumValue("contacts:FileAs")
    CONTACTS_FILE_AS("contacts:FileAs"),
    @XmlEnumValue("contacts:FileAsMapping")
    CONTACTS_FILE_AS_MAPPING("contacts:FileAsMapping"),
    @XmlEnumValue("contacts:Generation")
    CONTACTS_GENERATION("contacts:Generation"),
    @XmlEnumValue("contacts:GivenName")
    CONTACTS_GIVEN_NAME("contacts:GivenName"),
    @XmlEnumValue("contacts:ImAddresses")
    CONTACTS_IM_ADDRESSES("contacts:ImAddresses"),
    @XmlEnumValue("contacts:Initials")
    CONTACTS_INITIALS("contacts:Initials"),
    @XmlEnumValue("contacts:JobTitle")
    CONTACTS_JOB_TITLE("contacts:JobTitle"),
    @XmlEnumValue("contacts:Manager")
    CONTACTS_MANAGER("contacts:Manager"),
    @XmlEnumValue("contacts:ManagerMailbox")
    CONTACTS_MANAGER_MAILBOX("contacts:ManagerMailbox"),
    @XmlEnumValue("contacts:MiddleName")
    CONTACTS_MIDDLE_NAME("contacts:MiddleName"),
    @XmlEnumValue("contacts:Mileage")
    CONTACTS_MILEAGE("contacts:Mileage"),
    @XmlEnumValue("contacts:MSExchangeCertificate")
    CONTACTS_MS_EXCHANGE_CERTIFICATE("contacts:MSExchangeCertificate"),
    @XmlEnumValue("contacts:Nickname")
    CONTACTS_NICKNAME("contacts:Nickname"),
    @XmlEnumValue("contacts:Notes")
    CONTACTS_NOTES("contacts:Notes"),
    @XmlEnumValue("contacts:OfficeLocation")
    CONTACTS_OFFICE_LOCATION("contacts:OfficeLocation"),
    @XmlEnumValue("contacts:PhoneNumbers")
    CONTACTS_PHONE_NUMBERS("contacts:PhoneNumbers"),
    @XmlEnumValue("contacts:PhoneticFullName")
    CONTACTS_PHONETIC_FULL_NAME("contacts:PhoneticFullName"),
    @XmlEnumValue("contacts:PhoneticFirstName")
    CONTACTS_PHONETIC_FIRST_NAME("contacts:PhoneticFirstName"),
    @XmlEnumValue("contacts:PhoneticLastName")
    CONTACTS_PHONETIC_LAST_NAME("contacts:PhoneticLastName"),
    @XmlEnumValue("contacts:Photo")
    CONTACTS_PHOTO("contacts:Photo"),
    @XmlEnumValue("contacts:PhysicalAddresses")
    CONTACTS_PHYSICAL_ADDRESSES("contacts:PhysicalAddresses"),
    @XmlEnumValue("contacts:PostalAddressIndex")
    CONTACTS_POSTAL_ADDRESS_INDEX("contacts:PostalAddressIndex"),
    @XmlEnumValue("contacts:Profession")
    CONTACTS_PROFESSION("contacts:Profession"),
    @XmlEnumValue("contacts:SpouseName")
    CONTACTS_SPOUSE_NAME("contacts:SpouseName"),
    @XmlEnumValue("contacts:Surname")
    CONTACTS_SURNAME("contacts:Surname"),
    @XmlEnumValue("contacts:WeddingAnniversary")
    CONTACTS_WEDDING_ANNIVERSARY("contacts:WeddingAnniversary"),
    @XmlEnumValue("contacts:UserSMIMECertificate")
    CONTACTS_USER_SMIME_CERTIFICATE("contacts:UserSMIMECertificate"),
    @XmlEnumValue("contacts:HasPicture")
    CONTACTS_HAS_PICTURE("contacts:HasPicture"),
    @XmlEnumValue("distributionlist:Members")
    DISTRIBUTIONLIST_MEMBERS("distributionlist:Members"),
    @XmlEnumValue("postitem:PostedTime")
    POSTITEM_POSTED_TIME("postitem:PostedTime"),
    @XmlEnumValue("conversation:ConversationId")
    CONVERSATION_CONVERSATION_ID("conversation:ConversationId"),
    @XmlEnumValue("conversation:ConversationTopic")
    CONVERSATION_CONVERSATION_TOPIC("conversation:ConversationTopic"),
    @XmlEnumValue("conversation:UniqueRecipients")
    CONVERSATION_UNIQUE_RECIPIENTS("conversation:UniqueRecipients"),
    @XmlEnumValue("conversation:GlobalUniqueRecipients")
    CONVERSATION_GLOBAL_UNIQUE_RECIPIENTS("conversation:GlobalUniqueRecipients"),
    @XmlEnumValue("conversation:UniqueUnreadSenders")
    CONVERSATION_UNIQUE_UNREAD_SENDERS("conversation:UniqueUnreadSenders"),
    @XmlEnumValue("conversation:GlobalUniqueUnreadSenders")
    CONVERSATION_GLOBAL_UNIQUE_UNREAD_SENDERS("conversation:GlobalUniqueUnreadSenders"),
    @XmlEnumValue("conversation:UniqueSenders")
    CONVERSATION_UNIQUE_SENDERS("conversation:UniqueSenders"),
    @XmlEnumValue("conversation:GlobalUniqueSenders")
    CONVERSATION_GLOBAL_UNIQUE_SENDERS("conversation:GlobalUniqueSenders"),
    @XmlEnumValue("conversation:LastDeliveryTime")
    CONVERSATION_LAST_DELIVERY_TIME("conversation:LastDeliveryTime"),
    @XmlEnumValue("conversation:GlobalLastDeliveryTime")
    CONVERSATION_GLOBAL_LAST_DELIVERY_TIME("conversation:GlobalLastDeliveryTime"),
    @XmlEnumValue("conversation:Categories")
    CONVERSATION_CATEGORIES("conversation:Categories"),
    @XmlEnumValue("conversation:GlobalCategories")
    CONVERSATION_GLOBAL_CATEGORIES("conversation:GlobalCategories"),
    @XmlEnumValue("conversation:FlagStatus")
    CONVERSATION_FLAG_STATUS("conversation:FlagStatus"),
    @XmlEnumValue("conversation:GlobalFlagStatus")
    CONVERSATION_GLOBAL_FLAG_STATUS("conversation:GlobalFlagStatus"),
    @XmlEnumValue("conversation:HasAttachments")
    CONVERSATION_HAS_ATTACHMENTS("conversation:HasAttachments"),
    @XmlEnumValue("conversation:GlobalHasAttachments")
    CONVERSATION_GLOBAL_HAS_ATTACHMENTS("conversation:GlobalHasAttachments"),
    @XmlEnumValue("conversation:HasIrm")
    CONVERSATION_HAS_IRM("conversation:HasIrm"),
    @XmlEnumValue("conversation:GlobalHasIrm")
    CONVERSATION_GLOBAL_HAS_IRM("conversation:GlobalHasIrm"),
    @XmlEnumValue("conversation:MessageCount")
    CONVERSATION_MESSAGE_COUNT("conversation:MessageCount"),
    @XmlEnumValue("conversation:GlobalMessageCount")
    CONVERSATION_GLOBAL_MESSAGE_COUNT("conversation:GlobalMessageCount"),
    @XmlEnumValue("conversation:UnreadCount")
    CONVERSATION_UNREAD_COUNT("conversation:UnreadCount"),
    @XmlEnumValue("conversation:GlobalUnreadCount")
    CONVERSATION_GLOBAL_UNREAD_COUNT("conversation:GlobalUnreadCount"),
    @XmlEnumValue("conversation:Size")
    CONVERSATION_SIZE("conversation:Size"),
    @XmlEnumValue("conversation:GlobalSize")
    CONVERSATION_GLOBAL_SIZE("conversation:GlobalSize"),
    @XmlEnumValue("conversation:ItemClasses")
    CONVERSATION_ITEM_CLASSES("conversation:ItemClasses"),
    @XmlEnumValue("conversation:GlobalItemClasses")
    CONVERSATION_GLOBAL_ITEM_CLASSES("conversation:GlobalItemClasses"),
    @XmlEnumValue("conversation:Importance")
    CONVERSATION_IMPORTANCE("conversation:Importance"),
    @XmlEnumValue("conversation:GlobalImportance")
    CONVERSATION_GLOBAL_IMPORTANCE("conversation:GlobalImportance"),
    @XmlEnumValue("conversation:ItemIds")
    CONVERSATION_ITEM_IDS("conversation:ItemIds"),
    @XmlEnumValue("conversation:GlobalItemIds")
    CONVERSATION_GLOBAL_ITEM_IDS("conversation:GlobalItemIds"),
    @XmlEnumValue("conversation:LastModifiedTime")
    CONVERSATION_LAST_MODIFIED_TIME("conversation:LastModifiedTime"),
    @XmlEnumValue("conversation:InstanceKey")
    CONVERSATION_INSTANCE_KEY("conversation:InstanceKey"),
    @XmlEnumValue("conversation:Preview")
    CONVERSATION_PREVIEW("conversation:Preview"),
    @XmlEnumValue("conversation:NextPredictedAction")
    CONVERSATION_NEXT_PREDICTED_ACTION("conversation:NextPredictedAction"),
    @XmlEnumValue("conversation:GroupingAction")
    CONVERSATION_GROUPING_ACTION("conversation:GroupingAction"),
    @XmlEnumValue("conversation:IconIndex")
    CONVERSATION_ICON_INDEX("conversation:IconIndex"),
    @XmlEnumValue("conversation:GlobalIconIndex")
    CONVERSATION_GLOBAL_ICON_INDEX("conversation:GlobalIconIndex"),
    @XmlEnumValue("conversation:DraftItemIds")
    CONVERSATION_DRAFT_ITEM_IDS("conversation:DraftItemIds"),
    @XmlEnumValue("conversation:HasClutter")
    CONVERSATION_HAS_CLUTTER("conversation:HasClutter"),
    @XmlEnumValue("persona:PersonaId")
    PERSONA_PERSONA_ID("persona:PersonaId"),
    @XmlEnumValue("persona:PersonaType")
    PERSONA_PERSONA_TYPE("persona:PersonaType"),
    @XmlEnumValue("persona:GivenName")
    PERSONA_GIVEN_NAME("persona:GivenName"),
    @XmlEnumValue("persona:CompanyName")
    PERSONA_COMPANY_NAME("persona:CompanyName"),
    @XmlEnumValue("persona:Surname")
    PERSONA_SURNAME("persona:Surname"),
    @XmlEnumValue("persona:DisplayName")
    PERSONA_DISPLAY_NAME("persona:DisplayName"),
    @XmlEnumValue("persona:EmailAddress")
    PERSONA_EMAIL_ADDRESS("persona:EmailAddress"),
    @XmlEnumValue("persona:FileAs")
    PERSONA_FILE_AS("persona:FileAs"),
    @XmlEnumValue("persona:HomeCity")
    PERSONA_HOME_CITY("persona:HomeCity"),
    @XmlEnumValue("persona:CreationTime")
    PERSONA_CREATION_TIME("persona:CreationTime"),
    @XmlEnumValue("persona:RelevanceScore")
    PERSONA_RELEVANCE_SCORE("persona:RelevanceScore"),
    @XmlEnumValue("persona:WorkCity")
    PERSONA_WORK_CITY("persona:WorkCity"),
    @XmlEnumValue("persona:PersonaObjectStatus")
    PERSONA_PERSONA_OBJECT_STATUS("persona:PersonaObjectStatus"),
    @XmlEnumValue("persona:FileAsId")
    PERSONA_FILE_AS_ID("persona:FileAsId"),
    @XmlEnumValue("persona:DisplayNamePrefix")
    PERSONA_DISPLAY_NAME_PREFIX("persona:DisplayNamePrefix"),
    @XmlEnumValue("persona:YomiCompanyName")
    PERSONA_YOMI_COMPANY_NAME("persona:YomiCompanyName"),
    @XmlEnumValue("persona:YomiFirstName")
    PERSONA_YOMI_FIRST_NAME("persona:YomiFirstName"),
    @XmlEnumValue("persona:YomiLastName")
    PERSONA_YOMI_LAST_NAME("persona:YomiLastName"),
    @XmlEnumValue("persona:Title")
    PERSONA_TITLE("persona:Title"),
    @XmlEnumValue("persona:EmailAddresses")
    PERSONA_EMAIL_ADDRESSES("persona:EmailAddresses"),
    @XmlEnumValue("persona:PhoneNumber")
    PERSONA_PHONE_NUMBER("persona:PhoneNumber"),
    @XmlEnumValue("persona:ImAddress")
    PERSONA_IM_ADDRESS("persona:ImAddress"),
    @XmlEnumValue("persona:ImAddresses")
    PERSONA_IM_ADDRESSES("persona:ImAddresses"),
    @XmlEnumValue("persona:ImAddresses2")
    PERSONA_IM_ADDRESSES_2("persona:ImAddresses2"),
    @XmlEnumValue("persona:ImAddresses3")
    PERSONA_IM_ADDRESSES_3("persona:ImAddresses3"),
    @XmlEnumValue("persona:FolderIds")
    PERSONA_FOLDER_IDS("persona:FolderIds"),
    @XmlEnumValue("persona:Attributions")
    PERSONA_ATTRIBUTIONS("persona:Attributions"),
    @XmlEnumValue("persona:DisplayNames")
    PERSONA_DISPLAY_NAMES("persona:DisplayNames"),
    @XmlEnumValue("persona:Initials")
    PERSONA_INITIALS("persona:Initials"),
    @XmlEnumValue("persona:FileAses")
    PERSONA_FILE_ASES("persona:FileAses"),
    @XmlEnumValue("persona:FileAsIds")
    PERSONA_FILE_AS_IDS("persona:FileAsIds"),
    @XmlEnumValue("persona:DisplayNamePrefixes")
    PERSONA_DISPLAY_NAME_PREFIXES("persona:DisplayNamePrefixes"),
    @XmlEnumValue("persona:GivenNames")
    PERSONA_GIVEN_NAMES("persona:GivenNames"),
    @XmlEnumValue("persona:MiddleNames")
    PERSONA_MIDDLE_NAMES("persona:MiddleNames"),
    @XmlEnumValue("persona:Surnames")
    PERSONA_SURNAMES("persona:Surnames"),
    @XmlEnumValue("persona:Generations")
    PERSONA_GENERATIONS("persona:Generations"),
    @XmlEnumValue("persona:Nicknames")
    PERSONA_NICKNAMES("persona:Nicknames"),
    @XmlEnumValue("persona:YomiCompanyNames")
    PERSONA_YOMI_COMPANY_NAMES("persona:YomiCompanyNames"),
    @XmlEnumValue("persona:YomiFirstNames")
    PERSONA_YOMI_FIRST_NAMES("persona:YomiFirstNames"),
    @XmlEnumValue("persona:YomiLastNames")
    PERSONA_YOMI_LAST_NAMES("persona:YomiLastNames"),
    @XmlEnumValue("persona:BusinessPhoneNumbers")
    PERSONA_BUSINESS_PHONE_NUMBERS("persona:BusinessPhoneNumbers"),
    @XmlEnumValue("persona:BusinessPhoneNumbers2")
    PERSONA_BUSINESS_PHONE_NUMBERS_2("persona:BusinessPhoneNumbers2"),
    @XmlEnumValue("persona:HomePhones")
    PERSONA_HOME_PHONES("persona:HomePhones"),
    @XmlEnumValue("persona:HomePhones2")
    PERSONA_HOME_PHONES_2("persona:HomePhones2"),
    @XmlEnumValue("persona:MobilePhones")
    PERSONA_MOBILE_PHONES("persona:MobilePhones"),
    @XmlEnumValue("persona:MobilePhones2")
    PERSONA_MOBILE_PHONES_2("persona:MobilePhones2"),
    @XmlEnumValue("persona:AssistantPhoneNumbers")
    PERSONA_ASSISTANT_PHONE_NUMBERS("persona:AssistantPhoneNumbers"),
    @XmlEnumValue("persona:CallbackPhones")
    PERSONA_CALLBACK_PHONES("persona:CallbackPhones"),
    @XmlEnumValue("persona:CarPhones")
    PERSONA_CAR_PHONES("persona:CarPhones"),
    @XmlEnumValue("persona:HomeFaxes")
    PERSONA_HOME_FAXES("persona:HomeFaxes"),
    @XmlEnumValue("persona:OrganizationMainPhones")
    PERSONA_ORGANIZATION_MAIN_PHONES("persona:OrganizationMainPhones"),
    @XmlEnumValue("persona:OtherFaxes")
    PERSONA_OTHER_FAXES("persona:OtherFaxes"),
    @XmlEnumValue("persona:OtherTelephones")
    PERSONA_OTHER_TELEPHONES("persona:OtherTelephones"),
    @XmlEnumValue("persona:OtherPhones2")
    PERSONA_OTHER_PHONES_2("persona:OtherPhones2"),
    @XmlEnumValue("persona:Pagers")
    PERSONA_PAGERS("persona:Pagers"),
    @XmlEnumValue("persona:RadioPhones")
    PERSONA_RADIO_PHONES("persona:RadioPhones"),
    @XmlEnumValue("persona:TelexNumbers")
    PERSONA_TELEX_NUMBERS("persona:TelexNumbers"),
    @XmlEnumValue("persona:WorkFaxes")
    PERSONA_WORK_FAXES("persona:WorkFaxes"),
    @XmlEnumValue("persona:Emails1")
    PERSONA_EMAILS_1("persona:Emails1"),
    @XmlEnumValue("persona:Emails2")
    PERSONA_EMAILS_2("persona:Emails2"),
    @XmlEnumValue("persona:Emails3")
    PERSONA_EMAILS_3("persona:Emails3"),
    @XmlEnumValue("persona:BusinessHomePages")
    PERSONA_BUSINESS_HOME_PAGES("persona:BusinessHomePages"),
    @XmlEnumValue("persona:School")
    PERSONA_SCHOOL("persona:School"),
    @XmlEnumValue("persona:PersonalHomePages")
    PERSONA_PERSONAL_HOME_PAGES("persona:PersonalHomePages"),
    @XmlEnumValue("persona:OfficeLocations")
    PERSONA_OFFICE_LOCATIONS("persona:OfficeLocations"),
    @XmlEnumValue("persona:BusinessAddresses")
    PERSONA_BUSINESS_ADDRESSES("persona:BusinessAddresses"),
    @XmlEnumValue("persona:HomeAddresses")
    PERSONA_HOME_ADDRESSES("persona:HomeAddresses"),
    @XmlEnumValue("persona:OtherAddresses")
    PERSONA_OTHER_ADDRESSES("persona:OtherAddresses"),
    @XmlEnumValue("persona:Titles")
    PERSONA_TITLES("persona:Titles"),
    @XmlEnumValue("persona:Departments")
    PERSONA_DEPARTMENTS("persona:Departments"),
    @XmlEnumValue("persona:CompanyNames")
    PERSONA_COMPANY_NAMES("persona:CompanyNames"),
    @XmlEnumValue("persona:Managers")
    PERSONA_MANAGERS("persona:Managers"),
    @XmlEnumValue("persona:AssistantNames")
    PERSONA_ASSISTANT_NAMES("persona:AssistantNames"),
    @XmlEnumValue("persona:Professions")
    PERSONA_PROFESSIONS("persona:Professions"),
    @XmlEnumValue("persona:SpouseNames")
    PERSONA_SPOUSE_NAMES("persona:SpouseNames"),
    @XmlEnumValue("persona:Hobbies")
    PERSONA_HOBBIES("persona:Hobbies"),
    @XmlEnumValue("persona:WeddingAnniversaries")
    PERSONA_WEDDING_ANNIVERSARIES("persona:WeddingAnniversaries"),
    @XmlEnumValue("persona:Birthdays")
    PERSONA_BIRTHDAYS("persona:Birthdays"),
    @XmlEnumValue("persona:Children")
    PERSONA_CHILDREN("persona:Children"),
    @XmlEnumValue("persona:Locations")
    PERSONA_LOCATIONS("persona:Locations"),
    @XmlEnumValue("persona:ExtendedProperties")
    PERSONA_EXTENDED_PROPERTIES("persona:ExtendedProperties"),
    @XmlEnumValue("persona:PostalAddress")
    PERSONA_POSTAL_ADDRESS("persona:PostalAddress"),
    @XmlEnumValue("persona:Bodies")
    PERSONA_BODIES("persona:Bodies");
    private final String value;

    UnindexedFieldURIType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnindexedFieldURIType fromValue(String v) {
        for (UnindexedFieldURIType c : UnindexedFieldURIType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
