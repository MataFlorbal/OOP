package jednoduchePriklady;

import java.sql.SQLOutput;

public class penezenka {
    int zustatek;

    public void vlozCastku(int vlozenaCastka){
        if (vlozenaCastka > 3000){
            System.out.println("nemuzes vlozit castku vetsi nez 3000");
        }
        else {
            zustatek += vlozenaCastka;
        }
    }
    public void vyberCastku(int vybranaCastka){
        if (zustatek < vybranaCastka){
            System.out.println("nemuzes vybrat vetsi castku nez mas penez v penezence");
        }
        else {
            zustatek -= vybranaCastka;
        }
    }
    public void zjistiZustatek(){
        if (zustatek == 0){
            System.out.println("jsi na nule");
        }
        else {
            System.out.println(zustatek);
        }
    }
}
