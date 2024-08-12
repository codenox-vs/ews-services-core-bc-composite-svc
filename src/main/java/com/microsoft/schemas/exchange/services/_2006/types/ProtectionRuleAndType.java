package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for ProtectionRuleAndType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProtectionRuleAndType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="AllInternal" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleAllInternalType"/>
 *           &lt;element name="And" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleAndType"/>
 *           &lt;element name="RecipientIs" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleRecipientIsType"/>
 *           &lt;element name="SenderDepartments" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleSenderDepartmentsType"/>
 *           &lt;element name="True" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProtectionRuleTrueType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ProtectionRuleAndType",
        propOrder = {"allInternalOrAndOrRecipientIs"})
public class ProtectionRuleAndType {

    @XmlElementRefs({
        @XmlElementRef(
                name = "True",
                namespace = "http://schemas.microsoft.com/exchange/services/2006/types",
                type = JAXBElement.class),
        @XmlElementRef(
                name = "And",
                namespace = "http://schemas.microsoft.com/exchange/services/2006/types",
                type = JAXBElement.class),
        @XmlElementRef(
                name = "RecipientIs",
                namespace = "http://schemas.microsoft.com/exchange/services/2006/types",
                type = JAXBElement.class),
        @XmlElementRef(
                name = "SenderDepartments",
                namespace = "http://schemas.microsoft.com/exchange/services/2006/types",
                type = JAXBElement.class),
        @XmlElementRef(
                name = "AllInternal",
                namespace = "http://schemas.microsoft.com/exchange/services/2006/types",
                type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> allInternalOrAndOrRecipientIs;

    /**
     * Gets the value of the allInternalOrAndOrRecipientIs property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the allInternalOrAndOrRecipientIs property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getAllInternalOrAndOrRecipientIs().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code
     * <}{@link ProtectionRuleAndType }{@code >} {@link JAXBElement }{@code <}{@link String }{@code
     * >} {@link JAXBElement }{@code <}{@link ProtectionRuleRecipientIsType }{@code >} {@link
     * JAXBElement }{@code <}{@link String }{@code >} {@link JAXBElement }{@code <}{@link
     * ProtectionRuleSenderDepartmentsType }{@code >}
     */
    public List<JAXBElement<?>> getAllInternalOrAndOrRecipientIs() {
        if (allInternalOrAndOrRecipientIs == null) {
            allInternalOrAndOrRecipientIs = new ArrayList<JAXBElement<?>>();
        }
        return this.allInternalOrAndOrRecipientIs;
    }
}
