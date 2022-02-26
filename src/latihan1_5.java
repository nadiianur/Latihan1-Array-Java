import java.util.ArrayList;

public class latihan1_5 {

    public static void main(String[] args) {

        // Perintah 5 : remove(0), remove(3), dan remove(2)
        String[] nama = { "a", "i", "d", "a" };

        System.out.println("Data sebelum di remove : ");
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Elemen index ke- " + i + " : " + nama[i]);
        }

        ArrayList<String> nama1 = new ArrayList<String>();
        nama1.add("a");
        nama1.add("i");
        nama1.add("d");
        nama1.add("a");

        nama1.remove(0);

        // nama1.remove(3);
        // karena sebelumnya sudah remove(0), panjang data array menjadi 3
        // maka data array yang tersisa hanya ada sampai index ke-2

        nama1.remove(2);
        System.out.println("Elemen array setelah remove : " + nama1);

    }
}
