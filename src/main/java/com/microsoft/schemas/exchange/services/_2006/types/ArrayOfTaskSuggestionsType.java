package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for ArrayOfTaskSuggestionsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfTaskSuggestionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaskSuggestion" type="{http://schemas.microsoft.com/exchange/services/2006/types}TaskSuggestionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ArrayOfTaskSuggestionsType",
        propOrder = {"taskSuggestion"})
public class ArrayOfTaskSuggestionsType {

    @XmlElement(name = "TaskSuggestion", required = true)
    protected List<TaskSuggestionType> taskSuggestion;

    /**
     * Gets the value of the taskSuggestion property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the taskSuggestion property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getTaskSuggestion().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link TaskSuggestionType }
     */
    public List<TaskSuggestionType> getTaskSuggestion() {
        if (taskSuggestion == null) {
            taskSuggestion = new ArrayList<TaskSuggestionType>();
        }
        return this.taskSuggestion;
    }
}
