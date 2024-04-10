package org.firstinspires.ftc.teamcode.drive;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.drive.subsystems.FieldCentric;


@TeleOp(group="drive")
public class TeleopExample extends LinearOpMode {
    public double mecanumVelocity = 0;

    public int elevatorState = 0;

    @Override
    public void runOpMode() {

        FieldCentric fieldOriented = new FieldCentric();
        fieldOriented.init(hardwareMap);

        while (!isStopRequested()) {

            //Define controls for driving.
            double y = -gamepad1.left_stick_y;
            double x = gamepad1.left_stick_x;
            double rx = gamepad1.right_stick_x;

            fieldOriented.fieldOrientedDrive(y, x, rx);
            telemetry.addData("Y",y);
            telemetry.addData("X",x);
            telemetry.addData("RX",rx);
            telemetry.addData("Tempo", getRuntime());
            telemetry.update();
            if (gamepad1.options) {
                fieldOriented.resetIMU();
            }


        }
    }

}

