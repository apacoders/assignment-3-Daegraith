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
public class Human extends Animal {

    public Human(int numberOfLegs, String speakParameters, String name) {
        super(numberOfLegs, speakParameters, name);
        name = "Human";
        numberOfLegs = 2;
        speakParameters = "Narly";
        System.out.println(name+", "+numberOfLegs+", "+speakParameters);
    }

    public void walkTo(int x, int y) {
        System.out.println("Walking");
        System.out.println("Looking Around");
        x = 0;
        y = 1;
    }
}
