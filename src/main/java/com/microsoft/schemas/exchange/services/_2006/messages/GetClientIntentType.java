package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.NonEmptyStateDefinitionType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for GetClientIntentType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetClientIntentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="GlobalObjectId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StateDefinition" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStateDefinitionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetClientIntentType",
        propOrder = {"globalObjectId", "stateDefinition"})
public class GetClientIntentType extends BaseRequestType {

    @XmlElement(name = "GlobalObjectId", required = true)
    protected String globalObjectId;

    @XmlElement(name = "StateDefinition", required = true)
    protected NonEmptyStateDefinitionType stateDefinition;

    /**
     * Gets the value of the globalObjectId property.
     *
     * @return possible object is {@link String }
     */
    public String getGlobalObjectId() {
        return globalObjectId;
    }

    /**
     * Sets the value of the globalObjectId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setGlobalObjectId(String value) {
        this.globalObjectId = value;
    }

    /**
     * Gets the value of the stateDefinition property.
     *
     * @return possible object is {@link NonEmptyStateDefinitionType }
     */
    public NonEmptyStateDefinitionType getStateDefinition() {
        return stateDefinition;
    }

    /**
     * Sets the value of the stateDefinition property.
     *
     * @param value allowed object is {@link NonEmptyStateDefinitionType }
     */
    public void setStateDefinition(NonEmptyStateDefinitionType value) {
        this.stateDefinition = value;
    }
}
