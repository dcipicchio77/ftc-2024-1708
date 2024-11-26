package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Elevator {
    public DcMotor leftElevator;
    public DcMotor rightElevator;

    public void setPower(double power) {
        leftElevator.setPower(power);
        rightElevator.setPower(power);
    }
}
