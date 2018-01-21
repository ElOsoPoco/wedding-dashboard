/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weddingDashboard.main;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author oso1018
 */
@Path("dashboard")
public class DashboardEndpoint {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of DashboardResource
     */
    public DashboardEndpoint() {
    }

    /**
     * Retrieves representation of an instance of com.keepingUpWithTheKeims.main.DashboardEndpoint
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of DashboardEndpoint
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    /**
     * POST method
     * @param credentials         
     * @return          
     */
    @POST
    @Path("/post_dashboard")
    @Consumes(MediaType.APPLICATION_JSON) 
    @Produces(MediaType.APPLICATION_JSON)
    public DashboardResponse postDashboard(DashboardCredentials credentials){        
        DashboardQuery dashboardQuery = new DashboardQuery(credentials);
        DashboardResponse dr = new DashboardResponse();
        dr.setResponse(dashboardQuery.getResponseData());        
        return dr;
    }
}
