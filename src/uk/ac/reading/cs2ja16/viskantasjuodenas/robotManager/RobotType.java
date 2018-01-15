package uk.ac.reading.cs2ja16.viskantasjuodenas.robotManager;

import java.util.Arrays;
import java.util.Random;

public class RobotType {

	private static String[] robots = { "RobotOne", "RobotTwo", "RobotThree", "RobotFour", "RobotEight"};
	private static String[] robotDescriptions = {
			"Robot changes direction clockwise. Takes a turn to change a direction.",
			"Robot changes direction clockwise. Changes direction instantly.",
			"Robot changes direction randomly. Changes direction instantly",
			"Robot changes direction clockwise, but can change at a random time. Changes direction instantly.",
			"Robot changes direction clockwise. Has extra charge. Takes a turn to change direction",
			"Robot changes direction clockwise. Removes traps. Takes a turn to change direction",
			"Robot changes direction clockwise, can steer towards a light. Changes direction instantly",
			"Robot changes direction clockwise, can destroy walls. Takes a turn to change direction"};

	public static int getCount() {
		return robots.length;
	}

	public static String getRandom() {
		return robots[new Random().nextInt(robots.length)];
	}

	public static String get(int index) {
		return robots[index];
	}
	
	public static String getDescription(int index) {
		return robotDescriptions[index];
	}

	public static int getIndex(String name) {
		return Arrays.asList(robots).indexOf(name);
	}

	public static Robot getRobotObject(int x, int y, Direction direction, String type, RobotArena robotArena) {
		switch (type) {
		default:
			return new RobotOne(x, y, direction, robotArena);
		case "RobotTwo":
			return new RobotTwo(x, y, direction, robotArena);
		case "RobotThree":
			return new RobotThree(x, y, direction, robotArena);
		case "RobotFour":
			return new RobotFour(x, y, direction, robotArena);
		case "RobotEight":
			return new RobotEight(x, y, direction, robotArena);
		}
	}
}
