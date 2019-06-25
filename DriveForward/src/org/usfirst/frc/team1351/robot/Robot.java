package org.usfirst.frc.team1351.robot;

import edu.wpi.first.wpilibj.SampleRobot;

public class Robot extends SampleRobot {

	public Robot() {
//		talons = new WPI_TalonSRX[4];
	}

	public void robotInit() {
//		for (int i =0; i< talons.length; i++){
//			talons[i] = new WPI_TalonSRX(i);
//		}
//		talons[1].set(ControlMode.Follower, 0);
//		talons[3].set(ControlMode.Follower, 2);
//
//		talons[0].configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
//		talons[2].configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
//		final double p = 0.2, i = 0, d = 0;
//		talons[0].config_kP(0,p,0);
//		talons[0].config_kP(0,i,0);
//		talons[0].config_kP(0,d,0);
//		talons[2].config_kP(0,p,0);
//		talons[2].config_kP(0,i,0);
//		talons[2].config_kP(0,d,0);

	}

	@Override
	public void autonomous() {
		DriveAtom d = new DriveAtom(36);
		d.execute();
	}
//	void move(final double inches) {
//
//		double setpoint = inches * ticksperinch;
//		double error = talons[0].getClosedLoopError();
//
//		while (error > threshold) {
//
//			talons[0].set(ControlMode.Position, setpoint + talons[0].getSelectedSensorPosition());
//			talons[2].set(ControlMode.Position, setpoint + talons[2].getSelectedSensorPosition());
//		}
//
//		talons[0].set(ControlMode.PercentOutput, 0);
//		talons[2].set(ControlMode.PercentOutput, 0);
//
//		while (true) {
//			try{
//				Thread.sleep(20);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
}