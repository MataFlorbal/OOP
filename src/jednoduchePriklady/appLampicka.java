package jednoduchePriklady;

public class appLampicka {
    public static void main(String[] args) {
        lampicka lam = new lampicka();
        lam.rozsvicena = true;

        lam.zjistiStav();
        lam.rozsvit();
        lam.zhasni();
        lam.zjistiStav();

    }
}
