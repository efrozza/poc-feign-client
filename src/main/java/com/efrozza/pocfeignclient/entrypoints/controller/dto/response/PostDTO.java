package com.efrozza.pocfeignclient.entrypoints.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PostDTO {

    private int userId;
    private long id;
    private String title;
    private String body;
}
