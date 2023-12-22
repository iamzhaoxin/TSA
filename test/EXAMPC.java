/**
 * @Author: 赵鑫
 * @Date: 2023/12/20 9:34
 */
import org.junit.Test;
import java.util.HashSet;
import static org.junit.Assert.assertTrue;


public class EXAMPC {
    @Test
    public static void main(String[] args) {

        // 创建一个共享的缓冲区
        Buffer buffer = new Buffer(5);
        Thread t2 = new NewProducerConsumerTest.Thread2(buffer);
        Thread t3 = new NewProducerConsumerTest.Thread3(buffer);
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




}
