package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for BaseCalendarItemStateDefinitionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BaseCalendarItemStateDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseCalendarItemStateDefinitionType")
@XmlSeeAlso({
    DeletedOccurrenceStateDefinitionType.class,
    DeleteFromFolderStateDefinitionType.class,
    LocationBasedStateDefinitionType.class
})
public class BaseCalendarItemStateDefinitionType {}
