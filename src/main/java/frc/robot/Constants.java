
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
    //Set a current limit for the motor controllers (in Amps)
    public static final int SMART_CURRENT_LIMIT = 40;
    //Set ramp rate for motor controllers (time in seconds to go from zero to full throttle)
    public static final double OPEN_RAMP_RATE = 0.08;
  }

    public static class TransmissionConstants {
    //Port numbers on the Pneumatic Control Module where Transmission solenoid is attached
    public static final int SOL_LOW_GEAR = 0; 
    public static final int SOL_HIGH_GEAR = 1;
  }

  public static class Intake {
    public static final int DIO_COUNTER = 12;  //DIO port on RoboRio for Counter
    public static final double INTAKE_SPEED = 0.5; //speed from 0 to 1
    public static final double EJECT_SPEED = -0.7;  //speed from 0 to -1
    public static final double INTAKE_WAIT = 2.0; //(seconds)
  }
 
  public static class XboxController {  //(copy/paste from old project)
    public static final int A = 1;
    public static final int B = 2;
    public static final int X = 3;
    public static final int Y = 4;
    public static final int LB = 5;
    public static final int RB = 6;
    //public static final int VIEW = 7;
   // public static final int MENU = 8;
   // public static final int LM = 9;
   // public static final int RM = 10;
   // public static class AxesXbox {
    //  public static final int LX = 0;
    // public static final int LY = 1;
     // public static final int LTrig = 2;
     // public static final int RTrig = 3;
     // public static final int RX = 4;
     // public static final int RY = 5;
    //}
    //public class POVXbox {
     // public static final int UP_ANGLE = 0;
      //public static final int RIGHT_ANGLE = 90;
      //public static final int DOWN_ANGLE = 180;
      //public static final int LEFT_ANGLE = 270;
   // }
  } 

}
