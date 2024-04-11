## Road Runner with Field Centric Drive Repository Usage Guide

This guide is intended to help you use a GitHub repository for an FTC (First Tech Challenge) code project that is a modification of the RoadRunner library and includes an adaptation of Field Centric Drive for the Teleoperated and Autonomous period.

### Step 1: Cloning the Repository

1. Open a terminal or command prompt on your computer.
2. Clone the repository using the following command:
   ```
   git clone --single-branch -b [RoadRunner] https://github.com/tyggas/FieldCentricDrive.git
   ```

### Step 2: Project Setup

1. Open Android Studio.
2. In Android Studio, click on "Open an existing Android Studio project".
3. Navigate to the directory where you cloned the repository and select it.
4. Wait for Android Studio to set up the project.

### Step 3: Code Organization

In this step, we will organize the code within the project repository in a more specific manner. Here's how you can structure it:

1. **Drive Folder (`drive`)**: Within this folder, you will find the code related to the robot's driving controls, both for teleoperated and autonomous modes.

   ```
   |- road-runner-quickstart
      |- drive
         |- TeleOpDrive.java
         |- AutonomousDrive.java
         |- ...
   ```

2. **Subsystems Folder (`drive/subsystems`)**: This folder is designated for different subsystems of the robot. Specifically, the Field Centric Drive system is located here. Use this folder to create your own subsystems.

   ```
   |- road-runner-quickstart
      |- drive
         |- subsystems
            |- FieldCentricDriveSubsystem.java
            |- ...
   ```

By organizing the code in this manner, you can easily locate and manage different components of your project. The `drive` folder contains driving-related code, while the `subsystems` folder within it houses specific subsystem code, such as the Field Centric Drive system. This structure enhances readability and maintainability of the project.

### Step 4: Compiling the Project

1. After the project is set up, you can compile the project as you would with any other `ftc_app` project.
2. Make sure your Rev Control HUB device is connected to the computer.
3. Click on "Run" in Android Studio to compile and install the app on the device.

### Step 5: Troubleshooting

- **Multidex Issues**: If you encounter issues with multidex, you can enable Proguard by changing `useProguard` to `true` in the `build.common.gradle` file.

### Step 6: Documentation

1. For detailed information on getting started with the project, refer to the [online documentation of Road Runner](https://rr.brott.dev/docs/v0-5/quickstart/introduction/).
