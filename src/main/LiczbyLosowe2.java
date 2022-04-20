package main;

import java.util.Random;

public class LiczbyLosowe2 {
    public static void main(String[] args) {
        Random r2 = new Random();
        String str = "!@#$%&*0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUWVWXYZ";
        int dlugoscStr = str.length();
        System.out.println("Dlugość łańcucha: " + dlugoscStr);
        String kod = "";
        for(int x =0; x<12; x++) {
            int pos = r2.nextInt(dlugoscStr);
            kod = kod + str.charAt(pos);

        }
        System.out.println("Wygenerowany kod: " + kod);

    }
}
