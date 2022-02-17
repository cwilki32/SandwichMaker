package com.company;

public class Sandwich {

    //setting properties for Sandwiches
    private String breadType;
    private String proteinType;
    private String cheeseType;
    private boolean hasVeggies;

    public Sandwich(String protein, String cheese, boolean veggies) { // new format - Constructor sets
        breadType = "Whole grain";
        cheeseType = cheese;
        proteinType = protein;
        hasVeggies = veggies;

        //create getter and setter methods
    /* old format
    public void setBreadType(String bread) {
        breadType = bread;
    }

    public void setProteinType(String protein) {
        proteinType = protein;
    }

    public void setCheeseType(String cheese) {
        cheeseType = cheese;
    }

    public void setHasVeggies(boolean veggies) {
        hasVeggies = veggies;*/
    }

    public String getBreadType() {//keep your gets
        return breadType;
    }

    public String getProteinType() {
        return proteinType;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public boolean getHasVeggies() {
        return hasVeggies;
    }

    public void describeSandwich() {
        if (hasVeggies == false) {
            System.out.print("The sandwich is " + getProteinType() + " and " + getCheeseType() + " with " +
                    "on " + getBreadType() + " bread, hold the veggies");
        } else {
            System.out.println("The sandwich is " + getProteinType() + " and " + getCheeseType() + " with " +
                    "on " + getBreadType() + " bread, with veggies on top");
        }
    }

}

//constructor
    /*old format with just setters in constructor
    public Sandwich() {
        proteinType = "Ham";
        breadType = "Sourdough";
        cheeseType = "Colby Jack";
        hasVeggies = true;
    }*/

    /*public String veggieConvertor() {
        return if (hasVeggies == true)
            System.out.println("With veggies");
        else
            System.out.println("without veggies");*/

