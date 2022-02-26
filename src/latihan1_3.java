import java.util.ArrayList;

public class latihan1_3 {

    public static void main(String[] args) {

        // Perintah 3 : get(0), get(2), get(6), dan get(-3)

        ArrayList<String> nama = new ArrayList<String>();
        nama.add("a");
        nama.add("i");
        nama.add("d");
        nama.add("a");

        System.out.println("Elemen pada index ke-0 adalah : " + nama.get(0));
        System.out.println("Elemen pada index ke-2 adalah : " + nama.get(2));
        System.out.println("Elemen pada index ke-6 adalah : " + nama.get(6));
        System.out.println("Elemen pada index ke(-3) adalah : " + nama.get(-3));
    }
}
