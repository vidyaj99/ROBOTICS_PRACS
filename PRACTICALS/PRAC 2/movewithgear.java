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

public class movewithgear {
    movewithgear(){
        NxtRobot robot = new NxtRobot();
        Gear g = new Gear();
        robot.addPart(g);
        g.setSpeed(100);
        while (true){
            g.forward(200);
            g.left(90);
            g.forward(200);
        }
        
    }
    
    public static void main (String[] args) {
        movewithgear m = new movewithgear();
    }
}
