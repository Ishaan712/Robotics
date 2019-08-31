package com.amhsrobotics;

import edu.wpi.first.wpilibj.command.Command;

public class GearShiftLow extends Command {

    public GearShiftLow() {
        requires(GearShiftSub.getInstance());
    }

    @Override
    protected void initialize() {
        GearShiftSub.getInstance().shiftLow();
    }

    @Override
    protected boolean isFinished() {
        return true;
    }
}