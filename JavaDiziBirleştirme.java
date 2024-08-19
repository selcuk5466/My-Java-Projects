package task01;

import java.util.*;

public class JavaDiziBirleştirme {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("array1 dizisinin elemanlarını giriniz(elemanları virgül ile ayırarak girin): ");
        String dizi1Eleman= oku.nextLine();
        String[] dizi1=dizi1Eleman.split(",");
        ArrayList<Integer> array1=new ArrayList<>();
        for (int i = 0; i < dizi1.length; i++)
            array1.add(Integer.parseInt(dizi1[i]));


        System.out.print("array2 dizisinin elemanlarını giriniz(elemanları virgül ile ayırarak girin): ");
        String dizi2Eleman= oku.nextLine();
        String[] dizi2=dizi2Eleman.split(",");
        ArrayList<Integer> array2=new ArrayList<>();
        for (int i = 0; i < dizi2.length; i++)
            array2.add(Integer.parseInt(dizi2[i]));


        TreeSet<Integer> mergedArray=new TreeSet<>();
        mergedArray.addAll(array2);
        mergedArray.addAll(array1);

        System.out.println("array1 = " + array1);
        System.out.println("array2 = " + array2);
        System.out.println("mergedArray = " + mergedArray);


    }
}
