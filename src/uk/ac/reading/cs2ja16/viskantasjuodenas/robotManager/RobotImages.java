package uk.ac.reading.cs2ja16.viskantasjuodenas.robotManager;

import java.util.Random;
import javafx.scene.image.Image;

/**
 * Simple class to easily store and retrieve robot images 
 */
public class RobotImages {
	
	private Image[] robotImages = {
    		new Image(getClass().getResourceAsStream("robot_01.png")),
    		new Image(getClass().getResourceAsStream("robot_02.png")),
    		new Image(getClass().getResourceAsStream("robot_03.png")),
    		new Image(getClass().getResourceAsStream("robot_04.png")),
    		new Image(getClass().getResourceAsStream("robot_05.png")),
    		new Image(getClass().getResourceAsStream("robot_06.png")),
    		new Image(getClass().getResourceAsStream("robot_07.png")),
    		new Image(getClass().getResourceAsStream("robot_08.png")),
    		new Image(getClass().getResourceAsStream("robot_09.png")),
    		};
		
	/**
	 * Get image with provided index
	 * @param	index	provide image index
	 * @return	return robot image
	 */
	public Image getImage(int index) {
		return robotImages[index];
	}
	
	/**
	 * Get a random robot image
	 * @return	return robot image
	 */
	public Image getRandomImage() {
		return robotImages[new Random().nextInt(robotImages.length)];
	}
	
	/**
	 * Get size of images array
	 * @return	size of images array
	 */
	public int getSize() {
		return robotImages.length;
	}
}
