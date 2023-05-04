package com.inqognitoo.spring.service;

import com.inqognitoo.spring.memory.PalindromeCache;
import com.inqognitoo.spring.text.Text;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PalindromeService {

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
        }

        return response;
    }
}
