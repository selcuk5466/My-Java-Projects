package task4;

import javax.swing.*;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _4_Mevsimler {
    public static void main(String[] args) {
        //   Scanner oku=new Scanner(System.in);
        //  Scanner input=new Scanner(System.in);

        // System.out.print("Gün giriniz: ");    int gun=oku.nextInt();
        //  System.out.print("Ay giriniz: ");    String ay=input.nextLine();  ay=ay.toLowerCase();

        mevsim();


    }

    public static void mevsim() {
        Scanner oku = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int aydegeri = 0;
        int gun = 0;
        String ay;
        String mevsim ="";


        while (!(gun > 0 && gun <= 31)) {
            System.out.print("Gün giriniz: ");
            gun = oku.nextInt();
            System.out.print("Ay giriniz: ");
            ay = input.nextLine();
            ay = ay.toLowerCase();




            if ((gun > 0 && gun <= 31)) {


                while (!(aydegeri <= 12 && aydegeri>0)) {
                    if (ay.equalsIgnoreCase("Ocak".toLowerCase()))
                        aydegeri = 1;
                    else if (ay.equalsIgnoreCase("Şubat".toLowerCase()))
                        aydegeri = 2;
                    else if (ay.equalsIgnoreCase("Mart".toLowerCase()))
                        aydegeri = 3;
                    else if (ay.equalsIgnoreCase("Nisan".toLowerCase()))
                        aydegeri = 4;
                    else if (ay.equalsIgnoreCase("Mayıs".toLowerCase()))
                        aydegeri = 5;
                    else if (ay.equalsIgnoreCase("Haziran".toLowerCase()))
                        aydegeri = 6;
                    else if (ay.equalsIgnoreCase("Temmuz".toLowerCase()))
                        aydegeri = 7;
                    else if (ay.equalsIgnoreCase("Ağustos".toLowerCase()))
                        aydegeri = 8;
                    else if (ay.equalsIgnoreCase("Eylül".toLowerCase()))
                        aydegeri = 9;
                    else if (ay.equalsIgnoreCase("Ekim".toLowerCase()))
                        aydegeri = 10;
                    else if (ay.equalsIgnoreCase("Kasım".toLowerCase()))
                        aydegeri = 11;
                    else if (ay.equalsIgnoreCase("Aralık".toLowerCase()))
                        aydegeri = 12;

                }

            }else
                System.out.println("Girilen değer geçersiz");



                        if (((gun > 20 && gun <= 31) && aydegeri == 3) || (aydegeri == 4) || (aydegeri == 5) || ((gun <= 21 && gun > 0) && aydegeri == 6)) {
                            mevsim = "İlkbahar";
                        } else if (((gun > 21 && gun <= 31) && aydegeri == 6) || (aydegeri == 7) || (aydegeri == 8) || ((gun <= 21 && gun > 0) && aydegeri == 9)) {
                            mevsim = "Yaz";
                        } else if (((gun > 21 && gun <= 31) && aydegeri == 9) || (aydegeri == 10) || (aydegeri == 11) || ((gun < 21 && gun > 0) && aydegeri == 12)) {
                            mevsim = "Sonbahar";
                        } else if (((gun > 20 && gun <= 31) && aydegeri == 12) || (aydegeri == 1) || (aydegeri == 2) || ((gun <= 20 && gun > 0) && aydegeri == 3)) {
                            mevsim = "Kış";
                        }



         }

        System.out.println(mevsim);

        }
    }





