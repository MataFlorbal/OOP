package dedicnost;

import uvod.auto;

import java.util.ArrayList;

public class Dum {
    ArrayList<Zvire> ubytovani = new ArrayList<>();
    String jmeno;

    public Dum(){}

    public Dum(String jmeno){
        this.jmeno = jmeno;
    }
    public void vypisZvirata(){
        for (Zvire z : ubytovani){
            System.out.println("zvirata v ubytovani: " + z.jmeno);
        }
    }
    public void ubytujSe(Zvire z){
        ubytovani.add(z);
        System.out.println("jsem ubytovan");
    }
    public void odejdi(Zvire z){
        ubytovani.remove(z);
        System.out.println("odesel jsem z ubytovani");
    }
}
