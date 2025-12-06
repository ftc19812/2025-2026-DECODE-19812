package org.firstinspires.ftc.teamcode.teamfiles.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Servo;

public class SOlomonBot2 extends OpMode{

    public DcMotorEx intake;

    public DcMotorEx arm;

    public Servo lift;

    @Override
    public void init() {

       intake = hardwareMap.get(DcMotorEx.class,"intake");
       intake.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
       arm = hardwareMap.get(DcMotorEx.class,"arm");
       arm.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
       lift = hardwareMap.get(Servo.class,"lift");
    }

    @Override
    public void loop() {

        if(gamepad1.a){
            intake.setVelocity(-2000);

        } else if (gamepad1.b) {
            intake.setVelocity(2000);
        } else {
            intake.setVelocity(0);
        }
        if(gamepad1.right_bumper){
            lift.setPosition(1);
        }else if (gamepad1.left_bumper) {
            lift.setPosition(-1);
        }else{
            lift.setPosition(0);
        }

    }
}
