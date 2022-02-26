import java.util.ArrayList;

public class latihan1_6 {
    public static void main(String[] args) {
        // Perintah 6 : add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), dan add(-3,j)

        ArrayList<String> nama = new ArrayList<String>();
        nama.add("a");
        nama.add("i");
        nama.add("d");
        nama.add("a");

        System.out.println("Data sebelum di remove : ");
        System.out.println("elemen index ke-0 : " + nama.get(0));
        System.out.println("elemen index ke-1 : " + nama.get(1));
        System.out.println("elemen index ke-2 : " + nama.get(2));
        System.out.println("elemen index ke-3 : " + nama.get(3));

        nama.remove(0);
        // nama1.remove(3);
        // karena sebelumnya sudah remove(0), panjang data array menjadi 3
        // maka data array yang tersisa hanya ada sampai index ke-2
        nama.remove(2);
        // elemen array setelah di remove adalah "i" dan "d"
        System.out.println("\nElemen array setelah remove : " + nama);

        System.out.println("\nAdd elemen baru ke array");

        nama.add(0, "e");
        System.out.println("Hasil setelah add (0,e) : " + nama);
        nama.add(2, "f");
        System.out.println("Hasil setelah add (2,f) : " + nama);
        nama.add(3, "g");
        System.out.println("Hasil setelah add (3,g) : " + nama);
        nama.add(4, "h");
        System.out.println("Hasil setelah add (4,h) : " + nama);
        nama.add(6, "h");
        System.out.println("Hasil setelah add (6,h) : " + nama);
        nama.add(-3, "j");
        System.out.println("Hasil setelah add (-3,j) : " + nama);

    }
}
