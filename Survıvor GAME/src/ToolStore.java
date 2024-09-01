
public class ToolStore extends NormalLoc {

	ToolStore(Player player) {
		super(player, "Tool Store");

	}

	public boolean getLocation() {
		System.out.println("Şu an " + name + " adlı yerdesiniz.");
		System.out.println("Para: " + player.getMoney());
		System.out.println("--------------");
		System.out.println("1. Silahlar");
		System.out.println("2. Zirhlar");
		System.out.println("3. Cikis");
		System.out.print("SECIMINIZ: ");
		int selTool = scanner.nextInt();
		//int selItemID;
		switch (selTool) {
		case 1:
			buyWeapon(weaponMenu());

			break;
		case 2:
			buyArmor(armorMenu());
			break;
		default:
			break;
		}

		return true;
	}

	public int weaponMenu() {
		System.out.println("1. Tabanca | <Para: 20 | <Hasar: 2");
		System.out.println("2. Kilic | <Para: 35 | <Hasar: 3");
		System.out.println("3. Tufek | <Para: 45 | <Hasar: 7");
		System.out.println("4. Cikis");
		System.out.print("Silah Seciniz:	");
		int selWeaponID = scanner.nextInt();
		return selWeaponID;
	}

	public void buyWeapon(int selWeaponID) {
		int damage = 0, price = 0;
		String wName = null;

		switch (selWeaponID) {
		case 1:
			damage = 2;
			price = 20;
			wName = "Tabanca";
			break;
		case 2:
			damage = 3;
			price = 35;
			wName = "Kilic";
			break;
		case 3:
			damage = 7;
			price = 45;
			wName = "Tufek";
			break;
		default:
			System.out.println("GECERSIZ ISLEM!");
			break;
		}
		if(price>0) {
			if (player.getMoney() >= price) {
				player.getInv().setDamage(damage);
				player.getInv().setwName(wName);
				player.setMoney(player.getMoney() - price);
				System.out.println(wName+" Satin Aldiniz 	 Eski hasariniz: "+player.getDamage()+" yeni hasariniz: "+player.getTotalDamage());
				System.out.println("Kalan Para: "+ player.getMoney());
			} else {
				System.out.println("Bakiye Yetersiz!");
			}
		}
		}

	
	
	
	public int armorMenu() {
		System.out.println("1. Hafif | <Para: 15 | <Engelleme: 1");
		System.out.println("2. Orta | <Para: 25 | <Engelleme: 3");
		System.out.println("3. Agir | <Para: 40 | <Engelleme: 5");
		System.out.println("4. Cikis");
		System.out.print("Zirh Seciniz:	");
		int selArmorID = scanner.nextInt();
		return selArmorID;
	}

	public void buyArmor(int selArmorID) {
		int avoid = 0, price = 0;
		String aName = null;

		switch (selArmorID) {
		case 1: 
			avoid = 1;
			price = 15;
			aName = "Hafif";
			break;
		case 2:
			avoid = 3;
			price = 25;
			aName = "Orta";
			break;
		case 3:
			avoid = 5;
			price = 40;
			aName = "Agir";
			break;
		case 4: 
			System.out.println("Cikis Yapiliyor...");
		default:
			System.out.println("GECERSIZ ISLEM!");
			break;
		}
		if(price>0) {
			if (player.getMoney() >= price) {
				player.getInv().setArmor(avoid);
				player.getInv().setaName(aName);
				player.setMoney(player.getMoney() - price);
				System.out.println(aName+" Satin Aldiniz 	 Eski Armor: "+player.getArmor()+" yeni Armor: "
				+player.getTotalArmor());
				System.out.println("Kalan Para: "+ player.getMoney());
			} else {
				System.out.println("Bakiye Yetersiz!");
			}
		}
		}
	
}
