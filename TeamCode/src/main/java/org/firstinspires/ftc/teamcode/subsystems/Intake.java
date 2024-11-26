package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Intake {
    public DcMotor intakeMotor;

    public CRServo intakeLeft;
    public CRServo intakeRight;
    public void setPower (double power) {
        intakeMotor.setPower(power);
    }
    public void setServoPower (double power) {
        intakeLeft.setPower(power);
        intakeRight.setPower(power);
    }
}
