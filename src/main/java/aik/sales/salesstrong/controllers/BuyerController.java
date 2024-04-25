package aik.sales.salesstrong.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aik.sales.salesstrong.models.Order;

@RestController
@RequestMapping("/buyers")
public class BuyerController {
    @Autowired
    private BuyerService buyerService;
    @PostMapping("/new/")
    public Order createOrder(@RequestBody Order order) {
        return buyerService.createOrder(order);
    }
    // other methods for the operations
}