package com.efrozza.pocfeignclient.controller;

import com.efrozza.pocfeignclient.entities.Post;
import com.efrozza.pocfeignclient.service.JSONPlaceHolderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostResource {

    @Autowired
    JSONPlaceHolderClient jsonPlaceHolderClient;

    @RequestMapping("posts")
    public List<Post> getPosts(){
        return jsonPlaceHolderClient.getPosts();
    }

    @RequestMapping("posts/{postId}")
    public Post getPost(@PathVariable("postId") Long postId){
        return jsonPlaceHolderClient.getPostById(postId);


    }
}
