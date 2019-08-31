package com.amhsrobotics;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;

public class OI {
    private static OI ourInstance = new OI();

    public static OI getInstance() {
        return ourInstance;
    }
    private XboxController controller = new XboxController(0);
    private OI() {

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
