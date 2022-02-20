import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90).map(x -> x + 10)
                .limit(5).forEach(System.out::print);

        int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
        int count = 0;
        for (int x : arr) {
            if (x >= 90) continue;
            x += 10;
            count++;
            if (count > 3) break;
            System.out.print(x);

        }
            String[] array = {"Java", "Ruuuuussshhh"};
            Stream<String> streamOfArray = Arrays.stream(array);
            streamOfArray.map(s->s.split("")) //Преобразование слова в массив букв
                    .map(Arrays::stream).distinct() //Сделать массив в отдельный поток
                    .collect(Collectors.toList()).forEach(System.out::println);


    }
}
