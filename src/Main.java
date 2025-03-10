public class Main {
    public static void main(String[] args) {
        SuperHero bolt = new SpeedHero("Bolt", 50);
        SuperHero baleze = new StrongHero("Baleze", 50);
        SuperHero professorY = new TelepathHero("ProfessorY", 50);


        //1er combat
        BattleArena.fight(bolt, baleze);

        //Second combat
        BattleArena.fight((baleze), professorY);

        //Log
        System.out.println("\nTotal de combats:"+ BattleArena.getBattleCount());
    }

}