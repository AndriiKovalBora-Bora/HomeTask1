package com.company;

public class View {

    public static final String INPUT_HELLO_STRING_DATA = "Enter the word " + (char) 34 + "Hello" + (char) 34 + " ";
    public static final String INPUT_WORLD_STRING_DATA = "Enter the word " + (char) 34 + "World" + (char) 34 + " ";
    public static final String WRONG_INPUT_DATA = "Wrong word! Repeat please! ";
    public static final String OUTPUT_RESULT_STRING = "Sentence : ";

    public void printMessage(String message) {
        System.out.println(message);
    }

}

