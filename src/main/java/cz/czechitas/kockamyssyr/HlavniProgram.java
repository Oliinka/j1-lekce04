package cz.czechitas.kockamyssyr;

import dev.czechitas.java1.kockamyssyr.api.*;

import java.awt.*;
import java.util.Random;

/**
 * Hlaví třída pro hru Kočka–myš–sýr.
 */
public class HlavniProgram {
    private final Random random = new Random();

    private final int VELIKOST_PRVKU = 50;
    private final int SIRKA_OKNA = 1000 - VELIKOST_PRVKU;
    private final int VYSKA_OKNA = 600 - VELIKOST_PRVKU;

    private Cat tom;
    private Mouse jerry;

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String[] args) {
        new HlavniProgram().run();
    }

    /**
     * Hlavní metoda obsahující výkonný kód.
     */
    public void run() {
        tom = vytvorKocku();
        tom.setBrain(new KeyboardBrain(KeyCode.W, KeyCode.A, KeyCode.S, KeyCode.D));

        jerry = vytvorMys();
        jerry.setBrain(new KeyboardBrain());

        vytvorVeci(4);
        chytMys();
    }

    public void chytMys() {

        while (jerry.isAlive()) {

            int horizontalniPosun = jerry.getX() - tom.getX();
            System.out.println(horizontalniPosun);
            if (horizontalniPosun < 0) {
                tom.turnRight();
                tom.turnRight();
                horizontalniPosun = Math.abs(horizontalniPosun);
            }
            tom.moveForward(horizontalniPosun);

            if (tom.getOrientation() == PlayerOrientation.LEFT) {
                tom.turnRight();
            } else {
                tom.turnLeft();
            }

            int vertikalniPosun = tom.getY() - jerry.getY();
            System.out.println(vertikalniPosun);
            if (vertikalniPosun < 0) {
                tom.turnRight();
                tom.turnRight();
                vertikalniPosun = Math.abs(vertikalniPosun);
            }
            tom.moveForward(vertikalniPosun);
        }
    }
        // TODO: Sem vepište svůj program


    public void vytvorVeci(int pocetStromu) {
        for (int i = 0; i < pocetStromu; i++) {
            vytvorStrom();
        }
        vytvorSyr();
        vytvorJitrnici();
    }

    public Tree vytvorStrom() {
        return new Tree(vytvorNahodnyBod());
    }

    public Cat vytvorKocku() {
        return new Cat(vytvorNahodnyBod());
    }

    public Mouse vytvorMys() {
        return new Mouse(vytvorNahodnyBod());
    }

    public Cheese vytvorSyr() {
        return new Cheese(vytvorNahodnyBod());
    }

    public Meat vytvorJitrnici() {
        return new Meat(vytvorNahodnyBod());
    }

    private Point vytvorNahodnyBod() {
        return new Point(random.nextInt(SIRKA_OKNA), random.nextInt(VYSKA_OKNA));
    }

}
