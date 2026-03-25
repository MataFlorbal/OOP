package uvod;

public class aplikace {
    public static void main(String[] args) {
        auto a1 = new auto();
        a1.nazev = "bourák";
        a1.barva = "modrá";
        a1.jePojizdne = true;
        a1.maxRychlost = 200;
        a1.aktualniRychlost = 20;

        auto a2 = new auto();
        a2.nazev = "plechovka";
        a2.barva = "červená";
        a2.jePojizdne = true;
        a2.maxRychlost = 80;
        a2.aktualniRychlost = 0;

        a1.vypisInfo();
        a2.vypisInfo();
        a1.stav();
        a2.stav();

        a1.nastartuj();
        a1.zrychli(10);
        a1.stav();
    }
}