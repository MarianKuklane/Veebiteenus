
package ee.ttu.idu0075._2015.ws.concert;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for concertType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="concertType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="concertId" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="concertName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="concertDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="place" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="concertDuration" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="category"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="Rock|Pop|Trance|Classic"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="concertPerformerList" type="{http://www.ttu.ee/idu0075/2015/ws/concert}concertPerformerListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "concertType", propOrder = {
    "concertId",
    "concertName",
    "concertDate",
    "price",
    "place",
    "concertDuration",
    "category",
    "concertPerformerList"
})
public class ConcertType {

    @XmlElement(required = true)
    protected BigInteger concertId;
    @XmlElement(required = true)
    protected String concertName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar concertDate;
    protected double price;
    @XmlElement(required = true)
    protected String place;
    protected double concertDuration;
    @XmlElement(required = true)
    protected String category;
    @XmlElement(required = true)
    protected ConcertPerformerListType concertPerformerList;

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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the concertPerformerList property.
     * 
     * @return
     *     possible object is
     *     {@link ConcertPerformerListType }
     *     
     */
    public ConcertPerformerListType getConcertPerformerList() {
        return concertPerformerList;
    }

    /**
     * Sets the value of the concertPerformerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcertPerformerListType }
     *     
     */
    public void setConcertPerformerList(ConcertPerformerListType value) {
        this.concertPerformerList = value;
    }

}
