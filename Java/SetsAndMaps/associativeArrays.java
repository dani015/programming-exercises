import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class associativeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Key,Integer> asd = new HashMap<>();

        Key firstKey = new Key("A");
        Key secondKey = new Key("B");

        asd.put(firstKey,1);
        asd.put(secondKey,2);

        System.out.println();
    }

    static class Key implements Comparable<Key>{
        String val;

        public Key(String val){
            this.val = val;
        }

        @Override
        public int hashCode() {
            return 1;
        }

        @Override
        public boolean equals(Object obj) {
            if(this != obj) return false;
            Key k = (Key)obj;
            return this.val.equals(k.val);
        }


        @Override
        public int compareTo(Key o) {
            return 1;
        }
    }
}
