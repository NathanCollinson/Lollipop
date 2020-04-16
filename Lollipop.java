/* Based on the VUW ecs100 template
 *
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 * Draw Little pictures on the graphics pane
 *
 * @author: Nathan Collinson
 * @version: 1
 */
public class Lollipop{

    /**
     * Constructor for objects of class Lollipop
     * Draw a red lollipop with a stick
     */
    public Lollipop(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }
    private void drawLollipop(){
        UI.setLineWidth(10);                //set line width to 10
        UI.drawLine(300, 200, 300, 400);    //draw line     (300, 200) to (300, 400)
        UI.setLineWidth(1);//set line width to 1
        UI.setColor(Color.red);//set colour to red
        UI.fillOval(260, 160, 80, 80);//fill oval     @(260, 100), (80*50)
        
    }

    /**
     * Main routine
     *
     */
    public static void main(String[] args){
        Lollipop obj = new Lollipop();
        obj.drawLollipop();
    }

}

