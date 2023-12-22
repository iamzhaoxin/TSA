import java.util.HashSet;
import java.util.Set;
public class Example {

	static class Thread2 extends Thread{
		Set set;
		public Thread2(HashSet set) {
			this.set = set;
		}
		public void run(){
			for(Object o:set)
				System.out.println(o.hashCode());
		}
	}
	static class Thread3 extends Thread{
		Shared s;
		public Thread3(Shared s) {
			this.s = s;
		}
		public void run(){
			s.a[0]=2;
		}
	}
}