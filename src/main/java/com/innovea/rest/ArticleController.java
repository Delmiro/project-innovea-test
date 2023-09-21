package com.innovea.rest;

import com.innovea.interfaces.ArticleService;
import com.innovea.model.Wikipedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("article")
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	@GetMapping()
	public ResponseEntity<Wikipedia> getArticles(@RequestParam(name="q") String argument,
												 @RequestParam(name="from") @DateTimeFormat(pattern="yyyy-MM-dd") Date from,
												 @RequestParam(name="sortBy") String sortBy,
												 @RequestParam(name="apiKey") String apiKey) {

		Wikipedia wikipedias = articleService.getArticles(argument, from, sortBy, apiKey);

		return wikipedias != null ? ResponseEntity.ok().body((Wikipedia) wikipedias) : ResponseEntity.notFound().build();
	}


}
