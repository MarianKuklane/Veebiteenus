
package client_kaitsmine;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for concertPerformerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="concertPerformerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="performer" type="{http://www.ttu.ee/idu0075/2015/ws/concert}performerType"/>
 *         &lt;element name="performerHourPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="concertDuration" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "concertPerformerType", propOrder = {
    "performer",
    "performerHourPrice",
    "concertDuration"
})
public class ConcertPerformerType {

    @XmlElement(required = true)
    protected PerformerType performer;
    protected double performerHourPrice;
    protected double concertDuration;

    /**
     * Gets the value of the performer property.
     * 
     * @return
     *     possible object is
     *     {@link PerformerType }
     *     
     */
    public PerformerType getPerformer() {
        return performer;
    }

    /**
     * Sets the value of the performer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformerType }
     *     
     */
    public void setPerformer(PerformerType value) {
        this.performer = value;
    }

    /**
     * Gets the value of the performerHourPrice property.
     * 
     */
    public double getPerformerHourPrice() {
        return performerHourPrice;
    }

    /**
     * Sets the value of the performerHourPrice property.
     * 
     */
    public void setPerformerHourPrice(double value) {
        this.performerHourPrice = value;
    }

    /**
     * Gets the value of the concertDuration property.
     * 
     */
    public double getConcertDuration() {
        return concertDuration;
    }

    /**
     * Sets the value of the concertDuration property.
     * 
     */
    public void setConcertDuration(double value) {
        this.concertDuration = value;
    }

}
