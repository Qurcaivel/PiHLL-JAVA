package com.inqognitoo.spring.control;

import com.inqognitoo.spring.service.PalindromeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
public class PalindromeRestController {

    private static final Logger logger =
            LoggerFactory.getLogger(PalindromeRestController.class);

    private final PalindromeService service;

    @Autowired
    public PalindromeRestController(PalindromeService service){
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET,
            value = "/palindrome",
            produces = "application/json")
    public Map<String, Boolean> isPalindrome(@RequestParam(value = "string") String string){
        // concat has best print format performance :|
        logger.info("GET /palindrome PARAMS \"" + string + "\"");

        return Collections.
                singletonMap("isPalindrome", service.test(string));
    }
}