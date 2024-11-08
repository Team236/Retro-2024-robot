// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
private CANSparkMax intake;


  /** Creates a new Intake. */
  public Intake() {
    intake= new CANSparkMax(Constants.MotorControllers.ID_INTAKE, MotorType.kBrushless);

    intake.restoreFactoryDefaults();

    intake.setInverted(false); 

    intake.setSmartCurrentLimit(Constants.MotorControllers.SMART_CURRENT_LIMIT);
  }
  

 //Methods start here
  public void openRampRate() {
    intake.setOpenLoopRampRate(Constants.MotorControllers.OPEN_RAMP_RATE);
  }

  public void intakeStop() {
    intake.set(0);
  }

  public void setIntakeSpeed(double speed) {
    intake.set(speed);
  }

  public boolean isIntakeSpinning() {
    boolean spin;
    if (Math.abs(intake.get()) >0.1) {
      spin = true;
    }
    else {
      spin = false;
    }
    return spin;
  }



  @Override
  public void periodic() {}

}