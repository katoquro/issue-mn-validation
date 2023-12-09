package com.example;

import dto.Issue1Dto;
import dto.DemoEndpoints;
import dto.Issue2Dto;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.validation.Valid;

import java.util.UUID;

@Controller("/demo")
public class DemoController implements DemoEndpoints {

    @Post("/form")
    public Issue1Dto.Form form(@Body @Valid Issue1Dto.Form demoDto) {
        return demoDto;
    }

    @Post("/form-with-nullable-blank")
    public Issue2Dto.Form issue2(@Body @Valid Issue2Dto.Form demoDto) {
        return demoDto;
    }

    @Override
    public UUID issue3(UUID id) {
        return id;
    }
}
