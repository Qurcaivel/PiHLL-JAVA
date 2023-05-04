package com.inqognitoo.spring.control;

import com.inqognitoo.spring.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
public class PalindromeRestController {

    private final PalindromeService service;

    @Autowired
    public PalindromeRestController(PalindromeService service){
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET,
            value = "/palindrome",
            produces = "application/json")
    public Map<String, Boolean> isPalindrome(@RequestParam(value = "string") String string){
        return Collections.
                singletonMap("isPalindrome", service.test(string));
    }
}