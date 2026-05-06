package uvod;
import java.util.ArrayList;

public class Garaz {
    private int kapacita;
    String id;
    ArrayList<auto> auta = new ArrayList<>();

    public void info(){
        System.out.println("id: " + this.id);
        System.out.println("kapacita: " + this.kapacita);
        System.out.println("volnych mist: " + (this.kapacita - this.auta.size()));
        for (auto a : auta){
            System.out.println(a.nazev);
        }
    }
    public void vyparkuj(auto a){
        auta.remove(a);
    }
    public void zaparkuj (auto a){
        if (auta.size() < kapacita){
            auta.add(a);
            System.out.println("zaparkovano");
        }
        else {
            System.out.println("nezaparkovano");
        }
    }
    public void setKapacita(int mista){
        this.kapacita = Math.max(1,mista);
    }
    public Garaz(){}
    public Garaz(int mista){
        this.setKapacita(mista);
    }
}
