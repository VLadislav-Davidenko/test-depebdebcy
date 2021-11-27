package org.example.test;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Order {
    private final String id;
    private final String owner;
    private Set<String> bucket;
}
