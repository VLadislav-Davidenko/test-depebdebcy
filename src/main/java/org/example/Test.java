package org.example;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.example.models.Car;
import org.example.test.MyBurger;
import org.example.test.Order;
import org.example.test.Pizza;


public class Test {
    public static void main(String[] args) {
        System.out.println("Hello Test");
        Car car = new Car("ada", 123);
        car.go();

        Pizza pizza = new Pizza("Paperoni", Lists.newArrayList("sausages", "cheese", "ketchup"), 40);
        pizza.getDiameter();
        System.out.println(pizza);
        int i = pizza.hashCode();
        System.out.println(i);
        pizza.eat();

        Order order = new Order("21312781", "Oleg", Sets.newHashSet("car", "planet", "house"));

        MyBurger myBurger = MyBurger.builder()
                .breadType("Adas")
                .count(123)
                .sauce("Barbequi")
                .meat("Beaf")
                .weight(123.342)
                .build();
        System.out.println(myBurger);

    }

}
