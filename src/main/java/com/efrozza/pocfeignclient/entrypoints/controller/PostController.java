package com.efrozza.pocfeignclient.entrypoints.controller;

import com.efrozza.pocfeignclient.entrypoints.controller.dto.response.PostDTO;
import com.efrozza.pocfeignclient.gateways.providers.post.PostClient;
import com.efrozza.pocfeignclient.gateways.providers.post.PostProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostProvider postProvider;

    @RequestMapping("posts")
    public List<PostDTO> getPosts(){
        return postProvider.getPosts();
    }

    @RequestMapping("posts/{postId}")
    public PostDTO getPost(@PathVariable("postId") Long postId){
        return postProvider.getPostById(postId);


    }
}
