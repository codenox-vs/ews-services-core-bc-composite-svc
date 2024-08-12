package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.ArrayOfUMCallDataRecordsType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for GetUMCallDataRecordsResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetUMCallDataRecordsResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="CallDataRecords" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfUMCallDataRecordsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetUMCallDataRecordsResponseMessageType",
        propOrder = {"callDataRecords"})
public class GetUMCallDataRecordsResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "CallDataRecords")
    protected ArrayOfUMCallDataRecordsType callDataRecords;

    /**
     * Gets the value of the callDataRecords property.
     *
     * @return possible object is {@link ArrayOfUMCallDataRecordsType }
     */
    public ArrayOfUMCallDataRecordsType getCallDataRecords() {
        return callDataRecords;
    }

    /**
     * Sets the value of the callDataRecords property.
     *
     * @param value allowed object is {@link ArrayOfUMCallDataRecordsType }
     */
    public void setCallDataRecords(ArrayOfUMCallDataRecordsType value) {
        this.callDataRecords = value;
    }
}
