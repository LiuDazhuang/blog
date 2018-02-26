package top.kkzhixia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.kkzhixia.mapper.ArticleMappper;
import top.kkzhixia.modle.Article;

@Service
public class ArticleService {

	@Autowired
	private ArticleMappper articleMappper;

	public List<Article> queryArticle() {

		return articleMappper.queryArticle();
	}

}
