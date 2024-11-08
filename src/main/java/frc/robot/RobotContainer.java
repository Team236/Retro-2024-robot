// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import frc.robot.commands.Intake.ManualIntake;
import frc.robot.commands.Intake.ManualIntakeWithWait;
import frc.robot.commands.Transmission.HighGear;
import frc.robot.commands.Transmission.LowGear;
import frc.robot.commands.Transmission.ToggleGear;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Transmission;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.POVButton;

public class RobotContainer {
  //CONTROLLERS
  XboxController driverController = new XboxController(Constants.Controller.USB_DRIVECONTROLLER);

  //create instance of each subsystem
  private final Intake intake = new Intake();
  private final Transmission transmission = new Transmission();
  
  //create an instance of each command
  //INTAKE COMMANDS
  private final ManualIntakeWithWait intakeWithWait = new ManualIntakeWithWait(intake, Constants.Intake.INTAKE_SPEED);
  private final ManualIntake manualIntake = new ManualIntake(intake, Constants.Intake.INTAKE_SPEED);
  private final ManualIntake manualEject = new ManualIntake(intake, Constants.Intake.EJECT_SPEED);
  //TRANSMISSION COMMANDS
  private final ToggleGear toggleGear = new ToggleGear(transmission);
  private final HighGear highGear = new HighGear(transmission);
  private final LowGear lowGear = new LowGear(transmission);


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  private void configureBindings() {
    // CREATE BUTTONS FOR XBOXCONTROLLER - DRIVER CONTROLLER  (copy/paste from old project)
    JoystickButton x = new JoystickButton(driverController, Constants.XboxController.X);
    JoystickButton a = new JoystickButton(driverController, Constants.XboxController.A);
    JoystickButton b = new JoystickButton(driverController, Constants.XboxController.B);
    JoystickButton y = new JoystickButton(driverController, Constants.XboxController.Y);
    JoystickButton lb = new JoystickButton(driverController, Constants.XboxController.LB);
    JoystickButton rb = new JoystickButton(driverController, Constants.XboxController.RB);
    //JoystickButton lm = new JoystickButton(driverController, Constants.XboxController.LM);
    //JoystickButton rm = new JoystickButton(driverController, Constants.XboxController.RM);
    //JoystickButton view = new JoystickButton(driverController, Constants.XboxController.VIEW);
    //JoystickButton menu = new JoystickButton(driverController, Constants.XboxController.MENU);
    //POVButton upPov = new POVButton(driverController,Constants.XboxController.POVXbox.UP_ANGLE);
    //POVButton downPov = new POVButton(driverController,Constants.XboxController.POVXbox.DOWN_ANGLE); 
   // POVButton leftPov = new POVButton(driverController,Constants.XboxController.POVXbox.LEFT_ANGLE);
    //POVButton rightPov = new POVButton(driverController,Constants.XboxController.POVXbox.RIGHT_ANGLE);

    
/*USE BELOW IF AN XBOX CONTROLLER BREAKS 
    JoystickButton x = new JoystickButton(driverController, Constants.LogitechF310.X);
    JoystickButton a = new JoystickButton(driverController, Constants.LogitechF310.A);
    JoystickButton b = new JoystickButton(driverController, Constants.LogitechF310.B);
    JoystickButton y = new JoystickButton(driverController, Constants.LogitechF310.Y);
    JoystickButton lb = new JoystickButton(driverController, Constants.LogitechF310.LB);
    JoystickButton rb = new JoystickButton(driverController, Constants.LogitechF310.RB);
    JoystickButton back = new JoystickButton(driverController, Constants.LogitechF310.BACK);
    JoystickButton start = new JoystickButton(driverController, Constants.LogitechF310.START);
    JoystickButton leftPress = new JoystickButton(driverController, Constants.LogitechF310.LEFT_PRESS);
    JoystickButton rightPress = new JoystickButton(driverController, Constants.LogitechF310.RIGHT_PRESS);
*/
  //assign driver controller buttons to commands:
  //INTAKE COMMANDS:
    x.whileTrue(intakeWithWait);
    y.whileTrue(manualIntake); 
    a.whileTrue(manualEject);
  //TRANSMISSION COMMANDS
    b.onTrue(toggleGear);
    lb.onTrue(highGear);
    rb.onTrue(lowGear);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
     Command command = null;
    return command;
  }

}