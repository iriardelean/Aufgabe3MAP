public class ZahlRechner {
    public static int[] summe(int[] a, int[] b) {
        int n = a.length;
        int[] ergebnis = new int[n + 1];
        int uebertrag = 0;

        for (int i = n - 1; i >= 0; i--) {
            int summe = a[i] + b[i] + uebertrag;
            ergebnis[i + 1] = summe % 10;
            uebertrag = summe / 10;
        }

        ergebnis[0] = uebertrag;
        return ergebnis;
    }

    public static int[] differenz(int[] a, int[] b) {
        int n = a.length;
        int[] ergebnis = new int[n];
        int geliehen = 0;

        for (int i = n - 1; i >= 0; i--) {
            int zifferA = a[i] - geliehen;
            int zifferB = b[i];
            int differenz;

            if (zifferA < zifferB) {
                differenz = (zifferA + 10) - zifferB;
                geliehen = 1;
            } else {
                differenz = zifferA - zifferB;
                geliehen = 0;
            }
            ergebnis[i] = differenz;
        }
        return ergebnis;
    }
}
