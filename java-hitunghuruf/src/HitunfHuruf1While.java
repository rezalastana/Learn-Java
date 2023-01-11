import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HitunfHuruf1While {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan input kalimat: ");

        while (scan.hasNext()){
            String kalimat = scan.nextLine();
            kalimat.replace(" ", "");
            char huruf[] = kalimat.toCharArray();
            Map<Character, Integer> map = new TreeMap<>();

            for (char item : huruf) {
                if (map.containsKey(item)){
                    int value = map.get(item)+1;
                    map.put(item, value);
                } else {
                    map.put(item,1);
                }
            }

            System.out.println(map);
            System.out.println("Masukkan kalimat: ");
        }
    }
}
