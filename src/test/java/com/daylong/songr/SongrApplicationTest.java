package com.daylong.songr;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.context.WebApplicationContext;


@SpringBootTest
class SongrApplicationTest {

    @Autowired
    private WebApplicationContext wac;

    @Test
    void contextLoads() {
    }

    @ExtendWith(SpringExtension.class)
    @ContextConfiguration(classes = { SongrApplicationTest.class })
    public class GreetingsSpringTest {

    }
}