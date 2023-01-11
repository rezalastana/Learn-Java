import java.util.Scanner;

public class TotalHuruf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan input kalimat :");
        String input = scan.nextLine();

        System.out.println("Banyak huruf kalimat " + input );

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            count++;
        }
        System.out.println(count);
    }
}
