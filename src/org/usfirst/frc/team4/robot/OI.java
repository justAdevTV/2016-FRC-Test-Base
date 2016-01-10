package org.usfirst.frc.team4.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public double rightY(Joystick cont) {
		return (cont.getRawAxis(RobotMap.CONT_RY) * Math.abs((cont.getRawAxis(RobotMap.CONT_RY)))* .75);
	}

	public double leftY(Joystick cont) {
		return (cont.getRawAxis(RobotMap.CONT_LY) * Math.abs((cont.getRawAxis(RobotMap.CONT_LY)))* .75);
	}
}
