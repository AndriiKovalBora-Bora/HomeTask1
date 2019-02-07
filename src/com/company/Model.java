package com.company;

public class Model {
    private String helloWorld;


    public void makeHelloWorld(String hello, String world) {
        helloWorld = hello + world;
    }

    public String getHelloWorld() {
        return this.helloWorld;
    }

}
