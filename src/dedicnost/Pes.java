package dedicnost;

public class Pes extends Zvire{
    int pocetKoncetin;

    public Pes(String jmeno){
        super(jmeno);
    }

    public void bez(int vzdalenost){
        System.out.println("bezim " + vzdalenost + "m");
    }

    @Override
    public void vydejZvuk(){
        System.out.println("Haf haf");
    }
}
