package com.greenfoxdi.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApplication implements CommandLineRunner {
    @Autowired
    Printer printer;

    @Autowired
    MyColor myColor;



    public static void main(String[] args) {
        SpringApplication.run(DiApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {


        printer.log(myColor.printColor());


    }
}
