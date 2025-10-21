import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // aufgabe 1
        System.out.println("Aufgabe 1");
        int[] a1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] b1 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(a1) + " + " + Arrays.toString(b1));
        System.out.println("Ergebnis: " + Arrays.toString(ZahlRechner.summe(a1, b1)));

        // aufgabe 2
        System.out.println("Aufgabe 2");
        int[] a2 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] b2 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(a2) + " - " + Arrays.toString(b2));
        System.out.println("Ergebnis: " + Arrays.toString(ZahlRechner.differenz(a2, b2)));

        // aufgabe 3
        System.out.println("Aufgabe 3");
        int[] a3 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int b3 = 2;
        System.out.println(Arrays.toString(a3) + " * " + b3);
        System.out.println("Ergebnis: " + Arrays.toString(ZahlRechner.multiplikation(a3, b3)));

        // aufgabe 4
        System.out.println("Aufgabe 4");
        int[] a4 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int b4 = 2;
        System.out.println(Arrays.toString(a4) + " / " + b4);
        System.out.println("Ergebnis: " + Arrays.toString(ZahlRechner.division(a4, b4)));
    }
}
