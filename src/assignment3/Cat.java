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
        numberOfLegs = 4;       // this is already set in the constructor - should not reset it.
        speakParameters = "Meow";   // this is already set in the constructor - should not reset it.
        System.out.println(name+", "+numberOfLegs+", "+speakParameters);
    }
    
    public Cat(String name) {       // this is the constructor we are looking for?
        super(4, "Meow", name);
    }

    public void walkTo(int x, int y) {
        System.out.println("Walking");
        System.out.println("Lying down");
        
        // should be:
        this.x = x;
        this.y = y;
        
        //x = 0;                      // you do not want to set these here - they are set when they are called
        //y = 1;
        
        
    }
}
