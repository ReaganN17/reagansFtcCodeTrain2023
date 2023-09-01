package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.subsystems.DriveTrain;

@TeleOp
public class OpMode extends LinearOpMode {

    DriveTrain drivemf;
    GamepadEx driverConally;

    @Override
    public void runOpMode() throws InterruptedException {

        waitForStart();

        drivemf.drive(driverConally.getLeftY(), driverConally.getLeftX());
    }
}
