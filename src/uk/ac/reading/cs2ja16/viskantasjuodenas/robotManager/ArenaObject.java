package uk.ac.reading.cs2ja16.viskantasjuodenas.robotManager;

import javafx.scene.image.Image;

public abstract class ArenaObject {
	
	protected int x;
	protected int y;
	protected int id;
	protected String objectType;
	protected Image image;
	protected static int objectsCount = 0;
	protected RobotArena robotArena;
	
	public void countId() {
		objectsCount++;
		id = objectsCount;
	}
	
	public boolean isHere(int x, int y) {
		if (this.x == x && this.y == y) {
			return true;
		} else {
			return false;
		}
	}
	
	public abstract boolean tryToMove();
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public int getId() {
		return id;
	}
	
	public Image getImage() {
		return image;
	}
	
	public static int getObjectsCount() {
		return objectsCount;
	}

	public abstract boolean getDidMove();
}