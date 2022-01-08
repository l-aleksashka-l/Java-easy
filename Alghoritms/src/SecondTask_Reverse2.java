import java.util.Scanner;

public class SecondTask_Reverse2 {
    public static void main(String[] args) {
        String st;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        st = sc.nextLine();
        String[] strings = st.split("");
        for(int i = strings.length-1; i!=-1;i--){
            System.out.print(strings[i]);
        }
    }
}
