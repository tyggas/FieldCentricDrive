//Project in development

package org.firstinspires.ftc.teamcode.drive;

import org.firstinspires.ftc.teamcode.drive.subsystems.FieldCentric;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(group="drive")
public class autonomousExample extends LinearOpMode{
    FieldCentric fieldCentric = new FieldCentric();

    @Override
    public void runOpMode() throws InterruptedException {

        Waypoints[] waypoints = {
                new Waypoints(0, 0, 0),

        };

        while (!isStopRequested()) {

            for (int idx = 0; idx < waypoints.length; idx++) {
                if (isStopRequested()) {
                    break;
                }
                Waypoints w = waypoints[idx];
                fieldCentric.resetEncoders();
                fieldCentric.resetIMU();
            }
        }
    }
}
