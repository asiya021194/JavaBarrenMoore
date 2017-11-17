
public class Player extends Entity {

	private int health;

	public Player(int xPosition, int yPosition, int health) {
		super(xPosition, yPosition);
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}