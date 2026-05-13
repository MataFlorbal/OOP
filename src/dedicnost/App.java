package dedicnost;

public class App {
    public static void main(String[] args) {
        Zvire z = new Zvire("Zvíře");
        z.vydejZvuk();

        Pes bohm = new Pes("Böhm");
        bohm.bez(200);
        bohm.vydejZvuk();

        Papousek kiko = new Papousek("Kiko");
        kiko.let(10);
        kiko.vydejZvuk();
    }
}
