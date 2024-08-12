package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.ArrayOfPeopleType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for FindPeopleResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FindPeopleResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="People" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPeopleType" minOccurs="0"/>
 *         &lt;element name="TotalNumberOfPeopleInView" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FirstMatchingRowIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FirstLoadedRowIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "FindPeopleResponseMessageType",
        propOrder = {
            "people",
            "totalNumberOfPeopleInView",
            "firstMatchingRowIndex",
            "firstLoadedRowIndex"
        })
public class FindPeopleResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "People")
    protected ArrayOfPeopleType people;

    @XmlElement(name = "TotalNumberOfPeopleInView")
    protected Integer totalNumberOfPeopleInView;

    @XmlElement(name = "FirstMatchingRowIndex")
    protected Integer firstMatchingRowIndex;

    @XmlElement(name = "FirstLoadedRowIndex")
    protected Integer firstLoadedRowIndex;

    /**
     * Gets the value of the people property.
     *
     * @return possible object is {@link ArrayOfPeopleType }
     */
    public ArrayOfPeopleType getPeople() {
        return people;
    }

    /**
     * Sets the value of the people property.
     *
     * @param value allowed object is {@link ArrayOfPeopleType }
     */
    public void setPeople(ArrayOfPeopleType value) {
        this.people = value;
    }

    /**
     * Gets the value of the totalNumberOfPeopleInView property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getTotalNumberOfPeopleInView() {
        return totalNumberOfPeopleInView;
    }

    /**
     * Sets the value of the totalNumberOfPeopleInView property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setTotalNumberOfPeopleInView(Integer value) {
        this.totalNumberOfPeopleInView = value;
    }

    /**
     * Gets the value of the firstMatchingRowIndex property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getFirstMatchingRowIndex() {
        return firstMatchingRowIndex;
    }

    /**
     * Sets the value of the firstMatchingRowIndex property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setFirstMatchingRowIndex(Integer value) {
        this.firstMatchingRowIndex = value;
    }

    /**
     * Gets the value of the firstLoadedRowIndex property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getFirstLoadedRowIndex() {
        return firstLoadedRowIndex;
    }

    /**
     * Sets the value of the firstLoadedRowIndex property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setFirstLoadedRowIndex(Integer value) {
        this.firstLoadedRowIndex = value;
    }
}
