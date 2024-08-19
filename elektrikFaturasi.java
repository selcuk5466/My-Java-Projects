package task3;

import java.util.Scanner;

public class elektrikFaturasi {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Eski Okumayı giriniz = ");
        int eskiOkuma=oku.nextInt();

        System.out.print("Yeni Okumayı giriniz = ");
        int yeniOkuma=oku.nextInt();

        int elektrikTuketimi=yeniOkuma-eskiOkuma;
        float birimFiyat=1.1F;

        if (elektrikTuketimi>0 && elektrikTuketimi<=100)
             birimFiyat=1.1F;
         else
        if (elektrikTuketimi>100 && elektrikTuketimi<=200)
            birimFiyat=1.3F;
        else
        if (elektrikTuketimi>200 && elektrikTuketimi<=300)
            birimFiyat=1.5F;
        else
        if (elektrikTuketimi>300 && elektrikTuketimi<=400)
            birimFiyat=1.7F;
        else
        if (elektrikTuketimi>400 && elektrikTuketimi<=500)
            birimFiyat=1.9F;
        else
        if (elektrikTuketimi>500)
            birimFiyat=2.3F;

        float aylikFatura=(elektrikTuketimi*birimFiyat);

        System.out.println("aylikFatura = " + aylikFatura);


    }
}
