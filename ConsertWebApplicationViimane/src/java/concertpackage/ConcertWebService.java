/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertpackage;

import com.sun.xml.ws.developer.SchemaValidation;
import ee.ttu.idu0075._2015.ws.concert.AddConcertPerformerRequest;
import ee.ttu.idu0075._2015.ws.concert.AddConcertRequest;
import ee.ttu.idu0075._2015.ws.concert.AddPerformerRequest;
import ee.ttu.idu0075._2015.ws.concert.ConcertPerformerListType;
import ee.ttu.idu0075._2015.ws.concert.ConcertPerformerType;
import ee.ttu.idu0075._2015.ws.concert.ConcertType;
import ee.ttu.idu0075._2015.ws.concert.GetConcertListRequest;
import ee.ttu.idu0075._2015.ws.concert.GetConcertListResponse;
import ee.ttu.idu0075._2015.ws.concert.GetConcertPerformerListRequest;
import ee.ttu.idu0075._2015.ws.concert.GetConcertRequest;
import ee.ttu.idu0075._2015.ws.concert.GetPerformerListRequest;
import ee.ttu.idu0075._2015.ws.concert.GetPerformerListResponse;
import ee.ttu.idu0075._2015.ws.concert.GetPerformerRequest;
import ee.ttu.idu0075._2015.ws.concert.PerformerType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;


@SchemaValidation
@WebService(serviceName = "ConcertService", portName = "ConcertPort", endpointInterface = "ee.ttu.idu0075._2015.ws.concert.ConcertPortType", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/concert", wsdlLocation = "WEB-INF/wsdl/ConcertWebService/ConcertService_2.wsdl")
public class ConcertWebService
{
    
    static int nextConcertId = 1;
    static int nextPerformerId = 1;
    static List<ConcertType> concertList = new ArrayList<ConcertType>();
    static List<PerformerType> performerList = new ArrayList<PerformerType>();
    

    public ConcertType getConcert(GetConcertRequest parameter)
    {
        ConcertType ct = null;
        if (parameter.getToken().equalsIgnoreCase("salajane"))
        {
           for(int i = 0; i < concertList.size(); i++)
           {
               if(concertList.get(i).getConcertId().equals(parameter.getConcertId()))
               {
                   ct = concertList.get(i);
               }
           }
        }    
        return ct;
    }

    public ConcertType addConcert(AddConcertRequest parameter)
    {
      ConcertType ct = new ConcertType();
      if(parameter.getToken().equalsIgnoreCase("salajane"))
      {
          if(parameter.getCatecory().equals("Rock") || parameter.getCatecory().equals("Trance") || parameter.getCatecory().equals("Pop") || parameter.getCatecory().equals("Classic"))
          {
            ct.setCategory(parameter.getCatecory());
            ct.setPrice(parameter.getPrice());
            ct.setConcertDate(parameter.getConcertDate());
            ct.setConcertName(parameter.getConcertName());
            ct.setPlace(parameter.getPlace());
            ct.setConcertId(BigInteger.valueOf(nextConcertId++));
            ct.setConcertDuration(parameter.getConcertDuration());
            ct.setPrice(parameter.getPrice());
            ct.setConcertPerformerList(new ConcertPerformerListType());
            concertList.add(ct);
          }
        else return null;
      }
      return ct;
    }

    public GetConcertListResponse getConcertList(GetConcertListRequest parameter) 
    {
        GetConcertListResponse response = new GetConcertListResponse();
        ConcertType concertType = null;
        if(parameter.getToken().equalsIgnoreCase("salajane"))
        {
            for(int i = 0; i < concertList.size(); i++)
            {
                if (((parameter.getCatecory() != null) && (concertList.get(i).getCategory().equals(parameter.getCatecory()))) &&                      
                    ((parameter.getPlace() != null) && (concertList.get(i).getPlace().equals(parameter.getPlace())))  &&
                    ((parameter.getPrice() != 0) && (concertList.get(i).getPrice() == (parameter.getPrice()))))
                {
                    concertType = concertList.get(i);
                    response.getConcert().add(concertType);
                }
            }
        }
        return response;
    }

    public PerformerType getPerformer(GetPerformerRequest parameter) 
    {
      PerformerType st = null;
        if (parameter.getToken().equalsIgnoreCase("salajane"))
        {
            for (int i = 0; i < performerList.size(); i++)
            {
                if (performerList.get(i).getPerformerId().equals(parameter.getId())) 
                {
                    st = performerList.get(i);
                }
            }    
        }
        return st;
    }

    public PerformerType addPerformer(AddPerformerRequest parameter)
    {
      PerformerType st = new PerformerType();
      if(parameter.getToken().equalsIgnoreCase("salajane"))
      {
        st.setName(parameter.getName());
        st.setPerformerId(BigInteger.valueOf(nextPerformerId++));
        st.setPhone(parameter.getPhone());
        st.setEmail(parameter.getEmail());
        performerList.add(st);
      }
      return st; 
    }

    public GetPerformerListResponse getPerformerList(GetPerformerListRequest parameter) 
    {
       GetPerformerListResponse response = new GetPerformerListResponse();
        if(parameter.getToken().equalsIgnoreCase("salajane"))
        {
            for(PerformerType performerType : performerList)
            {
                response.getPerformer().add(performerType);
            }
        }
        return response;
    }

    public ConcertPerformerListType getConcertPerformerList(GetConcertPerformerListRequest parameter)
    {
        ConcertPerformerListType concertPerformerList = null;
        if(parameter.getToken().equalsIgnoreCase("salajane"))
        {
            for(int i = 0; i < concertList.size(); i++ )
            {
                if(concertList.get(i).getConcertId().equals(parameter.getConcertId()))
                {
                    concertPerformerList = concertList.get(i).getConcertPerformerList();
                }
            }
        }
        return concertPerformerList;
    }

    public ConcertPerformerType addConcertPerformer(AddConcertPerformerRequest parameter) 
    {
       ConcertPerformerType concertPerformer = new ConcertPerformerType();
       if(parameter.getToken().equalsIgnoreCase("salajane"))
       {
           GetPerformerRequest performerRequest = new GetPerformerRequest();
           performerRequest.setId(parameter.getPerformerId());
           performerRequest.setToken(parameter.getToken());
           concertPerformer.setPerformer(getPerformer(performerRequest));
           concertPerformer.setConcertDuration(parameter.getConcertDuration());
           concertPerformer.setPerformerHourPrice(parameter.getPerformerHourPrice());
           
           for(int i =0; i < concertList.size(); i++)
           {
               if(concertList.get(i).getConcertId().equals(parameter.getConcertId()))
                {
                    concertList.get(i).getConcertPerformerList().getConcertPerformer().add(concertPerformer);
                    concertList.get(i).setPrice(concertList.get(i).getPrice() + concertPerformer.getConcertDuration() + concertPerformer.getPerformerHourPrice());
                    return concertPerformer;
                }
           }
           
       }
       return null;
    }  
}
