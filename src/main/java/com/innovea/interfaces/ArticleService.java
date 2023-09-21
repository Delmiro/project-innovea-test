package com.innovea.interfaces;

import com.innovea.model.Wikipedia;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(url= "https://newsapi.org/v2/everything" , name = "article")
public interface ArticleService {
    @RequestMapping(method = RequestMethod.GET, value = "?q={argument}&from={from}&sortBy={sortBy}&apiKey={apiKey}")
    Wikipedia getArticles(@PathVariable("argument") String argument,
                          @PathVariable("from") Date from,
                          @PathVariable("sortBy") String sortBy,
                          @PathVariable("apiKey") String apiKey);
}
