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
 * @version: 4
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
    /**
     * 
     */
    public void doDrawLollipop(){
        double diameter = UI.askDouble("Diameter: ");
        drawLollipop(300, 180, 200, diameter);
        drawLollipop(50, 60, 90, diameter/2.0);
        drawLollipop(400, 100, 70, diameter);        
    }
    private void drawLollipop(double x, double y, double stick, double size){
        double left = x-size/2.0;        //left of lollipop
        double top = y-size/2.0;         //top of lollipop
        double bottom = y + stick;         //bottom of lollipop 
        
        UI.setColor(Color.black);
        UI.setLineWidth(size/8.0);                  //set line width to 10
        UI.drawLine(x, y, x, bottom);               //draw line     (300, 200) to (300, 400)
        UI.setLineWidth(1);                         //set line width to 1
        UI.setColor(Color.red);                     //set colour to red
        UI.fillOval(left, top, size, size);         //fill oval     @(260, 100), (80*50)
        
    }

    /**
     * Main routine
     *
     */
    public static void main(String[] args){
        Lollipop obj = new Lollipop();
        obj.doDrawLollipop();
    }

}

