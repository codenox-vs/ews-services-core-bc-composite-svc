package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.UMCDRGroupByType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for GetUMCallSummaryType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetUMCallSummaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="DailPlanGuid" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/>
 *         &lt;element name="GatewayGuid" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/>
 *         &lt;element name="GroupRecordsBy" type="{http://schemas.microsoft.com/exchange/services/2006/types}UMCDRGroupByType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GetUMCallSummaryType",
        propOrder = {"dailPlanGuid", "gatewayGuid", "groupRecordsBy"})
public class GetUMCallSummaryType extends BaseRequestType {

    @XmlElement(name = "DailPlanGuid", required = true)
    protected String dailPlanGuid;

    @XmlElement(name = "GatewayGuid", required = true)
    protected String gatewayGuid;

    @XmlElement(name = "GroupRecordsBy", required = true)
    protected UMCDRGroupByType groupRecordsBy;

    /**
     * Gets the value of the dailPlanGuid property.
     *
     * @return possible object is {@link String }
     */
    public String getDailPlanGuid() {
        return dailPlanGuid;
    }

    /**
     * Sets the value of the dailPlanGuid property.
     *
     * @param value allowed object is {@link String }
     */
    public void setDailPlanGuid(String value) {
        this.dailPlanGuid = value;
    }

    /**
     * Gets the value of the gatewayGuid property.
     *
     * @return possible object is {@link String }
     */
    public String getGatewayGuid() {
        return gatewayGuid;
    }

    /**
     * Sets the value of the gatewayGuid property.
     *
     * @param value allowed object is {@link String }
     */
    public void setGatewayGuid(String value) {
        this.gatewayGuid = value;
    }

    /**
     * Gets the value of the groupRecordsBy property.
     *
     * @return possible object is {@link UMCDRGroupByType }
     */
    public UMCDRGroupByType getGroupRecordsBy() {
        return groupRecordsBy;
    }

    /**
     * Sets the value of the groupRecordsBy property.
     *
     * @param value allowed object is {@link UMCDRGroupByType }
     */
    public void setGroupRecordsBy(UMCDRGroupByType value) {
        this.groupRecordsBy = value;
    }
}
