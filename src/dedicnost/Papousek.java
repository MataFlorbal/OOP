package dedicnost;

public class Papousek extends Zvire{
    int rozpetiKridel;

    public Papousek(String jmeno){
        super(jmeno);
    }

    public void let(int rychlost){
        System.out.println("letim rychlosti " + rychlost + "km/h");
    }
}
