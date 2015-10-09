package dmh;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

/**
 * Created by Daniel on 10/9/2015.
 */
public class Wookie extends AdvancedRobot {

    public void run() {

        while (true) {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        }

    }

    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1);
    }
}
