package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
    private Joystick right = new Joystick(0);
    private Joystick left = new Joystick(1);

    public double getRightY() {
        return -right.getY()*right.getY();
    }

    public double getLeftY() {
        return -left.getY()*left.getY();
    }
}
