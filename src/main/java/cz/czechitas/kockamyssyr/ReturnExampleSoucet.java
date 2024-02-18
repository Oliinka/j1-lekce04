package cz.czechitas.kockamyssyr;

public class ReturnExampleSoucet {
    /* vypise zobrazeni*/
    public static void main(String[] args) {
        new ReturnExampleSoucet().vypisSoucetCisel(3, 5);



    }

    public int sectiCisla(int a, int b) {
        return a + b;
    }

    /* v Jave muzu mit metody co se jmenuji stejne,
    ale maji ruzne typy(int string...)nebo aleposn ruzny pocet parametru*/
    public int sectiCisla(int a, int b, int c) {
        int soucet = a + b + c;
        return soucet;
        /* soucet je podtrzeny protoze idea rika,
        ze je ta funkce vlastn zbytecna z lze to napsat jen jako:
        return a + b nemusim kvuli tomu zakladat novou promennou*/
    }

    public void vypisSoucetCisel(int a, int b) {
        /*kdyz uz mam definovany soucet tak cisla vypisu
         pomoci metody */
        //int soucet = a+b;
        int soucet = sectiCisla(a, b);
        System.out.println(soucet);

        //nebo je mozne metodu vlozit do volani jine metody
        System.out.println(sectiCisla(8, 15));
        /*kdy mam void muzu nakonec napsat return, hodnota je tam vlozena
         * automaticky, ALE nekdy muzu chtit any se tam v nejakem reteci
         * hodnota vratila driv nez na konci, proto je tam ta moznost*/
        return;
    }

}
