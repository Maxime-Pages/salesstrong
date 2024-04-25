package aik.sales.salesstrong.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aik.sales.salesstrong.models.Conversation;
import aik.sales.salesstrong.models.Message;
import aik.sales.salesstrong.services.MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/messages")
public class MessageController {
    
    @Autowired
    MessageService messageService;

    @Autowired
    ConversationService conversationService;

    @PostMapping("new/")
    public String postMethodName(@RequestBody Message message) {
        
    }
    
}
