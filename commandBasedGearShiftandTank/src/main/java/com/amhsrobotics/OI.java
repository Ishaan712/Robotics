package com.amhsrobotics;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.Button;

public class OI {
    private static OI ourInstance = new OI();

    public static OI getInstance() {
        return ourInstance;
    }

    private XboxController controller = new XboxController(0);

    private OI() {

        Button shiftHigh = new Button() {
            @Override
            public boolean get() {
                return controller.getBumperPressed(GenericHID.Hand.kRight);
            }
        };
        shiftHigh.whenPressed(new GearShiftHigh());

        Button shiftLow = new Button() {
            @Override
            public boolean get() {
                return controller.getBumperPressed(GenericHID.Hand.kLeft);
            }
        };
        shiftLow.whenPressed(new GearShiftLow());
    }

    public XboxController getController(){

        return controller;

    }
}
