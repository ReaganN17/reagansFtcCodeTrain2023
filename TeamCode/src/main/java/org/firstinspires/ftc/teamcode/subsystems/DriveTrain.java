package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class DriveTrain extends SubsystemBase {

    HardwareMap hardwareMap = null;

    MotorEx fr;
    MotorEx fl;
    MotorEx br;
    MotorEx bl;

    private DriveTrain() {
        fr = new MotorEx(hardwareMap, "uno");
        fl = new MotorEx(hardwareMap, "dos");
        br = new MotorEx(hardwareMap, "tres");
        bl = new MotorEx(hardwareMap, "cuatro");


        fl.setZeroPowerBehavior(MotorEx.ZeroPowerBehavior.BRAKE);
        bl.setZeroPowerBehavior(MotorEx.ZeroPowerBehavior.BRAKE);
        fr.setZeroPowerBehavior(MotorEx.ZeroPowerBehavior.BRAKE);
        br.setZeroPowerBehavior(MotorEx.ZeroPowerBehavior.BRAKE);
    }

    public void drive (double ypowa, double xpowa) {
        fr.set(ypowa - xpowa);
        br.set(ypowa - xpowa);
        fl.set(-ypowa - xpowa);
        bl.set(-ypowa - xpowa);

    }





}
