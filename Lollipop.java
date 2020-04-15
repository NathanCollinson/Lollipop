/* Based on the VUW ecs100 template
 *
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 * Write a description of class Lollipop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lollipop{

    /**
     * Constructor for objects of class Lollipop 
     */
    public Lollipop(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }


    /**
     * Main routine
     *
     */
    public static void main(String[] args){
        Lollipop obj = new Lollipop();
    }

}

