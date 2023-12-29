
public class MyExample {
    int[] a = new int[2];

    public static void main(String[] args) {

        MyExample e = new MyExample();

        Thread t1 = new Thread1(e);
        t1.start();

        for (int i = 0; i < 1000; i++) {
            e.a[0] = i;
            System.out.println(Thread.currentThread().getId() + "main" + e.a[0]);
        }

    }

    static class Thread1 extends Thread {
        MyExample o;

        Thread1(MyExample e) {
            this.o = e;
        }

        public void run() {

            for (int i = 0; i < 1000; i++) {
                o.a[0] = i * -1;
                System.out.println(Thread.currentThread().getId() + "child thread: " + o.a[0]);
            }

        }
    }
}