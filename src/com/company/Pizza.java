package com.company;

public class Pizza {
    private String topping1;
    private String topping2;
    private String size;

    public Pizza() {
        topping1 = "Cheese";
        size = "Small";
    }

    public Pizza(String top) {
        topping1 = "Cheese";
        topping2 = top;
        size = "Xtra Large";
    }

    public void printPizza() {//example of using an if statement to determine a null or false value
        if (topping2 == null) {
            System.out.println(topping1 + ", " + size);
        } else {
            System.out.println(topping1 + ", " + topping2 + ", " + size);
        }
    }
}