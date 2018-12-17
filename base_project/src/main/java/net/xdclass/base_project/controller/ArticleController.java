//package net.xdclass.base_project.controller;
//
//import org.elasticsearch.index.query.QueryBuilder;
//import org.elasticsearch.index.query.QueryBuilders;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import net.xdclass.base_project.domain.Article;
//import net.xdclass.base_project.domain.JsonData;
//import net.xdclass.base_project.repository.ArticleRepository;
//
//@RestController
//@RequestMapping("/api/v1/article")
//public class ArticleController {
//
//	@Autowired
//	private ArticleRepository articleRepository;
//	
//	@GetMapping("save")
//	public Object save() {
//		Article article = new Article();
//		article.setId(1L);
//		article.setPv(123);
//		article.setContent("spring boot learning !");
//		article.setTitle("title 1");
//		article.setSummary("search");
//		
//		articleRepository.save(article);
//		return JsonData.buildSuccess();
//	}
//	
//	@GetMapping("search")
//	public Object search(String title) {
//		QueryBuilder builder = QueryBuilders.matchQuery("title", title);
//		
//		Iterable<Article> list = articleRepository.search(builder);
//		
//		return JsonData.buildSuccess(list);
//	}
//}
