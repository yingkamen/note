package com.codex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DailyNoteApplication {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        SpringApplication.run(DailyNoteApplication.class, args);
    }
}
