package com.microsoft.schemas.exchange.services._2006.messages;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for GetUserPhotoResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetUserPhotoResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="HasChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PictureData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetUserPhotoResponseMessageType",
        propOrder = {"hasChanged", "pictureData"})
public class GetUserPhotoResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "HasChanged")
    protected boolean hasChanged;

    @XmlElement(name = "PictureData")
    protected byte[] pictureData;

    /** Gets the value of the hasChanged property. */
    public boolean isHasChanged() {
        return hasChanged;
    }

    /** Sets the value of the hasChanged property. */
    public void setHasChanged(boolean value) {
        this.hasChanged = value;
    }

    /**
     * Gets the value of the pictureData property.
     *
     * @return possible object is byte[]
     */
    public byte[] getPictureData() {
        return pictureData;
    }

    /**
     * Sets the value of the pictureData property.
     *
     * @param value allowed object is byte[]
     */
    public void setPictureData(byte[] value) {
        this.pictureData = ((byte[]) value);
    }
}
