package jednoduchePriklady;

public class appPenezenka {
    public static void main(String[] args) {
        penezenka pen = new penezenka();
        pen.zustatek = 0;

        pen.zjistiZustatek();
        pen.vlozCastku(200);
        pen.vyberCastku(250);
        pen.zjistiZustatek();
        pen.vyberCastku(100);
        pen.zjistiZustatek();
        pen.vlozCastku(3500);
        pen.zjistiZustatek();
        pen.vyberCastku(100);
        pen.zjistiZustatek();
    }
}
