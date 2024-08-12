package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.PersonaType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for AddNewTelUriContactToGroupResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AddNewTelUriContactToGroupResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="Persona" type="{http://schemas.microsoft.com/exchange/services/2006/types}PersonaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "AddNewTelUriContactToGroupResponseMessageType",
        propOrder = {"persona"})
public class AddNewTelUriContactToGroupResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "Persona")
    protected PersonaType persona;

    /**
     * Gets the value of the persona property.
     *
     * @return possible object is {@link PersonaType }
     */
    public PersonaType getPersona() {
        return persona;
    }

    /**
     * Sets the value of the persona property.
     *
     * @param value allowed object is {@link PersonaType }
     */
    public void setPersona(PersonaType value) {
        this.persona = value;
    }
}
