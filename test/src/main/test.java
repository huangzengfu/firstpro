package main;


import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.StreamSupport;

public class test {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(6);
        List<Integer> res = sum_two(list);
        System.out.println(res);

    }

    public static List<Integer> sum_two(List<Integer> list) {
        int size = list.size();
        if (size <= 2) return list;
        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            if (i == size - i - 1) {
                res.add(list.get(i));
                break;
            } else if (i > size - 1 - i) {
                break;
            } else {
                res.add(0, list.get(i) + list.get(size - i - 1));
            }
        }
        return sum_two(res);
    }


}

class Super {
    public int getLength() {
        return 4;
    }
}





