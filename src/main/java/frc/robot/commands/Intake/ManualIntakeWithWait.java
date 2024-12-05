// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Intake;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;
import frc.robot.subsystems.Intake;

//This command runs the intake at a specified speed, but there is a wait first
//It is a sequential command (two commands in row)
public class ManualIntakeWithWait extends SequentialCommandGroup {
  /** Creates a new ManualIntakeWithWait. */
  public ManualIntakeWithWait(Intake intake, double intSpeed) {
    addCommands(
       new WaitCommand(Constants.Intake.INTAKE_WAIT), //in seconds
       new ManualIntake(intake, intSpeed)
    ); 
  }
}


