package com.inqognitoo.spring.service;

import com.inqognitoo.spring.control.PalindromeRestController;
import com.inqognitoo.spring.memory.PalindromeCache;
import com.inqognitoo.spring.text.Text;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PalindromeService {

    private static final Logger logger =
            LoggerFactory.getLogger(PalindromeService.class);

    private final PalindromeCache cache;

    @Autowired
    public PalindromeService(PalindromeCache cache){
        this.cache = cache;
    }

    public boolean test(String string){
        Boolean response = cache.get(string);

        if(response == null){
            response = Text.isPalindrome(string);
            cache.put(string, response);
            // just a demo message about caching :|
            logger.info("Cache \"" + string + "\" as " + response);
        }

        return response;
    }
}