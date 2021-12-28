package com.efrozza.pocfeignclient.gateways.providers.post;

import com.efrozza.pocfeignclient.entrypoints.controller.dto.response.PostDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "jplaceholder", url = "https://jsonplaceholder.typicode.com/")
public interface PostClient {

    @RequestMapping(method = RequestMethod.GET, value = "/posts")
    List<PostDTO> getPosts();

    @RequestMapping(method = RequestMethod.GET, value = "/posts/{postId}", produces = "application/json")
    PostDTO getPostById(@PathVariable("postId") Long postId);
}

