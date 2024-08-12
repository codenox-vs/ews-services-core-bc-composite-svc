package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for ArrayOfPeopleType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfPeopleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Persona" type="{http://schemas.microsoft.com/exchange/services/2006/types}PersonaType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ArrayOfPeopleType",
        propOrder = {"persona"})
public class ArrayOfPeopleType {

    @XmlElement(name = "Persona")
    protected List<PersonaType> persona;

    /**
     * Gets the value of the persona property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the persona property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getPersona().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link PersonaType }
     */
    public List<PersonaType> getPersona() {
        if (persona == null) {
            persona = new ArrayList<PersonaType>();
        }
        return this.persona;
    }
}
