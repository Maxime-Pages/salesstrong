package aik.sales.salesstrong.services;

import aik.sales.salesstrong.models.Article;
import aik.sales.salesstrong.models.Seller;
import aik.sales.salesstrong.repositories.ArticleRepository;
import aik.sales.salesstrong.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private ArticleRepository articleRepository;

    public Seller createSeller(Seller seller) {
        return sellerRepository.save(seller);
    }

    public List<Seller> getAllSellers() {
        return sellerRepository.findAll();
    }

    public Seller getSellerById(Long id) {
        return sellerRepository.findById(id).orElse(null);
    }

    public Seller updateSeller(Seller seller) {
        return sellerRepository.save(seller);
    }

    public void deleteSeller(Long id) {
        sellerRepository.deleteById(id);
    }


    public Article createArticle(Long sellerId, Article article) {
        Seller seller = sellerRepository.findById(sellerId).orElse(null);
        if (seller != null) {
            article.setSeller(seller);
            return articleRepository.save(article);
        }
        return null;
    }

    public Article getArticleById(Long id) {
        return articleRepository.findById(id).orElse(null);
    }

    public Article updateArticle(Article article) {
        return articleRepository.save(article);
    }

    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);
    }
}