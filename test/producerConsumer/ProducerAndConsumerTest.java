package producerConsumer;

import producerConsumer.Buffer;

/**
 * @Author: 赵鑫
 * @Date: 2023/12/20 9:34
 */



public class ProducerAndConsumerTest {

    public static void main(String[] args) {

        // 创建一个共享的缓冲区
        Buffer buffer = new Buffer(5);
        Thread t2 = new Producer(buffer);
        Thread t3 = new Consumer(buffer);
        // 启动线程
        t2.start();
        t3.start();

        // 等待线程执行完毕
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //检查缓冲区是否为空
        //assertTrue(buffer.isEmpty());

    }

    static class Producer extends Thread {
        Buffer buffer;

        public Producer(Buffer buffer) {
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

    static class Consumer extends Thread {
        Buffer buffer;

        public Consumer(Buffer buffer) {
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
