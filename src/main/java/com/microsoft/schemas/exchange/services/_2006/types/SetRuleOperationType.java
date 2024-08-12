package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for SetRuleOperationType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SetRuleOperationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}RuleOperationType">
 *       &lt;sequence>
 *         &lt;element name="Rule" type="{http://schemas.microsoft.com/exchange/services/2006/types}RuleType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "SetRuleOperationType",
        propOrder = {"rule"})
public class SetRuleOperationType extends RuleOperationType {

    @XmlElement(name = "Rule", required = true)
    protected RuleType rule;

    /**
     * Gets the value of the rule property.
     *
     * @return possible object is {@link RuleType }
     */
    public RuleType getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     *
     * @param value allowed object is {@link RuleType }
     */
    public void setRule(RuleType value) {
        this.rule = value;
    }
}
