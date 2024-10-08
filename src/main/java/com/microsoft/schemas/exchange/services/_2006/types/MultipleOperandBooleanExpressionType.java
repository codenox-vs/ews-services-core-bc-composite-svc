package com.microsoft.schemas.exchange.services._2006.types;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

/**
 * Java class for MultipleOperandBooleanExpressionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MultipleOperandBooleanExpressionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}SearchExpressionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.microsoft.com/exchange/services/2006/types}SearchExpression" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "MultipleOperandBooleanExpressionType",
        propOrder = {"searchExpression"})
@XmlSeeAlso({OrType.class, AndType.class})
public abstract class MultipleOperandBooleanExpressionType extends SearchExpressionType {

    @XmlElementRef(
            name = "SearchExpression",
            namespace = "http://schemas.microsoft.com/exchange/services/2006/types",
            type = JAXBElement.class)
    protected List<JAXBElement<? extends SearchExpressionType>> searchExpression;

    /**
     * Gets the value of the searchExpression property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the searchExpression property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getSearchExpression().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code
     * <}{@link IsGreaterThanType }{@code >} {@link JAXBElement }{@code <}{@link
     * IsLessThanOrEqualToType }{@code >} {@link JAXBElement }{@code <}{@link ExcludesType }{@code
     * >} {@link JAXBElement }{@code <}{@link ExistsType }{@code >} {@link JAXBElement }{@code
     * <}{@link AndType }{@code >} {@link JAXBElement }{@code <}{@link IsLessThanType }{@code >}
     * {@link JAXBElement }{@code <}{@link SearchExpressionType }{@code >} {@link JAXBElement
     * }{@code <}{@link ContainsExpressionType }{@code >} {@link JAXBElement }{@code <}{@link
     * IsEqualToType }{@code >} {@link JAXBElement }{@code <}{@link IsNotEqualToType }{@code >}
     * {@link JAXBElement }{@code <}{@link NotType }{@code >} {@link JAXBElement }{@code <}{@link
     * OrType }{@code >} {@link JAXBElement }{@code <}{@link IsGreaterThanOrEqualToType }{@code >}
     */
    public List<JAXBElement<? extends SearchExpressionType>> getSearchExpression() {
        if (searchExpression == null) {
            searchExpression = new ArrayList<JAXBElement<? extends SearchExpressionType>>();
        }
        return this.searchExpression;
    }
}
