package task01;

public class HarfCevrimi_kod {
    public static void main(String[] args) {
        String kelime="Hayat";
        büyükHarfFormati(kelime);
        kücükHarfFormati(kelime);
    }
    public static String büyükHarfFormati(String str1){

        str1=str1.toUpperCase();
        System.out.println("str1 = " + str1);
       return str1;
    }

    public static String kücükHarfFormati(String str){

        str=str.toLowerCase();
        System.out.println("str = " + str);
        return str;
    }
}
