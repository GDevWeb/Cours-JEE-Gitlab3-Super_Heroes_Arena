import java.util.Random;

class TelepathHero extends SuperHero {
    private static final int DAMAGE_NORMAL = 10;
    private static final int DAMAGE_CRITICAL = 20;

    public TelepathHero(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(SuperHero adversary) {
        Random rand = new Random();
        if (rand.nextBoolean()) { // 50% chance
            System.out.println(name + " utilise attaque mental. Coup critique!");
            adversary.takeDamage(DAMAGE_CRITICAL);
        } else {
            System.out.println(name + " utilises poussée telekinetic!");
            adversary.takeDamage(DAMAGE_NORMAL);
        }
    }
}

/*
* Hero au pouvoir télékinésique.
* Intelligent mais faible, on peut pas tout avoir dans la vie
* */

