package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for ArrayOfPersonaAttributionsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfPersonaAttributionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attribution" type="{http://schemas.microsoft.com/exchange/services/2006/types}PersonaAttributionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ArrayOfPersonaAttributionsType",
        propOrder = {"attribution"})
public class ArrayOfPersonaAttributionsType {

    @XmlElement(name = "Attribution", required = true)
    protected List<PersonaAttributionType> attribution;

    /**
     * Gets the value of the attribution property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the attribution property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getAttribution().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link PersonaAttributionType }
     */
    public List<PersonaAttributionType> getAttribution() {
        if (attribution == null) {
            attribution = new ArrayList<PersonaAttributionType>();
        }
        return this.attribution;
    }
}
