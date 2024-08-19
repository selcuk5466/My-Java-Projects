package task02;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class JavaGucluParola {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen şifre giriniz: ");
        String sifre = oku.nextLine();
        boolean GucluSifre = false;

        if (sifre.length() >= 8){
            if (BüyükVarmi(sifre)==true && KücükVarMi(sifre)==true)
            if (RakamVarmi(sifre)==true && ÖzelKarakterVarMi(sifre)==true)
                GucluSifre=true;
                System.out.println("Güclü Sifre mi?: " + GucluSifre);
        } else
            System.out.println("Parolanız uzunluk şartını karşılamıyor. en az 8 karakter uzunluğunda olması gerekir. ");
    }

    //----------------------------------------------------------------------------------------------------

    public static boolean BüyükVarmi(String sifre) {
        boolean BüyükVarMi = false;
        char[] dizi = sifre.toCharArray();
        for (int i = 0; i < sifre.length(); i++) {
            char harf = dizi[i];
            if (Character.isUpperCase(harf)) {
                BüyükVarMi = true;
                break;
            }
        }
        return BüyükVarMi;
    }
//---------------------------------------------------------------------------------------------------------
    public static boolean KücükVarMi(String sifre) {
        boolean KücükVarMi = false;
        char[] dizi = sifre.toCharArray();
        for (int i = 0; i < sifre.length(); i++) {
            char harf = dizi[i];
            if (Character.isLowerCase(harf)) {
                KücükVarMi = true;
                break;
            }
        }
        return KücükVarMi;
    }
//-------------------------------------------------------------------------------------------------------
    public static boolean RakamVarmi(String sifre) {
        boolean RakamVarMi = false;
        char[] dizi = sifre.toCharArray();
        for (int i = 0; i < sifre.length(); i++) {
            char harf = dizi[i];
            if (Character.isDigit(harf)) {
                RakamVarMi = true;
                break;
            }
        }
        return RakamVarMi;
    }
//------------------------------------------------------------------------------------------------------
    public static boolean ÖzelKarakterVarMi(String sifre) {

        String özelKarakter = "! @ # $ % ^ & * ( ) _ + - = { } [ ] ; : ' , < . > / ?";

        boolean ÖzelKarakterVarMi = false;
        char[] dizi = sifre.toCharArray();
        for (int i = 0; i < sifre.length(); i++) {
            char harf = dizi[i];
            for (int j = 0; j < özelKarakter.length(); j++) {
                if (dizi[i] == özelKarakter.indexOf(j))
                    ÖzelKarakterVarMi = true;
                break;
            }

           if (ÖzelKarakterVarMi=true)
               break;
        }

        return ÖzelKarakterVarMi; }
}










