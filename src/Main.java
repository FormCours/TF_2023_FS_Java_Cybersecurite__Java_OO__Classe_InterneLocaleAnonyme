import listenners.IHouseListenner;
import models.House;

public class Main {
    public static void main(String[] args) {

        House h1 = new House("Hot Pink");

        House.Room r1 = new House.Room(50, 2, true);
        h1.addRoom(r1);

        h1.setHouseListenner(new IHouseListenner() {
            @Override
            public void open() {
                System.out.println("Dire bonjour :)");
            }
        });

        // -------------------------------
        House h2 = new House("Noir");
        h2.setHouseListenner(new IHouseListenner() {
            @Override
            public void open() {
                System.out.println("Claquer la porte à la personne !");
            }
        });

        // -------------------------------
        h1.HaveVisite();
        h2.HaveVisite();
    }
}