package com20.bridge;

public class Vivo extends Phone{
    @Override
    public void run(String name) {
        System.out.print("Phone: " + name + " ");
        software.run();
    }
}
