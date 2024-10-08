package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for ChangeDescriptionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ChangeDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.microsoft.com/exchange/services/2006/types}Path"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ChangeDescriptionType",
        propOrder = {"path"})
@XmlSeeAlso({FolderChangeDescriptionType.class, ItemChangeDescriptionType.class})
public abstract class ChangeDescriptionType {

    @XmlElementRef(
            name = "Path",
            namespace = "http://schemas.microsoft.com/exchange/services/2006/types",
            type = JAXBElement.class)
    protected JAXBElement<? extends BasePathToElementType> path;

    /**
     * Gets the value of the path property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link PathToUnindexedFieldType
     *     }{@code >} {@link JAXBElement }{@code <}{@link PathToIndexedFieldType }{@code >} {@link
     *     JAXBElement }{@code <}{@link BasePathToElementType }{@code >} {@link JAXBElement }{@code
     *     <}{@link PathToExtendedFieldType }{@code >}
     */
    public JAXBElement<? extends BasePathToElementType> getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     *
     * @param value allowed object is {@link JAXBElement }{@code <}{@link PathToUnindexedFieldType
     *     }{@code >} {@link JAXBElement }{@code <}{@link PathToIndexedFieldType }{@code >} {@link
     *     JAXBElement }{@code <}{@link BasePathToElementType }{@code >} {@link JAXBElement }{@code
     *     <}{@link PathToExtendedFieldType }{@code >}
     */
    public void setPath(JAXBElement<? extends BasePathToElementType> value) {
        this.path = ((JAXBElement<? extends BasePathToElementType>) value);
    }
}
