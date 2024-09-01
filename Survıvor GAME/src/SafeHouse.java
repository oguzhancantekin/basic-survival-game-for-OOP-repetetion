public class SafeHouse extends NormalLoc {

    SafeHouse(Player player) {
        super(player, "Guvenli Ev");
    }

    @Override
    public boolean getLocation() {
        System.out.println("Şu an " + name + " adlı yerdesiniz.");
        player.setHealth(player.getRhealty());
        System.out.println("Canınız doldu.");
        return true;
    }
}
