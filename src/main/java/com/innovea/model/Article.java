package com.innovea.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class Article {

    private String author;
    private String title;

    private String description;

    private String url;

    private String urlToImage;

    private Date publishedAt;

    private String content;

}
