package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for VotingInformationType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="VotingInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserOptions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfVotingOptionDataType" minOccurs="0"/>
 *         &lt;element name="VotingResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "VotingInformationType",
        propOrder = {"userOptions", "votingResponse"})
public class VotingInformationType {

    @XmlElement(name = "UserOptions")
    protected ArrayOfVotingOptionDataType userOptions;

    @XmlElement(name = "VotingResponse")
    protected String votingResponse;

    /**
     * Gets the value of the userOptions property.
     *
     * @return possible object is {@link ArrayOfVotingOptionDataType }
     */
    public ArrayOfVotingOptionDataType getUserOptions() {
        return userOptions;
    }

    /**
     * Sets the value of the userOptions property.
     *
     * @param value allowed object is {@link ArrayOfVotingOptionDataType }
     */
    public void setUserOptions(ArrayOfVotingOptionDataType value) {
        this.userOptions = value;
    }

    /**
     * Gets the value of the votingResponse property.
     *
     * @return possible object is {@link String }
     */
    public String getVotingResponse() {
        return votingResponse;
    }

    /**
     * Sets the value of the votingResponse property.
     *
     * @param value allowed object is {@link String }
     */
    public void setVotingResponse(String value) {
        this.votingResponse = value;
    }
}
