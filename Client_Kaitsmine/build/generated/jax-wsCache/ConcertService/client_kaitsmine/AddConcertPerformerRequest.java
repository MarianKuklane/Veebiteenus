
package client_kaitsmine;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="concertId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="performerId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
@XmlType(name = "", propOrder = {
    "requestCode",
    "token",
    "concertId",
    "performerId",
    "performerHourPrice",
    "concertDuration"
})
@XmlRootElement(name = "addConcertPerformerRequest")
public class AddConcertPerformerRequest {

    @XmlElement(required = true)
    protected BigInteger requestCode;
    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected BigInteger concertId;
    @XmlElement(required = true)
    protected BigInteger performerId;
    protected double performerHourPrice;
    protected double concertDuration;

    /**
     * Gets the value of the requestCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestCode() {
        return requestCode;
    }

    /**
     * Sets the value of the requestCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestCode(BigInteger value) {
        this.requestCode = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the concertId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConcertId() {
        return concertId;
    }

    /**
     * Sets the value of the concertId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConcertId(BigInteger value) {
        this.concertId = value;
    }

    /**
     * Gets the value of the performerId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPerformerId() {
        return performerId;
    }

    /**
     * Sets the value of the performerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPerformerId(BigInteger value) {
        this.performerId = value;
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
