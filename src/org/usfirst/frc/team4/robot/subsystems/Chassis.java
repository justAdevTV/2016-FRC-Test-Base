package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;
import org.usfirst.frc.team4.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Chassis extends Subsystem {
    
    private VictorSP leftFwd, leftBwd, rightFwd, rightBwd;
    
    private RobotDrive drive;
    
    public Chassis(){
    	super();
    	leftFwd = new VictorSP(RobotMap.CHASSIS_MOTOR_LEFTFRONT);
    	leftBwd = new VictorSP(RobotMap.CHASSIS_MOTOR_LEFTREAR);
    	rightFwd = new VictorSP(RobotMap.CHASSIS_MOTOR_RIGHTFRONT);
    	rightBwd = new VictorSP(RobotMap.CHASSIS_MOTOR_RIGHTREAR);
    	
    	drive = new RobotDrive(leftFwd, leftBwd, rightFwd, rightBwd);
    	
    }

    public void initDefaultCommand() {
        setDefaultCommand(new TankDrive());
    }
    
    public void tank(double l, double r){
    	drive.tankDrive(l, r);
    }
    
    public void stop(){
    	drive.stopMotor();
    }
}

