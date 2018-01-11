package uk.ac.reading.cs2ja16.viskantasjuodenas.robotManager;

public class Robot {

	private int x, y;
	private int oldX, oldY;
	private static int robotsCount = 0; // Robots counter, to help calculate IDs
	private int robotId;
	private Direction direction;
	private RobotArena robotArena;
	private int imageIndex;
	private boolean robotMoved = false;

	/**
	 * Robot constructor, sets up his location, direction, robotArena, Id, and imageIndex
	 * @param	x	x coordinate
	 * @param	y	y coordinate
	 * @param	direction	robot's initial direction
	 * @param	robotArena	robotArena the robot belongs to	
	 * @param	imageIndex	robot's image index, stored to have a consistent image
	 */
	Robot(int x, int y, Direction direction, RobotArena robotArena, int imageIndex) {
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.robotArena = robotArena;
		this.imageIndex = imageIndex;
		// Setting robot ID
		robotsCount++;
		robotId = robotsCount;
	}

	Robot() {
		x = 5;
		y = 5;
		// Setting robot ID
		robotsCount++;
		robotId = robotsCount;
	}

	public String toString() {
		return "Robot ID: " + robotId + ". Current position x: " + x + ", y: " + y + ". Current direction: "
				+ direction;
	}

	public boolean isHere(int x, int y) {
		if (this.x == x && this.y == y) {
			return true;
		} else {
			return false;
		}
	}

	//Function to move
	public void tryToMove() {
		int nextX = x, nextY = y;
		//Set next coordinates
		switch (direction) {
		case NORTH:
			nextY--;
			break;
		case EAST:
			nextX++;
			break;
		case SOUTH:
			nextY++;
			break;
		case WEST:
			nextX--;
			break;
		}
		//If robot can move there, set next coordinates to current
		if (robotArena.canMoveHere(nextX, nextY)) {
			oldX = x;
			oldY = y;
			x = nextX;
			y = nextY;
			robotMoved = true;
		} else {	//Otherwise, set direction to random
			direction = direction.getNextDirection();
			robotMoved = false;
		}
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setId(int robotId) {
		this.robotId = robotId;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public void setRobotArena(RobotArena robotArena) {
		this.robotArena = robotArena;
	}
	
	public static void setRobotsCount(int count) {
		robotsCount = count;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public int getOldX() {
		return oldX;
	}

	public int getOldY() {
		return oldY;
	}

	public int getId() {
		return robotId;
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public RobotArena getRobotArena() {
		return robotArena;
	}
	
	public int getImageIndex() {
		return imageIndex;
	}
	
	public boolean getRobotMoved() {
		return robotMoved;
	}
}
