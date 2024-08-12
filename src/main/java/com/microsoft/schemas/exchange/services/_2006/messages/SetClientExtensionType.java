package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.ArrayOfSetClientExtensionActionsType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for SetClientExtensionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SetClientExtensionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="Actions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSetClientExtensionActionsType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SetClientExtensionType",
        propOrder = {"actions"})
public class SetClientExtensionType extends BaseRequestType {

    @XmlElement(name = "Actions", required = true)
    protected ArrayOfSetClientExtensionActionsType actions;

    /**
     * Gets the value of the actions property.
     *
     * @return possible object is {@link ArrayOfSetClientExtensionActionsType }
     */
    public ArrayOfSetClientExtensionActionsType getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     *
     * @param value allowed object is {@link ArrayOfSetClientExtensionActionsType }
     */
    public void setActions(ArrayOfSetClientExtensionActionsType value) {
        this.actions = value;
    }
}
