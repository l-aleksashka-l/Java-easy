class hh {
  void  method(){
      System.out.println("hh");
  }
}
public class gg extends hh{
    public static void main(String[] args) {
        gg gg = new gg();
        gg.method();
        int i = 1;
        System.out.println(++i); //change nonce
        System.out.println(i++); //change after action
        System.out.println(++i + i++);
    }
    void method(){
        System.out.println("gg");
    }
}
