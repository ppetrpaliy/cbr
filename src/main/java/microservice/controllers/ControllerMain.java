package microservice.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import microservice.pojos.RequestResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
//@RequestMapping(path = "/requester")
public class ControllerMain {

    @GetMapping("/request1")
    public @ResponseBody
    RequestResult getRequest1(){
        return new RequestResult("First item",1L,"First item");
    }
}
