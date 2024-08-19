package task04;
import java.util.Scanner;
public class MarketJava {
    public static void main(String[] args) {
        // Ürün isimleri, fiyatları ve stok durumları ayrı ayrı diziler şeklinde oluşturuldu.
        String[] urunler = new String[4];   // Ürünler dizisi
        urunler[0]= "Elma";
        urunler[1]= "Muz";
        urunler[2]= "Portakal";
        urunler[3]= "Erik";

        double[] fiyatlar = new double[4];      //fiyatlar dizisi
        fiyatlar[0]= 15.0;
        fiyatlar[1]= 10.0;
        fiyatlar[2]= 25.0;
        fiyatlar[3]= 10.0;

        int[] stok = new int[4];            // stok dizisi
        stok[0]= 10;
        stok[1]= 5;
        stok[2]= 20;
        stok[3]= 15;

        Scanner okuSayi = new Scanner(System.in);       // 2 farklı okuma şekli için 2 farklı Scanner tanımlandı
        Scanner okuStr = new Scanner(System.in);        //biri sayı diğeri ise String okuayacak.

        boolean devamMi = true;                           // devamMi diye bir booleandeğişekn tanımalndı
                                                            // ve ilkdeğeri true olarak atandı
        double toplamFiyat = 0.0;
        while (devamMi) {

            boolean stokYetersiz = false;
            String eksikUrun = "";
            int eksikAdet = 0;

            // Ürünleri listeleyelim
            System.out.println("Ürün Listesi:");
            for (int i = 0; i < urunler.length; i++) {
                System.out.println((i + 1) + ". " + urunler[i] + " - " + fiyatlar[i] + " TL - Stok: " + stok[i]);
            }

            // Kullanıcıdan alışveriş yapmak istediği ürünleri ve miktarlarını alalım
            for (int i = 0; i < urunler.length; i++) {
                System.out.print(urunler[i] + " için kaç adet almak istersiniz? : ");
                int miktar = okuSayi.nextInt();

                // Stoğun yeterli olup olmadığını kontrol edelim
                if (miktar > stok[i]) {
                    stokYetersiz = true;
                    eksikUrun = urunler[i];
                    eksikAdet = miktar - stok[i];
                    break;
                } else if(miktar>0) {
                    stok[i] -= miktar;
                    toplamFiyat += miktar * fiyatlar[i];
                }
            }

            if (stokYetersiz) {
                System.out.println("Stok yetersiz! " + eksikUrun + " için " + eksikAdet + " adet eksik.");
            } else {
                System.out.println("Toplam fiyat: " + toplamFiyat + " TL");
                System.out.println("Ödemeniz gereken toplam tutar: " + toplamFiyat + " TL");
            }

            // Müşteriye tekrar alışveriş yapmak isteyip istemediğini sor

            System.out.print("Tekrar alışveriş yapmak ister misiniz? (evet/hayir): ");
            String cevap = okuStr.nextLine();
            if (cevap.equalsIgnoreCase("Evet"))
                devamMi = true;
            else if (cevap.equalsIgnoreCase("hayir"))
            {
                devamMi = false;
                System.out.println("Sipariş özeti:");
                for (int i = 0; i < urunler.length; i++) {
                    System.out.println(urunler[i] + " - Kalan Stok: " + stok[i]);
                }
            }
        }

    }
}
