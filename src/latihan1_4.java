import java.util.ArrayList;

public class latihan1_4 {
    public static void main(String[] args) {

        // Perintah 4 : indexOf(a), indexOf(c), dan indexOf(q)

        ArrayList<String> nama = new ArrayList<String>();
        nama.add("a");
        nama.add("i");
        nama.add("d");
        nama.add("a");

        System.out.println("Elemen a pada index ke- : " + nama.indexOf("a"));
        System.out.println("Elemen c pada index ke- : " + nama.indexOf("c"));
        System.out.println("Elemen q pada index ke- : " + nama.indexOf("q"));

        // jika output menghasilkan -1 berarti elemen itu tidak ada pada array

    }
}
