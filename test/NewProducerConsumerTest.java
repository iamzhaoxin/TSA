import static org.junit.Assert.assertTrue;

public class NewProducerConsumerTest {
//    public static void main(String[] args)  {
//        // 创建一个共享的缓冲区
//       Buffer buffer = new Buffer(5);
//        Thread t2 = new Thread2(buffer);
//        Thread t3 = new Thread3(buffer);
//
//            // 启动线程
//            t2.start();
//            t3.start();
//
//            // 等待线程执行完毕
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        try {
//            t3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        //检查缓冲区是否为空
//            assertTrue(buffer.isEmpty());
//
//
//
//
//    }

    static class Thread2 extends Thread {
        Buffer buffer;

        public Thread2(Buffer buffer) {
            this.buffer = buffer;
        }

        public void run() {

                for (int i = 0; i < 10; i++) {
                    try {
                        buffer.produce(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

        }
    }

    static class Thread3 extends Thread {
        Buffer buffer;

        public Thread3(Buffer buffer) {
            this.buffer = buffer;
        }

        public void run() {

                for (int i = 0; i < 10; i++) {
                    try {
                        buffer.consume();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

        }
    }
}
