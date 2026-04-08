package jednoduchePriklady;

public class appClovek {
    public static void main(String[] args) {
        clovek pavel = new clovek();
        pavel.jmeno = "Pavel";
        pavel.prijmeni = "Flinta";

        String celeJmeno = pavel.vratCeleJmeno();
        System.out.println(celeJmeno);
    }
}
