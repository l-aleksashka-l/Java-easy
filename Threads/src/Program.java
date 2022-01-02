class Increminator extends Thread {
    private volatile boolean increment = true;
    //private volatile boolean finish = false;

    public void changeAction() {
        increment = !increment;
    }

   /* public void finish() {
        finish = true;
    }*/

    @Override
    public void run() {
        do {
            //if (!finish) {
                if (increment) {
                    Program.value++;
                } else {
                    Program.value--;
                }
                System.out.print(Program.value + " ");
           /* } else {
                return;
            }*/
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return; //changing
            }
        } while (true);
    }
}


class Program {
    public static int value;
    static Increminator increminator;

    public static void main(String[] args) throws InterruptedException {
        increminator = new Increminator();
        System.out.print("Value: ");
        increminator.start();
        for(int i = 0; i <= 3; i++){
            Thread.sleep(i*4*1000);
            increminator.changeAction();
        }
        //increminator.finish();
        increminator.interrupt();
    }
}
