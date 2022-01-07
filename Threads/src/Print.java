import java.util.Arrays;
import java.util.List;

/**
 * Вот как добавляется блок синхронизации.
 * Внутри нужно указать у кого будет взят мьютекс для блокировки.
 */
class Print {

    static synchronized void print(List<String> wordsToPrint) {
        wordsToPrint.forEach(System.out::print);
        System.out.println();
    }

    public static void main(String args[]) {

        // создаем два треда
        Thread writer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> poem = Arrays.asList("Я ", "Writer1", " Пишу", " Письмо");
                Print.print(poem);
            }
        });
        Thread writer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> poem = Arrays.asList("Не Я ", "Writer2", " Не пишу", " Не Письмо");
                Print.print(poem);
            }
        });

        // запускаем их
        writer1.start();
        writer2.start();
    }
}