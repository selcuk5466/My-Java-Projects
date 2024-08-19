package task4;

import java.util.Scanner;

public class suyunHalleri {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("Su sıcaklığını giriniz= ");
        int suSicakligi=oku.nextInt();

        if (suSicakligi<0)
            System.out.println("Su katı haldedir");
        else if (suSicakligi>=0 && suSicakligi<100 )
            System.out.println("Su sıvı haldedir");
        else
            System.out.println("Su gaz halindedir");


    }
}
