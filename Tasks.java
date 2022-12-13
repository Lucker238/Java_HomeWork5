import java.util.*;

public class Tasks {

    public static void main(String[] args) {
        Map<Integer, String> dict = new HashMap<>();
        dict.put(1, "Red");
        dict.put(2, "Green");
        dict.put(3, "Blue");

        for (int i = 1; i < 4; i++) {
            dict.compute(i, (k, v) -> v += "!");
        }

        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(1, "Red");
        tree.put(2, "Green");
        tree.put(3, "Blue");

        for (int i = 1; i < 4; i++) {
            tree.compute(i, (k, v) -> v += "!");
        }

        for (int i = 4; i <= 1000; i++) {
            tree.put(i, "SeroBarmalinoviy!");
        }

    }
}