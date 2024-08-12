package com.microsoft.schemas.exchange.services._2006.messages;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ResponseCodeType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="ResponseCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoError"/>
 *     &lt;enumeration value="ErrorAccessDenied"/>
 *     &lt;enumeration value="ErrorAccessModeSpecified"/>
 *     &lt;enumeration value="ErrorAccountDisabled"/>
 *     &lt;enumeration value="ErrorAddDelegatesFailed"/>
 *     &lt;enumeration value="ErrorAddressSpaceNotFound"/>
 *     &lt;enumeration value="ErrorADOperation"/>
 *     &lt;enumeration value="ErrorADSessionFilter"/>
 *     &lt;enumeration value="ErrorADUnavailable"/>
 *     &lt;enumeration value="ErrorAutoDiscoverFailed"/>
 *     &lt;enumeration value="ErrorAffectedTaskOccurrencesRequired"/>
 *     &lt;enumeration value="ErrorAttachmentNestLevelLimitExceeded"/>
 *     &lt;enumeration value="ErrorAttachmentSizeLimitExceeded"/>
 *     &lt;enumeration value="ErrorArchiveFolderPathCreation"/>
 *     &lt;enumeration value="ErrorArchiveMailboxNotEnabled"/>
 *     &lt;enumeration value="ErrorArchiveMailboxServiceDiscoveryFailed"/>
 *     &lt;enumeration value="ErrorAvailabilityConfigNotFound"/>
 *     &lt;enumeration value="ErrorBatchProcessingStopped"/>
 *     &lt;enumeration value="ErrorCalendarCannotMoveOrCopyOccurrence"/>
 *     &lt;enumeration value="ErrorCalendarCannotUpdateDeletedItem"/>
 *     &lt;enumeration value="ErrorCalendarCannotUseIdForOccurrenceId"/>
 *     &lt;enumeration value="ErrorCalendarCannotUseIdForRecurringMasterId"/>
 *     &lt;enumeration value="ErrorCalendarDurationIsTooLong"/>
 *     &lt;enumeration value="ErrorCalendarEndDateIsEarlierThanStartDate"/>
 *     &lt;enumeration value="ErrorCalendarFolderIsInvalidForCalendarView"/>
 *     &lt;enumeration value="ErrorCalendarInvalidAttributeValue"/>
 *     &lt;enumeration value="ErrorCalendarInvalidDayForTimeChangePattern"/>
 *     &lt;enumeration value="ErrorCalendarInvalidDayForWeeklyRecurrence"/>
 *     &lt;enumeration value="ErrorCalendarInvalidPropertyState"/>
 *     &lt;enumeration value="ErrorCalendarInvalidPropertyValue"/>
 *     &lt;enumeration value="ErrorCalendarInvalidRecurrence"/>
 *     &lt;enumeration value="ErrorCalendarInvalidTimeZone"/>
 *     &lt;enumeration value="ErrorCalendarIsCancelledForAccept"/>
 *     &lt;enumeration value="ErrorCalendarIsCancelledForDecline"/>
 *     &lt;enumeration value="ErrorCalendarIsCancelledForRemove"/>
 *     &lt;enumeration value="ErrorCalendarIsCancelledForTentative"/>
 *     &lt;enumeration value="ErrorCalendarIsDelegatedForAccept"/>
 *     &lt;enumeration value="ErrorCalendarIsDelegatedForDecline"/>
 *     &lt;enumeration value="ErrorCalendarIsDelegatedForRemove"/>
 *     &lt;enumeration value="ErrorCalendarIsDelegatedForTentative"/>
 *     &lt;enumeration value="ErrorCalendarIsNotOrganizer"/>
 *     &lt;enumeration value="ErrorCalendarIsOrganizerForAccept"/>
 *     &lt;enumeration value="ErrorCalendarIsOrganizerForDecline"/>
 *     &lt;enumeration value="ErrorCalendarIsOrganizerForRemove"/>
 *     &lt;enumeration value="ErrorCalendarIsOrganizerForTentative"/>
 *     &lt;enumeration value="ErrorCalendarOccurrenceIndexIsOutOfRecurrenceRange"/>
 *     &lt;enumeration value="ErrorCalendarOccurrenceIsDeletedFromRecurrence"/>
 *     &lt;enumeration value="ErrorCalendarOutOfRange"/>
 *     &lt;enumeration value="ErrorCalendarMeetingRequestIsOutOfDate"/>
 *     &lt;enumeration value="ErrorCalendarViewRangeTooBig"/>
 *     &lt;enumeration value="ErrorCallerIsInvalidADAccount"/>
 *     &lt;enumeration value="ErrorCannotArchiveCalendarContactTaskFolderException"/>
 *     &lt;enumeration value="ErrorCannotArchiveItemsInPublicFolders"/>
 *     &lt;enumeration value="ErrorCannotArchiveItemsInArchiveMailbox"/>
 *     &lt;enumeration value="ErrorCannotCreateCalendarItemInNonCalendarFolder"/>
 *     &lt;enumeration value="ErrorCannotCreateContactInNonContactFolder"/>
 *     &lt;enumeration value="ErrorCannotCreatePostItemInNonMailFolder"/>
 *     &lt;enumeration value="ErrorCannotCreateTaskInNonTaskFolder"/>
 *     &lt;enumeration value="ErrorCannotDeleteObject"/>
 *     &lt;enumeration value="ErrorCannotDisableMandatoryExtension"/>
 *     &lt;enumeration value="ErrorCannotGetSourceFolderPath"/>
 *     &lt;enumeration value="ErrorCannotGetExternalEcpUrl"/>
 *     &lt;enumeration value="ErrorCannotOpenFileAttachment"/>
 *     &lt;enumeration value="ErrorCannotDeleteTaskOccurrence"/>
 *     &lt;enumeration value="ErrorCannotEmptyFolder"/>
 *     &lt;enumeration value="ErrorCannotSetCalendarPermissionOnNonCalendarFolder"/>
 *     &lt;enumeration value="ErrorCannotSetNonCalendarPermissionOnCalendarFolder"/>
 *     &lt;enumeration value="ErrorCannotSetPermissionUnknownEntries"/>
 *     &lt;enumeration value="ErrorCannotSpecifySearchFolderAsSourceFolder"/>
 *     &lt;enumeration value="ErrorCannotUseFolderIdForItemId"/>
 *     &lt;enumeration value="ErrorCannotUseItemIdForFolderId"/>
 *     &lt;enumeration value="ErrorChangeKeyRequired"/>
 *     &lt;enumeration value="ErrorChangeKeyRequiredForWriteOperations"/>
 *     &lt;enumeration value="ErrorClientDisconnected"/>
 *     &lt;enumeration value="ErrorClientIntentInvalidStateDefinition"/>
 *     &lt;enumeration value="ErrorClientIntentNotFound"/>
 *     &lt;enumeration value="ErrorConnectionFailed"/>
 *     &lt;enumeration value="ErrorContainsFilterWrongType"/>
 *     &lt;enumeration value="ErrorContentConversionFailed"/>
 *     &lt;enumeration value="ErrorContentIndexingNotEnabled"/>
 *     &lt;enumeration value="ErrorCorruptData"/>
 *     &lt;enumeration value="ErrorCreateItemAccessDenied"/>
 *     &lt;enumeration value="ErrorCreateManagedFolderPartialCompletion"/>
 *     &lt;enumeration value="ErrorCreateSubfolderAccessDenied"/>
 *     &lt;enumeration value="ErrorCrossMailboxMoveCopy"/>
 *     &lt;enumeration value="ErrorCrossSiteRequest"/>
 *     &lt;enumeration value="ErrorDataSizeLimitExceeded"/>
 *     &lt;enumeration value="ErrorDataSourceOperation"/>
 *     &lt;enumeration value="ErrorDelegateAlreadyExists"/>
 *     &lt;enumeration value="ErrorDelegateCannotAddOwner"/>
 *     &lt;enumeration value="ErrorDelegateMissingConfiguration"/>
 *     &lt;enumeration value="ErrorDelegateNoUser"/>
 *     &lt;enumeration value="ErrorDelegateValidationFailed"/>
 *     &lt;enumeration value="ErrorDeleteDistinguishedFolder"/>
 *     &lt;enumeration value="ErrorDeleteItemsFailed"/>
 *     &lt;enumeration value="ErrorDeleteUnifiedMessagingPromptFailed"/>
 *     &lt;enumeration value="ErrorDistinguishedUserNotSupported"/>
 *     &lt;enumeration value="ErrorDistributionListMemberNotExist"/>
 *     &lt;enumeration value="ErrorDuplicateInputFolderNames"/>
 *     &lt;enumeration value="ErrorDuplicateUserIdsSpecified"/>
 *     &lt;enumeration value="ErrorEmailAddressMismatch"/>
 *     &lt;enumeration value="ErrorEventNotFound"/>
 *     &lt;enumeration value="ErrorExceededConnectionCount"/>
 *     &lt;enumeration value="ErrorExceededSubscriptionCount"/>
 *     &lt;enumeration value="ErrorExceededFindCountLimit"/>
 *     &lt;enumeration value="ErrorExpiredSubscription"/>
 *     &lt;enumeration value="ErrorExtensionNotFound"/>
 *     &lt;enumeration value="ErrorFolderCorrupt"/>
 *     &lt;enumeration value="ErrorFolderNotFound"/>
 *     &lt;enumeration value="ErrorFolderPropertRequestFailed"/>
 *     &lt;enumeration value="ErrorFolderSave"/>
 *     &lt;enumeration value="ErrorFolderSaveFailed"/>
 *     &lt;enumeration value="ErrorFolderSavePropertyError"/>
 *     &lt;enumeration value="ErrorFolderExists"/>
 *     &lt;enumeration value="ErrorFreeBusyGenerationFailed"/>
 *     &lt;enumeration value="ErrorGetServerSecurityDescriptorFailed"/>
 *     &lt;enumeration value="ErrorImContactLimitReached"/>
 *     &lt;enumeration value="ErrorImGroupDisplayNameAlreadyExists"/>
 *     &lt;enumeration value="ErrorImGroupLimitReached"/>
 *     &lt;enumeration value="ErrorImpersonateUserDenied"/>
 *     &lt;enumeration value="ErrorImpersonationDenied"/>
 *     &lt;enumeration value="ErrorImpersonationFailed"/>
 *     &lt;enumeration value="ErrorIncorrectSchemaVersion"/>
 *     &lt;enumeration value="ErrorIncorrectUpdatePropertyCount"/>
 *     &lt;enumeration value="ErrorIndividualMailboxLimitReached"/>
 *     &lt;enumeration value="ErrorInsufficientResources"/>
 *     &lt;enumeration value="ErrorInternalServerError"/>
 *     &lt;enumeration value="ErrorInternalServerTransientError"/>
 *     &lt;enumeration value="ErrorInvalidAccessLevel"/>
 *     &lt;enumeration value="ErrorInvalidArgument"/>
 *     &lt;enumeration value="ErrorInvalidAttachmentId"/>
 *     &lt;enumeration value="ErrorInvalidAttachmentSubfilter"/>
 *     &lt;enumeration value="ErrorInvalidAttachmentSubfilterTextFilter"/>
 *     &lt;enumeration value="ErrorInvalidAuthorizationContext"/>
 *     &lt;enumeration value="ErrorInvalidChangeKey"/>
 *     &lt;enumeration value="ErrorInvalidClientSecurityContext"/>
 *     &lt;enumeration value="ErrorInvalidCompleteDate"/>
 *     &lt;enumeration value="ErrorInvalidContactEmailAddress"/>
 *     &lt;enumeration value="ErrorInvalidContactEmailIndex"/>
 *     &lt;enumeration value="ErrorInvalidCrossForestCredentials"/>
 *     &lt;enumeration value="ErrorInvalidDelegatePermission"/>
 *     &lt;enumeration value="ErrorInvalidDelegateUserId"/>
 *     &lt;enumeration value="ErrorInvalidExcludesRestriction"/>
 *     &lt;enumeration value="ErrorInvalidExpressionTypeForSubFilter"/>
 *     &lt;enumeration value="ErrorInvalidExtendedProperty"/>
 *     &lt;enumeration value="ErrorInvalidExtendedPropertyValue"/>
 *     &lt;enumeration value="ErrorInvalidFolderId"/>
 *     &lt;enumeration value="ErrorInvalidFolderTypeForOperation"/>
 *     &lt;enumeration value="ErrorInvalidFractionalPagingParameters"/>
 *     &lt;enumeration value="ErrorInvalidFreeBusyViewType"/>
 *     &lt;enumeration value="ErrorInvalidId"/>
 *     &lt;enumeration value="ErrorInvalidIdEmpty"/>
 *     &lt;enumeration value="ErrorInvalidIdMalformed"/>
 *     &lt;enumeration value="ErrorInvalidIdMalformedEwsLegacyIdFormat"/>
 *     &lt;enumeration value="ErrorInvalidIdMonikerTooLong"/>
 *     &lt;enumeration value="ErrorInvalidIdNotAnItemAttachmentId"/>
 *     &lt;enumeration value="ErrorInvalidIdReturnedByResolveNames"/>
 *     &lt;enumeration value="ErrorInvalidIdStoreObjectIdTooLong"/>
 *     &lt;enumeration value="ErrorInvalidIdTooManyAttachmentLevels"/>
 *     &lt;enumeration value="ErrorInvalidIdXml"/>
 *     &lt;enumeration value="ErrorInvalidImContactId"/>
 *     &lt;enumeration value="ErrorInvalidImDistributionGroupSmtpAddress"/>
 *     &lt;enumeration value="ErrorInvalidImGroupId"/>
 *     &lt;enumeration value="ErrorInvalidIndexedPagingParameters"/>
 *     &lt;enumeration value="ErrorInvalidInternetHeaderChildNodes"/>
 *     &lt;enumeration value="ErrorInvalidItemForOperationArchiveItem"/>
 *     &lt;enumeration value="ErrorInvalidItemForOperationCreateItemAttachment"/>
 *     &lt;enumeration value="ErrorInvalidItemForOperationCreateItem"/>
 *     &lt;enumeration value="ErrorInvalidItemForOperationAcceptItem"/>
 *     &lt;enumeration value="ErrorInvalidItemForOperationDeclineItem"/>
 *     &lt;enumeration value="ErrorInvalidItemForOperationCancelItem"/>
 *     &lt;enumeration value="ErrorInvalidItemForOperationExpandDL"/>
 *     &lt;enumeration value="ErrorInvalidItemForOperationRemoveItem"/>
 *     &lt;enumeration value="ErrorInvalidItemForOperationSendItem"/>
 *     &lt;enumeration value="ErrorInvalidItemForOperationTentative"/>
 *     &lt;enumeration value="ErrorInvalidLogonType"/>
 *     &lt;enumeration value="ErrorInvalidMailbox"/>
 *     &lt;enumeration value="ErrorInvalidManagedFolderProperty"/>
 *     &lt;enumeration value="ErrorInvalidManagedFolderQuota"/>
 *     &lt;enumeration value="ErrorInvalidManagedFolderSize"/>
 *     &lt;enumeration value="ErrorInvalidMergedFreeBusyInterval"/>
 *     &lt;enumeration value="ErrorInvalidNameForNameResolution"/>
 *     &lt;enumeration value="ErrorInvalidOperation"/>
 *     &lt;enumeration value="ErrorInvalidNetworkServiceContext"/>
 *     &lt;enumeration value="ErrorInvalidOofParameter"/>
 *     &lt;enumeration value="ErrorInvalidPagingMaxRows"/>
 *     &lt;enumeration value="ErrorInvalidParentFolder"/>
 *     &lt;enumeration value="ErrorInvalidPercentCompleteValue"/>
 *     &lt;enumeration value="ErrorInvalidPermissionSettings"/>
 *     &lt;enumeration value="ErrorInvalidPhoneCallId"/>
 *     &lt;enumeration value="ErrorInvalidPhoneNumber"/>
 *     &lt;enumeration value="ErrorInvalidUserInfo"/>
 *     &lt;enumeration value="ErrorInvalidPropertyAppend"/>
 *     &lt;enumeration value="ErrorInvalidPropertyDelete"/>
 *     &lt;enumeration value="ErrorInvalidPropertyForExists"/>
 *     &lt;enumeration value="ErrorInvalidPropertyForOperation"/>
 *     &lt;enumeration value="ErrorInvalidPropertyRequest"/>
 *     &lt;enumeration value="ErrorInvalidPropertySet"/>
 *     &lt;enumeration value="ErrorInvalidPropertyUpdateSentMessage"/>
 *     &lt;enumeration value="ErrorInvalidProxySecurityContext"/>
 *     &lt;enumeration value="ErrorInvalidPullSubscriptionId"/>
 *     &lt;enumeration value="ErrorInvalidPushSubscriptionUrl"/>
 *     &lt;enumeration value="ErrorInvalidRecipients"/>
 *     &lt;enumeration value="ErrorInvalidRecipientSubfilter"/>
 *     &lt;enumeration value="ErrorInvalidRecipientSubfilterComparison"/>
 *     &lt;enumeration value="ErrorInvalidRecipientSubfilterOrder"/>
 *     &lt;enumeration value="ErrorInvalidRecipientSubfilterTextFilter"/>
 *     &lt;enumeration value="ErrorInvalidReferenceItem"/>
 *     &lt;enumeration value="ErrorInvalidRequest"/>
 *     &lt;enumeration value="ErrorInvalidRestriction"/>
 *     &lt;enumeration value="ErrorInvalidRetentionTagTypeMismatch"/>
 *     &lt;enumeration value="ErrorInvalidRetentionTagInvisible"/>
 *     &lt;enumeration value="ErrorInvalidRetentionTagInheritance"/>
 *     &lt;enumeration value="ErrorInvalidRetentionTagIdGuid"/>
 *     &lt;enumeration value="ErrorInvalidRoutingType"/>
 *     &lt;enumeration value="ErrorInvalidScheduledOofDuration"/>
 *     &lt;enumeration value="ErrorInvalidSchemaVersionForMailboxVersion"/>
 *     &lt;enumeration value="ErrorInvalidSecurityDescriptor"/>
 *     &lt;enumeration value="ErrorInvalidSendItemSaveSettings"/>
 *     &lt;enumeration value="ErrorInvalidSerializedAccessToken"/>
 *     &lt;enumeration value="ErrorInvalidServerVersion"/>
 *     &lt;enumeration value="ErrorInvalidSid"/>
 *     &lt;enumeration value="ErrorInvalidSIPUri"/>
 *     &lt;enumeration value="ErrorInvalidSmtpAddress"/>
 *     &lt;enumeration value="ErrorInvalidSubfilterType"/>
 *     &lt;enumeration value="ErrorInvalidSubfilterTypeNotAttendeeType"/>
 *     &lt;enumeration value="ErrorInvalidSubfilterTypeNotRecipientType"/>
 *     &lt;enumeration value="ErrorInvalidSubscription"/>
 *     &lt;enumeration value="ErrorInvalidSubscriptionRequest"/>
 *     &lt;enumeration value="ErrorInvalidSyncStateData"/>
 *     &lt;enumeration value="ErrorInvalidTimeInterval"/>
 *     &lt;enumeration value="ErrorInvalidUserOofSettings"/>
 *     &lt;enumeration value="ErrorInvalidUserPrincipalName"/>
 *     &lt;enumeration value="ErrorInvalidUserSid"/>
 *     &lt;enumeration value="ErrorInvalidUserSidMissingUPN"/>
 *     &lt;enumeration value="ErrorInvalidValueForProperty"/>
 *     &lt;enumeration value="ErrorInvalidWatermark"/>
 *     &lt;enumeration value="ErrorIPGatewayNotFound"/>
 *     &lt;enumeration value="ErrorIrresolvableConflict"/>
 *     &lt;enumeration value="ErrorItemCorrupt"/>
 *     &lt;enumeration value="ErrorItemNotFound"/>
 *     &lt;enumeration value="ErrorItemPropertyRequestFailed"/>
 *     &lt;enumeration value="ErrorItemSave"/>
 *     &lt;enumeration value="ErrorItemSavePropertyError"/>
 *     &lt;enumeration value="ErrorLegacyMailboxFreeBusyViewTypeNotMerged"/>
 *     &lt;enumeration value="ErrorLocalServerObjectNotFound"/>
 *     &lt;enumeration value="ErrorLogonAsNetworkServiceFailed"/>
 *     &lt;enumeration value="ErrorMailboxConfiguration"/>
 *     &lt;enumeration value="ErrorMailboxDataArrayEmpty"/>
 *     &lt;enumeration value="ErrorMailboxDataArrayTooBig"/>
 *     &lt;enumeration value="ErrorMailboxHoldNotFound"/>
 *     &lt;enumeration value="ErrorMailboxLogonFailed"/>
 *     &lt;enumeration value="ErrorMailboxMoveInProgress"/>
 *     &lt;enumeration value="ErrorMailboxStoreUnavailable"/>
 *     &lt;enumeration value="ErrorMailRecipientNotFound"/>
 *     &lt;enumeration value="ErrorMailTipsDisabled"/>
 *     &lt;enumeration value="ErrorManagedFolderAlreadyExists"/>
 *     &lt;enumeration value="ErrorManagedFolderNotFound"/>
 *     &lt;enumeration value="ErrorManagedFoldersRootFailure"/>
 *     &lt;enumeration value="ErrorMeetingSuggestionGenerationFailed"/>
 *     &lt;enumeration value="ErrorMessageDispositionRequired"/>
 *     &lt;enumeration value="ErrorMessageSizeExceeded"/>
 *     &lt;enumeration value="ErrorMimeContentConversionFailed"/>
 *     &lt;enumeration value="ErrorMimeContentInvalid"/>
 *     &lt;enumeration value="ErrorMimeContentInvalidBase64String"/>
 *     &lt;enumeration value="ErrorMissingArgument"/>
 *     &lt;enumeration value="ErrorMissingEmailAddress"/>
 *     &lt;enumeration value="ErrorMissingEmailAddressForManagedFolder"/>
 *     &lt;enumeration value="ErrorMissingInformationEmailAddress"/>
 *     &lt;enumeration value="ErrorMissingInformationReferenceItemId"/>
 *     &lt;enumeration value="ErrorMissingItemForCreateItemAttachment"/>
 *     &lt;enumeration value="ErrorMissingManagedFolderId"/>
 *     &lt;enumeration value="ErrorMissingRecipients"/>
 *     &lt;enumeration value="ErrorMissingUserIdInformation"/>
 *     &lt;enumeration value="ErrorMoreThanOneAccessModeSpecified"/>
 *     &lt;enumeration value="ErrorMoveCopyFailed"/>
 *     &lt;enumeration value="ErrorMoveDistinguishedFolder"/>
 *     &lt;enumeration value="ErrorMultiLegacyMailboxAccess"/>
 *     &lt;enumeration value="ErrorNameResolutionMultipleResults"/>
 *     &lt;enumeration value="ErrorNameResolutionNoMailbox"/>
 *     &lt;enumeration value="ErrorNameResolutionNoResults"/>
 *     &lt;enumeration value="ErrorNoApplicableProxyCASServersAvailable"/>
 *     &lt;enumeration value="ErrorNoCalendar"/>
 *     &lt;enumeration value="ErrorNoDestinationCASDueToKerberosRequirements"/>
 *     &lt;enumeration value="ErrorNoDestinationCASDueToSSLRequirements"/>
 *     &lt;enumeration value="ErrorNoDestinationCASDueToVersionMismatch"/>
 *     &lt;enumeration value="ErrorNoFolderClassOverride"/>
 *     &lt;enumeration value="ErrorNoFreeBusyAccess"/>
 *     &lt;enumeration value="ErrorNonExistentMailbox"/>
 *     &lt;enumeration value="ErrorNonPrimarySmtpAddress"/>
 *     &lt;enumeration value="ErrorNoPropertyTagForCustomProperties"/>
 *     &lt;enumeration value="ErrorNoPublicFolderReplicaAvailable"/>
 *     &lt;enumeration value="ErrorNoPublicFolderServerAvailable"/>
 *     &lt;enumeration value="ErrorNoRespondingCASInDestinationSite"/>
 *     &lt;enumeration value="ErrorNotDelegate"/>
 *     &lt;enumeration value="ErrorNotEnoughMemory"/>
 *     &lt;enumeration value="ErrorObjectTypeChanged"/>
 *     &lt;enumeration value="ErrorOccurrenceCrossingBoundary"/>
 *     &lt;enumeration value="ErrorOccurrenceTimeSpanTooBig"/>
 *     &lt;enumeration value="ErrorOperationNotAllowedWithPublicFolderRoot"/>
 *     &lt;enumeration value="ErrorParentFolderIdRequired"/>
 *     &lt;enumeration value="ErrorParentFolderNotFound"/>
 *     &lt;enumeration value="ErrorPasswordChangeRequired"/>
 *     &lt;enumeration value="ErrorPasswordExpired"/>
 *     &lt;enumeration value="ErrorPhoneNumberNotDialable"/>
 *     &lt;enumeration value="ErrorPropertyUpdate"/>
 *     &lt;enumeration value="ErrorPromptPublishingOperationFailed"/>
 *     &lt;enumeration value="ErrorPropertyValidationFailure"/>
 *     &lt;enumeration value="ErrorProxiedSubscriptionCallFailure"/>
 *     &lt;enumeration value="ErrorProxyCallFailed"/>
 *     &lt;enumeration value="ErrorProxyGroupSidLimitExceeded"/>
 *     &lt;enumeration value="ErrorProxyRequestNotAllowed"/>
 *     &lt;enumeration value="ErrorProxyRequestProcessingFailed"/>
 *     &lt;enumeration value="ErrorProxyServiceDiscoveryFailed"/>
 *     &lt;enumeration value="ErrorProxyTokenExpired"/>
 *     &lt;enumeration value="ErrorPublicFolderMailboxDiscoveryFailed"/>
 *     &lt;enumeration value="ErrorPublicFolderOperationFailed"/>
 *     &lt;enumeration value="ErrorPublicFolderRequestProcessingFailed"/>
 *     &lt;enumeration value="ErrorPublicFolderServerNotFound"/>
 *     &lt;enumeration value="ErrorPublicFolderSyncException"/>
 *     &lt;enumeration value="ErrorQueryFilterTooLong"/>
 *     &lt;enumeration value="ErrorQuotaExceeded"/>
 *     &lt;enumeration value="ErrorReadEventsFailed"/>
 *     &lt;enumeration value="ErrorReadReceiptNotPending"/>
 *     &lt;enumeration value="ErrorRecurrenceEndDateTooBig"/>
 *     &lt;enumeration value="ErrorRecurrenceHasNoOccurrence"/>
 *     &lt;enumeration value="ErrorRemoveDelegatesFailed"/>
 *     &lt;enumeration value="ErrorRequestAborted"/>
 *     &lt;enumeration value="ErrorRequestStreamTooBig"/>
 *     &lt;enumeration value="ErrorRequiredPropertyMissing"/>
 *     &lt;enumeration value="ErrorResolveNamesInvalidFolderType"/>
 *     &lt;enumeration value="ErrorResolveNamesOnlyOneContactsFolderAllowed"/>
 *     &lt;enumeration value="ErrorResponseSchemaValidation"/>
 *     &lt;enumeration value="ErrorRestrictionTooLong"/>
 *     &lt;enumeration value="ErrorRestrictionTooComplex"/>
 *     &lt;enumeration value="ErrorResultSetTooBig"/>
 *     &lt;enumeration value="ErrorInvalidExchangeImpersonationHeaderData"/>
 *     &lt;enumeration value="ErrorSavedItemFolderNotFound"/>
 *     &lt;enumeration value="ErrorSchemaValidation"/>
 *     &lt;enumeration value="ErrorSearchFolderNotInitialized"/>
 *     &lt;enumeration value="ErrorSendAsDenied"/>
 *     &lt;enumeration value="ErrorSendMeetingCancellationsRequired"/>
 *     &lt;enumeration value="ErrorSendMeetingInvitationsOrCancellationsRequired"/>
 *     &lt;enumeration value="ErrorSendMeetingInvitationsRequired"/>
 *     &lt;enumeration value="ErrorSentMeetingRequestUpdate"/>
 *     &lt;enumeration value="ErrorSentTaskRequestUpdate"/>
 *     &lt;enumeration value="ErrorServerBusy"/>
 *     &lt;enumeration value="ErrorServiceDiscoveryFailed"/>
 *     &lt;enumeration value="ErrorStaleObject"/>
 *     &lt;enumeration value="ErrorSubmissionQuotaExceeded"/>
 *     &lt;enumeration value="ErrorSubscriptionAccessDenied"/>
 *     &lt;enumeration value="ErrorSubscriptionDelegateAccessNotSupported"/>
 *     &lt;enumeration value="ErrorSubscriptionNotFound"/>
 *     &lt;enumeration value="ErrorSubscriptionUnsubscribed"/>
 *     &lt;enumeration value="ErrorSyncFolderNotFound"/>
 *     &lt;enumeration value="ErrorTeamMailboxNotFound"/>
 *     &lt;enumeration value="ErrorTeamMailboxNotLinkedToSharePoint"/>
 *     &lt;enumeration value="ErrorTeamMailboxUrlValidationFailed"/>
 *     &lt;enumeration value="ErrorTeamMailboxNotAuthorizedOwner"/>
 *     &lt;enumeration value="ErrorTeamMailboxActiveToPendingDelete"/>
 *     &lt;enumeration value="ErrorTeamMailboxFailedSendingNotifications"/>
 *     &lt;enumeration value="ErrorTeamMailboxErrorUnknown"/>
 *     &lt;enumeration value="ErrorTimeIntervalTooBig"/>
 *     &lt;enumeration value="ErrorTimeoutExpired"/>
 *     &lt;enumeration value="ErrorTimeZone"/>
 *     &lt;enumeration value="ErrorToFolderNotFound"/>
 *     &lt;enumeration value="ErrorTokenSerializationDenied"/>
 *     &lt;enumeration value="ErrorTooManyObjectsOpened"/>
 *     &lt;enumeration value="ErrorUpdatePropertyMismatch"/>
 *     &lt;enumeration value="ErrorUnifiedMessagingDialPlanNotFound"/>
 *     &lt;enumeration value="ErrorUnifiedMessagingReportDataNotFound"/>
 *     &lt;enumeration value="ErrorUnifiedMessagingPromptNotFound"/>
 *     &lt;enumeration value="ErrorUnifiedMessagingRequestFailed"/>
 *     &lt;enumeration value="ErrorUnifiedMessagingServerNotFound"/>
 *     &lt;enumeration value="ErrorUnableToGetUserOofSettings"/>
 *     &lt;enumeration value="ErrorUnableToRemoveImContactFromGroup"/>
 *     &lt;enumeration value="ErrorUnsupportedSubFilter"/>
 *     &lt;enumeration value="ErrorUnsupportedCulture"/>
 *     &lt;enumeration value="ErrorUnsupportedMapiPropertyType"/>
 *     &lt;enumeration value="ErrorUnsupportedMimeConversion"/>
 *     &lt;enumeration value="ErrorUnsupportedPathForQuery"/>
 *     &lt;enumeration value="ErrorUnsupportedPathForSortGroup"/>
 *     &lt;enumeration value="ErrorUnsupportedPropertyDefinition"/>
 *     &lt;enumeration value="ErrorUnsupportedQueryFilter"/>
 *     &lt;enumeration value="ErrorUnsupportedRecurrence"/>
 *     &lt;enumeration value="ErrorUnsupportedTypeForConversion"/>
 *     &lt;enumeration value="ErrorUpdateDelegatesFailed"/>
 *     &lt;enumeration value="ErrorUserNotUnifiedMessagingEnabled"/>
 *     &lt;enumeration value="ErrorVoiceMailNotImplemented"/>
 *     &lt;enumeration value="ErrorValueOutOfRange"/>
 *     &lt;enumeration value="ErrorVirusDetected"/>
 *     &lt;enumeration value="ErrorVirusMessageDeleted"/>
 *     &lt;enumeration value="ErrorWebRequestInInvalidState"/>
 *     &lt;enumeration value="ErrorWin32InteropError"/>
 *     &lt;enumeration value="ErrorWorkingHoursSaveFailed"/>
 *     &lt;enumeration value="ErrorWorkingHoursXmlMalformed"/>
 *     &lt;enumeration value="ErrorWrongServerVersion"/>
 *     &lt;enumeration value="ErrorWrongServerVersionDelegate"/>
 *     &lt;enumeration value="ErrorMissingInformationSharingFolderId"/>
 *     &lt;enumeration value="ErrorDuplicateSOAPHeader"/>
 *     &lt;enumeration value="ErrorSharingSynchronizationFailed"/>
 *     &lt;enumeration value="ErrorSharingNoExternalEwsAvailable"/>
 *     &lt;enumeration value="ErrorFreeBusyDLLimitReached"/>
 *     &lt;enumeration value="ErrorInvalidGetSharingFolderRequest"/>
 *     &lt;enumeration value="ErrorNotAllowedExternalSharingByPolicy"/>
 *     &lt;enumeration value="ErrorUserNotAllowedByPolicy"/>
 *     &lt;enumeration value="ErrorPermissionNotAllowedByPolicy"/>
 *     &lt;enumeration value="ErrorOrganizationNotFederated"/>
 *     &lt;enumeration value="ErrorMailboxFailover"/>
 *     &lt;enumeration value="ErrorInvalidExternalSharingInitiator"/>
 *     &lt;enumeration value="ErrorMessageTrackingPermanentError"/>
 *     &lt;enumeration value="ErrorMessageTrackingTransientError"/>
 *     &lt;enumeration value="ErrorMessageTrackingNoSuchDomain"/>
 *     &lt;enumeration value="ErrorUserWithoutFederatedProxyAddress"/>
 *     &lt;enumeration value="ErrorInvalidOrganizationRelationshipForFreeBusy"/>
 *     &lt;enumeration value="ErrorInvalidFederatedOrganizationId"/>
 *     &lt;enumeration value="ErrorInvalidExternalSharingSubscriber"/>
 *     &lt;enumeration value="ErrorInvalidSharingData"/>
 *     &lt;enumeration value="ErrorInvalidSharingMessage"/>
 *     &lt;enumeration value="ErrorNotSupportedSharingMessage"/>
 *     &lt;enumeration value="ErrorApplyConversationActionFailed"/>
 *     &lt;enumeration value="ErrorInboxRulesValidationError"/>
 *     &lt;enumeration value="ErrorOutlookRuleBlobExists"/>
 *     &lt;enumeration value="ErrorRulesOverQuota"/>
 *     &lt;enumeration value="ErrorNewEventStreamConnectionOpened"/>
 *     &lt;enumeration value="ErrorMissedNotificationEvents"/>
 *     &lt;enumeration value="ErrorDuplicateLegacyDistinguishedName"/>
 *     &lt;enumeration value="ErrorInvalidClientAccessTokenRequest"/>
 *     &lt;enumeration value="ErrorNoSpeechDetected"/>
 *     &lt;enumeration value="ErrorUMServerUnavailable"/>
 *     &lt;enumeration value="ErrorRecipientNotFound"/>
 *     &lt;enumeration value="ErrorRecognizerNotInstalled"/>
 *     &lt;enumeration value="ErrorSpeechGrammarError"/>
 *     &lt;enumeration value="ErrorInvalidManagementRoleHeader"/>
 *     &lt;enumeration value="ErrorLocationServicesDisabled"/>
 *     &lt;enumeration value="ErrorLocationServicesRequestTimedOut"/>
 *     &lt;enumeration value="ErrorLocationServicesRequestFailed"/>
 *     &lt;enumeration value="ErrorLocationServicesInvalidRequest"/>
 *     &lt;enumeration value="ErrorMailboxScopeNotAllowedWithoutQueryString"/>
 *     &lt;enumeration value="ErrorArchiveMailboxSearchFailed"/>
 *     &lt;enumeration value="ErrorInvalidPhotoSize"/>
 *     &lt;enumeration value="ErrorSearchQueryHasTooManyKeywords"/>
 *     &lt;enumeration value="ErrorSearchTooManyMailboxes"/>
 *     &lt;enumeration value="ErrorInvalidRetentionTagNone"/>
 *     &lt;enumeration value="ErrorDiscoverySearchesDisabled"/>
 *     &lt;enumeration value="ErrorCalendarSeekToConditionNotSupported"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ResponseCodeType")
@XmlEnum
public enum ResponseCodeType {
    @XmlEnumValue("NoError")
    NO_ERROR("NoError"),
    @XmlEnumValue("ErrorAccessDenied")
    ERROR_ACCESS_DENIED("ErrorAccessDenied"),
    @XmlEnumValue("ErrorAccessModeSpecified")
    ERROR_ACCESS_MODE_SPECIFIED("ErrorAccessModeSpecified"),
    @XmlEnumValue("ErrorAccountDisabled")
    ERROR_ACCOUNT_DISABLED("ErrorAccountDisabled"),
    @XmlEnumValue("ErrorAddDelegatesFailed")
    ERROR_ADD_DELEGATES_FAILED("ErrorAddDelegatesFailed"),
    @XmlEnumValue("ErrorAddressSpaceNotFound")
    ERROR_ADDRESS_SPACE_NOT_FOUND("ErrorAddressSpaceNotFound"),
    @XmlEnumValue("ErrorADOperation")
    ERROR_AD_OPERATION("ErrorADOperation"),
    @XmlEnumValue("ErrorADSessionFilter")
    ERROR_AD_SESSION_FILTER("ErrorADSessionFilter"),
    @XmlEnumValue("ErrorADUnavailable")
    ERROR_AD_UNAVAILABLE("ErrorADUnavailable"),
    @XmlEnumValue("ErrorAutoDiscoverFailed")
    ERROR_AUTO_DISCOVER_FAILED("ErrorAutoDiscoverFailed"),
    @XmlEnumValue("ErrorAffectedTaskOccurrencesRequired")
    ERROR_AFFECTED_TASK_OCCURRENCES_REQUIRED("ErrorAffectedTaskOccurrencesRequired"),
    @XmlEnumValue("ErrorAttachmentNestLevelLimitExceeded")
    ERROR_ATTACHMENT_NEST_LEVEL_LIMIT_EXCEEDED("ErrorAttachmentNestLevelLimitExceeded"),
    @XmlEnumValue("ErrorAttachmentSizeLimitExceeded")
    ERROR_ATTACHMENT_SIZE_LIMIT_EXCEEDED("ErrorAttachmentSizeLimitExceeded"),
    @XmlEnumValue("ErrorArchiveFolderPathCreation")
    ERROR_ARCHIVE_FOLDER_PATH_CREATION("ErrorArchiveFolderPathCreation"),
    @XmlEnumValue("ErrorArchiveMailboxNotEnabled")
    ERROR_ARCHIVE_MAILBOX_NOT_ENABLED("ErrorArchiveMailboxNotEnabled"),
    @XmlEnumValue("ErrorArchiveMailboxServiceDiscoveryFailed")
    ERROR_ARCHIVE_MAILBOX_SERVICE_DISCOVERY_FAILED("ErrorArchiveMailboxServiceDiscoveryFailed"),
    @XmlEnumValue("ErrorAvailabilityConfigNotFound")
    ERROR_AVAILABILITY_CONFIG_NOT_FOUND("ErrorAvailabilityConfigNotFound"),
    @XmlEnumValue("ErrorBatchProcessingStopped")
    ERROR_BATCH_PROCESSING_STOPPED("ErrorBatchProcessingStopped"),
    @XmlEnumValue("ErrorCalendarCannotMoveOrCopyOccurrence")
    ERROR_CALENDAR_CANNOT_MOVE_OR_COPY_OCCURRENCE("ErrorCalendarCannotMoveOrCopyOccurrence"),
    @XmlEnumValue("ErrorCalendarCannotUpdateDeletedItem")
    ERROR_CALENDAR_CANNOT_UPDATE_DELETED_ITEM("ErrorCalendarCannotUpdateDeletedItem"),
    @XmlEnumValue("ErrorCalendarCannotUseIdForOccurrenceId")
    ERROR_CALENDAR_CANNOT_USE_ID_FOR_OCCURRENCE_ID("ErrorCalendarCannotUseIdForOccurrenceId"),
    @XmlEnumValue("ErrorCalendarCannotUseIdForRecurringMasterId")
    ERROR_CALENDAR_CANNOT_USE_ID_FOR_RECURRING_MASTER_ID(
            "ErrorCalendarCannotUseIdForRecurringMasterId"),
    @XmlEnumValue("ErrorCalendarDurationIsTooLong")
    ERROR_CALENDAR_DURATION_IS_TOO_LONG("ErrorCalendarDurationIsTooLong"),
    @XmlEnumValue("ErrorCalendarEndDateIsEarlierThanStartDate")
    ERROR_CALENDAR_END_DATE_IS_EARLIER_THAN_START_DATE(
            "ErrorCalendarEndDateIsEarlierThanStartDate"),
    @XmlEnumValue("ErrorCalendarFolderIsInvalidForCalendarView")
    ERROR_CALENDAR_FOLDER_IS_INVALID_FOR_CALENDAR_VIEW(
            "ErrorCalendarFolderIsInvalidForCalendarView"),
    @XmlEnumValue("ErrorCalendarInvalidAttributeValue")
    ERROR_CALENDAR_INVALID_ATTRIBUTE_VALUE("ErrorCalendarInvalidAttributeValue"),
    @XmlEnumValue("ErrorCalendarInvalidDayForTimeChangePattern")
    ERROR_CALENDAR_INVALID_DAY_FOR_TIME_CHANGE_PATTERN(
            "ErrorCalendarInvalidDayForTimeChangePattern"),
    @XmlEnumValue("ErrorCalendarInvalidDayForWeeklyRecurrence")
    ERROR_CALENDAR_INVALID_DAY_FOR_WEEKLY_RECURRENCE("ErrorCalendarInvalidDayForWeeklyRecurrence"),
    @XmlEnumValue("ErrorCalendarInvalidPropertyState")
    ERROR_CALENDAR_INVALID_PROPERTY_STATE("ErrorCalendarInvalidPropertyState"),
    @XmlEnumValue("ErrorCalendarInvalidPropertyValue")
    ERROR_CALENDAR_INVALID_PROPERTY_VALUE("ErrorCalendarInvalidPropertyValue"),
    @XmlEnumValue("ErrorCalendarInvalidRecurrence")
    ERROR_CALENDAR_INVALID_RECURRENCE("ErrorCalendarInvalidRecurrence"),
    @XmlEnumValue("ErrorCalendarInvalidTimeZone")
    ERROR_CALENDAR_INVALID_TIME_ZONE("ErrorCalendarInvalidTimeZone"),
    @XmlEnumValue("ErrorCalendarIsCancelledForAccept")
    ERROR_CALENDAR_IS_CANCELLED_FOR_ACCEPT("ErrorCalendarIsCancelledForAccept"),
    @XmlEnumValue("ErrorCalendarIsCancelledForDecline")
    ERROR_CALENDAR_IS_CANCELLED_FOR_DECLINE("ErrorCalendarIsCancelledForDecline"),
    @XmlEnumValue("ErrorCalendarIsCancelledForRemove")
    ERROR_CALENDAR_IS_CANCELLED_FOR_REMOVE("ErrorCalendarIsCancelledForRemove"),
    @XmlEnumValue("ErrorCalendarIsCancelledForTentative")
    ERROR_CALENDAR_IS_CANCELLED_FOR_TENTATIVE("ErrorCalendarIsCancelledForTentative"),
    @XmlEnumValue("ErrorCalendarIsDelegatedForAccept")
    ERROR_CALENDAR_IS_DELEGATED_FOR_ACCEPT("ErrorCalendarIsDelegatedForAccept"),
    @XmlEnumValue("ErrorCalendarIsDelegatedForDecline")
    ERROR_CALENDAR_IS_DELEGATED_FOR_DECLINE("ErrorCalendarIsDelegatedForDecline"),
    @XmlEnumValue("ErrorCalendarIsDelegatedForRemove")
    ERROR_CALENDAR_IS_DELEGATED_FOR_REMOVE("ErrorCalendarIsDelegatedForRemove"),
    @XmlEnumValue("ErrorCalendarIsDelegatedForTentative")
    ERROR_CALENDAR_IS_DELEGATED_FOR_TENTATIVE("ErrorCalendarIsDelegatedForTentative"),
    @XmlEnumValue("ErrorCalendarIsNotOrganizer")
    ERROR_CALENDAR_IS_NOT_ORGANIZER("ErrorCalendarIsNotOrganizer"),
    @XmlEnumValue("ErrorCalendarIsOrganizerForAccept")
    ERROR_CALENDAR_IS_ORGANIZER_FOR_ACCEPT("ErrorCalendarIsOrganizerForAccept"),
    @XmlEnumValue("ErrorCalendarIsOrganizerForDecline")
    ERROR_CALENDAR_IS_ORGANIZER_FOR_DECLINE("ErrorCalendarIsOrganizerForDecline"),
    @XmlEnumValue("ErrorCalendarIsOrganizerForRemove")
    ERROR_CALENDAR_IS_ORGANIZER_FOR_REMOVE("ErrorCalendarIsOrganizerForRemove"),
    @XmlEnumValue("ErrorCalendarIsOrganizerForTentative")
    ERROR_CALENDAR_IS_ORGANIZER_FOR_TENTATIVE("ErrorCalendarIsOrganizerForTentative"),
    @XmlEnumValue("ErrorCalendarOccurrenceIndexIsOutOfRecurrenceRange")
    ERROR_CALENDAR_OCCURRENCE_INDEX_IS_OUT_OF_RECURRENCE_RANGE(
            "ErrorCalendarOccurrenceIndexIsOutOfRecurrenceRange"),
    @XmlEnumValue("ErrorCalendarOccurrenceIsDeletedFromRecurrence")
    ERROR_CALENDAR_OCCURRENCE_IS_DELETED_FROM_RECURRENCE(
            "ErrorCalendarOccurrenceIsDeletedFromRecurrence"),
    @XmlEnumValue("ErrorCalendarOutOfRange")
    ERROR_CALENDAR_OUT_OF_RANGE("ErrorCalendarOutOfRange"),
    @XmlEnumValue("ErrorCalendarMeetingRequestIsOutOfDate")
    ERROR_CALENDAR_MEETING_REQUEST_IS_OUT_OF_DATE("ErrorCalendarMeetingRequestIsOutOfDate"),
    @XmlEnumValue("ErrorCalendarViewRangeTooBig")
    ERROR_CALENDAR_VIEW_RANGE_TOO_BIG("ErrorCalendarViewRangeTooBig"),
    @XmlEnumValue("ErrorCallerIsInvalidADAccount")
    ERROR_CALLER_IS_INVALID_AD_ACCOUNT("ErrorCallerIsInvalidADAccount"),
    @XmlEnumValue("ErrorCannotArchiveCalendarContactTaskFolderException")
    ERROR_CANNOT_ARCHIVE_CALENDAR_CONTACT_TASK_FOLDER_EXCEPTION(
            "ErrorCannotArchiveCalendarContactTaskFolderException"),
    @XmlEnumValue("ErrorCannotArchiveItemsInPublicFolders")
    ERROR_CANNOT_ARCHIVE_ITEMS_IN_PUBLIC_FOLDERS("ErrorCannotArchiveItemsInPublicFolders"),
    @XmlEnumValue("ErrorCannotArchiveItemsInArchiveMailbox")
    ERROR_CANNOT_ARCHIVE_ITEMS_IN_ARCHIVE_MAILBOX("ErrorCannotArchiveItemsInArchiveMailbox"),
    @XmlEnumValue("ErrorCannotCreateCalendarItemInNonCalendarFolder")
    ERROR_CANNOT_CREATE_CALENDAR_ITEM_IN_NON_CALENDAR_FOLDER(
            "ErrorCannotCreateCalendarItemInNonCalendarFolder"),
    @XmlEnumValue("ErrorCannotCreateContactInNonContactFolder")
    ERROR_CANNOT_CREATE_CONTACT_IN_NON_CONTACT_FOLDER("ErrorCannotCreateContactInNonContactFolder"),
    @XmlEnumValue("ErrorCannotCreatePostItemInNonMailFolder")
    ERROR_CANNOT_CREATE_POST_ITEM_IN_NON_MAIL_FOLDER("ErrorCannotCreatePostItemInNonMailFolder"),
    @XmlEnumValue("ErrorCannotCreateTaskInNonTaskFolder")
    ERROR_CANNOT_CREATE_TASK_IN_NON_TASK_FOLDER("ErrorCannotCreateTaskInNonTaskFolder"),
    @XmlEnumValue("ErrorCannotDeleteObject")
    ERROR_CANNOT_DELETE_OBJECT("ErrorCannotDeleteObject"),
    @XmlEnumValue("ErrorCannotDisableMandatoryExtension")
    ERROR_CANNOT_DISABLE_MANDATORY_EXTENSION("ErrorCannotDisableMandatoryExtension"),
    @XmlEnumValue("ErrorCannotGetSourceFolderPath")
    ERROR_CANNOT_GET_SOURCE_FOLDER_PATH("ErrorCannotGetSourceFolderPath"),
    @XmlEnumValue("ErrorCannotGetExternalEcpUrl")
    ERROR_CANNOT_GET_EXTERNAL_ECP_URL("ErrorCannotGetExternalEcpUrl"),
    @XmlEnumValue("ErrorCannotOpenFileAttachment")
    ERROR_CANNOT_OPEN_FILE_ATTACHMENT("ErrorCannotOpenFileAttachment"),
    @XmlEnumValue("ErrorCannotDeleteTaskOccurrence")
    ERROR_CANNOT_DELETE_TASK_OCCURRENCE("ErrorCannotDeleteTaskOccurrence"),
    @XmlEnumValue("ErrorCannotEmptyFolder")
    ERROR_CANNOT_EMPTY_FOLDER("ErrorCannotEmptyFolder"),
    @XmlEnumValue("ErrorCannotSetCalendarPermissionOnNonCalendarFolder")
    ERROR_CANNOT_SET_CALENDAR_PERMISSION_ON_NON_CALENDAR_FOLDER(
            "ErrorCannotSetCalendarPermissionOnNonCalendarFolder"),
    @XmlEnumValue("ErrorCannotSetNonCalendarPermissionOnCalendarFolder")
    ERROR_CANNOT_SET_NON_CALENDAR_PERMISSION_ON_CALENDAR_FOLDER(
            "ErrorCannotSetNonCalendarPermissionOnCalendarFolder"),
    @XmlEnumValue("ErrorCannotSetPermissionUnknownEntries")
    ERROR_CANNOT_SET_PERMISSION_UNKNOWN_ENTRIES("ErrorCannotSetPermissionUnknownEntries"),
    @XmlEnumValue("ErrorCannotSpecifySearchFolderAsSourceFolder")
    ERROR_CANNOT_SPECIFY_SEARCH_FOLDER_AS_SOURCE_FOLDER(
            "ErrorCannotSpecifySearchFolderAsSourceFolder"),
    @XmlEnumValue("ErrorCannotUseFolderIdForItemId")
    ERROR_CANNOT_USE_FOLDER_ID_FOR_ITEM_ID("ErrorCannotUseFolderIdForItemId"),
    @XmlEnumValue("ErrorCannotUseItemIdForFolderId")
    ERROR_CANNOT_USE_ITEM_ID_FOR_FOLDER_ID("ErrorCannotUseItemIdForFolderId"),
    @XmlEnumValue("ErrorChangeKeyRequired")
    ERROR_CHANGE_KEY_REQUIRED("ErrorChangeKeyRequired"),
    @XmlEnumValue("ErrorChangeKeyRequiredForWriteOperations")
    ERROR_CHANGE_KEY_REQUIRED_FOR_WRITE_OPERATIONS("ErrorChangeKeyRequiredForWriteOperations"),
    @XmlEnumValue("ErrorClientDisconnected")
    ERROR_CLIENT_DISCONNECTED("ErrorClientDisconnected"),
    @XmlEnumValue("ErrorClientIntentInvalidStateDefinition")
    ERROR_CLIENT_INTENT_INVALID_STATE_DEFINITION("ErrorClientIntentInvalidStateDefinition"),
    @XmlEnumValue("ErrorClientIntentNotFound")
    ERROR_CLIENT_INTENT_NOT_FOUND("ErrorClientIntentNotFound"),
    @XmlEnumValue("ErrorConnectionFailed")
    ERROR_CONNECTION_FAILED("ErrorConnectionFailed"),
    @XmlEnumValue("ErrorContainsFilterWrongType")
    ERROR_CONTAINS_FILTER_WRONG_TYPE("ErrorContainsFilterWrongType"),
    @XmlEnumValue("ErrorContentConversionFailed")
    ERROR_CONTENT_CONVERSION_FAILED("ErrorContentConversionFailed"),
    @XmlEnumValue("ErrorContentIndexingNotEnabled")
    ERROR_CONTENT_INDEXING_NOT_ENABLED("ErrorContentIndexingNotEnabled"),
    @XmlEnumValue("ErrorCorruptData")
    ERROR_CORRUPT_DATA("ErrorCorruptData"),
    @XmlEnumValue("ErrorCreateItemAccessDenied")
    ERROR_CREATE_ITEM_ACCESS_DENIED("ErrorCreateItemAccessDenied"),
    @XmlEnumValue("ErrorCreateManagedFolderPartialCompletion")
    ERROR_CREATE_MANAGED_FOLDER_PARTIAL_COMPLETION("ErrorCreateManagedFolderPartialCompletion"),
    @XmlEnumValue("ErrorCreateSubfolderAccessDenied")
    ERROR_CREATE_SUBFOLDER_ACCESS_DENIED("ErrorCreateSubfolderAccessDenied"),
    @XmlEnumValue("ErrorCrossMailboxMoveCopy")
    ERROR_CROSS_MAILBOX_MOVE_COPY("ErrorCrossMailboxMoveCopy"),
    @XmlEnumValue("ErrorCrossSiteRequest")
    ERROR_CROSS_SITE_REQUEST("ErrorCrossSiteRequest"),
    @XmlEnumValue("ErrorDataSizeLimitExceeded")
    ERROR_DATA_SIZE_LIMIT_EXCEEDED("ErrorDataSizeLimitExceeded"),
    @XmlEnumValue("ErrorDataSourceOperation")
    ERROR_DATA_SOURCE_OPERATION("ErrorDataSourceOperation"),
    @XmlEnumValue("ErrorDelegateAlreadyExists")
    ERROR_DELEGATE_ALREADY_EXISTS("ErrorDelegateAlreadyExists"),
    @XmlEnumValue("ErrorDelegateCannotAddOwner")
    ERROR_DELEGATE_CANNOT_ADD_OWNER("ErrorDelegateCannotAddOwner"),
    @XmlEnumValue("ErrorDelegateMissingConfiguration")
    ERROR_DELEGATE_MISSING_CONFIGURATION("ErrorDelegateMissingConfiguration"),
    @XmlEnumValue("ErrorDelegateNoUser")
    ERROR_DELEGATE_NO_USER("ErrorDelegateNoUser"),
    @XmlEnumValue("ErrorDelegateValidationFailed")
    ERROR_DELEGATE_VALIDATION_FAILED("ErrorDelegateValidationFailed"),
    @XmlEnumValue("ErrorDeleteDistinguishedFolder")
    ERROR_DELETE_DISTINGUISHED_FOLDER("ErrorDeleteDistinguishedFolder"),
    @XmlEnumValue("ErrorDeleteItemsFailed")
    ERROR_DELETE_ITEMS_FAILED("ErrorDeleteItemsFailed"),
    @XmlEnumValue("ErrorDeleteUnifiedMessagingPromptFailed")
    ERROR_DELETE_UNIFIED_MESSAGING_PROMPT_FAILED("ErrorDeleteUnifiedMessagingPromptFailed"),
    @XmlEnumValue("ErrorDistinguishedUserNotSupported")
    ERROR_DISTINGUISHED_USER_NOT_SUPPORTED("ErrorDistinguishedUserNotSupported"),
    @XmlEnumValue("ErrorDistributionListMemberNotExist")
    ERROR_DISTRIBUTION_LIST_MEMBER_NOT_EXIST("ErrorDistributionListMemberNotExist"),
    @XmlEnumValue("ErrorDuplicateInputFolderNames")
    ERROR_DUPLICATE_INPUT_FOLDER_NAMES("ErrorDuplicateInputFolderNames"),
    @XmlEnumValue("ErrorDuplicateUserIdsSpecified")
    ERROR_DUPLICATE_USER_IDS_SPECIFIED("ErrorDuplicateUserIdsSpecified"),
    @XmlEnumValue("ErrorEmailAddressMismatch")
    ERROR_EMAIL_ADDRESS_MISMATCH("ErrorEmailAddressMismatch"),
    @XmlEnumValue("ErrorEventNotFound")
    ERROR_EVENT_NOT_FOUND("ErrorEventNotFound"),
    @XmlEnumValue("ErrorExceededConnectionCount")
    ERROR_EXCEEDED_CONNECTION_COUNT("ErrorExceededConnectionCount"),
    @XmlEnumValue("ErrorExceededSubscriptionCount")
    ERROR_EXCEEDED_SUBSCRIPTION_COUNT("ErrorExceededSubscriptionCount"),
    @XmlEnumValue("ErrorExceededFindCountLimit")
    ERROR_EXCEEDED_FIND_COUNT_LIMIT("ErrorExceededFindCountLimit"),
    @XmlEnumValue("ErrorExpiredSubscription")
    ERROR_EXPIRED_SUBSCRIPTION("ErrorExpiredSubscription"),
    @XmlEnumValue("ErrorExtensionNotFound")
    ERROR_EXTENSION_NOT_FOUND("ErrorExtensionNotFound"),
    @XmlEnumValue("ErrorFolderCorrupt")
    ERROR_FOLDER_CORRUPT("ErrorFolderCorrupt"),
    @XmlEnumValue("ErrorFolderNotFound")
    ERROR_FOLDER_NOT_FOUND("ErrorFolderNotFound"),
    @XmlEnumValue("ErrorFolderPropertRequestFailed")
    ERROR_FOLDER_PROPERT_REQUEST_FAILED("ErrorFolderPropertRequestFailed"),
    @XmlEnumValue("ErrorFolderSave")
    ERROR_FOLDER_SAVE("ErrorFolderSave"),
    @XmlEnumValue("ErrorFolderSaveFailed")
    ERROR_FOLDER_SAVE_FAILED("ErrorFolderSaveFailed"),
    @XmlEnumValue("ErrorFolderSavePropertyError")
    ERROR_FOLDER_SAVE_PROPERTY_ERROR("ErrorFolderSavePropertyError"),
    @XmlEnumValue("ErrorFolderExists")
    ERROR_FOLDER_EXISTS("ErrorFolderExists"),
    @XmlEnumValue("ErrorFreeBusyGenerationFailed")
    ERROR_FREE_BUSY_GENERATION_FAILED("ErrorFreeBusyGenerationFailed"),
    @XmlEnumValue("ErrorGetServerSecurityDescriptorFailed")
    ERROR_GET_SERVER_SECURITY_DESCRIPTOR_FAILED("ErrorGetServerSecurityDescriptorFailed"),
    @XmlEnumValue("ErrorImContactLimitReached")
    ERROR_IM_CONTACT_LIMIT_REACHED("ErrorImContactLimitReached"),
    @XmlEnumValue("ErrorImGroupDisplayNameAlreadyExists")
    ERROR_IM_GROUP_DISPLAY_NAME_ALREADY_EXISTS("ErrorImGroupDisplayNameAlreadyExists"),
    @XmlEnumValue("ErrorImGroupLimitReached")
    ERROR_IM_GROUP_LIMIT_REACHED("ErrorImGroupLimitReached"),
    @XmlEnumValue("ErrorImpersonateUserDenied")
    ERROR_IMPERSONATE_USER_DENIED("ErrorImpersonateUserDenied"),
    @XmlEnumValue("ErrorImpersonationDenied")
    ERROR_IMPERSONATION_DENIED("ErrorImpersonationDenied"),
    @XmlEnumValue("ErrorImpersonationFailed")
    ERROR_IMPERSONATION_FAILED("ErrorImpersonationFailed"),
    @XmlEnumValue("ErrorIncorrectSchemaVersion")
    ERROR_INCORRECT_SCHEMA_VERSION("ErrorIncorrectSchemaVersion"),
    @XmlEnumValue("ErrorIncorrectUpdatePropertyCount")
    ERROR_INCORRECT_UPDATE_PROPERTY_COUNT("ErrorIncorrectUpdatePropertyCount"),
    @XmlEnumValue("ErrorIndividualMailboxLimitReached")
    ERROR_INDIVIDUAL_MAILBOX_LIMIT_REACHED("ErrorIndividualMailboxLimitReached"),
    @XmlEnumValue("ErrorInsufficientResources")
    ERROR_INSUFFICIENT_RESOURCES("ErrorInsufficientResources"),
    @XmlEnumValue("ErrorInternalServerError")
    ERROR_INTERNAL_SERVER_ERROR("ErrorInternalServerError"),
    @XmlEnumValue("ErrorInternalServerTransientError")
    ERROR_INTERNAL_SERVER_TRANSIENT_ERROR("ErrorInternalServerTransientError"),
    @XmlEnumValue("ErrorInvalidAccessLevel")
    ERROR_INVALID_ACCESS_LEVEL("ErrorInvalidAccessLevel"),
    @XmlEnumValue("ErrorInvalidArgument")
    ERROR_INVALID_ARGUMENT("ErrorInvalidArgument"),
    @XmlEnumValue("ErrorInvalidAttachmentId")
    ERROR_INVALID_ATTACHMENT_ID("ErrorInvalidAttachmentId"),
    @XmlEnumValue("ErrorInvalidAttachmentSubfilter")
    ERROR_INVALID_ATTACHMENT_SUBFILTER("ErrorInvalidAttachmentSubfilter"),
    @XmlEnumValue("ErrorInvalidAttachmentSubfilterTextFilter")
    ERROR_INVALID_ATTACHMENT_SUBFILTER_TEXT_FILTER("ErrorInvalidAttachmentSubfilterTextFilter"),
    @XmlEnumValue("ErrorInvalidAuthorizationContext")
    ERROR_INVALID_AUTHORIZATION_CONTEXT("ErrorInvalidAuthorizationContext"),
    @XmlEnumValue("ErrorInvalidChangeKey")
    ERROR_INVALID_CHANGE_KEY("ErrorInvalidChangeKey"),
    @XmlEnumValue("ErrorInvalidClientSecurityContext")
    ERROR_INVALID_CLIENT_SECURITY_CONTEXT("ErrorInvalidClientSecurityContext"),
    @XmlEnumValue("ErrorInvalidCompleteDate")
    ERROR_INVALID_COMPLETE_DATE("ErrorInvalidCompleteDate"),
    @XmlEnumValue("ErrorInvalidContactEmailAddress")
    ERROR_INVALID_CONTACT_EMAIL_ADDRESS("ErrorInvalidContactEmailAddress"),
    @XmlEnumValue("ErrorInvalidContactEmailIndex")
    ERROR_INVALID_CONTACT_EMAIL_INDEX("ErrorInvalidContactEmailIndex"),
    @XmlEnumValue("ErrorInvalidCrossForestCredentials")
    ERROR_INVALID_CROSS_FOREST_CREDENTIALS("ErrorInvalidCrossForestCredentials"),
    @XmlEnumValue("ErrorInvalidDelegatePermission")
    ERROR_INVALID_DELEGATE_PERMISSION("ErrorInvalidDelegatePermission"),
    @XmlEnumValue("ErrorInvalidDelegateUserId")
    ERROR_INVALID_DELEGATE_USER_ID("ErrorInvalidDelegateUserId"),
    @XmlEnumValue("ErrorInvalidExcludesRestriction")
    ERROR_INVALID_EXCLUDES_RESTRICTION("ErrorInvalidExcludesRestriction"),
    @XmlEnumValue("ErrorInvalidExpressionTypeForSubFilter")
    ERROR_INVALID_EXPRESSION_TYPE_FOR_SUB_FILTER("ErrorInvalidExpressionTypeForSubFilter"),
    @XmlEnumValue("ErrorInvalidExtendedProperty")
    ERROR_INVALID_EXTENDED_PROPERTY("ErrorInvalidExtendedProperty"),
    @XmlEnumValue("ErrorInvalidExtendedPropertyValue")
    ERROR_INVALID_EXTENDED_PROPERTY_VALUE("ErrorInvalidExtendedPropertyValue"),
    @XmlEnumValue("ErrorInvalidFolderId")
    ERROR_INVALID_FOLDER_ID("ErrorInvalidFolderId"),
    @XmlEnumValue("ErrorInvalidFolderTypeForOperation")
    ERROR_INVALID_FOLDER_TYPE_FOR_OPERATION("ErrorInvalidFolderTypeForOperation"),
    @XmlEnumValue("ErrorInvalidFractionalPagingParameters")
    ERROR_INVALID_FRACTIONAL_PAGING_PARAMETERS("ErrorInvalidFractionalPagingParameters"),
    @XmlEnumValue("ErrorInvalidFreeBusyViewType")
    ERROR_INVALID_FREE_BUSY_VIEW_TYPE("ErrorInvalidFreeBusyViewType"),
    @XmlEnumValue("ErrorInvalidId")
    ERROR_INVALID_ID("ErrorInvalidId"),
    @XmlEnumValue("ErrorInvalidIdEmpty")
    ERROR_INVALID_ID_EMPTY("ErrorInvalidIdEmpty"),
    @XmlEnumValue("ErrorInvalidIdMalformed")
    ERROR_INVALID_ID_MALFORMED("ErrorInvalidIdMalformed"),
    @XmlEnumValue("ErrorInvalidIdMalformedEwsLegacyIdFormat")
    ERROR_INVALID_ID_MALFORMED_EWS_LEGACY_ID_FORMAT("ErrorInvalidIdMalformedEwsLegacyIdFormat"),
    @XmlEnumValue("ErrorInvalidIdMonikerTooLong")
    ERROR_INVALID_ID_MONIKER_TOO_LONG("ErrorInvalidIdMonikerTooLong"),
    @XmlEnumValue("ErrorInvalidIdNotAnItemAttachmentId")
    ERROR_INVALID_ID_NOT_AN_ITEM_ATTACHMENT_ID("ErrorInvalidIdNotAnItemAttachmentId"),
    @XmlEnumValue("ErrorInvalidIdReturnedByResolveNames")
    ERROR_INVALID_ID_RETURNED_BY_RESOLVE_NAMES("ErrorInvalidIdReturnedByResolveNames"),
    @XmlEnumValue("ErrorInvalidIdStoreObjectIdTooLong")
    ERROR_INVALID_ID_STORE_OBJECT_ID_TOO_LONG("ErrorInvalidIdStoreObjectIdTooLong"),
    @XmlEnumValue("ErrorInvalidIdTooManyAttachmentLevels")
    ERROR_INVALID_ID_TOO_MANY_ATTACHMENT_LEVELS("ErrorInvalidIdTooManyAttachmentLevels"),
    @XmlEnumValue("ErrorInvalidIdXml")
    ERROR_INVALID_ID_XML("ErrorInvalidIdXml"),
    @XmlEnumValue("ErrorInvalidImContactId")
    ERROR_INVALID_IM_CONTACT_ID("ErrorInvalidImContactId"),
    @XmlEnumValue("ErrorInvalidImDistributionGroupSmtpAddress")
    ERROR_INVALID_IM_DISTRIBUTION_GROUP_SMTP_ADDRESS("ErrorInvalidImDistributionGroupSmtpAddress"),
    @XmlEnumValue("ErrorInvalidImGroupId")
    ERROR_INVALID_IM_GROUP_ID("ErrorInvalidImGroupId"),
    @XmlEnumValue("ErrorInvalidIndexedPagingParameters")
    ERROR_INVALID_INDEXED_PAGING_PARAMETERS("ErrorInvalidIndexedPagingParameters"),
    @XmlEnumValue("ErrorInvalidInternetHeaderChildNodes")
    ERROR_INVALID_INTERNET_HEADER_CHILD_NODES("ErrorInvalidInternetHeaderChildNodes"),
    @XmlEnumValue("ErrorInvalidItemForOperationArchiveItem")
    ERROR_INVALID_ITEM_FOR_OPERATION_ARCHIVE_ITEM("ErrorInvalidItemForOperationArchiveItem"),
    @XmlEnumValue("ErrorInvalidItemForOperationCreateItemAttachment")
    ERROR_INVALID_ITEM_FOR_OPERATION_CREATE_ITEM_ATTACHMENT(
            "ErrorInvalidItemForOperationCreateItemAttachment"),
    @XmlEnumValue("ErrorInvalidItemForOperationCreateItem")
    ERROR_INVALID_ITEM_FOR_OPERATION_CREATE_ITEM("ErrorInvalidItemForOperationCreateItem"),
    @XmlEnumValue("ErrorInvalidItemForOperationAcceptItem")
    ERROR_INVALID_ITEM_FOR_OPERATION_ACCEPT_ITEM("ErrorInvalidItemForOperationAcceptItem"),
    @XmlEnumValue("ErrorInvalidItemForOperationDeclineItem")
    ERROR_INVALID_ITEM_FOR_OPERATION_DECLINE_ITEM("ErrorInvalidItemForOperationDeclineItem"),
    @XmlEnumValue("ErrorInvalidItemForOperationCancelItem")
    ERROR_INVALID_ITEM_FOR_OPERATION_CANCEL_ITEM("ErrorInvalidItemForOperationCancelItem"),
    @XmlEnumValue("ErrorInvalidItemForOperationExpandDL")
    ERROR_INVALID_ITEM_FOR_OPERATION_EXPAND_DL("ErrorInvalidItemForOperationExpandDL"),
    @XmlEnumValue("ErrorInvalidItemForOperationRemoveItem")
    ERROR_INVALID_ITEM_FOR_OPERATION_REMOVE_ITEM("ErrorInvalidItemForOperationRemoveItem"),
    @XmlEnumValue("ErrorInvalidItemForOperationSendItem")
    ERROR_INVALID_ITEM_FOR_OPERATION_SEND_ITEM("ErrorInvalidItemForOperationSendItem"),
    @XmlEnumValue("ErrorInvalidItemForOperationTentative")
    ERROR_INVALID_ITEM_FOR_OPERATION_TENTATIVE("ErrorInvalidItemForOperationTentative"),
    @XmlEnumValue("ErrorInvalidLogonType")
    ERROR_INVALID_LOGON_TYPE("ErrorInvalidLogonType"),
    @XmlEnumValue("ErrorInvalidMailbox")
    ERROR_INVALID_MAILBOX("ErrorInvalidMailbox"),
    @XmlEnumValue("ErrorInvalidManagedFolderProperty")
    ERROR_INVALID_MANAGED_FOLDER_PROPERTY("ErrorInvalidManagedFolderProperty"),
    @XmlEnumValue("ErrorInvalidManagedFolderQuota")
    ERROR_INVALID_MANAGED_FOLDER_QUOTA("ErrorInvalidManagedFolderQuota"),
    @XmlEnumValue("ErrorInvalidManagedFolderSize")
    ERROR_INVALID_MANAGED_FOLDER_SIZE("ErrorInvalidManagedFolderSize"),
    @XmlEnumValue("ErrorInvalidMergedFreeBusyInterval")
    ERROR_INVALID_MERGED_FREE_BUSY_INTERVAL("ErrorInvalidMergedFreeBusyInterval"),
    @XmlEnumValue("ErrorInvalidNameForNameResolution")
    ERROR_INVALID_NAME_FOR_NAME_RESOLUTION("ErrorInvalidNameForNameResolution"),
    @XmlEnumValue("ErrorInvalidOperation")
    ERROR_INVALID_OPERATION("ErrorInvalidOperation"),
    @XmlEnumValue("ErrorInvalidNetworkServiceContext")
    ERROR_INVALID_NETWORK_SERVICE_CONTEXT("ErrorInvalidNetworkServiceContext"),
    @XmlEnumValue("ErrorInvalidOofParameter")
    ERROR_INVALID_OOF_PARAMETER("ErrorInvalidOofParameter"),
    @XmlEnumValue("ErrorInvalidPagingMaxRows")
    ERROR_INVALID_PAGING_MAX_ROWS("ErrorInvalidPagingMaxRows"),
    @XmlEnumValue("ErrorInvalidParentFolder")
    ERROR_INVALID_PARENT_FOLDER("ErrorInvalidParentFolder"),
    @XmlEnumValue("ErrorInvalidPercentCompleteValue")
    ERROR_INVALID_PERCENT_COMPLETE_VALUE("ErrorInvalidPercentCompleteValue"),
    @XmlEnumValue("ErrorInvalidPermissionSettings")
    ERROR_INVALID_PERMISSION_SETTINGS("ErrorInvalidPermissionSettings"),
    @XmlEnumValue("ErrorInvalidPhoneCallId")
    ERROR_INVALID_PHONE_CALL_ID("ErrorInvalidPhoneCallId"),
    @XmlEnumValue("ErrorInvalidPhoneNumber")
    ERROR_INVALID_PHONE_NUMBER("ErrorInvalidPhoneNumber"),
    @XmlEnumValue("ErrorInvalidUserInfo")
    ERROR_INVALID_USER_INFO("ErrorInvalidUserInfo"),
    @XmlEnumValue("ErrorInvalidPropertyAppend")
    ERROR_INVALID_PROPERTY_APPEND("ErrorInvalidPropertyAppend"),
    @XmlEnumValue("ErrorInvalidPropertyDelete")
    ERROR_INVALID_PROPERTY_DELETE("ErrorInvalidPropertyDelete"),
    @XmlEnumValue("ErrorInvalidPropertyForExists")
    ERROR_INVALID_PROPERTY_FOR_EXISTS("ErrorInvalidPropertyForExists"),
    @XmlEnumValue("ErrorInvalidPropertyForOperation")
    ERROR_INVALID_PROPERTY_FOR_OPERATION("ErrorInvalidPropertyForOperation"),
    @XmlEnumValue("ErrorInvalidPropertyRequest")
    ERROR_INVALID_PROPERTY_REQUEST("ErrorInvalidPropertyRequest"),
    @XmlEnumValue("ErrorInvalidPropertySet")
    ERROR_INVALID_PROPERTY_SET("ErrorInvalidPropertySet"),
    @XmlEnumValue("ErrorInvalidPropertyUpdateSentMessage")
    ERROR_INVALID_PROPERTY_UPDATE_SENT_MESSAGE("ErrorInvalidPropertyUpdateSentMessage"),
    @XmlEnumValue("ErrorInvalidProxySecurityContext")
    ERROR_INVALID_PROXY_SECURITY_CONTEXT("ErrorInvalidProxySecurityContext"),
    @XmlEnumValue("ErrorInvalidPullSubscriptionId")
    ERROR_INVALID_PULL_SUBSCRIPTION_ID("ErrorInvalidPullSubscriptionId"),
    @XmlEnumValue("ErrorInvalidPushSubscriptionUrl")
    ERROR_INVALID_PUSH_SUBSCRIPTION_URL("ErrorInvalidPushSubscriptionUrl"),
    @XmlEnumValue("ErrorInvalidRecipients")
    ERROR_INVALID_RECIPIENTS("ErrorInvalidRecipients"),
    @XmlEnumValue("ErrorInvalidRecipientSubfilter")
    ERROR_INVALID_RECIPIENT_SUBFILTER("ErrorInvalidRecipientSubfilter"),
    @XmlEnumValue("ErrorInvalidRecipientSubfilterComparison")
    ERROR_INVALID_RECIPIENT_SUBFILTER_COMPARISON("ErrorInvalidRecipientSubfilterComparison"),
    @XmlEnumValue("ErrorInvalidRecipientSubfilterOrder")
    ERROR_INVALID_RECIPIENT_SUBFILTER_ORDER("ErrorInvalidRecipientSubfilterOrder"),
    @XmlEnumValue("ErrorInvalidRecipientSubfilterTextFilter")
    ERROR_INVALID_RECIPIENT_SUBFILTER_TEXT_FILTER("ErrorInvalidRecipientSubfilterTextFilter"),
    @XmlEnumValue("ErrorInvalidReferenceItem")
    ERROR_INVALID_REFERENCE_ITEM("ErrorInvalidReferenceItem"),
    @XmlEnumValue("ErrorInvalidRequest")
    ERROR_INVALID_REQUEST("ErrorInvalidRequest"),
    @XmlEnumValue("ErrorInvalidRestriction")
    ERROR_INVALID_RESTRICTION("ErrorInvalidRestriction"),
    @XmlEnumValue("ErrorInvalidRetentionTagTypeMismatch")
    ERROR_INVALID_RETENTION_TAG_TYPE_MISMATCH("ErrorInvalidRetentionTagTypeMismatch"),
    @XmlEnumValue("ErrorInvalidRetentionTagInvisible")
    ERROR_INVALID_RETENTION_TAG_INVISIBLE("ErrorInvalidRetentionTagInvisible"),
    @XmlEnumValue("ErrorInvalidRetentionTagInheritance")
    ERROR_INVALID_RETENTION_TAG_INHERITANCE("ErrorInvalidRetentionTagInheritance"),
    @XmlEnumValue("ErrorInvalidRetentionTagIdGuid")
    ERROR_INVALID_RETENTION_TAG_ID_GUID("ErrorInvalidRetentionTagIdGuid"),
    @XmlEnumValue("ErrorInvalidRoutingType")
    ERROR_INVALID_ROUTING_TYPE("ErrorInvalidRoutingType"),
    @XmlEnumValue("ErrorInvalidScheduledOofDuration")
    ERROR_INVALID_SCHEDULED_OOF_DURATION("ErrorInvalidScheduledOofDuration"),
    @XmlEnumValue("ErrorInvalidSchemaVersionForMailboxVersion")
    ERROR_INVALID_SCHEMA_VERSION_FOR_MAILBOX_VERSION("ErrorInvalidSchemaVersionForMailboxVersion"),
    @XmlEnumValue("ErrorInvalidSecurityDescriptor")
    ERROR_INVALID_SECURITY_DESCRIPTOR("ErrorInvalidSecurityDescriptor"),
    @XmlEnumValue("ErrorInvalidSendItemSaveSettings")
    ERROR_INVALID_SEND_ITEM_SAVE_SETTINGS("ErrorInvalidSendItemSaveSettings"),
    @XmlEnumValue("ErrorInvalidSerializedAccessToken")
    ERROR_INVALID_SERIALIZED_ACCESS_TOKEN("ErrorInvalidSerializedAccessToken"),
    @XmlEnumValue("ErrorInvalidServerVersion")
    ERROR_INVALID_SERVER_VERSION("ErrorInvalidServerVersion"),
    @XmlEnumValue("ErrorInvalidSid")
    ERROR_INVALID_SID("ErrorInvalidSid"),
    @XmlEnumValue("ErrorInvalidSIPUri")
    ERROR_INVALID_SIP_URI("ErrorInvalidSIPUri"),
    @XmlEnumValue("ErrorInvalidSmtpAddress")
    ERROR_INVALID_SMTP_ADDRESS("ErrorInvalidSmtpAddress"),
    @XmlEnumValue("ErrorInvalidSubfilterType")
    ERROR_INVALID_SUBFILTER_TYPE("ErrorInvalidSubfilterType"),
    @XmlEnumValue("ErrorInvalidSubfilterTypeNotAttendeeType")
    ERROR_INVALID_SUBFILTER_TYPE_NOT_ATTENDEE_TYPE("ErrorInvalidSubfilterTypeNotAttendeeType"),
    @XmlEnumValue("ErrorInvalidSubfilterTypeNotRecipientType")
    ERROR_INVALID_SUBFILTER_TYPE_NOT_RECIPIENT_TYPE("ErrorInvalidSubfilterTypeNotRecipientType"),
    @XmlEnumValue("ErrorInvalidSubscription")
    ERROR_INVALID_SUBSCRIPTION("ErrorInvalidSubscription"),
    @XmlEnumValue("ErrorInvalidSubscriptionRequest")
    ERROR_INVALID_SUBSCRIPTION_REQUEST("ErrorInvalidSubscriptionRequest"),
    @XmlEnumValue("ErrorInvalidSyncStateData")
    ERROR_INVALID_SYNC_STATE_DATA("ErrorInvalidSyncStateData"),
    @XmlEnumValue("ErrorInvalidTimeInterval")
    ERROR_INVALID_TIME_INTERVAL("ErrorInvalidTimeInterval"),
    @XmlEnumValue("ErrorInvalidUserOofSettings")
    ERROR_INVALID_USER_OOF_SETTINGS("ErrorInvalidUserOofSettings"),
    @XmlEnumValue("ErrorInvalidUserPrincipalName")
    ERROR_INVALID_USER_PRINCIPAL_NAME("ErrorInvalidUserPrincipalName"),
    @XmlEnumValue("ErrorInvalidUserSid")
    ERROR_INVALID_USER_SID("ErrorInvalidUserSid"),
    @XmlEnumValue("ErrorInvalidUserSidMissingUPN")
    ERROR_INVALID_USER_SID_MISSING_UPN("ErrorInvalidUserSidMissingUPN"),
    @XmlEnumValue("ErrorInvalidValueForProperty")
    ERROR_INVALID_VALUE_FOR_PROPERTY("ErrorInvalidValueForProperty"),
    @XmlEnumValue("ErrorInvalidWatermark")
    ERROR_INVALID_WATERMARK("ErrorInvalidWatermark"),
    @XmlEnumValue("ErrorIPGatewayNotFound")
    ERROR_IP_GATEWAY_NOT_FOUND("ErrorIPGatewayNotFound"),
    @XmlEnumValue("ErrorIrresolvableConflict")
    ERROR_IRRESOLVABLE_CONFLICT("ErrorIrresolvableConflict"),
    @XmlEnumValue("ErrorItemCorrupt")
    ERROR_ITEM_CORRUPT("ErrorItemCorrupt"),
    @XmlEnumValue("ErrorItemNotFound")
    ERROR_ITEM_NOT_FOUND("ErrorItemNotFound"),
    @XmlEnumValue("ErrorItemPropertyRequestFailed")
    ERROR_ITEM_PROPERTY_REQUEST_FAILED("ErrorItemPropertyRequestFailed"),
    @XmlEnumValue("ErrorItemSave")
    ERROR_ITEM_SAVE("ErrorItemSave"),
    @XmlEnumValue("ErrorItemSavePropertyError")
    ERROR_ITEM_SAVE_PROPERTY_ERROR("ErrorItemSavePropertyError"),
    @XmlEnumValue("ErrorLegacyMailboxFreeBusyViewTypeNotMerged")
    ERROR_LEGACY_MAILBOX_FREE_BUSY_VIEW_TYPE_NOT_MERGED(
            "ErrorLegacyMailboxFreeBusyViewTypeNotMerged"),
    @XmlEnumValue("ErrorLocalServerObjectNotFound")
    ERROR_LOCAL_SERVER_OBJECT_NOT_FOUND("ErrorLocalServerObjectNotFound"),
    @XmlEnumValue("ErrorLogonAsNetworkServiceFailed")
    ERROR_LOGON_AS_NETWORK_SERVICE_FAILED("ErrorLogonAsNetworkServiceFailed"),
    @XmlEnumValue("ErrorMailboxConfiguration")
    ERROR_MAILBOX_CONFIGURATION("ErrorMailboxConfiguration"),
    @XmlEnumValue("ErrorMailboxDataArrayEmpty")
    ERROR_MAILBOX_DATA_ARRAY_EMPTY("ErrorMailboxDataArrayEmpty"),
    @XmlEnumValue("ErrorMailboxDataArrayTooBig")
    ERROR_MAILBOX_DATA_ARRAY_TOO_BIG("ErrorMailboxDataArrayTooBig"),
    @XmlEnumValue("ErrorMailboxHoldNotFound")
    ERROR_MAILBOX_HOLD_NOT_FOUND("ErrorMailboxHoldNotFound"),
    @XmlEnumValue("ErrorMailboxLogonFailed")
    ERROR_MAILBOX_LOGON_FAILED("ErrorMailboxLogonFailed"),
    @XmlEnumValue("ErrorMailboxMoveInProgress")
    ERROR_MAILBOX_MOVE_IN_PROGRESS("ErrorMailboxMoveInProgress"),
    @XmlEnumValue("ErrorMailboxStoreUnavailable")
    ERROR_MAILBOX_STORE_UNAVAILABLE("ErrorMailboxStoreUnavailable"),
    @XmlEnumValue("ErrorMailRecipientNotFound")
    ERROR_MAIL_RECIPIENT_NOT_FOUND("ErrorMailRecipientNotFound"),
    @XmlEnumValue("ErrorMailTipsDisabled")
    ERROR_MAIL_TIPS_DISABLED("ErrorMailTipsDisabled"),
    @XmlEnumValue("ErrorManagedFolderAlreadyExists")
    ERROR_MANAGED_FOLDER_ALREADY_EXISTS("ErrorManagedFolderAlreadyExists"),
    @XmlEnumValue("ErrorManagedFolderNotFound")
    ERROR_MANAGED_FOLDER_NOT_FOUND("ErrorManagedFolderNotFound"),
    @XmlEnumValue("ErrorManagedFoldersRootFailure")
    ERROR_MANAGED_FOLDERS_ROOT_FAILURE("ErrorManagedFoldersRootFailure"),
    @XmlEnumValue("ErrorMeetingSuggestionGenerationFailed")
    ERROR_MEETING_SUGGESTION_GENERATION_FAILED("ErrorMeetingSuggestionGenerationFailed"),
    @XmlEnumValue("ErrorMessageDispositionRequired")
    ERROR_MESSAGE_DISPOSITION_REQUIRED("ErrorMessageDispositionRequired"),
    @XmlEnumValue("ErrorMessageSizeExceeded")
    ERROR_MESSAGE_SIZE_EXCEEDED("ErrorMessageSizeExceeded"),
    @XmlEnumValue("ErrorMimeContentConversionFailed")
    ERROR_MIME_CONTENT_CONVERSION_FAILED("ErrorMimeContentConversionFailed"),
    @XmlEnumValue("ErrorMimeContentInvalid")
    ERROR_MIME_CONTENT_INVALID("ErrorMimeContentInvalid"),
    @XmlEnumValue("ErrorMimeContentInvalidBase64String")
    ERROR_MIME_CONTENT_INVALID_BASE_64_STRING("ErrorMimeContentInvalidBase64String"),
    @XmlEnumValue("ErrorMissingArgument")
    ERROR_MISSING_ARGUMENT("ErrorMissingArgument"),
    @XmlEnumValue("ErrorMissingEmailAddress")
    ERROR_MISSING_EMAIL_ADDRESS("ErrorMissingEmailAddress"),
    @XmlEnumValue("ErrorMissingEmailAddressForManagedFolder")
    ERROR_MISSING_EMAIL_ADDRESS_FOR_MANAGED_FOLDER("ErrorMissingEmailAddressForManagedFolder"),
    @XmlEnumValue("ErrorMissingInformationEmailAddress")
    ERROR_MISSING_INFORMATION_EMAIL_ADDRESS("ErrorMissingInformationEmailAddress"),
    @XmlEnumValue("ErrorMissingInformationReferenceItemId")
    ERROR_MISSING_INFORMATION_REFERENCE_ITEM_ID("ErrorMissingInformationReferenceItemId"),
    @XmlEnumValue("ErrorMissingItemForCreateItemAttachment")
    ERROR_MISSING_ITEM_FOR_CREATE_ITEM_ATTACHMENT("ErrorMissingItemForCreateItemAttachment"),
    @XmlEnumValue("ErrorMissingManagedFolderId")
    ERROR_MISSING_MANAGED_FOLDER_ID("ErrorMissingManagedFolderId"),
    @XmlEnumValue("ErrorMissingRecipients")
    ERROR_MISSING_RECIPIENTS("ErrorMissingRecipients"),
    @XmlEnumValue("ErrorMissingUserIdInformation")
    ERROR_MISSING_USER_ID_INFORMATION("ErrorMissingUserIdInformation"),
    @XmlEnumValue("ErrorMoreThanOneAccessModeSpecified")
    ERROR_MORE_THAN_ONE_ACCESS_MODE_SPECIFIED("ErrorMoreThanOneAccessModeSpecified"),
    @XmlEnumValue("ErrorMoveCopyFailed")
    ERROR_MOVE_COPY_FAILED("ErrorMoveCopyFailed"),
    @XmlEnumValue("ErrorMoveDistinguishedFolder")
    ERROR_MOVE_DISTINGUISHED_FOLDER("ErrorMoveDistinguishedFolder"),
    @XmlEnumValue("ErrorMultiLegacyMailboxAccess")
    ERROR_MULTI_LEGACY_MAILBOX_ACCESS("ErrorMultiLegacyMailboxAccess"),
    @XmlEnumValue("ErrorNameResolutionMultipleResults")
    ERROR_NAME_RESOLUTION_MULTIPLE_RESULTS("ErrorNameResolutionMultipleResults"),
    @XmlEnumValue("ErrorNameResolutionNoMailbox")
    ERROR_NAME_RESOLUTION_NO_MAILBOX("ErrorNameResolutionNoMailbox"),
    @XmlEnumValue("ErrorNameResolutionNoResults")
    ERROR_NAME_RESOLUTION_NO_RESULTS("ErrorNameResolutionNoResults"),
    @XmlEnumValue("ErrorNoApplicableProxyCASServersAvailable")
    ERROR_NO_APPLICABLE_PROXY_CAS_SERVERS_AVAILABLE("ErrorNoApplicableProxyCASServersAvailable"),
    @XmlEnumValue("ErrorNoCalendar")
    ERROR_NO_CALENDAR("ErrorNoCalendar"),
    @XmlEnumValue("ErrorNoDestinationCASDueToKerberosRequirements")
    ERROR_NO_DESTINATION_CAS_DUE_TO_KERBEROS_REQUIREMENTS(
            "ErrorNoDestinationCASDueToKerberosRequirements"),
    @XmlEnumValue("ErrorNoDestinationCASDueToSSLRequirements")
    ERROR_NO_DESTINATION_CAS_DUE_TO_SSL_REQUIREMENTS("ErrorNoDestinationCASDueToSSLRequirements"),
    @XmlEnumValue("ErrorNoDestinationCASDueToVersionMismatch")
    ERROR_NO_DESTINATION_CAS_DUE_TO_VERSION_MISMATCH("ErrorNoDestinationCASDueToVersionMismatch"),
    @XmlEnumValue("ErrorNoFolderClassOverride")
    ERROR_NO_FOLDER_CLASS_OVERRIDE("ErrorNoFolderClassOverride"),
    @XmlEnumValue("ErrorNoFreeBusyAccess")
    ERROR_NO_FREE_BUSY_ACCESS("ErrorNoFreeBusyAccess"),
    @XmlEnumValue("ErrorNonExistentMailbox")
    ERROR_NON_EXISTENT_MAILBOX("ErrorNonExistentMailbox"),
    @XmlEnumValue("ErrorNonPrimarySmtpAddress")
    ERROR_NON_PRIMARY_SMTP_ADDRESS("ErrorNonPrimarySmtpAddress"),
    @XmlEnumValue("ErrorNoPropertyTagForCustomProperties")
    ERROR_NO_PROPERTY_TAG_FOR_CUSTOM_PROPERTIES("ErrorNoPropertyTagForCustomProperties"),
    @XmlEnumValue("ErrorNoPublicFolderReplicaAvailable")
    ERROR_NO_PUBLIC_FOLDER_REPLICA_AVAILABLE("ErrorNoPublicFolderReplicaAvailable"),
    @XmlEnumValue("ErrorNoPublicFolderServerAvailable")
    ERROR_NO_PUBLIC_FOLDER_SERVER_AVAILABLE("ErrorNoPublicFolderServerAvailable"),
    @XmlEnumValue("ErrorNoRespondingCASInDestinationSite")
    ERROR_NO_RESPONDING_CAS_IN_DESTINATION_SITE("ErrorNoRespondingCASInDestinationSite"),
    @XmlEnumValue("ErrorNotDelegate")
    ERROR_NOT_DELEGATE("ErrorNotDelegate"),
    @XmlEnumValue("ErrorNotEnoughMemory")
    ERROR_NOT_ENOUGH_MEMORY("ErrorNotEnoughMemory"),
    @XmlEnumValue("ErrorObjectTypeChanged")
    ERROR_OBJECT_TYPE_CHANGED("ErrorObjectTypeChanged"),
    @XmlEnumValue("ErrorOccurrenceCrossingBoundary")
    ERROR_OCCURRENCE_CROSSING_BOUNDARY("ErrorOccurrenceCrossingBoundary"),
    @XmlEnumValue("ErrorOccurrenceTimeSpanTooBig")
    ERROR_OCCURRENCE_TIME_SPAN_TOO_BIG("ErrorOccurrenceTimeSpanTooBig"),
    @XmlEnumValue("ErrorOperationNotAllowedWithPublicFolderRoot")
    ERROR_OPERATION_NOT_ALLOWED_WITH_PUBLIC_FOLDER_ROOT(
            "ErrorOperationNotAllowedWithPublicFolderRoot"),
    @XmlEnumValue("ErrorParentFolderIdRequired")
    ERROR_PARENT_FOLDER_ID_REQUIRED("ErrorParentFolderIdRequired"),
    @XmlEnumValue("ErrorParentFolderNotFound")
    ERROR_PARENT_FOLDER_NOT_FOUND("ErrorParentFolderNotFound"),
    @XmlEnumValue("ErrorPasswordChangeRequired")
    ERROR_PASSWORD_CHANGE_REQUIRED("ErrorPasswordChangeRequired"),
    @XmlEnumValue("ErrorPasswordExpired")
    ERROR_PASSWORD_EXPIRED("ErrorPasswordExpired"),
    @XmlEnumValue("ErrorPhoneNumberNotDialable")
    ERROR_PHONE_NUMBER_NOT_DIALABLE("ErrorPhoneNumberNotDialable"),
    @XmlEnumValue("ErrorPropertyUpdate")
    ERROR_PROPERTY_UPDATE("ErrorPropertyUpdate"),
    @XmlEnumValue("ErrorPromptPublishingOperationFailed")
    ERROR_PROMPT_PUBLISHING_OPERATION_FAILED("ErrorPromptPublishingOperationFailed"),
    @XmlEnumValue("ErrorPropertyValidationFailure")
    ERROR_PROPERTY_VALIDATION_FAILURE("ErrorPropertyValidationFailure"),
    @XmlEnumValue("ErrorProxiedSubscriptionCallFailure")
    ERROR_PROXIED_SUBSCRIPTION_CALL_FAILURE("ErrorProxiedSubscriptionCallFailure"),
    @XmlEnumValue("ErrorProxyCallFailed")
    ERROR_PROXY_CALL_FAILED("ErrorProxyCallFailed"),
    @XmlEnumValue("ErrorProxyGroupSidLimitExceeded")
    ERROR_PROXY_GROUP_SID_LIMIT_EXCEEDED("ErrorProxyGroupSidLimitExceeded"),
    @XmlEnumValue("ErrorProxyRequestNotAllowed")
    ERROR_PROXY_REQUEST_NOT_ALLOWED("ErrorProxyRequestNotAllowed"),
    @XmlEnumValue("ErrorProxyRequestProcessingFailed")
    ERROR_PROXY_REQUEST_PROCESSING_FAILED("ErrorProxyRequestProcessingFailed"),
    @XmlEnumValue("ErrorProxyServiceDiscoveryFailed")
    ERROR_PROXY_SERVICE_DISCOVERY_FAILED("ErrorProxyServiceDiscoveryFailed"),
    @XmlEnumValue("ErrorProxyTokenExpired")
    ERROR_PROXY_TOKEN_EXPIRED("ErrorProxyTokenExpired"),
    @XmlEnumValue("ErrorPublicFolderMailboxDiscoveryFailed")
    ERROR_PUBLIC_FOLDER_MAILBOX_DISCOVERY_FAILED("ErrorPublicFolderMailboxDiscoveryFailed"),
    @XmlEnumValue("ErrorPublicFolderOperationFailed")
    ERROR_PUBLIC_FOLDER_OPERATION_FAILED("ErrorPublicFolderOperationFailed"),
    @XmlEnumValue("ErrorPublicFolderRequestProcessingFailed")
    ERROR_PUBLIC_FOLDER_REQUEST_PROCESSING_FAILED("ErrorPublicFolderRequestProcessingFailed"),
    @XmlEnumValue("ErrorPublicFolderServerNotFound")
    ERROR_PUBLIC_FOLDER_SERVER_NOT_FOUND("ErrorPublicFolderServerNotFound"),
    @XmlEnumValue("ErrorPublicFolderSyncException")
    ERROR_PUBLIC_FOLDER_SYNC_EXCEPTION("ErrorPublicFolderSyncException"),
    @XmlEnumValue("ErrorQueryFilterTooLong")
    ERROR_QUERY_FILTER_TOO_LONG("ErrorQueryFilterTooLong"),
    @XmlEnumValue("ErrorQuotaExceeded")
    ERROR_QUOTA_EXCEEDED("ErrorQuotaExceeded"),
    @XmlEnumValue("ErrorReadEventsFailed")
    ERROR_READ_EVENTS_FAILED("ErrorReadEventsFailed"),
    @XmlEnumValue("ErrorReadReceiptNotPending")
    ERROR_READ_RECEIPT_NOT_PENDING("ErrorReadReceiptNotPending"),
    @XmlEnumValue("ErrorRecurrenceEndDateTooBig")
    ERROR_RECURRENCE_END_DATE_TOO_BIG("ErrorRecurrenceEndDateTooBig"),
    @XmlEnumValue("ErrorRecurrenceHasNoOccurrence")
    ERROR_RECURRENCE_HAS_NO_OCCURRENCE("ErrorRecurrenceHasNoOccurrence"),
    @XmlEnumValue("ErrorRemoveDelegatesFailed")
    ERROR_REMOVE_DELEGATES_FAILED("ErrorRemoveDelegatesFailed"),
    @XmlEnumValue("ErrorRequestAborted")
    ERROR_REQUEST_ABORTED("ErrorRequestAborted"),
    @XmlEnumValue("ErrorRequestStreamTooBig")
    ERROR_REQUEST_STREAM_TOO_BIG("ErrorRequestStreamTooBig"),
    @XmlEnumValue("ErrorRequiredPropertyMissing")
    ERROR_REQUIRED_PROPERTY_MISSING("ErrorRequiredPropertyMissing"),
    @XmlEnumValue("ErrorResolveNamesInvalidFolderType")
    ERROR_RESOLVE_NAMES_INVALID_FOLDER_TYPE("ErrorResolveNamesInvalidFolderType"),
    @XmlEnumValue("ErrorResolveNamesOnlyOneContactsFolderAllowed")
    ERROR_RESOLVE_NAMES_ONLY_ONE_CONTACTS_FOLDER_ALLOWED(
            "ErrorResolveNamesOnlyOneContactsFolderAllowed"),
    @XmlEnumValue("ErrorResponseSchemaValidation")
    ERROR_RESPONSE_SCHEMA_VALIDATION("ErrorResponseSchemaValidation"),
    @XmlEnumValue("ErrorRestrictionTooLong")
    ERROR_RESTRICTION_TOO_LONG("ErrorRestrictionTooLong"),
    @XmlEnumValue("ErrorRestrictionTooComplex")
    ERROR_RESTRICTION_TOO_COMPLEX("ErrorRestrictionTooComplex"),
    @XmlEnumValue("ErrorResultSetTooBig")
    ERROR_RESULT_SET_TOO_BIG("ErrorResultSetTooBig"),
    @XmlEnumValue("ErrorInvalidExchangeImpersonationHeaderData")
    ERROR_INVALID_EXCHANGE_IMPERSONATION_HEADER_DATA("ErrorInvalidExchangeImpersonationHeaderData"),
    @XmlEnumValue("ErrorSavedItemFolderNotFound")
    ERROR_SAVED_ITEM_FOLDER_NOT_FOUND("ErrorSavedItemFolderNotFound"),
    @XmlEnumValue("ErrorSchemaValidation")
    ERROR_SCHEMA_VALIDATION("ErrorSchemaValidation"),
    @XmlEnumValue("ErrorSearchFolderNotInitialized")
    ERROR_SEARCH_FOLDER_NOT_INITIALIZED("ErrorSearchFolderNotInitialized"),
    @XmlEnumValue("ErrorSendAsDenied")
    ERROR_SEND_AS_DENIED("ErrorSendAsDenied"),
    @XmlEnumValue("ErrorSendMeetingCancellationsRequired")
    ERROR_SEND_MEETING_CANCELLATIONS_REQUIRED("ErrorSendMeetingCancellationsRequired"),
    @XmlEnumValue("ErrorSendMeetingInvitationsOrCancellationsRequired")
    ERROR_SEND_MEETING_INVITATIONS_OR_CANCELLATIONS_REQUIRED(
            "ErrorSendMeetingInvitationsOrCancellationsRequired"),
    @XmlEnumValue("ErrorSendMeetingInvitationsRequired")
    ERROR_SEND_MEETING_INVITATIONS_REQUIRED("ErrorSendMeetingInvitationsRequired"),
    @XmlEnumValue("ErrorSentMeetingRequestUpdate")
    ERROR_SENT_MEETING_REQUEST_UPDATE("ErrorSentMeetingRequestUpdate"),
    @XmlEnumValue("ErrorSentTaskRequestUpdate")
    ERROR_SENT_TASK_REQUEST_UPDATE("ErrorSentTaskRequestUpdate"),
    @XmlEnumValue("ErrorServerBusy")
    ERROR_SERVER_BUSY("ErrorServerBusy"),
    @XmlEnumValue("ErrorServiceDiscoveryFailed")
    ERROR_SERVICE_DISCOVERY_FAILED("ErrorServiceDiscoveryFailed"),
    @XmlEnumValue("ErrorStaleObject")
    ERROR_STALE_OBJECT("ErrorStaleObject"),
    @XmlEnumValue("ErrorSubmissionQuotaExceeded")
    ERROR_SUBMISSION_QUOTA_EXCEEDED("ErrorSubmissionQuotaExceeded"),
    @XmlEnumValue("ErrorSubscriptionAccessDenied")
    ERROR_SUBSCRIPTION_ACCESS_DENIED("ErrorSubscriptionAccessDenied"),
    @XmlEnumValue("ErrorSubscriptionDelegateAccessNotSupported")
    ERROR_SUBSCRIPTION_DELEGATE_ACCESS_NOT_SUPPORTED("ErrorSubscriptionDelegateAccessNotSupported"),
    @XmlEnumValue("ErrorSubscriptionNotFound")
    ERROR_SUBSCRIPTION_NOT_FOUND("ErrorSubscriptionNotFound"),
    @XmlEnumValue("ErrorSubscriptionUnsubscribed")
    ERROR_SUBSCRIPTION_UNSUBSCRIBED("ErrorSubscriptionUnsubscribed"),
    @XmlEnumValue("ErrorSyncFolderNotFound")
    ERROR_SYNC_FOLDER_NOT_FOUND("ErrorSyncFolderNotFound"),
    @XmlEnumValue("ErrorTeamMailboxNotFound")
    ERROR_TEAM_MAILBOX_NOT_FOUND("ErrorTeamMailboxNotFound"),
    @XmlEnumValue("ErrorTeamMailboxNotLinkedToSharePoint")
    ERROR_TEAM_MAILBOX_NOT_LINKED_TO_SHARE_POINT("ErrorTeamMailboxNotLinkedToSharePoint"),
    @XmlEnumValue("ErrorTeamMailboxUrlValidationFailed")
    ERROR_TEAM_MAILBOX_URL_VALIDATION_FAILED("ErrorTeamMailboxUrlValidationFailed"),
    @XmlEnumValue("ErrorTeamMailboxNotAuthorizedOwner")
    ERROR_TEAM_MAILBOX_NOT_AUTHORIZED_OWNER("ErrorTeamMailboxNotAuthorizedOwner"),
    @XmlEnumValue("ErrorTeamMailboxActiveToPendingDelete")
    ERROR_TEAM_MAILBOX_ACTIVE_TO_PENDING_DELETE("ErrorTeamMailboxActiveToPendingDelete"),
    @XmlEnumValue("ErrorTeamMailboxFailedSendingNotifications")
    ERROR_TEAM_MAILBOX_FAILED_SENDING_NOTIFICATIONS("ErrorTeamMailboxFailedSendingNotifications"),
    @XmlEnumValue("ErrorTeamMailboxErrorUnknown")
    ERROR_TEAM_MAILBOX_ERROR_UNKNOWN("ErrorTeamMailboxErrorUnknown"),
    @XmlEnumValue("ErrorTimeIntervalTooBig")
    ERROR_TIME_INTERVAL_TOO_BIG("ErrorTimeIntervalTooBig"),
    @XmlEnumValue("ErrorTimeoutExpired")
    ERROR_TIMEOUT_EXPIRED("ErrorTimeoutExpired"),
    @XmlEnumValue("ErrorTimeZone")
    ERROR_TIME_ZONE("ErrorTimeZone"),
    @XmlEnumValue("ErrorToFolderNotFound")
    ERROR_TO_FOLDER_NOT_FOUND("ErrorToFolderNotFound"),
    @XmlEnumValue("ErrorTokenSerializationDenied")
    ERROR_TOKEN_SERIALIZATION_DENIED("ErrorTokenSerializationDenied"),
    @XmlEnumValue("ErrorTooManyObjectsOpened")
    ERROR_TOO_MANY_OBJECTS_OPENED("ErrorTooManyObjectsOpened"),
    @XmlEnumValue("ErrorUpdatePropertyMismatch")
    ERROR_UPDATE_PROPERTY_MISMATCH("ErrorUpdatePropertyMismatch"),
    @XmlEnumValue("ErrorUnifiedMessagingDialPlanNotFound")
    ERROR_UNIFIED_MESSAGING_DIAL_PLAN_NOT_FOUND("ErrorUnifiedMessagingDialPlanNotFound"),
    @XmlEnumValue("ErrorUnifiedMessagingReportDataNotFound")
    ERROR_UNIFIED_MESSAGING_REPORT_DATA_NOT_FOUND("ErrorUnifiedMessagingReportDataNotFound"),
    @XmlEnumValue("ErrorUnifiedMessagingPromptNotFound")
    ERROR_UNIFIED_MESSAGING_PROMPT_NOT_FOUND("ErrorUnifiedMessagingPromptNotFound"),
    @XmlEnumValue("ErrorUnifiedMessagingRequestFailed")
    ERROR_UNIFIED_MESSAGING_REQUEST_FAILED("ErrorUnifiedMessagingRequestFailed"),
    @XmlEnumValue("ErrorUnifiedMessagingServerNotFound")
    ERROR_UNIFIED_MESSAGING_SERVER_NOT_FOUND("ErrorUnifiedMessagingServerNotFound"),
    @XmlEnumValue("ErrorUnableToGetUserOofSettings")
    ERROR_UNABLE_TO_GET_USER_OOF_SETTINGS("ErrorUnableToGetUserOofSettings"),
    @XmlEnumValue("ErrorUnableToRemoveImContactFromGroup")
    ERROR_UNABLE_TO_REMOVE_IM_CONTACT_FROM_GROUP("ErrorUnableToRemoveImContactFromGroup"),
    @XmlEnumValue("ErrorUnsupportedSubFilter")
    ERROR_UNSUPPORTED_SUB_FILTER("ErrorUnsupportedSubFilter"),
    @XmlEnumValue("ErrorUnsupportedCulture")
    ERROR_UNSUPPORTED_CULTURE("ErrorUnsupportedCulture"),
    @XmlEnumValue("ErrorUnsupportedMapiPropertyType")
    ERROR_UNSUPPORTED_MAPI_PROPERTY_TYPE("ErrorUnsupportedMapiPropertyType"),
    @XmlEnumValue("ErrorUnsupportedMimeConversion")
    ERROR_UNSUPPORTED_MIME_CONVERSION("ErrorUnsupportedMimeConversion"),
    @XmlEnumValue("ErrorUnsupportedPathForQuery")
    ERROR_UNSUPPORTED_PATH_FOR_QUERY("ErrorUnsupportedPathForQuery"),
    @XmlEnumValue("ErrorUnsupportedPathForSortGroup")
    ERROR_UNSUPPORTED_PATH_FOR_SORT_GROUP("ErrorUnsupportedPathForSortGroup"),
    @XmlEnumValue("ErrorUnsupportedPropertyDefinition")
    ERROR_UNSUPPORTED_PROPERTY_DEFINITION("ErrorUnsupportedPropertyDefinition"),
    @XmlEnumValue("ErrorUnsupportedQueryFilter")
    ERROR_UNSUPPORTED_QUERY_FILTER("ErrorUnsupportedQueryFilter"),
    @XmlEnumValue("ErrorUnsupportedRecurrence")
    ERROR_UNSUPPORTED_RECURRENCE("ErrorUnsupportedRecurrence"),
    @XmlEnumValue("ErrorUnsupportedTypeForConversion")
    ERROR_UNSUPPORTED_TYPE_FOR_CONVERSION("ErrorUnsupportedTypeForConversion"),
    @XmlEnumValue("ErrorUpdateDelegatesFailed")
    ERROR_UPDATE_DELEGATES_FAILED("ErrorUpdateDelegatesFailed"),
    @XmlEnumValue("ErrorUserNotUnifiedMessagingEnabled")
    ERROR_USER_NOT_UNIFIED_MESSAGING_ENABLED("ErrorUserNotUnifiedMessagingEnabled"),
    @XmlEnumValue("ErrorVoiceMailNotImplemented")
    ERROR_VOICE_MAIL_NOT_IMPLEMENTED("ErrorVoiceMailNotImplemented"),
    @XmlEnumValue("ErrorValueOutOfRange")
    ERROR_VALUE_OUT_OF_RANGE("ErrorValueOutOfRange"),
    @XmlEnumValue("ErrorVirusDetected")
    ERROR_VIRUS_DETECTED("ErrorVirusDetected"),
    @XmlEnumValue("ErrorVirusMessageDeleted")
    ERROR_VIRUS_MESSAGE_DELETED("ErrorVirusMessageDeleted"),
    @XmlEnumValue("ErrorWebRequestInInvalidState")
    ERROR_WEB_REQUEST_IN_INVALID_STATE("ErrorWebRequestInInvalidState"),
    @XmlEnumValue("ErrorWin32InteropError")
    ERROR_WIN_32_INTEROP_ERROR("ErrorWin32InteropError"),
    @XmlEnumValue("ErrorWorkingHoursSaveFailed")
    ERROR_WORKING_HOURS_SAVE_FAILED("ErrorWorkingHoursSaveFailed"),
    @XmlEnumValue("ErrorWorkingHoursXmlMalformed")
    ERROR_WORKING_HOURS_XML_MALFORMED("ErrorWorkingHoursXmlMalformed"),
    @XmlEnumValue("ErrorWrongServerVersion")
    ERROR_WRONG_SERVER_VERSION("ErrorWrongServerVersion"),
    @XmlEnumValue("ErrorWrongServerVersionDelegate")
    ERROR_WRONG_SERVER_VERSION_DELEGATE("ErrorWrongServerVersionDelegate"),
    @XmlEnumValue("ErrorMissingInformationSharingFolderId")
    ERROR_MISSING_INFORMATION_SHARING_FOLDER_ID("ErrorMissingInformationSharingFolderId"),
    @XmlEnumValue("ErrorDuplicateSOAPHeader")
    ERROR_DUPLICATE_SOAP_HEADER("ErrorDuplicateSOAPHeader"),
    @XmlEnumValue("ErrorSharingSynchronizationFailed")
    ERROR_SHARING_SYNCHRONIZATION_FAILED("ErrorSharingSynchronizationFailed"),
    @XmlEnumValue("ErrorSharingNoExternalEwsAvailable")
    ERROR_SHARING_NO_EXTERNAL_EWS_AVAILABLE("ErrorSharingNoExternalEwsAvailable"),
    @XmlEnumValue("ErrorFreeBusyDLLimitReached")
    ERROR_FREE_BUSY_DL_LIMIT_REACHED("ErrorFreeBusyDLLimitReached"),
    @XmlEnumValue("ErrorInvalidGetSharingFolderRequest")
    ERROR_INVALID_GET_SHARING_FOLDER_REQUEST("ErrorInvalidGetSharingFolderRequest"),
    @XmlEnumValue("ErrorNotAllowedExternalSharingByPolicy")
    ERROR_NOT_ALLOWED_EXTERNAL_SHARING_BY_POLICY("ErrorNotAllowedExternalSharingByPolicy"),
    @XmlEnumValue("ErrorUserNotAllowedByPolicy")
    ERROR_USER_NOT_ALLOWED_BY_POLICY("ErrorUserNotAllowedByPolicy"),
    @XmlEnumValue("ErrorPermissionNotAllowedByPolicy")
    ERROR_PERMISSION_NOT_ALLOWED_BY_POLICY("ErrorPermissionNotAllowedByPolicy"),
    @XmlEnumValue("ErrorOrganizationNotFederated")
    ERROR_ORGANIZATION_NOT_FEDERATED("ErrorOrganizationNotFederated"),
    @XmlEnumValue("ErrorMailboxFailover")
    ERROR_MAILBOX_FAILOVER("ErrorMailboxFailover"),
    @XmlEnumValue("ErrorInvalidExternalSharingInitiator")
    ERROR_INVALID_EXTERNAL_SHARING_INITIATOR("ErrorInvalidExternalSharingInitiator"),
    @XmlEnumValue("ErrorMessageTrackingPermanentError")
    ERROR_MESSAGE_TRACKING_PERMANENT_ERROR("ErrorMessageTrackingPermanentError"),
    @XmlEnumValue("ErrorMessageTrackingTransientError")
    ERROR_MESSAGE_TRACKING_TRANSIENT_ERROR("ErrorMessageTrackingTransientError"),
    @XmlEnumValue("ErrorMessageTrackingNoSuchDomain")
    ERROR_MESSAGE_TRACKING_NO_SUCH_DOMAIN("ErrorMessageTrackingNoSuchDomain"),
    @XmlEnumValue("ErrorUserWithoutFederatedProxyAddress")
    ERROR_USER_WITHOUT_FEDERATED_PROXY_ADDRESS("ErrorUserWithoutFederatedProxyAddress"),
    @XmlEnumValue("ErrorInvalidOrganizationRelationshipForFreeBusy")
    ERROR_INVALID_ORGANIZATION_RELATIONSHIP_FOR_FREE_BUSY(
            "ErrorInvalidOrganizationRelationshipForFreeBusy"),
    @XmlEnumValue("ErrorInvalidFederatedOrganizationId")
    ERROR_INVALID_FEDERATED_ORGANIZATION_ID("ErrorInvalidFederatedOrganizationId"),
    @XmlEnumValue("ErrorInvalidExternalSharingSubscriber")
    ERROR_INVALID_EXTERNAL_SHARING_SUBSCRIBER("ErrorInvalidExternalSharingSubscriber"),
    @XmlEnumValue("ErrorInvalidSharingData")
    ERROR_INVALID_SHARING_DATA("ErrorInvalidSharingData"),
    @XmlEnumValue("ErrorInvalidSharingMessage")
    ERROR_INVALID_SHARING_MESSAGE("ErrorInvalidSharingMessage"),
    @XmlEnumValue("ErrorNotSupportedSharingMessage")
    ERROR_NOT_SUPPORTED_SHARING_MESSAGE("ErrorNotSupportedSharingMessage"),
    @XmlEnumValue("ErrorApplyConversationActionFailed")
    ERROR_APPLY_CONVERSATION_ACTION_FAILED("ErrorApplyConversationActionFailed"),
    @XmlEnumValue("ErrorInboxRulesValidationError")
    ERROR_INBOX_RULES_VALIDATION_ERROR("ErrorInboxRulesValidationError"),
    @XmlEnumValue("ErrorOutlookRuleBlobExists")
    ERROR_OUTLOOK_RULE_BLOB_EXISTS("ErrorOutlookRuleBlobExists"),
    @XmlEnumValue("ErrorRulesOverQuota")
    ERROR_RULES_OVER_QUOTA("ErrorRulesOverQuota"),
    @XmlEnumValue("ErrorNewEventStreamConnectionOpened")
    ERROR_NEW_EVENT_STREAM_CONNECTION_OPENED("ErrorNewEventStreamConnectionOpened"),
    @XmlEnumValue("ErrorMissedNotificationEvents")
    ERROR_MISSED_NOTIFICATION_EVENTS("ErrorMissedNotificationEvents"),
    @XmlEnumValue("ErrorDuplicateLegacyDistinguishedName")
    ERROR_DUPLICATE_LEGACY_DISTINGUISHED_NAME("ErrorDuplicateLegacyDistinguishedName"),
    @XmlEnumValue("ErrorInvalidClientAccessTokenRequest")
    ERROR_INVALID_CLIENT_ACCESS_TOKEN_REQUEST("ErrorInvalidClientAccessTokenRequest"),
    @XmlEnumValue("ErrorNoSpeechDetected")
    ERROR_NO_SPEECH_DETECTED("ErrorNoSpeechDetected"),
    @XmlEnumValue("ErrorUMServerUnavailable")
    ERROR_UM_SERVER_UNAVAILABLE("ErrorUMServerUnavailable"),
    @XmlEnumValue("ErrorRecipientNotFound")
    ERROR_RECIPIENT_NOT_FOUND("ErrorRecipientNotFound"),
    @XmlEnumValue("ErrorRecognizerNotInstalled")
    ERROR_RECOGNIZER_NOT_INSTALLED("ErrorRecognizerNotInstalled"),
    @XmlEnumValue("ErrorSpeechGrammarError")
    ERROR_SPEECH_GRAMMAR_ERROR("ErrorSpeechGrammarError"),
    @XmlEnumValue("ErrorInvalidManagementRoleHeader")
    ERROR_INVALID_MANAGEMENT_ROLE_HEADER("ErrorInvalidManagementRoleHeader"),
    @XmlEnumValue("ErrorLocationServicesDisabled")
    ERROR_LOCATION_SERVICES_DISABLED("ErrorLocationServicesDisabled"),
    @XmlEnumValue("ErrorLocationServicesRequestTimedOut")
    ERROR_LOCATION_SERVICES_REQUEST_TIMED_OUT("ErrorLocationServicesRequestTimedOut"),
    @XmlEnumValue("ErrorLocationServicesRequestFailed")
    ERROR_LOCATION_SERVICES_REQUEST_FAILED("ErrorLocationServicesRequestFailed"),
    @XmlEnumValue("ErrorLocationServicesInvalidRequest")
    ERROR_LOCATION_SERVICES_INVALID_REQUEST("ErrorLocationServicesInvalidRequest"),
    @XmlEnumValue("ErrorMailboxScopeNotAllowedWithoutQueryString")
    ERROR_MAILBOX_SCOPE_NOT_ALLOWED_WITHOUT_QUERY_STRING(
            "ErrorMailboxScopeNotAllowedWithoutQueryString"),
    @XmlEnumValue("ErrorArchiveMailboxSearchFailed")
    ERROR_ARCHIVE_MAILBOX_SEARCH_FAILED("ErrorArchiveMailboxSearchFailed"),
    @XmlEnumValue("ErrorInvalidPhotoSize")
    ERROR_INVALID_PHOTO_SIZE("ErrorInvalidPhotoSize"),
    @XmlEnumValue("ErrorSearchQueryHasTooManyKeywords")
    ERROR_SEARCH_QUERY_HAS_TOO_MANY_KEYWORDS("ErrorSearchQueryHasTooManyKeywords"),
    @XmlEnumValue("ErrorSearchTooManyMailboxes")
    ERROR_SEARCH_TOO_MANY_MAILBOXES("ErrorSearchTooManyMailboxes"),
    @XmlEnumValue("ErrorInvalidRetentionTagNone")
    ERROR_INVALID_RETENTION_TAG_NONE("ErrorInvalidRetentionTagNone"),
    @XmlEnumValue("ErrorDiscoverySearchesDisabled")
    ERROR_DISCOVERY_SEARCHES_DISABLED("ErrorDiscoverySearchesDisabled"),
    @XmlEnumValue("ErrorCalendarSeekToConditionNotSupported")
    ERROR_CALENDAR_SEEK_TO_CONDITION_NOT_SUPPORTED("ErrorCalendarSeekToConditionNotSupported");
    private final String value;

    ResponseCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseCodeType fromValue(String v) {
        for (ResponseCodeType c : ResponseCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
