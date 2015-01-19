package project.phrase.resources;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.PersistenceUnit;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;
import project.phrase.models.Phrase;

@Path("/phrase")
public class PhraseRes {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	@PersistenceUnit(unitName="introsde-jpa")
	EntityManager entityManager;

	@PersistenceContext(unitName = "introsde-jpa", type=PersistenceContextType.TRANSACTION)
	private EntityManagerFactory entityManagerFactory;
        
        
    @GET
    @Produces({ MediaType.APPLICATION_JSON})
	public ArrayList<Phrase> getPhrases(
                @QueryParam("bmilvl") int bmilvl,
                @QueryParam("change") int change,
                @QueryParam("wt1") int wT1,
                @QueryParam("wt2") int wT2,
                @QueryParam("wt3") int wT3) {
//
//            System.err.println("ciao");
//            int change = 0;
//            if(bmiold != 0){
//                if(bmi > bmiold)
//                    change = 1;
//                else
//                    change = 2;
//            }
//            int bmiType = utils.BMIUtils.getLevelByBmi(bmi);
            
            ArrayList<Phrase> phs = new ArrayList();
            
            
            
            phs.add(Phrase.getPhraseByWeatherAndByBmi(bmilvl,change, wT1));
            phs.add(Phrase.getPhraseByWeatherAndByBmi(bmilvl,change, wT2));
            phs.add(Phrase.getPhraseByWeatherAndByBmi(bmilvl,change, wT3));
            
            return phs;
	}
} 
