package org.usfirst.frc.team1351.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


public class DriveAtom {

    final double ticksperinch = 488.17;
    final WPI_TalonSRX[] talons = new WPI_TalonSRX[4];

    double p;
    double i;
    double d;
    double inches;
    double threshold = 5;

    public DriveAtom(double inches) {

       p = 0.2;
       i = 0;
       d = 0;

       this.inches = inches;

       for (int i =0; i< talons.length; i++){
            talons[i] = new WPI_TalonSRX(i);
       }

       talons[1].set(ControlMode.Follower, 0);
       talons[3].set(ControlMode.Follower, 2);

       talons[0].configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
       talons[2].configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);

    }

    public void init() {
    }

    public void execute() {
        for(int i = 0; i < talons.length; i++) {

            talons[i].config_kP(0, p, 1000);
            talons[i].config_kI(0, i, 1000);
            talons[i].config_kD(0, d, 1000);
        }

            double setpoint = inches * ticksperinch;
            double error = threshold+1;

            while (error > threshold) {

                talons[0].set(ControlMode.Position, setpoint + talons[0].getSelectedSensorPosition());
                talons[2].set(ControlMode.Position, setpoint + talons[2].getSelectedSensorPosition());
                error = talons[0].getClosedLoopError();
            }

            talons[0].set(ControlMode.PercentOutput, 0);
            talons[2].set(ControlMode.PercentOutput, 0);

            while (true) {
                try{
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }

