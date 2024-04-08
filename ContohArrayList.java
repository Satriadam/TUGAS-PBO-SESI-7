package Sesi7;

import java.util.ArrayList;

public class ContohArrayList {

    public static void main(String[] args) {
 
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Muhammad");
        nama.add("Fajar");
        nama.add("Satria");

        System.out.println("Isi ArrayList: " + nama);

        nama.remove("Satria");

        boolean adaFajar = nama.contains("Fajar");

        System.out.println("Apakah ada Fajar? " + adaFajar);

        System.out.println("Isi ArrayList setelah dihapus: " + nama);
    }
}
