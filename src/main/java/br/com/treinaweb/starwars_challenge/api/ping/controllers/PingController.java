package br.com.treinaweb.starwars_challenge.api.ping.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinaweb.starwars_challenge.api.common.dtos.MessageResponse;

@RestController
@RequestMapping("/api/ping")
public class PingController {

    @GetMapping
    public MessageResponse ping() {
        return new MessageResponse("pong");
    }

    @GetMapping("/{message}")
    public MessageResponse urlParam(@PathVariable String message) {
        return new MessageResponse(message);
    }

    @PostMapping
    public MessageResponse body(@RequestBody MessageResponse messageResponse) {
        return messageResponse;
    }
    
}
