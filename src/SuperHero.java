abstract class SuperHero {
    protected String name;
    protected int health;

    public SuperHero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attack(SuperHero adversary);

    public void takeDamage(int amount) {
        this.health -= amount;
        if (this.health < 0) this.health = 0;
        System.out.println(name + " takes " + amount + " damage. Remaining health: " + this.health);
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public String getName() {
        return this.name;
    }
}
