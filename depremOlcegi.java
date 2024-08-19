package task1;

import java.util.Scanner;

public class depremOlcegi {
    public static void main(String[] args) {
        Scanner oku = new Scanner (System.in); // Scanner tanımlandı.
        System.out.print("Deprem Büyüklüğünü Giriniz: ");
        double magnitude = oku.nextDouble(); // ekrandan girilecek verinin okunmasını sağladık.
        if (magnitude<2.0)
            System.out.println("Micro - Mikro");
          else
            if (magnitude>2.0 && magnitude <= 3.0)  System.out.println("Very minor - Çok küçük");
          else
            if (magnitude > 3.0 && magnitude <= 4.0 )  System.out.println("Minor - Küçük");
          else
            if (magnitude > 4.0 && magnitude <= 5.0 )  System.out.println("Light - Hafif");
          else
            if (magnitude >5.0 && magnitude <= 6.0)  System.out.println("Moderate - Orta");
          else
            if (magnitude >6.0 && magnitude<=7.0)  System.out.println("Strong - Ağır");
          else
            if (magnitude>7.0 && magnitude <= 8.0)  System.out.println("Major - Büyük");
          else
            if (magnitude>8 && magnitude<=10 ) System.out.println("Great - Çok Büyük");
          else
            if (magnitude>10) System.out.println("Meteoric- Meteorik");


    }
}
