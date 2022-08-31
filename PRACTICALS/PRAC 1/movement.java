/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package robotics;

/**
 *
 * @author admin
 */
import ch.aplu.robotsim.*;

public class movement {
    movement(){
        TurtleRobot t = new TurtleRobot();
        t.forward(200);
        t.left(90);
        t.forward(200);
        t.left(90);
        t.forward(200);
    }
    
    public static void main (String[] args) {
        movement m = new movement(); 
    }
}
