package task2;

import java.util.Scanner;

public class ucgenSiniflandirma {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("Üçgenin 1. kenarını tanımlayın : ");        int kenar1=oku.nextInt();
        System.out.print("Üçgenin 2. kenarını tanımlayın : ");        int kenar2=oku.nextInt();
        System.out.print("Üçgenin 3. kenarını tanımlayın : ");        int kenar3=oku.nextInt();

      int ikiUc=Math.abs(kenar2-kenar3);
      int birUc=Math.abs(kenar1-kenar3);
      int ikiBir=Math.abs(kenar2-kenar1);


        if (ikiUc<kenar1 && kenar1<(kenar3+kenar2)
            || (birUc<kenar2 && kenar2<(kenar3+kenar1) || (ikiBir<kenar3 && kenar3<(kenar1+kenar2)))){

            if (kenar1==kenar2 && kenar2==kenar3)
                System.out.println(" Eşkenar Üçgen ");

            if (kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3 )
                System.out.println("İkizkenar Üçgen");
            else
                System.out.println("Çeşitkenar Üçgen");
        }
        else
            System.out.println("Verilen kenar uzunlukları geçerli bir üçgen oluşturmaz");





    }
}
