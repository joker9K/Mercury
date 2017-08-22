package main.jvm;

/**
 * @author zhangwt
 * @date 2017/7/4 15:04.
 * 该方法用来在jvm中增加一个关闭的钩子。当程序正常退出,系统调用 System.exit方法或虚拟机
 * 被关闭时才会执行添加的shutdownHook线程。其中shutdownHook是一个已初始化但并不有启动
 * 的线程，当jvm关闭的时候，会执行系统中已经设置的所有通过方法addShutdownHook添加的钩子，
 * 当系统执行完这些钩子后，jvm才会关闭。所以可通过这些钩子在jvm关闭的时候进行内存清理、资
 * 源回收等工作。
 */
public class RuntimeShutdownHookTest {


    public static void main(String[] args) {

        Thread shutdownHookOne = new Thread() {
            public void run() {
                System.out.println("shutdownHook one...");
            }
        };
        Thread shutdownHookTwo = new Thread(){
            @Override
            public void run() {
                System.out.println("shutdownHook two...");
            }
        };
        Runtime.getRuntime().addShutdownHook(shutdownHookOne);
        Runtime.getRuntime().addShutdownHook(shutdownHookTwo);

        Runnable threadOne = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread one doing something...");
        };

        Runnable threadTwo = () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread two doing something...");
        };

        threadOne.run();
        threadTwo.run();
    }
}
