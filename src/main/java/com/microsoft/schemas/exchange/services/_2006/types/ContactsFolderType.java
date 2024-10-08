package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ContactsFolderType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ContactsFolderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseFolderType">
 *       &lt;sequence>
 *         &lt;element name="SharingEffectiveRights" type="{http://schemas.microsoft.com/exchange/services/2006/types}PermissionReadAccessType" minOccurs="0"/>
 *         &lt;element name="PermissionSet" type="{http://schemas.microsoft.com/exchange/services/2006/types}PermissionSetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ContactsFolderType",
        propOrder = {"sharingEffectiveRights", "permissionSet"})
public class ContactsFolderType extends BaseFolderType {

    @XmlElement(name = "SharingEffectiveRights")
    protected PermissionReadAccessType sharingEffectiveRights;

    @XmlElement(name = "PermissionSet")
    protected PermissionSetType permissionSet;

    /**
     * Gets the value of the sharingEffectiveRights property.
     *
     * @return possible object is {@link PermissionReadAccessType }
     */
    public PermissionReadAccessType getSharingEffectiveRights() {
        return sharingEffectiveRights;
    }

    /**
     * Sets the value of the sharingEffectiveRights property.
     *
     * @param value allowed object is {@link PermissionReadAccessType }
     */
    public void setSharingEffectiveRights(PermissionReadAccessType value) {
        this.sharingEffectiveRights = value;
    }

    /**
     * Gets the value of the permissionSet property.
     *
     * @return possible object is {@link PermissionSetType }
     */
    public PermissionSetType getPermissionSet() {
        return permissionSet;
    }

    /**
     * Sets the value of the permissionSet property.
     *
     * @param value allowed object is {@link PermissionSetType }
     */
    public void setPermissionSet(PermissionSetType value) {
        this.permissionSet = value;
    }
}
