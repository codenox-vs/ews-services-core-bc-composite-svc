package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Java class for DeletedOccurrenceStateDefinitionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DeletedOccurrenceStateDefinitionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseCalendarItemStateDefinitionType">
 *       &lt;sequence>
 *         &lt;element name="OccurrenceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsOccurrencePresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DeletedOccurrenceStateDefinitionType",
        propOrder = {"occurrenceDate", "isOccurrencePresent"})
public class DeletedOccurrenceStateDefinitionType extends BaseCalendarItemStateDefinitionType {

    @XmlElement(name = "OccurrenceDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar occurrenceDate;

    @XmlElement(name = "IsOccurrencePresent")
    protected Boolean isOccurrencePresent;

    /**
     * Gets the value of the occurrenceDate property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getOccurrenceDate() {
        return occurrenceDate;
    }

    /**
     * Sets the value of the occurrenceDate property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setOccurrenceDate(XMLGregorianCalendar value) {
        this.occurrenceDate = value;
    }

    /**
     * Gets the value of the isOccurrencePresent property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsOccurrencePresent() {
        return isOccurrencePresent;
    }

    /**
     * Sets the value of the isOccurrencePresent property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIsOccurrencePresent(Boolean value) {
        this.isOccurrencePresent = value;
    }
}
