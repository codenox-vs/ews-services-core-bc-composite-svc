package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.RecognitionResultType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for CompleteFindInGALSpeechRecognitionResponseMessageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CompleteFindInGALSpeechRecognitionResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="RecognitionResult" type="{http://schemas.microsoft.com/exchange/services/2006/types}RecognitionResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "CompleteFindInGALSpeechRecognitionResponseMessageType",
        propOrder = {"recognitionResult"})
public class CompleteFindInGALSpeechRecognitionResponseMessageType extends ResponseMessageType {

    @XmlElement(name = "RecognitionResult")
    protected RecognitionResultType recognitionResult;

    /**
     * Gets the value of the recognitionResult property.
     *
     * @return possible object is {@link RecognitionResultType }
     */
    public RecognitionResultType getRecognitionResult() {
        return recognitionResult;
    }

    /**
     * Sets the value of the recognitionResult property.
     *
     * @param value allowed object is {@link RecognitionResultType }
     */
    public void setRecognitionResult(RecognitionResultType value) {
        this.recognitionResult = value;
    }
}
