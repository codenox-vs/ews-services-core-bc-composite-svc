package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for SyncFolderItemsChangesType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SyncFolderItemsChangesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Create" type="{http://schemas.microsoft.com/exchange/services/2006/types}SyncFolderItemsCreateOrUpdateType"/>
 *           &lt;element name="Update" type="{http://schemas.microsoft.com/exchange/services/2006/types}SyncFolderItemsCreateOrUpdateType"/>
 *           &lt;element name="Delete" type="{http://schemas.microsoft.com/exchange/services/2006/types}SyncFolderItemsDeleteType"/>
 *           &lt;element name="ReadFlagChange" type="{http://schemas.microsoft.com/exchange/services/2006/types}SyncFolderItemsReadFlagType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SyncFolderItemsChangesType",
        propOrder = {"createOrUpdateOrDelete"})
public class SyncFolderItemsChangesType {

    @XmlElementRefs({
        @XmlElementRef(
                name = "Update",
                namespace = "http://schemas.microsoft.com/exchange/services/2006/types",
                type = JAXBElement.class),
        @XmlElementRef(
                name = "Delete",
                namespace = "http://schemas.microsoft.com/exchange/services/2006/types",
                type = JAXBElement.class),
        @XmlElementRef(
                name = "ReadFlagChange",
                namespace = "http://schemas.microsoft.com/exchange/services/2006/types",
                type = JAXBElement.class),
        @XmlElementRef(
                name = "Create",
                namespace = "http://schemas.microsoft.com/exchange/services/2006/types",
                type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> createOrUpdateOrDelete;

    /**
     * Gets the value of the createOrUpdateOrDelete property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the createOrUpdateOrDelete property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getCreateOrUpdateOrDelete().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code
     * <}{@link SyncFolderItemsReadFlagType }{@code >} {@link JAXBElement }{@code <}{@link
     * SyncFolderItemsCreateOrUpdateType }{@code >} {@link JAXBElement }{@code <}{@link
     * SyncFolderItemsDeleteType }{@code >} {@link JAXBElement }{@code <}{@link
     * SyncFolderItemsCreateOrUpdateType }{@code >}
     */
    public List<JAXBElement<?>> getCreateOrUpdateOrDelete() {
        if (createOrUpdateOrDelete == null) {
            createOrUpdateOrDelete = new ArrayList<JAXBElement<?>>();
        }
        return this.createOrUpdateOrDelete;
    }
}
