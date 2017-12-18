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
public class Mouse extends Animal {

    public Mouse(int numberOfLegs, String speakParameters, String name) {
        super(numberOfLegs, speakParameters, name);
        name = "Mouse";
        numberOfLegs = 4;
        speakParameters = "Squeek";
        System.out.println(name+", "+numberOfLegs+", "+speakParameters);
    }

    public void walkTo(int x, int y) {
        System.out.println("Walking");
        System.out.println("Sniffing ground");
        x = 0;
        y = 1;
    }

}
