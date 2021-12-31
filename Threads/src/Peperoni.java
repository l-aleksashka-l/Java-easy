class Pineapple extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("With pineapple!");

        }
    }
}

public class Peperoni {
    static Pineapple anotherOpinion;

    public static void main(String[] args) {
        anotherOpinion = new Pineapple();
        System.out.println("Fight!");
        anotherOpinion.start();

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("With peperoni!");

        }

        if (anotherOpinion.isAlive()) {
            try {
                anotherOpinion.join();
            } catch (InterruptedException e) {
            }
            System.out.println("\nBuy with pineapple\n");

        } else {
            System.out.println("\nBuy with peperoni\n");
        }
        System.out.println("Final");
    }
}
