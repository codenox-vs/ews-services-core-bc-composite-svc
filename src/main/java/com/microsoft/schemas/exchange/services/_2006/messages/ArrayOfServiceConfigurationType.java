package com.microsoft.schemas.exchange.services._2006.messages;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for ArrayOfServiceConfigurationType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfServiceConfigurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="ConfigurationName" type="{http://schemas.microsoft.com/exchange/services/2006/types}ServiceConfigurationType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ArrayOfServiceConfigurationType",
        propOrder = {"configurationName"})
public class ArrayOfServiceConfigurationType {

    @XmlElementRef(
            name = "ConfigurationName",
            namespace = "http://schemas.microsoft.com/exchange/services/2006/messages",
            type = JAXBElement.class)
    protected List<JAXBElement<List<String>>> configurationName;

    /**
     * Gets the value of the configurationName property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the configurationName property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getConfigurationName().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code
     * <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    public List<JAXBElement<List<String>>> getConfigurationName() {
        if (configurationName == null) {
            configurationName = new ArrayList<JAXBElement<List<String>>>();
        }
        return this.configurationName;
    }
}
