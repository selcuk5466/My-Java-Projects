package task02;

public class Palindrom {
    public static void main(String[] args) {
        String kelime="kayak";
        String kelime2="Cami";
        String kelime3="YAPay";


isPalindrom(kelime);
isPalindrom(kelime2);
isPalindrom(kelime3);


    }
public static String isPalindrom(String str){

    boolean palindromMu=true;

    StringBuilder tersecevir=new StringBuilder(str);
     if (str.equalsIgnoreCase(str = tersecevir.reverse().toString())) {
         System.out.println(" Bu bir palindrom kelimedir ");
         palindromMu=true;
         System.out.println("palindromMu = " + palindromMu);
     }
     else {
         System.out.println(" Bu palindrom kelime değildir ");
         palindromMu=false;
         System.out.println("palindromMu = " + palindromMu);

     }

    return str;
}

}
