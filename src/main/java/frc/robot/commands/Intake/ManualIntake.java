// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Intake;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Intake;

public class ManualIntake extends Command {
//runs intake regardless of count

  private Intake intake;
  private double speed;
  //private Counter counter;

  /** Creates a new ManualIntake. */
  public ManualIntake(Intake intake, double speed) {
    this.speed = speed;
    this.intake = intake;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(this.intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intake.setIntakeSpeed(speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intake.intakeStop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
