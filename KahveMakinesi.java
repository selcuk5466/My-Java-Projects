package task3;

import java.util.Scanner;

public class KahveMakinesi {
    public static void main(String[] args) {

        String kahvesonuc=kahvetercih();
        sütsecim();
        sekersecim();
        String boyutsonuc=boyutsecim();
        System.out.println(".............................." + " Kahveniz Hazırlanıyor. Lütfen Bekleyiniz" + "..............................");
        System.out.println("...\n...\n...");
        System.out.println(kahvesonuc+" " + boyutsonuc + " boy hazır. Afiyet Olsun!");

        }
    public static String kahvetercih() {
        Scanner oku = new Scanner(System.in);
        String[] hangiKahve = {"Türk kahvesi", "Espresso", "Filtre Kahve"};

        boolean kahvetercih = true;
        String kahvesonuc = "";
        while (kahvetercih == true) {

            System.out.print("Hangi kahveyi istersiniz ?" +
                    " \n 1- Türk Kahvesi \n 2- Espresso\n 3-Filtre Kahve : ");
            String cevap = (oku.nextLine().toLowerCase());

            if (cevap.equalsIgnoreCase(hangiKahve[0])) {
                System.out.println(hangiKahve[0] + " Hazırlanıyor");
                kahvetercih = false;
                kahvesonuc=hangiKahve[0];
            } else if (cevap.equalsIgnoreCase(hangiKahve[1])) {
                System.out.println(hangiKahve[1] + " Hazırlanıyor");
                kahvetercih = false;
                kahvesonuc=hangiKahve[1];

            } else if (cevap.equalsIgnoreCase((hangiKahve[2]).toLowerCase())) {
                System.out.println(hangiKahve[2] + " Hazırlanıyor");
                kahvetercih = false;
                kahvesonuc=hangiKahve[2];

            } else
                System.out.println("Yanlış giriş yaptınız tekrar deneyiniz");
        }

        return kahvesonuc;
    }
    public static String sütsecim() {
        Scanner oku = new Scanner(System.in);

        boolean sütekleme = true;
        String[] sütdizi = {"Evet", "Yes", "Hayır", "No"};
        String süt;


        while (sütekleme == true) {

            System.out.print("Süt eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayınız): ");
            String sütCevap = oku.nextLine();
            if (sütCevap.equalsIgnoreCase(sütdizi[0]) ||
                    sütCevap.equalsIgnoreCase(sütdizi[1])) {
                süt="süt";
                System.out.println("Süt ekleniyor");
                sütekleme = false;
            } else if (sütCevap.equalsIgnoreCase(sütdizi[2]) ||
                    sütCevap.equalsIgnoreCase(sütdizi[3])) {
                süt="sütsüz";
                System.out.println("Süt eklenmiyor");
                sütekleme = false;
            } else
                System.out.println("Hatalı giriş yaptınız tekrar giriniz : ");
        }
        return null;
    }
    public static void sekersecim() {
        Scanner oku = new Scanner(System.in);
        Scanner sayi = new Scanner(System.in);

        String h = "Hayır";
        boolean seker = true;
        while (seker == true) {

            System.out.print("Şeker ister misiniz? (Evet veya Hayır olarak cevaplayınız) : ");
            String cevap = oku.nextLine();
            if (cevap.equalsIgnoreCase("Evet")) {
                    System.out.println("Kaç şeker istersiniz (1-10 aralığında şeker adedi belirtin): ");
                    int sekercevap = sayi.nextInt();
                  if (sekercevap > 0 && sekercevap < 10 ) {
                    System.out.println(sekercevap + " Adet şeker ekleniyor");
                    seker = false;
                } else
                    System.out.println("Hatalı seçim yaptınız tekrar giriniz.");

            } if (cevap.equalsIgnoreCase("Hayır")) {
                System.out.println("Şeker eklenmiyor");
                seker = false;
            } else
                System.out.println("Hatalı bir giriş yaptınız tekrar deneyin");

        }
    }
    public static String boyutsecim(){
        Scanner oku=new Scanner(System.in);
        String[] boyutlar={"Küçük","Orta","Büyük"};

        boolean boy=false;
        String boyutsonuc= "";
        while (boy==false) {
            System.out.print("Hangi boyutta istersiniz? (Büyük - Orta - Küçük olarak giriniz.) : ");
            String boyut = oku.nextLine();

            if ((boyut.toLowerCase()).equalsIgnoreCase(boyutlar[0].toLowerCase())) {
                System.out.println("Kahveniz " + boyutlar[0] + " boyutta hazırlanıyor.");
                boy = true;
                boyutsonuc=boyutlar[0];
            } else if ((boyut.toLowerCase()).equalsIgnoreCase(boyutlar[1].toLowerCase())) {
                System.out.println("Kahveniz " + boyutlar[1] + " boyutta hazırlanıyor.");
                boy = true;
                boyutsonuc=boyutlar[1];

            } else if ((boyut.toLowerCase()).equalsIgnoreCase(boyutlar[2].toLowerCase())) {
                System.out.println("Kahveniz " + boyutlar[2] + " boyutta hazırlanıyor.");
                boy = true;
                boyutsonuc=boyutlar[2];

            } else
                System.out.println("Hatalı giriş yaptınız tekrar deneyin");

        }
        return boyutsonuc;
    }

    }

