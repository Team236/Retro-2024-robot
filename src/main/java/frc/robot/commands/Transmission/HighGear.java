// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Transmission;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Transmission;

public class HighGear extends Command {

  private Transmission transmission;
  /** Creates a new HighGear. */
  public HighGear(Transmission transmission) {
    this.transmission = transmission;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(transmission);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  //just change gear once, so do it in initialize
    transmission.setGearHigh();  
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}  //do nothing here since gear changed in "initialize"

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    //gear change happened in intialize, 
    //so by the time the code gets here, the gear has changed
    return true; 

  }
}
