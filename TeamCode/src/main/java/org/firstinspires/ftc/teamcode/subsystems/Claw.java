package org.firstinspires.ftc.teamcode.subsystems;
import com.qualcomm.robotcore.hardware.CRServo;

public class Claw {
    public CRServo wristServo;
    public CRServo clawServo;

    public void setClawServo(double power) {
        clawServo.setPower(power);
    }

    public void setWristServo(double power) {
        clawServo.setPower(power);
    }
}