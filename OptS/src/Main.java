import CvičenieT2.Uloha7;

public class Main {
    public static void main(String[] args) {
        Uloha7 uloha7 = new Uloha7();
        int [][] dji = {
                {500, 100, 300, 400, 100},
                {300, 200, 300, 400, 200},
                {200, 200, 300, 100, 300},
        };
        int y[] = {1, 0, 1};
        int zy[] = {0, 2};
        System.out.println("Uloha 1 Hodnota účelovej funkcie je: " + uloha7.objUFLP_1(5, 3, y, new int[]{200, 300, 300}, new int[]{1, 1, 1, 1, 1}, dji));
        System.out.println("Uloha 2 Hodnota účelovej funkcie je: " + uloha7.objUFLP_2(3, 5, 2, zy, new int[]{200, 300, 300}, new int[]{1, 1, 1, 1, 1}, dji));
    }
}