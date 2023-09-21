package com.innovea.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Wikipedia {

    private String status;
    private Long totalResults;

    private List<Article> articles;



}
