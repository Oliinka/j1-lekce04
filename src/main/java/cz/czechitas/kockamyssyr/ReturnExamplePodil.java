package cz.czechitas.kockamyssyr;

public class ReturnExamplePodil {

    public static void main(String[] args) {
        new ReturnExamplePodil().vypisPodilCisel(15, 0);
    }

    public int vydelCisla(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public void vypisPodilCisel(int a, int b) {
        if (b == 0){
            System.out.println("Nulou nelze delit!");
            return;/*tohle return vrati kod na zacatek metody
            casto se to pouziva jmenuje se to early return
            muzu vrcet vsechny typy string, int*/
        }
        System.out.println(a / b);
    }
}
