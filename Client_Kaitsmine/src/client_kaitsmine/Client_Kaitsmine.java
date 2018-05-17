/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_kaitsmine;

import java.math.BigInteger;

public class Client_Kaitsmine
{  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    
    {
      AddPerformerRequest addRequest = new AddPerformerRequest();
        addRequest.setToken("salajane");
        addRequest.setName("Jackson");
        addRequest.setEmail("jack@mail.ee");
        addRequest.setRequestCode(BigInteger.ONE);
        addRequest.setPhone(BigInteger.ONE);
        PerformerType addperformer = addPerformer(addRequest);
        
        GetPerformerRequest performerRequest = new GetPerformerRequest();
        performerRequest.setToken("salajane");
        performerRequest.setId(addperformer.getPerformerId());
        PerformerType performer = getPerformer(performerRequest);
        System.out.println(performer.getName());
    }

    private static PerformerType addPerformer(client_kaitsmine.AddPerformerRequest parameter) 
    {
        client_kaitsmine.ConcertService service = new client_kaitsmine.ConcertService();
        client_kaitsmine.ConcertPortType port = service.getConcertPort();
        return port.addPerformer(parameter);
    }

    private static PerformerType getPerformer(client_kaitsmine.GetPerformerRequest parameter)
    {
        client_kaitsmine.ConcertService service = new client_kaitsmine.ConcertService();
        client_kaitsmine.ConcertPortType port = service.getConcertPort();
        return port.getPerformer(parameter);
    }   
}
