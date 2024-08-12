package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for ArrayOfHighlightTermsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfHighlightTermsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Term" type="{http://schemas.microsoft.com/exchange/services/2006/types}HighlightTermType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ArrayOfHighlightTermsType",
        propOrder = {"term"})
public class ArrayOfHighlightTermsType {

    @XmlElement(name = "Term")
    protected List<HighlightTermType> term;

    /**
     * Gets the value of the term property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the term property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getTerm().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link HighlightTermType }
     */
    public List<HighlightTermType> getTerm() {
        if (term == null) {
            term = new ArrayList<HighlightTermType>();
        }
        return this.term;
    }
}
