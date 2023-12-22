public class Shared {
	
	int x=1;
	int y=1;
	static int z=1;
	int a[] = new int[1];
	@Override
	public int hashCode()
	{
		return y+x++;
	}

//	private int[] data;
//	private int size;
//	private int count;
//
//	public void Buffer(int size) {
//		this.size = size;
//		this.data = new int[size];
//		this.count = 0;
//	}
//
//	public synchronized void produce(int value) throws InterruptedException {
//		while (count == size) {
//			wait();
//		}
//		data[count] = value;
//		count++;
//		System.out.println("Produced: " + value);
//		notify();
//	}
//
//	public synchronized void consume() throws InterruptedException {
//		while (count == 0) {
//			wait();
//		}
//		int value = data[count - 1];
//		count--;
//		System.out.println("Consumed: " + value);
//		notify();
//	}
//
//	public synchronized boolean isEmpty() {
//		return count == 0;
//	}

}
