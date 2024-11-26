package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.CRServo;

public class Plane {
    public CRServo planeServo;

    public void setPower(double power) {
        planeServo.setPower(power);
    }
}
