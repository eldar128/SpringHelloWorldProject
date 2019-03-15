package com.yela.controller;

import com.yela.mapper.MessageRepository;
import com.yela.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/re")
public class RestHelloWorldController {

    @Autowired
    MessageRepository messageRepository;

    @GetMapping(value = "/show")
    public Response getResource() {
        Response response = new Response("Done", messageRepository.findById(1).getMessage());
        return response;
    }
}
