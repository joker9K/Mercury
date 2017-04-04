package main.jvm;

/**
 * @author supo
 * @Date 2017/3/30 16:47.
 * Copyright © mizhuanglicai
 */
public class finalizeTest {

    public static finalizeTest SAVE_HOOK = null;
    public void isAlive(){
        System.out.println("yes,i am still alive");
    }

    @Override
    protected void finalize() throws Throwable{
        super.finalize();
        System.out.println("finalize method executed!");
        SAVE_HOOK = this;
    }

    public static void main(String[] args) throws Throwable {
        SAVE_HOOK = new finalizeTest();
        SAVE_HOOK = null;
        System.gc();

        Thread.sleep(500);
        if(SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("no,i am dead :(");
        }

        SAVE_HOOK = null;
        System.gc();

        Thread.sleep(500);
        if(SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("no,i am dead :(");
        }
    }
}
