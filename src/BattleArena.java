class BattleArena {
    private static int battleCount = 0;

    public static void fight(SuperHero hero1, SuperHero hero2) {
        System.out.println("\n=== Combat #" + (++battleCount) + ": " + hero1.getName() + " VS " + hero2.getName() + " ===");

        while (hero1.isAlive() && hero2.isAlive()) {
            System.out.println("\n--- Nouveau Round ---");
            hero1.attack(hero2);
            if (hero2.isAlive()) hero2.attack(hero1);
        }

        System.out.println("\n🏆 Le gagnant est: " + (hero1.isAlive() ? hero1.getName() : hero2.getName()) + "!");
    }

    public static int getBattleCount() {
        return battleCount;
    }
}
