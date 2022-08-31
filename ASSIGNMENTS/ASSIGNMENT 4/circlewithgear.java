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

public class circlewithgear {
    circlewithgear(){
        NxtRobot robot = new NxtRobot();
        Gear g = new Gear();
        robot.addPart(g);
        g.setSpeed(400);
        while (true){
            g.leftArc(0.4);
        }
        
    }
    
    public static void main (String[] args) {
        circlewithgear m = new circlewithgear();
    }
}
