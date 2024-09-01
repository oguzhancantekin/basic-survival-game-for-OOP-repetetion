import java.util.Scanner;

public class Player {
	Scanner scanner = new Scanner(System.in);
	private int damage, healty, money, armor, rhealty;// rhealty bastaki can degerini korumamiz icin yapildi candaki
														// degisimleri healty ile tutariz fullemek icin rhealty kullanırız
														
	private String Name, cName;
	private Inventory inv = new Inventory();

	public int getTotalArmor() {
		int totalArmor = getArmor() + getInv().getArmor();
		return totalArmor;
	}

	public int getTotalDamage() {
		int totalDamage = getDamage() + getInv().getDamage();
		return totalDamage;
	}

	public void SelectChar() {

		switch (CharList()) {// burada charlist int bir fonksiyondur ve int dondurur burada parametre olarak kullanıyoruz
							
		case 1:
			initPlayer("Samurai", 5, 21, 15);
			break;
		case 2:
			initPlayer("Archer", 7, 18, 20);
			break;
		case 3:
			initPlayer("Knight", 8, 24, 5);
			break;
		default:// bug durumunda oto samurayi sectirir bu default yani 1 2 3 degerleri disinda
				// birsey girilirse ama asagida if ile kontrol etmistik bunu
			initPlayer("Samurai", 5, 21, 15);
			break;
		}
		System.out.println("SELECTED CHAR: " + getcName() + " DAMAGE: " + getDamage() + " HEALTY: " + getHealth()
				+ " MONEY: " + getMoney());

	}

	public void initPlayer(String cName, int dmg, int hlty, int mny) {// hizli bir sekilde atama yapmak icin olusturduk
		// caselerin herbirinde tek tek de tanimlayabilirdik ama boylesi daha hoş geldi bana
		setcName(cName);
		setDamage(dmg);
		setHealth(hlty);
		setMoney(mny);
		setRhealty(hlty);

	}

	public int CharList() {
		int CharID;
		System.out.println("Oyuna baslamak icinh asagidaki charlardan birini seciniz: ");
		while (true) {
			System.out.println("1/ Samurai		damage:5	healty:21	money:15 (deneme)");
			System.out.println("2/ Archer		damage:7	healty:18	money:20");
			System.out.println("3/ Knight		damage:8	healty:24	money:5");
			System.out.println("SECIMINIZ:");
			CharID = scanner.nextInt();
			if (CharID > 0 && CharID < 4) {
				break;
			} else {
				System.out.println("HATALI DEGER GIRDINIZ TEKRAR DENEYIN!!!");
			}

		}
		return CharID;
	}

	public Player(String Name) {
		this.Name = Name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return healty;
	}

	public void setHealth(int healty) {
		this.healty = healty;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Inventory getInv() {
		return inv;
	}

	public void setInv(Inventory inv) {
		this.inv = inv;
	}

	public int getRhealty() {
		return rhealty;
	}

	public void setRhealty(int rhealty) {
		this.rhealty = rhealty;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

}
