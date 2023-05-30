import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 정렬_Comparable {
    static class Product implements Comparable<Product> {
        String name;
        int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public int compareTo(Product o) {
            if (this.name.charAt(0) > o.name.charAt(0)) {
                return 1;
            } else if (this.name.charAt(0) == o.name.charAt(0)) {
                if (this.price > o.price) {
                    return 1;
                } else {
                    return -1;
                }

            } else {
                return -1;
            }
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product("갤럭시폴드2", 2000000);
        Product product2 = new Product("LG롤러블", 2300000);
        Product product3 = new Product("아이폰12PRO", 1700000);
        Product product4 = new Product("갤럭시폴드2(중고)", 1400000);
        Product product5 = new Product("LG롤러블(중고)", 1700000);
        Product product6 = new Product("아이폰12PRO(중고)", 1300000);


        // List 사용
        List<Product> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);

        System.out.println("List 정렬 전");
        list.forEach((s) -> System.out.println(s));

        Collections.sort(list);


        System.out.println("List 정렬 후");
        list.forEach((s) -> System.out.println(s));

        System.out.println("Collections.reverseOrder()");
        Collections.sort(list, Collections.reverseOrder());
        list.forEach((s) -> System.out.println("s = " + s));

        // 배열 사용
        Product[] array = {product1, product2, product3, product4, product5, product6};

        System.out.println();
        System.out.println("배열 정렬 전");
        Arrays.stream(array).forEach(s -> System.out.println(s));

        Arrays.sort(array);

        System.out.println("배열 정렬 후");
        Arrays.stream(array).forEach(s -> System.out.println(s));
    }
}
