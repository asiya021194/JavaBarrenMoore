
public class BarrenMoore {

	private Entity[][] map = new Entity[11][11];

	private Player newPlayer = new Player(1, 2, 0);
	private Treasure treasure = new Treasure(4, 6, true);

	public BarrenMoore() {
		map[newPlayer.getxPosition()][newPlayer.getyPosition()] = newPlayer;
		map[treasure.getxPosition()][treasure.getyPosition()] = treasure;
	}

	public Entity[][] getMap() {
		return map;
	}

	public void setMap(Entity[][] map) {
		this.map = map;
	}

	public Player getNewPlayer() {
		return newPlayer;
	}

	public void setNewPlayer(Player newPlayer) {
		this.newPlayer = newPlayer;
	}

	public Treasure getTreasure() {
		return treasure;
	}

	public void setTreasure(Treasure treasure) {
		this.treasure = treasure;
	}

	public void playerDirect(String direction) {

		map[newPlayer.getxPosition()][newPlayer.getyPosition()] = null;

		if (direction.equals("North")) {
			newPlayer.yPosition = newPlayer.yPosition + 1;
			newPlayer.setyPosition(newPlayer.yPosition);
		} else if (direction.equals("South")) {
			newPlayer.yPosition = newPlayer.yPosition - 1;
			newPlayer.setyPosition(newPlayer.yPosition);
		} else if (direction.equals("East")) {
			newPlayer.xPosition = newPlayer.xPosition + 1;
			newPlayer.setxPosition(newPlayer.xPosition);
		} else if (direction.equals("West")) {
			newPlayer.xPosition = newPlayer.xPosition - 1;
			newPlayer.setxPosition(newPlayer.xPosition);
		} else {

		}

	}

	public double distance() {
		return Math.sqrt((getTreasure().getxPosition() - getNewPlayer().getxPosition())
				* (getTreasure().getxPosition() - getNewPlayer().getxPosition())
				+ (getTreasure().getyPosition() - getNewPlayer().getyPosition())
						* (getTreasure().getyPosition() - getNewPlayer().getyPosition()));
	}

	public void outOfBound(String direction) {
		if (direction.equals("North") && newPlayer.yPosition >= 10
				|| direction.equals("South") && newPlayer.yPosition <= 0
				|| direction.equals("West") && newPlayer.xPosition <= 0
				|| direction.equals("East") && newPlayer.xPosition >= 10) {
			System.out.println("Wrong Direction!");
		} else {
			playerDirect(direction);
		}
	}

	public void treasureFound() {
		if (newPlayer.xPosition == treasure.xPosition && newPlayer.yPosition == treasure.yPosition) {
			System.out.println("Treasure Found! Your current location coordinates are" + " ("
					+ getTreasure().getxPosition() + ", " + getTreasure().getyPosition() + ") on the map.");
		} else {
			System.out.println("Continue Searching!");
		}
	}
}
