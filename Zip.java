package task2;

import java.util.Scanner;

public class Zip {
    public static void main(String[] args) {
        // String str = "aaabbccccddd";
     compressText();
    }
        public static void compressText(){
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");  String str=oku.nextLine();
        //String str="Buuuugüüünnnnn ggggüüüünllerden Cuuummmaaarrteeeesiiiii";
        char[] charArray = str.toCharArray();
        for ( int i =1 ; i < charArray.length; i++)  //bir for döngüsü kuruyoruz.
        {         int sayac=1;

                while ((charArray[i-1] == charArray[i])) {
                      sayac = sayac + 1;
                      i++;
                     if (i==charArray.length)
                            break;
                }
            System.out.print(sayac + "" + charArray[i-1]);

        }
    }
}





