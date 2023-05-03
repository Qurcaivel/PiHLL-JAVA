package com.inqognitoo.spring.control;

import com.inqognitoo.spring.text.Text;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class PalindromeRestController {

    @RequestMapping(method = RequestMethod.GET,
            value = "/palindrome",
            produces = "application/json")
    public Map<String, Boolean> isPalindrome(@RequestParam(value = "string") String string){
        return Collections.
                singletonMap("isPalindrome", Text.isPalindrome(string));
    }
}