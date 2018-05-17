
package client_kaitsmine;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="concertName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="concertDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="concertDuration" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="requestCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="place" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="catecory">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="Rock|Pop|Trance|Classic"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "token",
    "concertName",
    "concertDate",
    "concertDuration",
    "requestCode",
    "price",
    "place",
    "catecory"
})
@XmlRootElement(name = "addConcertRequest")
public class AddConcertRequest {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected String concertName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar concertDate;
    protected double concertDuration;
    @XmlElement(required = true)
    protected BigInteger requestCode;
    protected double price;
    @XmlElement(required = true)
    protected String place;
    @XmlElement(required = true)
    protected String catecory;

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
     * Gets the value of the concertName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcertName() {
        return concertName;
    }

    /**
     * Sets the value of the concertName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcertName(String value) {
        this.concertName = value;
    }

    /**
     * Gets the value of the concertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConcertDate() {
        return concertDate;
    }

    /**
     * Sets the value of the concertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConcertDate(XMLGregorianCalendar value) {
        this.concertDate = value;
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
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Gets the value of the catecory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatecory() {
        return catecory;
    }

    /**
     * Sets the value of the catecory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatecory(String value) {
        this.catecory = value;
    }

}
