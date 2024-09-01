import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Game {
	Location location = null;
//Location location=new SafeHouse(new Player("ali"));
	Player player;
	Scanner scanner = new Scanner(System.in);

	public void login() {

		System.out.println("Oyuna Hos Geldiniz");
		System.out.println("Oyuna baslamadan once isminizi giriniz!");
		String Playername = scanner.nextLine();
		player = new Player(Playername);
		player.SelectChar();
		start();
	}

	public void start() {

		while (true) {
			System.out.println();
			System.out.println("-------------------------");
			System.out.println();
			System.out.println("Bir yer seciniz: ");
			System.out.println("1- Guvenli ev -> Size ait guvenli bir ev, tehlike yok");
			System.out.println("2- Magara -> Karsiniza zombi cikabilir");
			System.out.println("3- Orman -> Karsiniza vampir cikabilir");
			System.out.println("4- Nehir -> Karsiniza ayi cikabilir");
			System.out.println("5- Magaza -> Silah veya Zirh alabilirsiniz");
			System.out.println("girdiginiz deger: ");
			int selloc = scanner.nextInt();
			while (selloc < 1 || selloc > 5) { 
				System.out.println("Hatali Deger girdiniz Tekrar Giriniz!");
				selloc = scanner.nextInt();
			}

			switch (selloc) {
			case 1:
				location = new SafeHouse(player);
				break;
			case 2:
				location = new Cave(player);
				break;
			case 3:
				location = new Forest(player);
				break;
			case 4:
				location = new River(player);
				break;

			case 5:
				location = new ToolStore(player);

				break;
			default:
				location = new SafeHouse(player);
				break;
			}
			if(location.getName()=="Guvenli Ev") {
				if(player.getInv().isFirewood()&&player.getInv().isWater()&&player.getInv().isFood()) {
					System.out.println("TEBRIKLER OYUNU KAZANDINIZ!!!");
					break;
				}
			}
			if (!location.getLocation()) {
				System.out.println("Oyun Bitti");
				break;
			}
		}
	}

}
