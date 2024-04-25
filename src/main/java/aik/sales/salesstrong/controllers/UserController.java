package aik.sales.salesstrong.controllers;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import aik.sales.salesstrong.models.Article;
import aik.sales.salesstrong.models.Order;
import aik.sales.salesstrong.models.Seller;
import aik.sales.salesstrong.models.User;
import aik.sales.salesstrong.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/new/")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        final User response;
        
        if (user.getClass().equals(Seller.class)) {
            response = userService.createSeller(user);
        } else {
            response = userService.createBuyer(user);
        } 
        return new ResponseEntity<User>(HttpStatus.CREATED);
    }
    @PostMapping("/validate/")
    public User validateAccount(@RequestParam String email, @RequestParam String validateCode) {
        return userService.validateAccount(email, validateCode);
    }
    // other methods for the operations
}
