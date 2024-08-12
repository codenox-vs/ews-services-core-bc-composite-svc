package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Java class for MeetingResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MeetingResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingMessageType">
 *       &lt;sequence>
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recurrence" type="{http://schemas.microsoft.com/exchange/services/2006/types}RecurrenceType" minOccurs="0"/>
 *         &lt;element name="CalendarItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProposedStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ProposedEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EnhancedLocation" type="{http://schemas.microsoft.com/exchange/services/2006/types}EnhancedLocationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "MeetingResponseMessageType",
        propOrder = {
            "start",
            "end",
            "location",
            "recurrence",
            "calendarItemType",
            "proposedStart",
            "proposedEnd",
            "enhancedLocation"
        })
public class MeetingResponseMessageType extends MeetingMessageType {

    @XmlElement(name = "Start")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;

    @XmlElement(name = "End")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;

    @XmlElement(name = "Location")
    protected String location;

    @XmlElement(name = "Recurrence")
    protected RecurrenceType recurrence;

    @XmlElement(name = "CalendarItemType")
    protected String calendarItemType;

    @XmlElement(name = "ProposedStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar proposedStart;

    @XmlElement(name = "ProposedEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar proposedEnd;

    @XmlElement(name = "EnhancedLocation")
    protected EnhancedLocationType enhancedLocation;

    /**
     * Gets the value of the start property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * Gets the value of the location property.
     *
     * @return possible object is {@link String }
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value allowed object is {@link String }
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the recurrence property.
     *
     * @return possible object is {@link RecurrenceType }
     */
    public RecurrenceType getRecurrence() {
        return recurrence;
    }

    /**
     * Sets the value of the recurrence property.
     *
     * @param value allowed object is {@link RecurrenceType }
     */
    public void setRecurrence(RecurrenceType value) {
        this.recurrence = value;
    }

    /**
     * Gets the value of the calendarItemType property.
     *
     * @return possible object is {@link String }
     */
    public String getCalendarItemType() {
        return calendarItemType;
    }

    /**
     * Sets the value of the calendarItemType property.
     *
     * @param value allowed object is {@link String }
     */
    public void setCalendarItemType(String value) {
        this.calendarItemType = value;
    }

    /**
     * Gets the value of the proposedStart property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getProposedStart() {
        return proposedStart;
    }

    /**
     * Sets the value of the proposedStart property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setProposedStart(XMLGregorianCalendar value) {
        this.proposedStart = value;
    }

    /**
     * Gets the value of the proposedEnd property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getProposedEnd() {
        return proposedEnd;
    }

    /**
     * Sets the value of the proposedEnd property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setProposedEnd(XMLGregorianCalendar value) {
        this.proposedEnd = value;
    }

    /**
     * Gets the value of the enhancedLocation property.
     *
     * @return possible object is {@link EnhancedLocationType }
     */
    public EnhancedLocationType getEnhancedLocation() {
        return enhancedLocation;
    }

    /**
     * Sets the value of the enhancedLocation property.
     *
     * @param value allowed object is {@link EnhancedLocationType }
     */
    public void setEnhancedLocation(EnhancedLocationType value) {
        this.enhancedLocation = value;
    }
}
