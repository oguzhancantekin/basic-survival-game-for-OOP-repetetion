
public class Vampire extends Obstacle {

	public Vampire() {
		super("Vampir", 3, 4, 7, 14); // Super kullanma sebebimiz Obstacle classından türemiş bir subclass olması bu sınıfın.
		//Ve Vampir veya diğer hayvanlar da bir Obstacle olduğu için Obstacle constructorındaki parametreleri içermeli.
	}

}
