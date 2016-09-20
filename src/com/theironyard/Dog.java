package com.theironyard;

/**
 * Created by zach on 9/20/16.
 */
public class Dog extends Mammal {
    Dog () {
        this.name = "Dog";
    }

    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}
