import java.util.ArrayList;

public class latihan1_2 {
    public static void main(String[] args) {
        String[] nama = { "a", "i", "d", "a" };

        // Perintah 2 : size()

        ArrayList<String> nama1 = new ArrayList<String>();
        for (int i = 0; i < nama.length; i++) {
            nama1.add(nama[i]);
        }

        System.out.println("\nUkuran array nama adalah " + nama1.size());
    }
}
