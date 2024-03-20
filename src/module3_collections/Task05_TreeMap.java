package module3_collections;

import java.util.*;

public class Task05_TreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            int q = scanner.nextInt();
            while (q-- > 0) {
                char type = scanner.next().charAt(0);
                switch (type) {
                    case 'a':
                        int x = scanner.nextInt();
                        int y = scanner.nextInt();
                        treeMap.put(x, y);
                        break;
                    case 'b':
                        int key = scanner.nextInt();
                        System.out.print(treeMap.getOrDefault(key, -1) + " ");
                        break;
                    case 'c':
                        System.out.print(treeMap.size() + " ");
                        break;
                    case 'd':
                        int removeKey = scanner.nextInt();
                        treeMap.remove(removeKey);
                        break;
                    case 'e':
                        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
                            System.out.print(entry.getKey() + " ");
                        }
                        break;
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
