import edu.tamu.cse.aser.tsa.Main;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(EXAMPCUnitTest.class);

        for (Failure failure : result.getFailures()) {
            System.err.println(failure.toString());
        }

        System.out.println("Tests successful? " + result.wasSuccessful());

        // Exit with a status code indicating success or failure
        System.exit(result.wasSuccessful() ? 0 : 1);
    }

    @Test
    public void test1(){
        Main.main(new String[]{"EXAMPC"});
    }

    @Test
    public void test2(){
        Main.main(new String[]{"EXAM"});
    }
}
