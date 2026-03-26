package uvod;

public class aplikace {
    public static void main(String[] args) {
        auto a1 = new auto();
        a1.nazev = "bourák";
        a1.barva = "modrá";
        a1.jePojizdne = true;
        a1.maxRychlost = 200;
        a1.aktualniRychlost = 120;

        auto a2 = new auto();
        a2.nazev = "plechovka";
        a2.barva = "červená";
        a2.jePojizdne = true;
        a2.maxRychlost = 80;
        a2.aktualniRychlost = 0;

        a1.vypisInfo();
        a2.vypisInfo();
            System.out.println("");
        a1.stav();
        a2.stav();
            System.out.println("");
        a1.nastartuj();
        a1.zrychli(10);
        a1.stav();
            System.out.println("");
        a1.zpomal(80);
        a1.stav();
            System.out.println("");
        a1.vypniMotor();
        a1.stav();
    }
}