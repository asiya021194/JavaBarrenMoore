import java.util.Scanner;

public class BarrenMooreRunner {

	public static void main(String[] args) {

		String player = "";
		BarrenMoore barrenMoore = new BarrenMoore();

		System.out.println("Player Location: (" + barrenMoore.getNewPlayer().getxPosition() + ", "
				+ barrenMoore.getNewPlayer().getyPosition() + ")");

		System.out.println("Hint! Distance between player and treasure: " + barrenMoore.distance() + "m");

		Scanner scanner = new Scanner(System.in);

		while (!player.equals("Give up!")) {
			player = scanner.nextLine();
			barrenMoore.outOfBound(player);
			System.out.println("Player Location: (" + barrenMoore.getNewPlayer().getxPosition() + ", "
					+ barrenMoore.getNewPlayer().getyPosition() + ")");
			barrenMoore.treasureFound();

		}
	}

}
