#FieldCentricDrive

Download this FieldCentric repository to Android Studio.

Hardware Configuration:

Ensure that all necessary motors and sensors are properly connected to the robot controller.
In the FieldCentric.java file, in the init() method, verify that the names of the motors and sensors correctly correspond to the identifiers in the FTC configuration file (usually hardware_map.xml).
If necessary, adjust the IMU settings according to the real hardware orientation.


Encoder Configuration:

Ensure that the encoders are properly connected and configured in the robot hardware.
If necessary, adjust the encoder directions in the init() method using perpendicularEncoder.setDirection(Encoder.Direction.REVERSE).


Useful Methods:

fieldOrientedDrive(double y, double x, double rx): Method to control the robot in field orientation. The parameters y, x, and rx represent the forward/backward, lateral, and rotation speeds, respectively.
resetIMU(): Resets the IMU orientation.
getParallelPosition(): Returns the current position of the robot in the parallel direction.
getPerpendicularPosition(): Returns the current position of the robot in the perpendicular direction.
Contribution and Improvements:

Feel free to contribute improvements and suggestions to the code through my contact.
Report any issues or bugs found using the GitHub issue tracking system. 



#Road Runner Quickstart

An example FTC project using [Road Runner](https://github.com/acmerobotics/road-runner).

## Installation

1. Download or clone this repo with `git clone --single-branch -b quickstart1 https://github.com/acmerobotics/road-runner-quickstart.git`.

1. Open the project in Android Studio and build `TeamCode` like any other `ftc_app` project.

1. If you have trouble with multidex, enable proguard by changing `useProguard` to `true` in `build.common.gradle`.

## Documentation

Check out the [online quickstart documentation](https://rr.brott.dev/docs/v0-5/quickstart/introduction/).
