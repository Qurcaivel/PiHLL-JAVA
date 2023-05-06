package com.inqognitoo.spring.persistance;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PalindromeRepository extends CrudRepository<Palindrome, String> {}
