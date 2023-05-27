import java.util.*;

public class TestArrayList1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        Queue<Integer> queue = new LinkedList<>();
        int[] newarr = {1,2,3};
        for (int i = 0; i < 4; i++ ) {
            arr.add(i);
            map.put(i, 4-i);
            queue.add(i);
            queue.add(i+1);
            arr.remove(0);
            queue.remove();
            Map<Integer, Integer> map1 = new TreeMap<>();
            map1.put(1, 1);
            map1.put(2, -1);
            map1.put(5, 2);
            map1.put(4, 0);
            map1.put(3, 3);
            System.out.println("map1 = " + map1);
        }
        System.out.println(map);




    }
}
