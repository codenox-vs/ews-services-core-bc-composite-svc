package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for NonEmptyArrayOfInternetHeadersType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfInternetHeadersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InternetMessageHeader" type="{http://schemas.microsoft.com/exchange/services/2006/types}InternetHeaderType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NonEmptyArrayOfInternetHeadersType",
        propOrder = {"internetMessageHeader"})
public class NonEmptyArrayOfInternetHeadersType {

    @XmlElement(name = "InternetMessageHeader", required = true)
    protected List<InternetHeaderType> internetMessageHeader;

    /**
     * Gets the value of the internetMessageHeader property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the internetMessageHeader property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getInternetMessageHeader().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link InternetHeaderType }
     */
    public List<InternetHeaderType> getInternetMessageHeader() {
        if (internetMessageHeader == null) {
            internetMessageHeader = new ArrayList<InternetHeaderType>();
        }
        return this.internetMessageHeader;
    }
}
