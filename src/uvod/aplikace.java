package uvod;

public class aplikace {
    public static void main(String[] args) {
        auto a1 = new auto("bourák","modrá",200,120,true);

        auto a2 = new auto();
        a2.nazev = "plechovka";
        a2.barva = "červená";
        a2.jePojizdne = true;
        a2.setMaxRychlost(80);
        a2.aktualniRychlost = 0;

        Garaz g1 = new Garaz(1);
        g1.id = "Garáž č. 1";
        g1.zaparkuj(a1);
        g1.zaparkuj(a2);
        g1.info();

        System.out.println(a2.getMaxRychlost());

        a1.vypisInfo();
        a2.vypisInfo();
        a1.stav();
        a2.stav();
        a1.nastartuj();
        a1.zrychli(10);
        a1.stav();
        a1.zpomal(80);
        a1.stav();
        a1.vypniMotor();
        a1.stav();
        a1.zatrub();
    }
}