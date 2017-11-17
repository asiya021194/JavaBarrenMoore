
public class Treasure extends Entity {

	private boolean isTreasureFound;

	public Treasure(int xPosition, int yPosition, boolean isTreasureFound) {
		super(xPosition, yPosition);
		this.isTreasureFound = isTreasureFound;
	}

	public boolean isTreasureFound() {
		return isTreasureFound;
	}

	public void setTreasureFound(boolean isTreasureFound) {
		this.isTreasureFound = isTreasureFound;
	}

}
