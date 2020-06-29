public class JoinExample {
    public static void main(String[] args){
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm th1");
            }
        }, "th1");

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm th2");
            }
        }, "th2");

        Thread th3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm th3");
            }
        }, "th3");

        th1.start();
        try{
            th1.join();
        }catch (InterruptedException e){}
    }
}
