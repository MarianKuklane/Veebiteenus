
package ee.ttu.idu0075._2015.ws.concert;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for concertPerformerListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="concertPerformerListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="concertPerformer" type="{http://www.ttu.ee/idu0075/2015/ws/concert}concertPerformerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "concertPerformerListType", propOrder = {
    "concertPerformer"
})
public class ConcertPerformerListType {

    protected List<ConcertPerformerType> concertPerformer;

    /**
     * Gets the value of the concertPerformer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the concertPerformer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcertPerformer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConcertPerformerType }
     * 
     * 
     */
    public List<ConcertPerformerType> getConcertPerformer() {
        if (concertPerformer == null) {
            concertPerformer = new ArrayList<ConcertPerformerType>();
        }
        return this.concertPerformer;
    }

}
