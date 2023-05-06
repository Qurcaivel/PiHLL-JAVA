package com.inqognitoo.spring.persistance;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Palindrome")
public class Palindrome implements Serializable {

    @Id
    private final String request;
    private final Boolean response;

    public Palindrome(String request, boolean response){
        this.request = request;
        this.response = response;
    }

    public String getRequest(){
        return request;
    }

    public boolean getResponse(){
        return response;
    }
}
