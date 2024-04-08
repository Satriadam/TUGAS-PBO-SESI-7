package Sesi7;

import java.util.ArrayList;

public class ContohArrayList {

    public static void main(String[] args) {
 
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Muhamad");
        nama.add("Satria");
        nama.add("Tile");

        System.out.println("Isi ArrayList: " + nama);

        nama.remove("Tile");

        boolean adaSatria = nama.contains("Satria");

        System.out.println("Apakah ada Satria? " + adaSatria);

        System.out.println("Isi ArrayList setelah dihapus: " + nama);
    }
}
