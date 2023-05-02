package com.example.apirest.api;

import com.example.apirest.model.Friend;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/hello-friend")
public class HelloFriendApi {

    @POST
    @Produces("application/json")
    public Response helloFriend(Friend friend) {
        return Response.ok(friend , MediaType.APPLICATION_JSON).build();
    }
}