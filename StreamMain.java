package StreamAPItask1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        Stream.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4)
                .filter(it -> it > 0)
                .filter(it -> it % 2 == 0)
                .sorted(Integer::compareTo)
                .forEach(System.out::println);

    }
}
