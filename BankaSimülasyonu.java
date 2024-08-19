package BankProject1;

import java.util.*;

public class BankaSimülasyonu implements BankaMetodları {
    Map<Integer, Musteri> musteriler=new HashMap<>();
    List<Hesap> hesaplar=new ArrayList<>();
    Scanner oku=new Scanner(System.in);
    Scanner okuInt=new Scanner(System.in);
    Scanner okuDouble=new Scanner(System.in);


    public BankaSimülasyonu() {
    }

    public BankaSimülasyonu(Map<Integer, Musteri> musteriler, List<Hesap> hesaplar) {
        this.musteriler=musteriler;
        this.hesaplar = hesaplar;

    }

    @Override
    public void run() {
        int secim;
        do {
            System.out.print("\n----- BANKA İŞLEMLERİ -----\n" +
                    "   1. Müşteri Listele\n" +
                    "   2. Yeni Müşteri Ekle\n" +
                    "   3. Müşteri İşlemleri\n" +
                    "   0. Çıkış\n" +
                    "   Seçiminizi yapın: ");
            secim = okuInt.nextInt();
            switch (secim) {
                case 1:
                    listCustomers();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    customerOperationsMenu();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }

        } while (secim!=0);

    }

    @Override
    public void listCustomers() {
        System.out.println("\n----- MÜŞTERİLER -----");
        if (musteriler.isEmpty()) {
            System.out.println("Kayıtlı Müşteri Bulunmamaktadır.");
        } else {
            for (Musteri musteri : musteriler.values()) {
                System.out.println(musteri.toString());
                listCustomerAccounts(musteri);
            }

        }


    }

    @Override
    public void listCustomerAccounts(Musteri musteri) {
        System.out.println("----- " + musteri.getCustomerId() +
                " " + musteri.getFirstName() +
                " " + musteri.getLastName() +
                " HESAPLARI -----");
        boolean hasAccounts = false;
        for (Hesap hesap : hesaplar) {
            if (hesap.getCustomerId() == musteri.getCustomerId()) {
                System.out.println(hesap.getAccountId() +
                        " - " + hesap.getHesapTipi() +
                        " - " + hesap.getBalance() +
                        " TL");
                hasAccounts = true;
            }
        }
        System.out.println("===============================================");

        if (!hasAccounts) {
            System.out.println("Müşterinin açılmış hesabı bulunmamaktadır.\n" +
                    "===============================================");
        }
    }

    @Override
    public void customerOperationsMenu() {
        Musteri musteri;
        int girilenId;
        do {
            System.out.println("\n----- MÜŞTERİ İŞLEMLERİ -----");
            System.out.println("0. Ana Menüye Dön");
            System.out.print("Müşteri ID girin (0 çıkış yapar): ");  girilenId=okuInt.nextInt();
            if (girilenId != 0)
                if (musteriler.containsKey(girilenId)) {
                    musteri=musteriler.get(girilenId);
                    customerOperations(musteri);
                } else
                    System.out.println("Geçersiz Müşteri ID. Tekrar deneyin.");


        } while (girilenId != 0);
    }


    @Override
    public void addCustomer() {
        Musteri musteri = new Musteri();
        System.out.println("\n----- YENİ MÜŞTERİ EKLE -----");
        System.out.print("İsim : "); String firstName = oku.nextLine();
        System.out.print("Soyisim : "); String lastName = oku.nextLine();
        System.out.print("Şehir : "); String city = oku.nextLine();
        musteri.setFirstName(firstName);
        musteri.setLastName(lastName);
        musteri.setCity(city);
        int musteriNo = musteri.getCustomerId();
        musteri.setCustomerId(musteriNo);
        musteriler.put(musteriNo,musteri);
        System.out.println("Müşteri başarıyla eklendi. Müşteri ID: " + musteriNo);
    }


    @Override
    public void customerOperations(Musteri musteri) {
        int secim;
        do {
            System.out.println("\n----- " + musteri.getFirstName() +
                    " " + musteri.getLastName() +
                    " İŞLEMLERİ -----");
            System.out.println("1. Yeni Hesap Aç");
            System.out.println("2. Hesapları Listele");
            System.out.println("3. Para Yatır");
            System.out.println("4. Para Çek");
            System.out.println("5. Bakiye Sorgula");
            System.out.println("0. Ana Menüye Dön");
            System.out.print("Seçiminizi yapın: ");
            secim = okuInt.nextInt();

            switch (secim) {
                case 1:
                    openNewAccount(musteri);
                    break;
                case 2:
                    listCustomerAccounts(musteri);
                    break;
                case 3:
                    depositToAccount(musteri);
                    break;
                case 4:
                    withdrawToAccount(musteri);
                    break;
                case 5:
                    checkBalance(musteri);
                    break;
                case 0:
                    System.out.println("Ana menüye dönülüyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }
        } while (secim != 0);
    }


    @Override
    public void openNewAccount(Musteri musteri) {
        System.out.println("\n----- YENİ HESAP AÇ -----");
        System.out.println("Hesap Türü Seçin:");

        System.out.println("1. Vadesiz Hesap (CHECKING)");
        System.out.println("2. Tasarruf Hesabı (SAVING)");
        System.out.println("3. Kredi Hesabı (CREDIT)");
        System.out.print("Seçiminizi Yapınız : ");    int secim = okuInt.nextInt();

       HesapTipi hesapTipi = null;
        switch (secim) {
            case 1:
                hesapTipi = HesapTipi.CHECKING;
                break;
            case 2:
                hesapTipi = HesapTipi.SAVINGS;
                break;
            case 3:
                hesapTipi = HesapTipi.CREDIT;
                break;
            default:
                System.out.println("Geçersiz seçim! Yeni hesap açma işlemi iptal edildi.");
        }
        Hesap hesap = new Hesap();
        hesap.setHesapTipi(hesapTipi);
        hesap.setCustomerId(musteri.getCustomerId());
        hesaplar.add(hesap);
        System.out.println("Hesap başarıyla açıldı. Hesap Numarası: " + hesap.getAccountId());

    }

    @Override
    public void depositToAccount(Musteri musteri) {
        System.out.println("\n----- PARA YATIR -----");
        System.out.print("Hesap Numarasını Girin: ");  int hesapNo=okuInt.nextInt();
        if (hesapNo>9000 && hesapNo<=Hesap.getAccauntSayac()) {
            for (Hesap hesap : hesaplar)
                if (hesapNo == hesap.getAccountId()) {
                    System.out.print("\nYatırılacak tutarı giriniz: ");
                    double yatirilan = okuDouble.nextDouble();
                    hesap.depositToAmount(yatirilan);
                    break;
                }
        }else
            System.out.println("Hesap numarası yanlış girildi");

    }

    @Override
    public void withdrawToAccount(Musteri musteri) {
        //Hesap hesap=new Hesap();
        System.out.println("\n----- PARA ÇEK -----");
        System.out.print("Hesap Numarasını Girin: ");
        int hesapNo = okuInt.nextInt();
        if (hesapNo >= 9000 && hesapNo <= Hesap.getAccauntSayac()) {
            for (Hesap hesap : hesaplar)
                if (hesapNo == hesap.getAccountId()) {
                    System.out.print("\nÇekilecek tutarı girin: ");
                    double cekilen = okuDouble.nextDouble();
                    hesap.withdrawToAmount(cekilen);
                    break;
                }
        }else
            System.out.println("Hesap numarası yanlış girildi");
    }

    @Override
    public void checkBalance(Musteri musteri) {
        System.out.println("\n----- BAKİYE SORGULA -----");
        System.out.print("Hesap Numarasını Girin: ");
        int hesapNo = okuInt.nextInt();
        if (hesapNo > 9000 && hesapNo <= Hesap.getAccauntSayac()) {
            for (Hesap hesap : hesaplar)
                if (hesap.getAccountId() == hesapNo) {
                    System.out.println("BAKİYE: " + hesap.getBalance());
                }
        }else
            System.out.println("Müsteri bilgileri hatalı veya eksik girildi.");
    }

    @Override
    public Hesap getAccountById(int accountId) {
        for (Hesap hesap : hesaplar)
            if (hesap.getAccountId() == accountId)
                return hesap;

            return null;
                  }
}
