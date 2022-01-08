//Напишите программу на Java для переворота
//последовательности символов в строке без
//использования встроенной в String функции reverse().

public class SecondTask_Reverse {
    public static void main(String[] args) {
        String st = "Задача";
        char symbols[] = st.toCharArray().clone();
        for(int i = symbols.length-1; i!= -1; --i )
        {
            System.out.print(symbols[i]);
        }
    }
}
