// Copyright 2021-2024 FRC 6328
// http://github.com/Mechanical-Advantage
//
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// version 3 as published by the Free Software Foundation or
// available in the root directory of this project.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU General Public License for more details.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final Mode currentMode = Mode.SIM;

  public static enum Mode {
    /** Running on a real robot. */
    REAL,

    /** Running a physics simulator. */
    SIM,

    /** Replaying from a log file. */
    REPLAY
  }

  public static class Ports {
    // Intake and Shooter
    public static int intake = 11;
    public static int shooter = 13;

    // Swerve Drive
    public static int frontLeftDrive = 8;
    public static int frontLeftTurn = 9;
    public static int frontLeftEncoder = 22;
    public static int frontLeftEncoderOffset = 251;

    public static int frontRightDrive = 2;
    public static int frontRightTurn = 3;
    public static int frontRightEncoder = 24;
    public static int frontRightEncoderOffset = 218;

    public static int rearLeftDrive = 6;
    public static int rearLeftTurn = 7;
    public static int rearLeftEncoder = 21;
    public static int rearLeftEncoderOffset = 105;

    public static int rearRightDrive = 4;
    public static int rearRightTurn = 5;
    public static int rearRightEncoder = 23;
    public static int rearRightEncoderOffset = 194;
  }
}
