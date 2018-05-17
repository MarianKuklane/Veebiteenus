
package ee.ttu.idu0075._2015.ws.concert;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.ttu.idu0075._2015.ws.concert package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetConcertResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/concert", "getConcertResponse");
    private final static QName _AddConcertResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/concert", "addConcertResponse");
    private final static QName _GetPerformerResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/concert", "getPerformerResponse");
    private final static QName _AddPerformerResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/concert", "addPerformerResponse");
    private final static QName _GetConcertPerformerListResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/concert", "getConcertPerformerListResponse");
    private final static QName _AddConcertPerformerResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/concert", "addConcertPerformerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.ttu.idu0075._2015.ws.concert
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetConcertRequest }
     * 
     */
    public GetConcertRequest createGetConcertRequest() {
        return new GetConcertRequest();
    }

    /**
     * Create an instance of {@link ConcertType }
     * 
     */
    public ConcertType createConcertType() {
        return new ConcertType();
    }

    /**
     * Create an instance of {@link AddConcertRequest }
     * 
     */
    public AddConcertRequest createAddConcertRequest() {
        return new AddConcertRequest();
    }

    /**
     * Create an instance of {@link GetConcertListRequest }
     * 
     */
    public GetConcertListRequest createGetConcertListRequest() {
        return new GetConcertListRequest();
    }

    /**
     * Create an instance of {@link GetConcertListResponse }
     * 
     */
    public GetConcertListResponse createGetConcertListResponse() {
        return new GetConcertListResponse();
    }

    /**
     * Create an instance of {@link GetPerformerRequest }
     * 
     */
    public GetPerformerRequest createGetPerformerRequest() {
        return new GetPerformerRequest();
    }

    /**
     * Create an instance of {@link PerformerType }
     * 
     */
    public PerformerType createPerformerType() {
        return new PerformerType();
    }

    /**
     * Create an instance of {@link AddPerformerRequest }
     * 
     */
    public AddPerformerRequest createAddPerformerRequest() {
        return new AddPerformerRequest();
    }

    /**
     * Create an instance of {@link GetPerformerListRequest }
     * 
     */
    public GetPerformerListRequest createGetPerformerListRequest() {
        return new GetPerformerListRequest();
    }

    /**
     * Create an instance of {@link GetPerformerListResponse }
     * 
     */
    public GetPerformerListResponse createGetPerformerListResponse() {
        return new GetPerformerListResponse();
    }

    /**
     * Create an instance of {@link GetConcertPerformerListRequest }
     * 
     */
    public GetConcertPerformerListRequest createGetConcertPerformerListRequest() {
        return new GetConcertPerformerListRequest();
    }

    /**
     * Create an instance of {@link ConcertPerformerListType }
     * 
     */
    public ConcertPerformerListType createConcertPerformerListType() {
        return new ConcertPerformerListType();
    }

    /**
     * Create an instance of {@link AddConcertPerformerRequest }
     * 
     */
    public AddConcertPerformerRequest createAddConcertPerformerRequest() {
        return new AddConcertPerformerRequest();
    }

    /**
     * Create an instance of {@link ConcertPerformerType }
     * 
     */
    public ConcertPerformerType createConcertPerformerType() {
        return new ConcertPerformerType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConcertType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/concert", name = "getConcertResponse")
    public JAXBElement<ConcertType> createGetConcertResponse(ConcertType value) {
        return new JAXBElement<ConcertType>(_GetConcertResponse_QNAME, ConcertType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConcertType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/concert", name = "addConcertResponse")
    public JAXBElement<ConcertType> createAddConcertResponse(ConcertType value) {
        return new JAXBElement<ConcertType>(_AddConcertResponse_QNAME, ConcertType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/concert", name = "getPerformerResponse")
    public JAXBElement<PerformerType> createGetPerformerResponse(PerformerType value) {
        return new JAXBElement<PerformerType>(_GetPerformerResponse_QNAME, PerformerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/concert", name = "addPerformerResponse")
    public JAXBElement<PerformerType> createAddPerformerResponse(PerformerType value) {
        return new JAXBElement<PerformerType>(_AddPerformerResponse_QNAME, PerformerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConcertPerformerListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/concert", name = "getConcertPerformerListResponse")
    public JAXBElement<ConcertPerformerListType> createGetConcertPerformerListResponse(ConcertPerformerListType value) {
        return new JAXBElement<ConcertPerformerListType>(_GetConcertPerformerListResponse_QNAME, ConcertPerformerListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConcertPerformerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/concert", name = "addConcertPerformerResponse")
    public JAXBElement<ConcertPerformerType> createAddConcertPerformerResponse(ConcertPerformerType value) {
        return new JAXBElement<ConcertPerformerType>(_AddConcertPerformerResponse_QNAME, ConcertPerformerType.class, null, value);
    }

}
