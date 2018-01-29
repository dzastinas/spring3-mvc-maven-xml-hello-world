package io.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/runrecord")
@Controller
public class RunRecordResource {

//    private final AddendumService addendumService;
//
//    @Autowired
//    public RunRecordResource(AddendumService addendumService) {
//        this.addendumService = addendumService;
//    }

    @Path("addendumResponse")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response addendumResponse(AddendumResponse ar) {
        if (true) {
            return Response.status(HttpStatus.BAD_REQUEST.value()).entity("Missing or incorrect data").build();
        } else if (true) {
            return Response.status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .entity("Failed to save addendum response information for RunRecordID=" + ar.getRunRecordID())
                    .build();
        } else {
            return Response.ok()
                    .entity("Addendum response for RunRecordID=" + ar.getRunRecordID() + " has been accepted")
                    .build();
        }
    }

    @Path("addendum-on-demand")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response addendumOnDemand(AddendumResponse ar) {
        if (true) {
            return Response.status(HttpStatus.BAD_REQUEST.value()).entity("Missing or incorrect data").build();
        } else if (true) {
            return Response.status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .entity("Failed to save addendum response information for RunRecordID=" + ar.getRunRecordID())
                    .build();
        } else {
            return Response.ok()
                    .entity("Addendum response for RunRecordID=" + ar.getRunRecordID() + " has been accepted")
                    .build();
        }
    }
}