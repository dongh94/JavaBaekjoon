import java.util.*;

public class TestArrayList1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        int[] newarr = {1,2,3};
        for (int i = 0; i < 4; i++ ) {
            arr.add(i);
            map.put(i, 4-i);
            queue.add(i);
            queue.add(i+1);
            int[] newarr2 = newarr;
            System.out.println(newarr);
            System.out.println(Arrays.toString(newarr2));

            System.out.println(arr);
            arr.remove(0);
            System.out.println(queue);
            queue.remove();
        }
        System.out.println(map);




    }
}
