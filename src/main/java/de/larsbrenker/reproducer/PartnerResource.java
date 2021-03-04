package de.larsbrenker.reproducer;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("partner")
@RequestScoped
public class PartnerResource {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Save", description = "Save partner data.")
    @APIResponses({@APIResponse(responseCode = "200", description = "Successful, returning ok.")})
    public Response save(@RequestBody(description = "The request body with partner data",
            required = true,
            content = @Content(
                    mediaType = MediaType.APPLICATION_JSON,
                    schema = @Schema(implementation = Partner.class)
            )
    ) final Partner partner) {
        return Response.ok().build();
    }
}