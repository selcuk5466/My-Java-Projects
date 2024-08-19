package task04;

import java.util.ArrayList;
import java.util.Random;

public class JavaParolaUretici {
    public static void main(String[] args) {

        parolaUretme();

    }
    public static void parolaUretme(){
        Random rastgeleSec=new Random();
        int parolaUzunluğu=rastgeleSec.nextInt(4) +7;
        StringBuilder parola=new StringBuilder();
        for (int i = 0; i < parolaUzunluğu; i++) {
            char randomkarakter=(char) (rastgeleSec.nextInt(94) + 33);
           parola.append(randomkarakter);
        }
        System.out.println("Parola = " + parola);
    }
}
