package com.efrozza.pocfeignclient.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Post {

    private int userId;
    private int id;
    private String title;
    private String body;
}
