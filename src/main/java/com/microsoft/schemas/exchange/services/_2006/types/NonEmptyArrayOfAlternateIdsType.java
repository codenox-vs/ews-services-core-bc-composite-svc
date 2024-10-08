package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * A non-empty array of alternate Ids.
 *
 * <p>Java class for NonEmptyArrayOfAlternateIdsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfAlternateIdsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="AlternateId" type="{http://schemas.microsoft.com/exchange/services/2006/types}AlternateIdType"/>
 *         &lt;element name="AlternatePublicFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}AlternatePublicFolderIdType"/>
 *         &lt;element name="AlternatePublicFolderItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}AlternatePublicFolderItemIdType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NonEmptyArrayOfAlternateIdsType",
        propOrder = {"alternateIdOrAlternatePublicFolderIdOrAlternatePublicFolderItemId"})
public class NonEmptyArrayOfAlternateIdsType {

    @XmlElements({
        @XmlElement(
                name = "AlternatePublicFolderItemId",
                type = AlternatePublicFolderItemIdType.class),
        @XmlElement(name = "AlternateId", type = AlternateIdType.class),
        @XmlElement(name = "AlternatePublicFolderId", type = AlternatePublicFolderIdType.class)
    })
    protected List<AlternateIdBaseType>
            alternateIdOrAlternatePublicFolderIdOrAlternatePublicFolderItemId;

    /**
     * Gets the value of the alternateIdOrAlternatePublicFolderIdOrAlternatePublicFolderItemId
     * property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the
     * alternateIdOrAlternatePublicFolderIdOrAlternatePublicFolderItemId property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getAlternateIdOrAlternatePublicFolderIdOrAlternatePublicFolderItemId().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link
     * AlternatePublicFolderItemIdType } {@link AlternateIdType } {@link AlternatePublicFolderIdType
     * }
     */
    public List<AlternateIdBaseType>
            getAlternateIdOrAlternatePublicFolderIdOrAlternatePublicFolderItemId() {
        if (alternateIdOrAlternatePublicFolderIdOrAlternatePublicFolderItemId == null) {
            alternateIdOrAlternatePublicFolderIdOrAlternatePublicFolderItemId =
                    new ArrayList<AlternateIdBaseType>();
        }
        return this.alternateIdOrAlternatePublicFolderIdOrAlternatePublicFolderItemId;
    }
}
