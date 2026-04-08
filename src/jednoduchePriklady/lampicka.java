package jednoduchePriklady;

public class lampicka {
    boolean rozsvicena;

    public void zjistiStav(){
        if (rozsvicena){
            System.out.println("lampicka je rozsvicena");
        }
        else {
            System.out.println("lampicka je zhasnuta");
        }
    }
    public void rozsvit(){
        if (rozsvicena){
            System.out.println("lampicka uz je rozsvicena");
        }
        else {
            System.out.println("rozsvitil jsem");
            rozsvicena = true;
        }
    }
    public void zhasni(){
        if (!rozsvicena){
            System.out.println("lampicka uz je zhasnuta");
        }
        else {
            System.out.println("zhasnul jsem");
            rozsvicena = false;
        }
    }
}
