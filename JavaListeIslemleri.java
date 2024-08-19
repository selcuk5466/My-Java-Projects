package task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaListeIslemleri {
    private static List<String> dizi = new ArrayList<>();
    private static Scanner oku = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- MENÜ ---");
            System.out.println("1. Eleman Ekle");
            System.out.println("2. En Üst Indexli Elemanı Kaldır");
            System.out.println("3. En Üst Indexli Elemanı Görüntüle");
            System.out.println("4. Elemanları Sırala");
            System.out.println("5. Elemanları Ters Çevir");
            System.out.println("6. Dizidaki Eleman Sayısı");
            System.out.println("7. Belirli Bir Elemanın Sayısı");
            System.out.println("8. Belirli Bir Elemanın İndeksleri");
            System.out.println("9. Dizinin Kopyasını Al");
            System.out.println("10. Belirli Bir Elemanı Kaldır");
            System.out.println("11. Belirli Bir Aralıktaki Elemanları Filtrele");
            System.out.println("12. Güncel Elemanları Listele");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminizi yapın: ");

            String secim = oku.nextLine().trim();
            System.out.println("\n");


            switch (secim) {
                case "1":
                    System.out.print("\nEklemek istediğiniz elemanı girin: ");  String yeniEleman=oku.nextLine().trim();
                    dizi.add(yeniEleman);
                    System.out.println(yeniEleman+" başarıyla eklendi");
                    System.out.println("\n");
                    break;


                case "2":
                    if (!dizi.isEmpty()) {
                        dizi.remove(dizi.size() - 1);
                        System.out.println("En üst eleman kaldırıldı.");
                    } else {
                        System.out.println("Dizi içinde hiç eleman bulunamadı.");
                    }
                    System.out.println("\n");
                    break;

                case "3":
                    System.out.println("En üst index elemanı: " + dizi.get(dizi.size()-1));
                    System.out.println("\n");
                    break;

                case "4":
                    Collections.sort(dizi);
                    System.out.println("---Sıralanmış Dizi---");
                    System.out.println(dizi);
                    System.out.println("\n");
                    break;

                case "5":
                    Collections.reverse(dizi);
                    System.out.println("---Terse çevrilmiş Dizi---");
                    System.out.println(dizi);
                    System.out.println("\n");
                    break;

                case "6":
                    System.out.println("Eleman sayısı: "+dizi.size());
                    System.out.println("\n");
                    break;

                case "7":
                    System.out.print("Öğrenmek istediğiniz kelimeyi yazınız: "); String kelime=oku.nextLine().trim().toLowerCase();
                    int say=0;
                    if (dizi.contains(kelime)) {
                        for (int i = 0; i < dizi.size(); i++) {
                            if (dizi.get(i).toLowerCase().equals(kelime))
                                say++;
                        }
                        System.out.println("Dizide bulunan "+kelime+" sayısı : "+say);
                    }else
                        System.out.println("!!! Dizi içerisinde bu kelime bulunmuyor !!!");
                    System.out.println("\n");
                    break;

                case "8":
                    System.out.print("Öğrenmek istediğiniz kelimeyi yazınız: "); String kelimeIndex=oku.nextLine().toLowerCase();
                    if (dizi.contains(kelimeIndex)) {
                        System.out.println("Aradığınız kelimenin indexleri: {");
                        for (int i = 0; i < dizi.size(); i++) {
                            if (dizi.get(i).toLowerCase().equals(kelimeIndex))
                                System.out.print(i+",");
                        }
                        System.out.println("}");
                    }else
                        System.out.println("!!! Dizi içerisinde bu kelime bulunmuyor !!!");
                    System.out.println("\n");
                    break;

                case "9":
                    ArrayList<String> copyDizi=new ArrayList<>();
                    System.out.print("Kopya ile oluşturulan dizi: {");
                    for (String copy: dizi)
                        System.out.print(copy+", ");
                    System.out.println("}");
                    System.out.println("\n");
                    break;

                case "10":
                    System.out.print("Kaldırmak istediğiniz elemanı giriniz: "); String kaldırılan= oku.nextLine();
                    if (dizi.contains(kaldırılan)) {
                        dizi.remove(kaldırılan);
                        System.out.println("İsteğiniz üzerine " + kaldırılan + " eleman kaldırıldı.");
                    }
                    else
                        System.out.println("!!! Girdiğiniz eleman dizide bulunmuyor !!!");
                    System.out.println("\n");
                    break;

                case "11":
                    Scanner intOku=new Scanner(System.in);
                    System.out.print("İlk index giriniz: "); int ilk=intOku.nextInt();
                    System.out.print("Son index giriniz: "); int son=intOku.nextInt();
                    System.out.println("Dizi girdiğiniz index'lere göre tekrar oluşturuldu: "+dizi.subList(ilk, son));
                    System.out.println("\n");
                    break;

                case "12":
                    listCurrentElements();
                    System.out.println("\n");
                    break;

                case "0":
                    exit = true;
                    System.out.println("...Programdan çıkış yapılıyor... \n----LÜTFEN BEKLEYİNİZ----");
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                    System.out.println("\n");
                    break;
            }

        }
        System.out.println("-------  PROGRAM SONLANDIRILDI  ------- \n*** TEKRAR GÖRÜŞMEK DİLEĞİYLE HOŞÇAKALIN ***");

    }

    private static void listCurrentElements() {
        System.out.println("Güncel Elemanlar: " + dizi);

    }
}
