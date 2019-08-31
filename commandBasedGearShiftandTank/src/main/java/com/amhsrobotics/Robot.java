package com.amhsrobotics;

import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {

  @SuppressWarnings("ResultOfMethodCallIgnored")
  @Override
  public void robotInit() {
    DriveSubsystem.getInstance();
    GearShiftSub.getInstance();
    OI.getInstance();

  }

  @Override
  public void autonomousInit() {

  }

  @Override
  public void autonomousPeriodic() {

  }

  @Override
  public void teleopInit() {

  }

  @Override
  public void teleopPeriodic() {

  }

  @Override
  public void testInit() {

  }

  @Override
  public void testPeriodic() {

  }
}