package org.example.test;

import lombok.Value;

import java.util.List;

@Value
public class Pizza {
    String name;
    List<String> ingredients;
    int diameter;

    public void eat(){
        System.out.println("Yep !");
    }
}
