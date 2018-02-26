package top.kkzhixia.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import top.kkzhixia.modle.Article;

@Mapper
public interface ArticleMappper {

	
	/**
	 * 查询所有的文章
	 * @return
	 */
	@Select("select * from article ")
	List<Article> queryArticle();

}
