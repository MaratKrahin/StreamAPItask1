package StreamAPItask1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> afterSortedList = new ArrayList<>();
        for (Integer i:list) {
            if (i <= 0){
                continue;
            }else {
                if (i % 2 == 0){
                    afterSortedList.add(i);
                }
            }
        }

        afterSortedList.sort(Integer::compareTo);
        System.out.println(afterSortedList.toString());
    }
}
