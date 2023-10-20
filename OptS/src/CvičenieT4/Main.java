package CvičenieT4;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        VypocetHUF huv = new VypocetHUF();
        int [][] cji = {
                {500, 100, 300, 400, 100},
                {300, 200, 300, 400, 200},
                {200, 200, 300, 100, 300},
        };

        int[] fi = new int[]{200, 300, 300};
        int[] bi = new int[]{1, 1, 1, 1, 1};

        int f = Integer.MAX_VALUE; // hodnota účelovej funkcie

        LinkedList<Integer> nespracovanyKandidati = new LinkedList<Integer>();
        nespracovanyKandidati.add(0);
        nespracovanyKandidati.add(1);
        nespracovanyKandidati.add(2);

        LinkedList<Integer> spracovanyKandidati = new LinkedList<Integer>();

        LinkedList<Integer> zaradenyKandidati = new LinkedList<Integer>();


        // vyberám prvého kandidáta
        zaradenyKandidati.add(nespracovanyKandidati.removeFirst());
        f = huv.objUFLP_2(3, 5, zaradenyKandidati.size(), zaradenyKandidati.toArray(new Integer[zaradenyKandidati.size()]), fi, bi, cji);
        System.out.printf("Aktualne riesenie huf: %d\n ", f);

        // spúsťam heristiku
        while (!nespracovanyKandidati.isEmpty()) {
            int kandidat = nespracovanyKandidati.removeFirst();
            zaradenyKandidati.add(kandidat);
            int f2 = huv.objUFLP_2(3, 5, zaradenyKandidati.size(), zaradenyKandidati.toArray(new Integer[zaradenyKandidati.size()]), fi, bi, cji);
            if (f2 < f) {
                f = f2;
                System.out.printf("Aktualne riesenie huf: %d\n ", f);
                nespracovanyKandidati.addAll(spracovanyKandidati);
                spracovanyKandidati.clear();
            } else {
                zaradenyKandidati.removeLast();
                spracovanyKandidati.add(kandidat);
            }
        }

        System.out.println();
        System.out.printf("Hodnota ucelovej funkcie je: %d\n", f);
        System.out.println("Vybraty kandidati: " + zaradenyKandidati);

    }
}
