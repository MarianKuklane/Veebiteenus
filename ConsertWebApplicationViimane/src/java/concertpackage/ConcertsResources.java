/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertpackage;


import ee.ttu.idu0075._2015.ws.concert.AddConcertPerformerRequest;
import ee.ttu.idu0075._2015.ws.concert.AddConcertRequest;
import ee.ttu.idu0075._2015.ws.concert.ConcertPerformerListType;
import ee.ttu.idu0075._2015.ws.concert.ConcertPerformerType;
import ee.ttu.idu0075._2015.ws.concert.ConcertType;
import ee.ttu.idu0075._2015.ws.concert.GetConcertListRequest;
import ee.ttu.idu0075._2015.ws.concert.GetConcertListResponse;
import ee.ttu.idu0075._2015.ws.concert.GetConcertPerformerListRequest;
import ee.ttu.idu0075._2015.ws.concert.GetConcertRequest;
import java.math.BigInteger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;


/**
 * REST Web Service
 *
 * 
 */
@Path("concerts")
public class ConcertsResources
{
    @Context
    private UriInfo context;
    public ConcertsResources()
    {
    }

    @GET
    @Path("{id : \\d+}") //support digit only
    @Produces("application/json")
    public ConcertType getconcert(@PathParam("id") String id,
            @QueryParam("token") String token) 
    {
        ConcertWebService ws = new ConcertWebService();
        GetConcertRequest request = new GetConcertRequest();
        request.setConcertId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getConcert(request);
    }
    
   
    @GET
    @Produces("application/json")
    public GetConcertListResponse getConcertList(@QueryParam("token") String token, @QueryParam("price") Double price,
            @QueryParam("catecory") String catecory, @QueryParam("place") String place) 
   {
        ConcertWebService ws = new ConcertWebService();
        //ConcertType content = new ConcertType();
        GetConcertListRequest request = new GetConcertListRequest();
        request.setToken(token);
        request.setPrice(price);
        request.setCatecory(catecory);
        request.setPlace(place);
        return ws.getConcertList(request); 
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public ConcertType addConcert(ConcertType content,@QueryParam("token") String token, @QueryParam("requestCode") BigInteger requestCode) 
    {
        ConcertWebService ws = new ConcertWebService();
        AddConcertRequest request = new AddConcertRequest();
        request.setToken(token);
        request.setPlace(content.getPlace());
        request.setCatecory(content.getCategory());
        request.setConcertDate(content.getConcertDate());
        request.setConcertDuration(content.getConcertDuration());
        request.setConcertName(content.getConcertName());
        request.setPrice(content.getPrice());
        request.setRequestCode(requestCode);
       
        return ws.addConcert(request);    
    }
    
    
    
    @GET
    @Path("{id : \\d+}/performers") //support digit only
    @Produces("application/json")
    public ConcertPerformerListType getConcertPerformerList(@PathParam("id") String id,
            @QueryParam("token") String token)
    {
        ConcertWebService ws = new ConcertWebService();
        GetConcertPerformerListRequest request = new GetConcertPerformerListRequest();
        request.setConcertId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getConcertPerformerList(request);
    }
    
       
    @POST
    @Path("{id : \\d+}/performers") //support digit only
    @Consumes("application/json")
    @Produces("application/json")
    public ConcertPerformerType addConcertPerformer(AddConcertPerformerRequest content, 
                                @QueryParam("token") String token,
                                @PathParam("id") String id) 
    {
        ConcertWebService ws = new ConcertWebService();
        AddConcertPerformerRequest request = new AddConcertPerformerRequest();
        request.setToken(token);
        request.setConcertId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setPerformerId(content.getPerformerId());
        request.setConcertDuration(content.getConcertDuration());
        request.setRequestCode(content.getRequestCode());
        request.setPerformerHourPrice(content.getPerformerHourPrice());
        return ws.addConcertPerformer(request);    
    }
}

