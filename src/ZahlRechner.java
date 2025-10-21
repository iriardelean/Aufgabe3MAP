public class ZahlRechner {

    // Berechnen Sie die Summe. Die Zahlen haben die gleiche Anzahl an Ziffern.
    // z.B. [1 3 0 0 0 0 0 0 0] + [8 7 0 0 0 0 0 0 0] = [1 0 0 0 0 0 0 0 0 0]
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

    // Berechnen Sie die Differenz. Die Zahlen haben die gleiche Anzahl an Ziffern.
    // z.B. [8 3 0 0 0 0 0 0 0] - [5 4 0 0 0 0 0 0 0] = [2 9 0 0 0 0 0 0 0]
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

    // Berechnen Sie die Multiplikation. Die erste Zahl ist eine große Zahl, die zweite Zahl ist nur eine Ziffer.
    // z.B. [2 3 6 0 0 0 0 0 0] * 2 = [4 7 2 0 0 0 0 0 0]
    public static int[] multiplikation(int[] a, int b) {
        int n = a.length;
        int[] ergebnis = new int[n+1];
        int uebertrag = 0;

        for (int i = n - 1; i >= 0; i--) {
            int produkt = (a[i] * b) + uebertrag;
            ergebnis[i + 1] = produkt % 10;
            uebertrag = produkt / 10;
        }

        ergebnis[0] = uebertrag;

        return trimmeFuehrendeNullen(ergebnis);
    }

    // hilfsfunktion
    private static int[] trimmeFuehrendeNullen(int[] arr) {
        int ersteNichtNull = 0;

        while (ersteNichtNull < arr.length - 1 && arr[ersteNichtNull] == 0)
            ersteNichtNull++;

        if (ersteNichtNull == 0)
            return arr;

        int[] getrimmt = new int[arr.length - ersteNichtNull];

        for (int i = 0; i < getrimmt.length; i++)
            getrimmt[i] = arr[ersteNichtNull + i];

        return getrimmt;
    }

    // Berechnen Sie die ganzzahlige Division. Die erste Zahl ist eine große Zahl, die zweite Zahl ist nur eine Ziffer.
    // z.B. [2 3 6 0 0 0 0 0 0] / 2 = [1 1 8 0 0 0 0 0 0]
    public static int[] division(int[] a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division durch Null ist nicht erlaubt.");
        }

        int n = a.length;
        int[] quotient = new int[n];
        int rest = 0;

        for (int i = 0; i < n; i++) {
            int dividend = rest * 10 + a[i];

            quotient[i] = dividend / b;
            rest = dividend % b;
        }

        return trimmeFuehrendeNullen(quotient);
    }
}
