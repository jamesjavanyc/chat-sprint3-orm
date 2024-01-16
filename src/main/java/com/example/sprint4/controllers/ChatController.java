package com.example.sprint4.controllers;

import com.example.sprint4.services.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ChatController {
    private final ChatService chatService;

    @GetMapping("/chat")
    public String getChat(@RequestParam("text")String text){
        return this.chatService.getResponse(text);
    }

    @PostMapping("/chat")
    public String saveChat(@RequestParam("ask")String ask, @RequestParam("ans") String ans){
        return this.chatService.save(ask, ans);
    }

    @PutMapping("/chat")
    public String updateChat(@RequestParam("ask")String ask, @RequestParam("ans") String ans){
        return this.chatService.update(ask, ans);
    }

    @DeleteMapping("/chat")
    public void updateChat(@RequestParam("question")String ask){
        this.chatService.delete(ask);
    }
}
