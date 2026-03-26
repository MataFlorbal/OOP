package uvod;

public class auto {
    String nazev;
    String barva;
    boolean jePojizdne;
    boolean jeNastartovane;
    int maxRychlost;
    int aktualniRychlost;

    public void vypisInfo(){
        System.out.println("název: " + this.nazev);
        System.out.println("barva: " + this.barva);
        System.out.println("pojízdné: " + this.jePojizdne);
        System.out.println("max. rychlost: " + this.maxRychlost);
    }
    public void stav(){
        if (!jePojizdne){
            System.out.println("jsem rozbité");
        }
        else if (aktualniRychlost == 0) {
            System.out.println("nemám benzín");
        }
        else{
            System.out.println("jedu rychlostí " + aktualniRychlost + "km/h");
        }
    }
    public void nastartuj(){
        jeNastartovane = true;
    }
    public void zrychli(int kolik){
        if (!jeNastartovane){
            System.out.println("Nejdriv nastartuj, nez budes zrychlovat");
        }
        else {
            aktualniRychlost += kolik;
        }
        if (aktualniRychlost > maxRychlost){
            jeNastartovane = false;
            jePojizdne = false;
            aktualniRychlost = 0;
            System.out.println("auto se rozbilo, kvuli presazene rychlosti");
        }
    }
    public void zpomal(int kolik){
        aktualniRychlost -= kolik;
        if (aktualniRychlost <= 0){
            aktualniRychlost = 0;
            System.out.println("nemuzes zpomalit do minusu");
        }
    }
    public void vypniMotor(){
        if (aktualniRychlost > 0){
            System.out.println("nejprve zastav, abys mohl vypnout motor");
        }
        else{
            jeNastartovane = false;
            System.out.println("vypnul jsem motor");
        }
    }
}
