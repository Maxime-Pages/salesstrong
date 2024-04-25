package aik.sales.salesstrong.controllers;

@RestController
@RequestMapping("/sellers")
public class SellerController {
    @Autowired
    private SellerService sellerService;
    @PostMapping("/articles")
    public Article createArticle(@RequestBody Article article) {
        return sellerService.createArticle(article);
    }
    // other methods for the operations
}