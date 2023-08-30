package com.tugalsan.spi;

import io.micronaut.http.annotation.*;

@Controller("/helloController")
public class HelloControllerController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}