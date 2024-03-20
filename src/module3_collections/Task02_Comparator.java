package module3_collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player {
	String name;
	int score;

	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class Checker implements Comparator<Player> {
	public int compare(Player a, Player b) {
		if (a.score != b.score) {
			return b.score - a.score;
		}
		return a.name.compareTo(b.name);
	}
}

public class Task02_Comparator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Player[] players = new Player[n];
		for (int i = 0; i < n; i++) {
			players[i] = new Player(scanner.next(), scanner.nextInt());
		}
		scanner.close();

		Arrays.sort(players, new Checker());

		for (Player player : players) {
			System.out.println(player.name + " " + player.score);
		}

	}

}
