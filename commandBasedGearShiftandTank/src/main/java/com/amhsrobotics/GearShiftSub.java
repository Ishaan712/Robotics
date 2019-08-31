package com.amhsrobotics;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearShiftSub extends Subsystem {

    private DoubleSolenoid gearShiftSolenoid = new DoubleSolenoid(0, 1);

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

        gearShiftSolenoid.set(DoubleSolenoid.Value.kForward);

    }

    public void shiftLow() {

        gearShiftSolenoid.set(DoubleSolenoid.Value.kReverse);

    }

}