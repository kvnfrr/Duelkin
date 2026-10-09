package creatures;

public class Creature {

    // starting values
    private int health;
    private int mana;

    // attack values
    private int punchDamage;
    private int superPunchDamage;


    public Creature(int health, int mana, int PunchDamage, int SuperPunchDamage) {
        this.health = health;
        this.mana = mana;
        this.punchDamage = PunchDamage;
        this.superPunchDamage = SuperPunchDamage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getPunchDamage() {
        return punchDamage;
    }

    public void setPunchDamage(int punchDamage) {
        this.punchDamage = punchDamage;
    }

    public int getSuperPunchDamage() {
        return superPunchDamage;
    }

    public void setSuperPunchDamage(int superPunchDamage) {
        this.superPunchDamage = superPunchDamage;
    }

    public void displayInfo() {
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Punch Damage: " + punchDamage);
        System.out.println("Super Punch Damage: " + superPunchDamage);
    }
}
