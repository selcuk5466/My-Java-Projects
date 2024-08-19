package task1;

import java.util.Scanner;

public class _1_SifreBelirleme {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("Bir kullanıcı adı belirleyin: ");  String kullaniciAdi=oku.nextLine();


        System.out.print("Bir şifre giriniz: ");      String sifre=oku.nextLine();
        System.out.print("Şifreyi onaylamak için tekrar giriniz: "); String onaySifre=oku.nextLine();
        sifre=sifre.toLowerCase();
        onaySifre=onaySifre.toLowerCase();
        if (onaySifre.equalsIgnoreCase(sifre))
            System.out.println("Başarıyla şifre oluşturuldu");
        else
            System.out.println("Şifreler birbiriyle uyuşmuyor, tekrar deneyiniz.");

        while (!(sifre.equalsIgnoreCase(onaySifre))) {
            System.out.print("Şifre giriniz: ");      sifre= oku.nextLine();
            System.out.print("Şifreyi onaylayın: ");  onaySifre=oku.nextLine();
            if (onaySifre.equalsIgnoreCase(sifre)){
                System.out.println("Başarıyla şifre oluşturuldu");  }
            else{
                System.out.println("Şifreler birbiriyle uyuşmuyor, tekrar deneyiniz."); }


        }




        System.out.println("Kullanıcı adı: ");  String girisAdi=oku.nextLine();
        System.out.println("Şifreniz: ");   String girisSifre=oku.nextLine();

            if (kullaniciAdi.equals(girisAdi) && girisSifre.equals(sifre))
                System.out.println("Başarılı bir şekilde giriş yaptınız," + kullaniciAdi + " kullanıcısı olarak sisteme hoş geldiniz!");
            else {
                int hak=3;

                while (!((kullaniciAdi.equals(girisAdi)) && girisSifre.equals(sifre))&& hak>0) {
                    System.out.println("Hatalı giriş");
                    System.out.println("Son " + hak + " Hak kaldı");          hak--;
                System.out.print("Kullanıcı adı: ");  girisAdi=oku.nextLine();
                System.out.print("Şifre : ");         girisSifre=oku.nextLine();

                    if (kullaniciAdi.equals(girisAdi) && girisSifre.equals(sifre)){
                        System.out.println("Başarılı bir şekilde giriş yaptınız," + kullaniciAdi + " kullanıcısı olarak sisteme hoş geldiniz!"); break; }

                 else if (!(kullaniciAdi.equals(girisAdi)) && girisSifre.equals(sifre))
                        System.out.println("Kullanıcı adı hatalı giriş yaptınız");

                     else if (kullaniciAdi.equals(girisAdi) && !(girisSifre.equals(sifre))) {
                     System.out.println("Şifrenizi yanlış girdiniz ");

                 }


                }
                if (hak == 0)
                    System.out.println("Üzgünüm, 3 kez üst üste yanlış giriş yaptınız. ");
           //     else
             //       System.out.println("Son " + i + " Hak kaldı");
            }
        }
    }






