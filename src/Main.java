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
    }
}
