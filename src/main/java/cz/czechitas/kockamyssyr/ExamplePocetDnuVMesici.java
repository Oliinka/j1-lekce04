package cz.czechitas.kockamyssyr;

public class ExamplePocetDnuVMesici {
    public static void main(String[] args) {
        new ExamplePocetDnuVMesici().vypisPocetDnuVMesici(2);
    }

    public int pocetDnuVMesici(int mesic) {
        if (mesic == 2) {
            return 28;
        }
        if (mesic == 4 || mesic == 6 || mesic == 9 || mesic == 11) {
            return 30;
        }
        return 31;
    }

    public void vypisPocetDnuVMesici(int mesic) {
        System.out.println(pocetDnuVMesici(mesic));
    }


}
