import javax.net.ssl.SSLEngineResult;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsAndElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        HashSet<Integer> firstNumbers = new LinkedHashSet<>();

        HashSet<Integer> secondNumbers = new LinkedHashSet<>();

        while (n-- > 0){
            int num = sc.nextInt();
            firstNumbers.add(num);
        }

        while (m-- > 0){
            int num = sc.nextInt();
            secondNumbers.add(num);
        }

        firstNumbers.retainAll(secondNumbers);

        firstNumbers.forEach(e -> System.out.print(e + " "));
    }

}
