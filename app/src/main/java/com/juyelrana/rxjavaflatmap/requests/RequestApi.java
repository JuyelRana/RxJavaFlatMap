package com.juyelrana.rxjavaflatmap.requests;

import com.juyelrana.rxjavaflatmap.models.Comment;
import com.juyelrana.rxjavaflatmap.models.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RequestApi {

    @GET("posts")
    Observable<List<Post>> getPosts();

    @GET("posts/{id}/comments")
    Observable<List<Comment>> getComments(
            @Path("id") int id
    );

}