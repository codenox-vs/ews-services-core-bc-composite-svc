package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Array of failed mailbox and error message.
 *
 * <p>Java class for ArrayOfFailedSearchMailboxesType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfFailedSearchMailboxesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FailedMailbox" type="{http://schemas.microsoft.com/exchange/services/2006/types}FailedSearchMailboxType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ArrayOfFailedSearchMailboxesType",
        propOrder = {"failedMailbox"})
public class ArrayOfFailedSearchMailboxesType {

    @XmlElement(name = "FailedMailbox")
    protected List<FailedSearchMailboxType> failedMailbox;

    /**
     * Gets the value of the failedMailbox property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the failedMailbox property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getFailedMailbox().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link FailedSearchMailboxType }
     */
    public List<FailedSearchMailboxType> getFailedMailbox() {
        if (failedMailbox == null) {
            failedMailbox = new ArrayList<FailedSearchMailboxType>();
        }
        return this.failedMailbox;
    }
}
