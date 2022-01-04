public class Main {
    public static void main(String[] args) {

        // Пример статического и динамического связывания в Java
        Insurance current = new CarInsurance();

        // Динамическое связывание на основе объекта
        int premium = current.premium();         //там нет слова static, переменная виртуальная, поэтому берем ее

        // Статическое связывание на основе класса
        String category = current.category();    //там есть слово static, поэтому берем из extends

        System.out.println("premium : " + premium);
        System.out.println("category : " + category);
    }
}

class Insurance{
    public static final int LOW = 100;

    public int premium(){
        return LOW;
    }

    public static String category(){
        return "Insurance";
    }

}

class CarInsurance extends Insurance{
    public static final int HIGH = 200;

    public int premium(){
        return HIGH;
    }

    public static String category(){
        return "Car Insurance";
    }

}