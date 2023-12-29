import edu.tamu.cse.aser.tsa.Main;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    @Test
    public void test1(){
        Main.main(new String[]{"producerConsumer.ProducerAndConsumerTest"});
    }

    @Test
    public void test2(){
        Main.main(new String[]{"shared.Example"});
    }

    @Test
    public void test3(){
        Main.main(new String[]{"MyExample"});
    }

    @Test
    public void test4(){
        Main.main(new String[]{"Example1"});
    }
}
