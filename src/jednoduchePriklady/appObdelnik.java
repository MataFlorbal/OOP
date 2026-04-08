package jednoduchePriklady;

public class appObdelnik {
    public static void main(String[] args) {
        obdelnik obl = new obdelnik();
        obl.a = 5;
        obl.b = 4;

        int obvod = obl.obvod();
        int obsah = obl.obsah();
        System.out.println(obsah);
        System.out.println(obvod);
    }
}
