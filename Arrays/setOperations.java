import java.util.ArrayList;
import java.util.HashSet;

public class setOperations {

    private static void intersection(int[] set1, int[] set2) {
        ArrayList<Integer> resList = new ArrayList<>();
        HashSet<Integer> set1Hash = new HashSet<>();
        for (int num : set1) {
            set1Hash.add(num);
        }
        for (int num : set2) {
            if (set1Hash.contains(num) && !resList.contains(num)) {
                resList.add(num);
            }
        }

        System.out.println("Intersection: " + resList);
    }

    private static void union(int[] set1, int[] set2) {
        HashSet<Integer> resSet = new HashSet<>();
        for (int num : set1) {
            resSet.add(num);
        }
        for (int num : set2) {
            resSet.add(num);
        }

        System.out.println("Union: " + resSet);
    }

    public static void main(String[] args) {
        int[] set1 = {1, 5, 9, 33, 56};
        int[] set2 = {9, 5, 16, 33, 12};

        union(set1, set2);
        intersection(set1, set2);
    }
}
