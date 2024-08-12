package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.NonEmptyArrayOfBaseItemIdsType;
import com.microsoft.schemas.exchange.services._2006.types.TargetFolderIdType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ArchiveItemType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArchiveItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ArchiveSourceFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}TargetFolderIdType"/>
 *         &lt;element name="ItemIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseItemIdsType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ArchiveItemType",
        propOrder = {"archiveSourceFolderId", "itemIds"})
public class ArchiveItemType extends BaseRequestType {

    @XmlElement(name = "ArchiveSourceFolderId", required = true)
    protected TargetFolderIdType archiveSourceFolderId;

    @XmlElement(name = "ItemIds", required = true)
    protected NonEmptyArrayOfBaseItemIdsType itemIds;

    /**
     * Gets the value of the archiveSourceFolderId property.
     *
     * @return possible object is {@link TargetFolderIdType }
     */
    public TargetFolderIdType getArchiveSourceFolderId() {
        return archiveSourceFolderId;
    }

    /**
     * Sets the value of the archiveSourceFolderId property.
     *
     * @param value allowed object is {@link TargetFolderIdType }
     */
    public void setArchiveSourceFolderId(TargetFolderIdType value) {
        this.archiveSourceFolderId = value;
    }

    /**
     * Gets the value of the itemIds property.
     *
     * @return possible object is {@link NonEmptyArrayOfBaseItemIdsType }
     */
    public NonEmptyArrayOfBaseItemIdsType getItemIds() {
        return itemIds;
    }

    /**
     * Sets the value of the itemIds property.
     *
     * @param value allowed object is {@link NonEmptyArrayOfBaseItemIdsType }
     */
    public void setItemIds(NonEmptyArrayOfBaseItemIdsType value) {
        this.itemIds = value;
    }
}
