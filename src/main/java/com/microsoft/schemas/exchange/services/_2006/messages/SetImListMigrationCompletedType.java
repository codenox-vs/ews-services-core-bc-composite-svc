package com.microsoft.schemas.exchange.services._2006.messages;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for SetImListMigrationCompletedType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SetImListMigrationCompletedType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ImListMigrationCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SetImListMigrationCompletedType",
        propOrder = {"imListMigrationCompleted"})
public class SetImListMigrationCompletedType extends BaseRequestType {

    @XmlElement(name = "ImListMigrationCompleted")
    protected boolean imListMigrationCompleted;

    /** Gets the value of the imListMigrationCompleted property. */
    public boolean isImListMigrationCompleted() {
        return imListMigrationCompleted;
    }

    /** Sets the value of the imListMigrationCompleted property. */
    public void setImListMigrationCompleted(boolean value) {
        this.imListMigrationCompleted = value;
    }
}
