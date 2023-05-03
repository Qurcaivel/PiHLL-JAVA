package com.inqognitoo.spring.control;

import com.inqognitoo.spring.text.Text;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
public class PalindromeRestController {

    private static final Logger logger = LogManager.getLogger(PalindromeRestController.class);

    @RequestMapping(method = RequestMethod.GET,
            value = "/palindrome",
            produces = "application/json")
    public Map<String, Boolean> isPalindrome(@RequestParam(value = "string") String string){
        // concat has best print format performance :|
        logger.info("GET /palindrome PARAMS \"" + string + "\"");

        return Collections.
                singletonMap("isPalindrome", Text.isPalindrome(string));
    }
}