package com.amhsrobotics;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;

public class ExampleCommand extends Command { //example command

	public ExampleCommand(){
		requires(ExampleSubsystem.getInstance());
	}
	@Override
	protected void initialize(){

	}

	@Override
	protected void execute(){
		double speed = ExampleOI.getInstance().getController().getY(GenericHID.Hand.kLeft);
		ExampleSubsystem.getInstance().move(speed);
	}

	@Override
	protected void end(){

	}

	@Override
	protected void interrupted(){

	}

	@Override
	protected boolean isFinished() {
		return false;
	}
}