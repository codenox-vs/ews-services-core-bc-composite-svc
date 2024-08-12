package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.NonEmptyArrayOfFoldersType;
import com.microsoft.schemas.exchange.services._2006.types.TargetFolderIdType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for CreateFolderPathType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CreateFolderPathType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ParentFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}TargetFolderIdType"/>
 *         &lt;element name="RelativeFolderPath" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfFoldersType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "CreateFolderPathType",
        propOrder = {"parentFolderId", "relativeFolderPath"})
public class CreateFolderPathType extends BaseRequestType {

    @XmlElement(name = "ParentFolderId", required = true)
    protected TargetFolderIdType parentFolderId;

    @XmlElement(name = "RelativeFolderPath", required = true)
    protected NonEmptyArrayOfFoldersType relativeFolderPath;

    /**
     * Gets the value of the parentFolderId property.
     *
     * @return possible object is {@link TargetFolderIdType }
     */
    public TargetFolderIdType getParentFolderId() {
        return parentFolderId;
    }

    /**
     * Sets the value of the parentFolderId property.
     *
     * @param value allowed object is {@link TargetFolderIdType }
     */
    public void setParentFolderId(TargetFolderIdType value) {
        this.parentFolderId = value;
    }

    /**
     * Gets the value of the relativeFolderPath property.
     *
     * @return possible object is {@link NonEmptyArrayOfFoldersType }
     */
    public NonEmptyArrayOfFoldersType getRelativeFolderPath() {
        return relativeFolderPath;
    }

    /**
     * Sets the value of the relativeFolderPath property.
     *
     * @param value allowed object is {@link NonEmptyArrayOfFoldersType }
     */
    public void setRelativeFolderPath(NonEmptyArrayOfFoldersType value) {
        this.relativeFolderPath = value;
    }
}
