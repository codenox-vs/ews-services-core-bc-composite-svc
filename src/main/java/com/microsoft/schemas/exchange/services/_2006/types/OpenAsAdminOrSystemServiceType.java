package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;

/**
 * Java class for OpenAsAdminOrSystemServiceType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OpenAsAdminOrSystemServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConnectingSID" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConnectingSIDType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LogonType" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}SpecialLogonTypeType" />
 *       &lt;attribute name="BudgetType" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;anyAttribute namespace='http://schemas.xmlsoap.org/soap/envelope/'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "OpenAsAdminOrSystemServiceType",
        propOrder = {"connectingSID"})
public class OpenAsAdminOrSystemServiceType {

    @XmlElement(name = "ConnectingSID", required = true)
    protected ConnectingSIDType connectingSID;

    @XmlAttribute(name = "LogonType", required = true)
    protected SpecialLogonTypeType logonType;

    @XmlAttribute(name = "BudgetType")
    protected Integer budgetType;

    @XmlAnyAttribute private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the connectingSID property.
     *
     * @return possible object is {@link ConnectingSIDType }
     */
    public ConnectingSIDType getConnectingSID() {
        return connectingSID;
    }

    /**
     * Sets the value of the connectingSID property.
     *
     * @param value allowed object is {@link ConnectingSIDType }
     */
    public void setConnectingSID(ConnectingSIDType value) {
        this.connectingSID = value;
    }

    /**
     * Gets the value of the logonType property.
     *
     * @return possible object is {@link SpecialLogonTypeType }
     */
    public SpecialLogonTypeType getLogonType() {
        return logonType;
    }

    /**
     * Sets the value of the logonType property.
     *
     * @param value allowed object is {@link SpecialLogonTypeType }
     */
    public void setLogonType(SpecialLogonTypeType value) {
        this.logonType = value;
    }

    /**
     * Gets the value of the budgetType property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getBudgetType() {
        return budgetType;
    }

    /**
     * Sets the value of the budgetType property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setBudgetType(Integer value) {
        this.budgetType = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     *
     * <p>the map is keyed by the name of the attribute and the value is the string value of the
     * attribute.
     *
     * <p>the map returned by this method is live, and you can add new attribute by updating the map
     * directly. Because of this design, there's no setter.
     *
     * @return always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }
}
