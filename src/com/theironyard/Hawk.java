package com.theironyard;

/**
 * Created by zach on 9/20/16.
 */
public class Hawk extends Bird {
    Hawk () {
        this.name = "Hawk";
    }

    @Override
    void makeSound() {
        System.out.println("Cawwwwww!");
    }
}
