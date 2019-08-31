package com.amhsrobotics;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;

public class TankCommand extends Command {

    private static TankCommand ourInstance = new TankCommand();

    public static TankCommand getInstance() {
        return ourInstance;
    }

    private TankCommand() {
        requires(DriveSubsystem.getInstance());
    }

    @Override
    protected void execute() {

        double leftSpeed = OI.getInstance().getController().getY(GenericHID.Hand.kLeft);
        double rightSpeed = OI.getInstance().getController().getY(GenericHID.Hand.kRight);

        DriveSubsystem.getInstance().tankDrive(leftSpeed, rightSpeed);
    }

    @Override
    protected boolean isFinished(){
        return false;
    }
}