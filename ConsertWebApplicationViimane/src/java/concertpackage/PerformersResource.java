/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertpackage;

import ee.ttu.idu0075._2015.ws.concert.AddPerformerRequest;
import ee.ttu.idu0075._2015.ws.concert.GetPerformerListRequest;
import ee.ttu.idu0075._2015.ws.concert.GetPerformerListResponse;
import ee.ttu.idu0075._2015.ws.concert.GetPerformerRequest;
import ee.ttu.idu0075._2015.ws.concert.PerformerType;
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
@Path("performers")
public class PerformersResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PerformersResource
     */
    public PerformersResource() {}
   
    @GET
    @Produces("application/json")
    public GetPerformerListResponse getPerformerList(@QueryParam("token")String token) 
    {
        ConcertWebService ws= new ConcertWebService();
        GetPerformerListRequest request = new GetPerformerListRequest();
        request.setToken(token);
        return ws.getPerformerList(request);
    }

    
    @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces("application/json")
    public PerformerType getPerformer(@PathParam("id") String id,
            @QueryParam("token") String token)
    {
        ConcertWebService ws = new ConcertWebService();
        GetPerformerRequest request = new GetPerformerRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getPerformer(request);
    }
    
    /**
     * PUT method for updating or creating an instance of ProductsResource
     * @param content representation for the resource
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public PerformerType addPerformer(AddPerformerRequest content,
            @QueryParam("token") String token) 
    {
        ConcertWebService ws= new ConcertWebService();
        AddPerformerRequest request = new AddPerformerRequest();
        request.setEmail(content.getEmail());
        request.setName(content.getName());
        request.setToken(token);
        request.setPhone(content.getPhone());
        request.setRequestCode(content.getRequestCode());
        return ws.addPerformer(request);
    }
}
