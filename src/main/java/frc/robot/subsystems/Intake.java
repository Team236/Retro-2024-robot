// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
private CANSparkMax intakeMotor;

  /** Creates a new Intake. */
  public Intake() {
    intakeMotor= new CANSparkMax(Constants.MotorControllers.ID_INTAKE, MotorType.kBrushless);
    intakeMotor.restoreFactoryDefaults();
  }
  

 //Methods start here
  public void stopIntake() {
    intakeMotor.set(0);
  }

  public void setIntakeSpeed(double speed) {
    intakeMotor.set(speed);
  }

  @Override
  public void periodic() {}

}