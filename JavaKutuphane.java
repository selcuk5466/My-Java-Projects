package task01;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class JavaKutuphane {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        TreeMap<String,String> KitapVeYazari=new TreeMap<>();
        boolean cikis=false;

        while (!cikis){
            System.out.print(" 1-Kitapları Listele \n 2-Kitap Ekleme \n 3-Kitap Silme \n 4-Çıkış \n " +
                    "Lütfen yapmak istediğiniz işlemi seçiniz : ");
            String secim=oku.nextLine().trim();
            System.out.println("\n");

            switch (secim){

                case "1":
                    if (KitapVeYazari.isEmpty()==false) {
                        System.out.println("<---KİTAP---" + "> <" +"-----YAZARI----->");
                        for (Map.Entry<String, String> kitap : KitapVeYazari.entrySet())
                            System.out.println(kitap.getKey() + "-" + kitap.getValue());
                    }
                    else
                        System.out.println("!!!--- KÜTÜPHAMEMİZDE HİÇ KİTAP YOK ---!!!");
                    System.out.println("\n");
                    break;

                case "2":
                    System.out.print("Lütfen eklemek istediğiniz kitap ismini giriniz: "); String kitapOku= oku.nextLine().trim();
                    System.out.print("Lütfen girdiğiniz kitap yazarını giriniz: "); String yazarOku= oku.nextLine().trim();
                    KitapVeYazari.put(kitapOku,yazarOku);
                    System.out.println("*** Kitap ve yazarı eklendi. ***");
                    System.out.println("\n");
                    break;
                case "3":
                    System.out.print("Silmek istediğiniz kitap ismini girin : "); String silOku=oku.nextLine().trim();
                    if (KitapVeYazari.containsKey(silOku)){
                        KitapVeYazari.remove(silOku);
                    System.out.println("*** Kitap başarıyla silindi. ***");
                     }
                    else
                        System.out.println("*** Bu kitap kütüphanemizde bulunmuyor! ***");
                    System.out.println("\n");
                    break;

                case "4":
                    System.out.println("...Programdan çıkış yapılıyor... \n----LÜTFEN BEKLEYİNİZ----");
                    cikis=true;
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("--- Geçersiz bir değer girdiniz.Tekrar giriş yapmak üzere yönlendiriliyorsunuz.---\n");
            }

        }
        System.out.println("-------  PROGRAM SONLANDIRILDI  ------- \n*** TEKRAR GÖRÜŞMEK DİLEĞİYLE HOŞÇAKALIN ***");
    }
}
//1. Anna Karenina – Leo Tolstoy
//2. Madame Bovary – Gustave Flaubert
//3. Savaş ve Barış – Leo Tolstoy
//4. Huckleberry Finn’in Maceraları – Mark Twain
//5. Anton Çehov’dan Hikayeler – Anton Çehov
//6. Middlemarch – George Eliot
//7. Moby-Dick – Herman Melville
//8. Büyük Umutlar – Charles Dickens
//9. Suç ve Ceza – Fyodor Dostoyevsky
//10. Emma – Jane Austen