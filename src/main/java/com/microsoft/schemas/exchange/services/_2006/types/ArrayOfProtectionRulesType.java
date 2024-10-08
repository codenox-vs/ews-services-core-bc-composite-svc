package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for ArrayOfProtectionRulesType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfProtectionRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rule" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ArrayOfProtectionRulesType",
        propOrder = {"rule"})
public class ArrayOfProtectionRulesType {

    @XmlElement(name = "Rule")
    protected List<ProtectionRuleType> rule;

    /**
     * Gets the value of the rule property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the rule property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getRule().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link ProtectionRuleType }
     */
    public List<ProtectionRuleType> getRule() {
        if (rule == null) {
            rule = new ArrayList<ProtectionRuleType>();
        }
        return this.rule;
    }
}
