package com.efrozza.pocfeignclient.gateways.providers.post;

import com.efrozza.pocfeignclient.entrypoints.controller.dto.response.PostDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PostProvider {

    private final PostClient postClient;

    public List<PostDTO> getPosts (){
        return postClient.getPosts();
    }

    public PostDTO getPostById(Long postId){
        return postClient.getPostById(postId);
    }
}
