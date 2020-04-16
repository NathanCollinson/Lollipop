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
 * @version: 2
 */
public class Lollipop{
    public static final double X = 300.0;       //Horizontal center of lollipop
    public static final double Y = 180.0;         //Vertical center of lollipop
    public static final double SIZE = 80.0;       //Diameter of lollipop
    public static final double STICK = 200.0;  //Length of lollipop
    
    
    /**
     * Constructor for objects of class Lollipop
     * Draw a red lollipop with a stick
     */
    public Lollipop(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }
    private void drawLollipop(){
        
        UI.setLineWidth(SIZE/8.0);                //set line width to 10
        UI.drawLine(X, Y, X, Y+STICK);    //draw line     (300, 200) to (300, 400)
        UI.setLineWidth(1);                 //set line width to 1
        UI.setColor(Color.red);             //set colour to red
        UI.fillOval(X-SIZE/2.0, Y-SIZE/2.0, SIZE, SIZE);      //fill oval     @(260, 100), (80*50)
        
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

