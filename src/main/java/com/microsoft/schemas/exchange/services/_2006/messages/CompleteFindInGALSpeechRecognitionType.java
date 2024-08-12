package com.microsoft.schemas.exchange.services._2006.messages;

import com.microsoft.schemas.exchange.services._2006.types.RecognitionIdType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Java class for CompleteFindInGALSpeechRecognitionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CompleteFindInGALSpeechRecognitionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="RecognitionId" type="{http://schemas.microsoft.com/exchange/services/2006/types}RecognitionIdType"/>
 *         &lt;element name="AudioData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "CompleteFindInGALSpeechRecognitionType",
        propOrder = {"recognitionId", "audioData"})
public class CompleteFindInGALSpeechRecognitionType extends BaseRequestType {

    @XmlElement(name = "RecognitionId", required = true)
    protected RecognitionIdType recognitionId;

    @XmlElement(name = "AudioData", required = true)
    protected byte[] audioData;

    /**
     * Gets the value of the recognitionId property.
     *
     * @return possible object is {@link RecognitionIdType }
     */
    public RecognitionIdType getRecognitionId() {
        return recognitionId;
    }

    /**
     * Sets the value of the recognitionId property.
     *
     * @param value allowed object is {@link RecognitionIdType }
     */
    public void setRecognitionId(RecognitionIdType value) {
        this.recognitionId = value;
    }

    /**
     * Gets the value of the audioData property.
     *
     * @return possible object is byte[]
     */
    public byte[] getAudioData() {
        return audioData;
    }

    /**
     * Sets the value of the audioData property.
     *
     * @param value allowed object is byte[]
     */
    public void setAudioData(byte[] value) {
        this.audioData = ((byte[]) value);
    }
}
