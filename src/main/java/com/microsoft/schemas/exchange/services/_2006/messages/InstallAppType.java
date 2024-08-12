package com.microsoft.schemas.exchange.services._2006.messages;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for InstallAppType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="InstallAppType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="Manifest" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "InstallAppType",
        propOrder = {"manifest"})
public class InstallAppType extends BaseRequestType {

    @XmlElement(name = "Manifest", required = true)
    protected byte[] manifest;

    /**
     * Gets the value of the manifest property.
     *
     * @return possible object is byte[]
     */
    public byte[] getManifest() {
        return manifest;
    }

    /**
     * Sets the value of the manifest property.
     *
     * @param value allowed object is byte[]
     */
    public void setManifest(byte[] value) {
        this.manifest = ((byte[]) value);
    }
}
