package article.service;

import java.sql.SQLException;
import java.util.List;

import article.dao.ArticleDAO;
import article.dto.ArticleDTO;
import lombok.extern.log4j.Log4j;

@Log4j
public class ArticleService {
	/*
	 * private static final Logger log =
	 * LoggerFactory.getLogger(ArticleService.class);
	 */
	private static ArticleService service = null;
	private ArticleDAO dao = ArticleDAO.getInstance();
	private ArticleService() {}
	
	public static ArticleService getInstance() {
		if(service == null) {
			service = new ArticleService();
		}
		return service;
	}

	public void insertArticle(ArticleDTO articleDTO) throws SQLException {
		try {
			dao.insertArticle(articleDTO);
		} catch (SQLException e) {
			log.info(e.getMessage());
			throw e;
		}
	}

	public List<ArticleDTO> getArticleList() throws Exception {
		try {
			return dao.getArticleList();
		} catch (Exception e) {
			log.info(e.getMessage());
			throw e;
		}
	}
}
