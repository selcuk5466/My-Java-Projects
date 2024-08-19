package task03;


public class PascalTriangle_kod {
    public static void main(String[] args) {

        int satirSayi = 5;

        for (int i = 0; i < satirSayi; i++) {
            int sayi = 1;


            for (int j = 0; j <= i; j++) {
                System.out.print(sayi);
                sayi = sayi * (i - j) / (j + 1);


            }
            System.out.println();

        }
    }
}
