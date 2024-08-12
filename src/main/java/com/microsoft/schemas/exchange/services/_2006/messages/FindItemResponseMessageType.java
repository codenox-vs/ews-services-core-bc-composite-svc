package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.ArrayOfHighlightTermsType;
import com.microsoft.schemas.exchange.services._2006.types.FindItemParentType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for FindItemResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FindItemResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="RootFolder" type="{http://schemas.microsoft.com/exchange/services/2006/types}FindItemParentType" minOccurs="0"/>
 *         &lt;element name="HighlightTerms" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfHighlightTermsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "FindItemResponseMessageType",
        propOrder = {"rootFolder", "highlightTerms"})
public class FindItemResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "RootFolder")
    protected FindItemParentType rootFolder;

    @XmlElement(name = "HighlightTerms")
    protected ArrayOfHighlightTermsType highlightTerms;

    /**
     * Gets the value of the rootFolder property.
     *
     * @return possible object is {@link FindItemParentType }
     */
    public FindItemParentType getRootFolder() {
        return rootFolder;
    }

    /**
     * Sets the value of the rootFolder property.
     *
     * @param value allowed object is {@link FindItemParentType }
     */
    public void setRootFolder(FindItemParentType value) {
        this.rootFolder = value;
    }

    /**
     * Gets the value of the highlightTerms property.
     *
     * @return possible object is {@link ArrayOfHighlightTermsType }
     */
    public ArrayOfHighlightTermsType getHighlightTerms() {
        return highlightTerms;
    }

    /**
     * Sets the value of the highlightTerms property.
     *
     * @param value allowed object is {@link ArrayOfHighlightTermsType }
     */
    public void setHighlightTerms(ArrayOfHighlightTermsType value) {
        this.highlightTerms = value;
    }
}
