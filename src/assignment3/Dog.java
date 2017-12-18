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
public class Dog extends Animal {

    public Dog(int numberOfLegs, String speakParameters, String name) {
        super(numberOfLegs, speakParameters, name);
        name = "Dog";
        numberOfLegs = 4;
        speakParameters = "Woof";
        System.out.println(name+", "+numberOfLegs+", "+speakParameters);
    }

    public void walkTo(int x, int y) {
        System.out.println("Walking");
        System.out.println("Wagging Tail");
        x = 0;
        y = 1;
    }

}
