// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Transmission extends SubsystemBase {
  private DoubleSolenoid transmissionSol;


//** Creates a new Drive. */
  public Transmission() {
    //pneumatic double solenoid
    transmissionSol = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.TransmissionSol.SOL_LOW_GEAR, Constants.TransmissionSol.SOL_HIGH_GEAR);
  }

  //methods start here
public void setGearHigh(){
  transmissionSol.set(Value.kReverse);
}

public void setGearLow(){
  transmissionSol.set(Value.kForward);
}

public boolean isInHighGear(){
  return transmissionSol.get() == Value.kReverse;
}

public boolean isInLowGear(){
  return transmissionSol.get() == Value.kForward;
}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.getBoolean("Is in High Gear?", isInHighGear());
  }

}
