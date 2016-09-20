package com.theironyard;

/**
 * Created by zach on 9/20/16.
 */
public class Snake extends Reptile {
    Snake () {
        this.name = "Snake";
    }

    @Override
    void makeSound() {
        System.out.println("SSssssssss");
    }
}
