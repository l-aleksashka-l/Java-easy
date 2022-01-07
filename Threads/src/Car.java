class Car {
    void run() {
        System.out.println("bjbsair.com");
    }
}

class Audi extends Car {
    void run() {
        System.out.println("Audi is running at bjbsair.com");
    }

    public static void main(String args[]) {
        Car b = new Audi();
        b.run();
    }
}

class Ford extends Car {
    static String method(){
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("c");
            return "sjdk";
        } finally {
            return "finally";
        }
    }
    public static void main(String[] args) {

        method();
    }

}

