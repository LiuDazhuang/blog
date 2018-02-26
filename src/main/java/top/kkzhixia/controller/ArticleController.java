package top.kkzhixia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import top.kkzhixia.modle.Article;
import top.kkzhixia.service.ArticleService;

@RestController
public class ArticleController {
	
	
	
	 @Autowired
     private ArticleService articleService;
	
	@RequestMapping(value = {"","/queryArticle"},method = RequestMethod.GET)
	public List<Article> queryArticle(){
		
		return articleService.queryArticle();
		
	}

}
