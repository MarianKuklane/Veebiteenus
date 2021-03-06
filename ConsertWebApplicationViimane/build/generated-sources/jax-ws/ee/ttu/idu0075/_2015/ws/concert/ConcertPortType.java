
package ee.ttu.idu0075._2015.ws.concert;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ConcertPortType", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/concert")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConcertPortType {


    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws.concert.ConcertType
     */
    @WebMethod
    @WebResult(name = "getConcertResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/concert", partName = "parameter")
    public ConcertType getConcert(
        @WebParam(name = "getConcertRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/concert", partName = "parameter")
        GetConcertRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws.concert.ConcertType
     */
    @WebMethod
    @WebResult(name = "addConcertResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/concert", partName = "parameter")
    public ConcertType addConcert(
        @WebParam(name = "addConcertRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/concert", partName = "parameter")
        AddConcertRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws.concert.GetConcertListResponse
     */
    @WebMethod
    @WebResult(name = "getConcertListResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/concert", partName = "parameter")
    public GetConcertListResponse getConcertList(
        @WebParam(name = "getConcertListRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/concert", partName = "parameter")
        GetConcertListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws.concert.PerformerType
     */
    @WebMethod
    @WebResult(name = "getPerformerResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/concert", partName = "parameter")
    public PerformerType getPerformer(
        @WebParam(name = "getPerformerRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/concert", partName = "parameter")
        GetPerformerRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws.concert.PerformerType
     */
    @WebMethod
    @WebResult(name = "addPerformerResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/concert", partName = "parameter")
    public PerformerType addPerformer(
        @WebParam(name = "addPerformerRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/concert", partName = "parameter")
        AddPerformerRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws.concert.GetPerformerListResponse
     */
    @WebMethod
    @WebResult(name = "getPerformerListResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/concert", partName = "parameter")
    public GetPerformerListResponse getPerformerList(
        @WebParam(name = "getPerformerListRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/concert", partName = "parameter")
        GetPerformerListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws.concert.ConcertPerformerListType
     */
    @WebMethod
    @WebResult(name = "getConcertPerformerListResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/concert", partName = "parameter")
    public ConcertPerformerListType getConcertPerformerList(
        @WebParam(name = "getConcertPerformerListRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/concert", partName = "parameter")
        GetConcertPerformerListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._2015.ws.concert.ConcertPerformerType
     */
    @WebMethod
    @WebResult(name = "addConcertPerformerResponse", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/concert", partName = "parameter")
    public ConcertPerformerType addConcertPerformer(
        @WebParam(name = "addConcertPerformerRequest", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/concert", partName = "parameter")
        AddConcertPerformerRequest parameter);

}
