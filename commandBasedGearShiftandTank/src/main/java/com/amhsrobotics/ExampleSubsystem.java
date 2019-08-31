package com.amhsrobotics;

import edu.wpi.first.wpilibj.command.Subsystem;

public class ExampleSubsystem extends Subsystem {
	private static ExampleSubsystem ourInstance = new ExampleSubsystem();

	public static ExampleSubsystem getInstance() {
		return ourInstance;
	}

	private ExampleSubsystem() {
	}

	@Override
	protected void initDefaultCommand() {
		//setDefaultCommand();
	}
	public void initHardware(){

	}

	public void move(double speed){

	}
}