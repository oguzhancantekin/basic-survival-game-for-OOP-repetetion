import java.util.Random;
public class Obstacle {
private String name;
private int maxNumber,damage,award,health;
Random random=new Random();

public Obstacle(String name, int maxNumber, int damage, int award, int health) { //Tüm alt classları buradan Super alacak
	this.name = name;
	this.maxNumber = maxNumber;
	this.damage = damage;
	this.award = award;
	this.health = health;
}
public int Count() {
	int randNum = random.nextInt(maxNumber) + 1;
	return randNum;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMaxNumber() {
	return maxNumber;
}
public void setMaxNumber(int maxNumber) {
	this.maxNumber = maxNumber;
}
public int getDamage() {
	return damage;
}
public void setDamage(int damage) {
	this.damage = damage;
}
public int getAward() {
	return award;
}
public void setAward(int award) {
	this.award = award;
}
public int getHealth() {
	return health;
}
public void setHealth(int health) {
	this.health = health;
}

}
