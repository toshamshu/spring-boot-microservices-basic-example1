package com.example.test.forexservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by khaja on 9/22/2018.
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long>{
    ExchangeValue findByFromAndTo(String from, String to);
}