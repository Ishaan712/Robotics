package com.amhsrobotics;

import edu.wpi.first.wpilibj.command.Command;

public class GearShiftHigh extends Command {

    public GearShiftHigh() {
        requires(GearShiftSub.getInstance());
    }

    @Override
    protected void initialize() {
        GearShiftSub.getInstance().shiftHigh();
    }

    @Override
    protected boolean isFinished() {
        return true;
    }

}
