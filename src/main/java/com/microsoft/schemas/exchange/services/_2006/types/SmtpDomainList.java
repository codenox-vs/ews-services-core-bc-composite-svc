package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for SmtpDomainList complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SmtpDomainList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Domain" type="{http://schemas.microsoft.com/exchange/services/2006/types}SmtpDomain" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SmtpDomainList",
        propOrder = {"domain"})
public class SmtpDomainList {

    @XmlElement(name = "Domain")
    protected List<SmtpDomain> domain;

    /**
     * Gets the value of the domain property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the domain property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getDomain().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link SmtpDomain }
     */
    public List<SmtpDomain> getDomain() {
        if (domain == null) {
            domain = new ArrayList<SmtpDomain>();
        }
        return this.domain;
    }
}
