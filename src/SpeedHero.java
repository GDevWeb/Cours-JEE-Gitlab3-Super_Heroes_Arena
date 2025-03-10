class SpeedHero extends SuperHero {
    private static final int DAMAGE = 5;

    public SpeedHero(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(SuperHero adversary) {
        System.out.println(name + " attaque rapidement!");
        adversary.takeDamage(DAMAGE);
        adversary.takeDamage(DAMAGE);
    }
}

/*
*
* Un hero rapide, mais faible. Sa rapidité lui vient de son enfant difficile.
* Une enfance passée à fuir, courir pour éviter les bastons.
* */