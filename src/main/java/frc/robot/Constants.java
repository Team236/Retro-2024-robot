
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
public final class Constants {

  public static class Controller {
    // usb port on the laptop when driver using XBox controller
    public static final int USB_DRIVECONTROLLER = 0;
  }

  public static class MotorControllers {
    //ID number for the Intake motor controller:
    public static final int ID_INTAKE = 48;
  }
    public static class TransmissionSol {
    //Port numbers on the Pneumatic Control Module where Transmission solenoid is attached
    public static final int SOL_LOW_GEAR = 0; 
    public static final int SOL_HIGH_GEAR = 1;
  }

  public static class Intake {
    public static final double INTAKE_SPEED = 0.5; //speed from 0 to 1
    public static final double EJECT_SPEED = -0.7;  //speed from 0 to -1
    public static final double INTAKE_WAIT = 2.0; //the wait in seconds
  }
 
  public static class XboxController {  //(copy/paste from old project)
    public static final int A = 1;
    public static final int B = 2;
    public static final int X = 3;
    public static final int Y = 4;
    public static final int LB = 5;
    public static final int RB = 6;
  } 

}
