import static org.junit.Assert.assertTrue;

public class ProducerConsumerTest {


    public static void main(String[] args){
        // 创建一个共享的缓冲区
        Buffer buffer = new Buffer(5);

        // 创建生产者和消费者线程
        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    buffer.produce(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    buffer.consume();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        try {

            // 启动线程
            producerThread.start();
            consumerThread.start();

            // 等待线程执行完毕
            producerThread.join();
            consumerThread.join();

            // 检查缓冲区是否为空
            assertTrue(buffer.isEmpty());
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
