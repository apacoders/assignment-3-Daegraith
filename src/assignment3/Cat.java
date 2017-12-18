/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Merlin.Blanchard
 */
public class Cat extends Animal {

    public Cat(int numberOfLegs, String speakParameters, String name) {
        super(numberOfLegs, speakParameters, name);
        name = "Cat";
        numberOfLegs = 4;
        speakParameters = "Meow";
        System.out.println(name+", "+numberOfLegs+", "+speakParameters);
    }

    public void walkTo(int x, int y) {
        System.out.println("Walking");
        System.out.println("Lying down");
        x = 0;
        y = 1;
    }
}
