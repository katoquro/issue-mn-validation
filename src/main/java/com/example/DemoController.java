package com.example;

import dto.DemoDto;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.validation.Valid;

@Controller("/demo")
public class DemoController {

    @Post("/form")
    public DemoDto.Form form(@Body @Valid DemoDto.Form demoDto) {
        return demoDto;
    }

    @Post("/form-with-nullable-blank")
    public DemoDto.FormWithNullableBlank formWithNullableBlank(@Body @Valid DemoDto.FormWithNullableBlank demoDto) {
        return demoDto;
    }
}
