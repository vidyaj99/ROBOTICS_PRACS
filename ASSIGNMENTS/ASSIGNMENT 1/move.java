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

public class move {
        move(){
            TurtleRobot t = new TurtleRobot();
            t.setTurtleSpeed(100);
            while (true){
                t.forward(200);
                t.left(90);
            }
        }
    
    public static void main (String[] args) {
        move m = new move();
    }
}
