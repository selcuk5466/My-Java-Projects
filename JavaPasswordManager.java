package task02;

import java.util.*;

public class JavaPasswordManager {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        LinkedHashMap<String,LinkedHashMap<String,String>> Passwords=new LinkedHashMap<>();
        boolean cikis=false;

        while (cikis==false){

            System.out.print("1-Şifre Ekle \n2-Şifre Göster \n3-Çıkış " +
                    "\nLütfen yapmak istediğiniz işlemi giriniz : \n");
            String secim=oku.nextLine().trim();

            switch (secim){
                case "1":
                    LinkedHashMap<String,String>kullaniciSifre=new LinkedHashMap<>();
                    System.out.print("Hesap Adı: ");  String hesapAdi=oku.nextLine().trim();
                    System.out.print("Kullanıcı Adı: ");  String kullaniciAdi=oku.nextLine().trim();
                    System.out.print("Şifre: ");  String sifre=oku.nextLine().trim();
                    kullaniciSifre.put(kullaniciAdi,sifre);
                    Passwords.put(hesapAdi,kullaniciSifre);
                    System.out.println("Şifreniz başarıyla kaydedildi");
                    System.out.println("\n");
                    break;

                case "2":
                    System.out.print("Lütfen şifresini öğrenmek istediğiniz hesabı girin: ");
                    String hesapAdiDogrula=oku.nextLine().trim();
                    if (Passwords.containsKey(hesapAdiDogrula)) {
                        System.out.println(Passwords.get(hesapAdiDogrula));
                    }else {
                            System.out.println("!!! BU HESAP ADI İLE KAYITLI ŞİFRE BULUNMUYOR !!!");
                            cikis = true;
                        }

                        System.out.println("\n");
                        break;


                case "3":
                    System.out.println("...Programdan çıkış yapılıyor... \n----LÜTFEN BEKLEYİNİZ----");
                    cikis=true;
                    System.out.println("\n");
                    break;
            }

        }
        System.out.println("-------  PROGRAM SONLANDIRILDI  ------- \n*** TEKRAR GÖRÜŞMEK DİLEĞİYLE HOŞÇAKALIN ***");

    }
}
