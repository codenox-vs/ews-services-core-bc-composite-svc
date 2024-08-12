package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.NonEmptyArrayOfBaseItemIdsType;
import com.microsoft.schemas.exchange.services._2006.types.NonEmptyArrayOfExtendedFieldURIs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for GetImItemsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetImItemsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ContactIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseItemIdsType" minOccurs="0"/>
 *         &lt;element name="GroupIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseItemIdsType" minOccurs="0"/>
 *         &lt;element name="ExtendedProperties" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfExtendedFieldURIs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetImItemsType",
        propOrder = {"contactIds", "groupIds", "extendedProperties"})
public class GetImItemsType extends BaseRequestType {

    @XmlElement(name = "ContactIds")
    protected NonEmptyArrayOfBaseItemIdsType contactIds;

    @XmlElement(name = "GroupIds")
    protected NonEmptyArrayOfBaseItemIdsType groupIds;

    @XmlElement(name = "ExtendedProperties")
    protected NonEmptyArrayOfExtendedFieldURIs extendedProperties;

    /**
     * Gets the value of the contactIds property.
     *
     * @return possible object is {@link NonEmptyArrayOfBaseItemIdsType }
     */
    public NonEmptyArrayOfBaseItemIdsType getContactIds() {
        return contactIds;
    }

    /**
     * Sets the value of the contactIds property.
     *
     * @param value allowed object is {@link NonEmptyArrayOfBaseItemIdsType }
     */
    public void setContactIds(NonEmptyArrayOfBaseItemIdsType value) {
        this.contactIds = value;
    }

    /**
     * Gets the value of the groupIds property.
     *
     * @return possible object is {@link NonEmptyArrayOfBaseItemIdsType }
     */
    public NonEmptyArrayOfBaseItemIdsType getGroupIds() {
        return groupIds;
    }

    /**
     * Sets the value of the groupIds property.
     *
     * @param value allowed object is {@link NonEmptyArrayOfBaseItemIdsType }
     */
    public void setGroupIds(NonEmptyArrayOfBaseItemIdsType value) {
        this.groupIds = value;
    }

    /**
     * Gets the value of the extendedProperties property.
     *
     * @return possible object is {@link NonEmptyArrayOfExtendedFieldURIs }
     */
    public NonEmptyArrayOfExtendedFieldURIs getExtendedProperties() {
        return extendedProperties;
    }

    /**
     * Sets the value of the extendedProperties property.
     *
     * @param value allowed object is {@link NonEmptyArrayOfExtendedFieldURIs }
     */
    public void setExtendedProperties(NonEmptyArrayOfExtendedFieldURIs value) {
        this.extendedProperties = value;
    }
}
