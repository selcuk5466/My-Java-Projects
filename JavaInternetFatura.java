package task03;

import java.util.Scanner;

public class JavaInternetFatura {
    public static void main(String[] args) {
        float aylikFatura;
        float ekstraUcret = 0;
        float aylikSabitUcret;
        float ekUcretBirimFiyatı;
        int kategori;
        int fazlaKullanımMiktarıGB;
        double kategori1=0.1;
        double kategori2=0.2;
        double kategori3=0.3;

        Scanner oku=new Scanner(System.in);
        System.out.print("Aylık Sabit ücreti girin: ");  aylikSabitUcret= oku.nextFloat();
        System.out.print("Kategori girin(1-3): ");  kategori= oku.nextInt();
        System.out.print("Fazla kullanılan GB miktarı girin: ");  fazlaKullanımMiktarıGB=oku.nextInt();
        if (kategori==1)
            ekstraUcret= (float) ((float) (1000*fazlaKullanımMiktarıGB)*kategori1);
        else if (kategori==2)
            ekstraUcret= (float) ((float) (1000*fazlaKullanımMiktarıGB)*kategori2);
        else if (kategori==3)
            ekstraUcret= (float) ((float) (1000*fazlaKullanımMiktarıGB)*kategori3);

        aylikFatura=faturaHesaplama(aylikSabitUcret,ekstraUcret);

        System.out.println("Aylık Toplam Faturanız = " + aylikFatura);


    }


    public static float faturaHesaplama(float aylıkSabitÜcret, float ekstraUcret){

     float toplamFatura = 0;
         toplamFatura= (float) (aylıkSabitÜcret+ ekstraUcret);

    return toplamFatura;}
}
