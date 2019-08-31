package com.amhsrobotics;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {

    WPI_TalonSRX leftTalon = new WPI_TalonSRX(0);
    WPI_TalonSRX rightTalon = new WPI_TalonSRX(1);


    private static DriveSubsystem ourInstance = new DriveSubsystem();

    public static DriveSubsystem getInstance() {
        return ourInstance;
    }

    private DriveSubsystem() {

    }

    @Override
    protected void initDefaultCommand() {
        TankCommand.getInstance().execute();
    }

    public void tankDrive(double left, double right){

        if (Math.abs(left) > 0.05){

            leftTalon.set(ControlMode.PercentOutput, left);

        } else {

            leftTalon.set(ControlMode.PercentOutput, 0);

        }

        if (Math.abs(right) > 0.05){

            rightTalon.set(ControlMode.PercentOutput, right);

        } else {

            rightTalon.set(ControlMode.PercentOutput, 0);

        }
    }
}