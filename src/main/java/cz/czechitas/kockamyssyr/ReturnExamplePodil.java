package cz.czechitas.kockamyssyr;

public class ReturnExamplePodil {

    public static void main(String[] args) {
        ReturnExamplePodil instance = new ReturnExamplePodil();
        instance.vypisPodilCisel(15, 5);
        instance.vypisPodilCisel(15, 0);

        System.out.println(instance.vydelCisla(12,3));
        System.out.println(instance.vydelCisla(12,0));
    }


    public int vydelCisla(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public void vypisPodilCisel(int a, int b) {
        if (b == 0) {
            System.out.println("Nulou nelze delit!");
            return;/*tohle return vrati kod na zacatek metody
            casto se to pouziva jmenuje se to early return
            muzu vrcet vsechny typy string, int*/
        }
        System.out.println(a / b);
    }
}
