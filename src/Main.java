import creatures.Creature;

public class Main {
    public static void main(String[] args) {

        Creature playerCreature = new Creature(20, 20, 5, 10);
        Creature enemyCreature = new Creature(20, 20, 5, 10);


        System.out.println("Player Creature:");
        playerCreature.displayInfo();

        System.out.println();

        System.out.println("Enemy Creature:");
        enemyCreature.displayInfo();

    }
}
