package com.amhsrobotics;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;

public class ExampleOI {
	private static ExampleOI ourInstance = new ExampleOI();

	public static ExampleOI getInstance() {
		return ourInstance;
	}
	private XboxController controller = new XboxController(0);
	private ExampleOI() {
		Button button = new Button() {
			@Override
			public boolean get() {
				return controller.getAButtonPressed();
			}
		};
		button.whenPressed(new ExampleCommand());
	}
	public XboxController getController(){
		return controller;
	}
}
