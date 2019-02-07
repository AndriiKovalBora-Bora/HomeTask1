package com.company;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.makeHelloWorld(inputStringHelloWithScanner(sc), inputStringWorldWithScanner(sc));

        view.printMessage(View.OUTPUT_RESULT_STRING + model.getHelloWorld());
    }

    public String inputStringHelloWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_HELLO_STRING_DATA);
        String word = "";
        boolean b = true;
        while (b) {
            word = sc.next();
            if (word.equals("Hello"))
                b = false;
            else
                view.printMessage(View.WRONG_INPUT_DATA);
        }
        return word;
    }

    public String inputStringWorldWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_WORLD_STRING_DATA);
        String word = "";
        boolean b = true;
        while (b) {
            word = sc.next();
            if (word.equals("World"))
                b = false;
            else
                view.printMessage(View.WRONG_INPUT_DATA);
        }
        return word;
    }
}
