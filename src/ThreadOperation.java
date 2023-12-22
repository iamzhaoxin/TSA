/**
 * @Author: 赵鑫
 * @Date: 2023/12/19 21:01
 */
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ThreadOperation {
    private static final Lock lock = new ReentrantLock();

    public static void fork(int i, Thread currentThread, Thread targetThread) {
        System.out.println("Oi" + i + "(FORK, T{" + currentThread.getName() + "," + targetThread.getName() + "})");
    }

    public static void join(int i, Thread currentThread, Thread targetThread) {
        System.out.println("Oi" + i + "(JOIN, T{" + currentThread.getName() + "," + targetThread.getName() + "})");
    }

    public static void stop(int i, Thread currentThread) {
        System.out.println("Oi" + i + "(STOP, T{" + currentThread.getName() + "})");
    }

    public static void acquire(int i, Thread currentThread, String lockName) {
        System.out.println("Oi" + i + "(ACQ, T{" + currentThread.getName() + "}, " + lockName + ")");
    }

    public static void release(int i, Thread currentThread, String lockName) {
        System.out.println("Oi" + i + "(REL, T{" + currentThread.getName() + "}, " + lockName + ")");
    }

    public static void read(int i, Thread currentThread, int variableId, String variableContent) {
        System.out.println("Oi" + i + "(R, T{" + currentThread.getName() + "}, " + variableId + ", " + variableContent + ")");
    }

    public static void write(int i, Thread currentThread, int variableId, String variableContent) {
        System.out.println("Oi" + i + "(W, T{" + currentThread.getName() + "}, " + variableId + ", " + variableContent + ")");
    }
}

