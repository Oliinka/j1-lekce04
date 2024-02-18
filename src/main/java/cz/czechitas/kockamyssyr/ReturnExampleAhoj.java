package cz.czechitas.kockamyssyr;

public class ReturnExampleAhoj {

    public String dejPozdrav() {
        return "Ahoj";
    }

    public static void pozdravJmenem(String jmeno) {
        System.out.println("Ahoj " + jmeno);
    }

    public static void main(String[] args) {
        // Example of using the instance method
        ReturnExampleAhoj instance = new ReturnExampleAhoj();
        System.out.println(instance.dejPozdrav());

        // Example of using the static method
        pozdravJmenem("Olga");
    }
}
