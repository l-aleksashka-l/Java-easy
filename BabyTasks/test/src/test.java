import java.util.*;

import static java.lang.Integer.compare;


public class test extends Thread{
    public static void main( String[] args ) {

        Map<String, Integer> map1 = new HashMap<String, Integer>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();

        map1.put( "Number1", new Integer( 100 ) );
        map1.put( "Number2", new Integer( 200 ) );
        map1.put( "Number3", new Integer( 300 ) );

        List<Map> list = new ArrayList<Map>();
        list.add( map1 );
        list.add( map2 );

        HashMap resultMap = (HashMap) list.get( 0 );
        System.out.println( "Number: " + resultMap.get( "Number2" ) );
    }

}

/*
        @FunctionalInterface
        interface Function<T, R> {
            R apply(T t);
        }

        @FunctionalInterface
        interface Consumer<T> {
            void accept(T t);
        }

        @FunctionalInterface
        interface Supplier<T> {
            T get();
        }x


        Function<Integer, String> convert = x -> String.valueOf(x) + " долларов";
        Consumer<Integer> printer = x-> System.out.printf("%d долларов \n", x);
        Supplier<User> userFactory = ()->{
            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = in.nextLine();
            return new User(name);
        };

        System.out.println(convert.apply(5));
        System.out.println(convert.apply(239));
        printer.accept(5467);
        printer.accept(600);
        User user1 = userFactory.get();
        User user2 = userFactory.get();
        System.out.println("Имя user1: " + user1.getName());
        System.out.println("Имя user2: " + user2.getName());*/
/*

}

class User{

    private String name;
    String getName(){
        return name;
    }

    User(String n){
        this.name=n;
    }
}*/
