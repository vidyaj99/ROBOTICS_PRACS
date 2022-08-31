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

public class rectanglewithgear {
    rectanglewithgear(){
        NxtRobot robot = new NxtRobot();
        Gear g = new Gear();
        robot.addPart(g);
        g.setSpeed(100);
        while (true){
            g.forward(800);
            g.left(280);
            g.forward(1500);
            g.left(280);
        }
        
    }
    
    public static void main (String[] args) {
        rectanglewithgear m = new rectanglewithgear();
    }
}
