package org.example.test;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MyBurger {

    private String meat;
    private String sauce;
    private int count;
    private boolean hasOnion;
    private String breadType;
    private double weight;

}
