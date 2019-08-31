package com.amhsrobotics;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearShiftSub extends Subsystem {

    private DoubleSolenoid solenoid = new DoubleSolenoid(0, 1);

    private static GearShiftSub ourInstance = new GearShiftSub();

    public static GearShiftSub getInstance() {

        return ourInstance;

    }

    private GearShiftSub() {

    }

    @Override
    protected void initDefaultCommand() {

    }

    public void shiftHigh() {

        solenoid.set(DoubleSolenoid.Value.kForward);

    }

    public void shiftLow() {

        solenoid.set(DoubleSolenoid.Value.kReverse);

    }

}