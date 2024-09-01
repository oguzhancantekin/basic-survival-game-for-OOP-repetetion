import java.util.Scanner;

public abstract class Location {
	Scanner scanner = new Scanner(System.in);// burada tanimlandigi icin alt siniflarin hepsinde kullanilabilir artik
												
	protected String name;
	protected Player player;

	Location(Player player) {
		this.player = player;

	}

	public abstract boolean getLocation();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
