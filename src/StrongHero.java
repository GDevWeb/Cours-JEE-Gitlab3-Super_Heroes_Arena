class StrongHero extends SuperHero {
    private static final int DAMAGE = 15;

    public StrongHero(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(SuperHero adversary) {
        System.out.println(name + " attaque d'un puissant coup de poing");
        adversary.takeDamage(DAMAGE);
    }
}

/*
* Un heros balèze mais con sur les bords.
* Il a passé plus de temps à la salle que sur les bancs d'école.
* */