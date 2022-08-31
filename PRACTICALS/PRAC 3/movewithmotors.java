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

public class movewithmotors {
    movewithmotors(){
        NxtRobot r = new NxtRobot();
        Motor m1 = new Motor(MotorPort.A);
        Motor m2 = new Motor(MotorPort.B);
        r.addPart(m1);
        r.addPart(m2);
        
        m1.forward();
        Tools.delay(1090);
        m2.forward();

        Tools.delay(1090);
        m1.stop();

        m2.forward();
        Tools.delay(1090);
        m1.forward();
        
        m1.stop();
        m2.stop();
    }
    
    public static void main(String args[]){
        new movewithmotors();
    }
}
    
    
    
   

