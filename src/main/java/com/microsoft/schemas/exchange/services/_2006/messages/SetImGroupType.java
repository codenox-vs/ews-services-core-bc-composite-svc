package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.ItemIdType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for SetImGroupType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SetImGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="GroupId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/>
 *         &lt;element name="NewDisplayName" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SetImGroupType",
        propOrder = {"groupId", "newDisplayName"})
public class SetImGroupType extends BaseRequestType {

    @XmlElement(name = "GroupId", required = true)
    protected ItemIdType groupId;

    @XmlElement(name = "NewDisplayName", required = true)
    protected String newDisplayName;

    /**
     * Gets the value of the groupId property.
     *
     * @return possible object is {@link ItemIdType }
     */
    public ItemIdType getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     *
     * @param value allowed object is {@link ItemIdType }
     */
    public void setGroupId(ItemIdType value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the newDisplayName property.
     *
     * @return possible object is {@link String }
     */
    public String getNewDisplayName() {
        return newDisplayName;
    }

    /**
     * Sets the value of the newDisplayName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setNewDisplayName(String value) {
        this.newDisplayName = value;
    }
}
