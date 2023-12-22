import org.junit.Test;

import java.util.HashSet;


public class EXAM {
    @Test
    public static void main(String[] args) {
        Shared s = new Shared();
        HashSet set = new HashSet<Object>();
        set.add(s);
        Thread t2 = new Example.Thread2(set);
        Thread t3 = new Example.Thread3(s);
        t2.start();
        t3.start();
        s.x=1;
        s.z=1;
        int[] b = s.a;
        b[0]=1;
    }
}
