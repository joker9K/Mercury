package main.think_in_java.generics;

import java.util.Date;

/**
 * Created by zhangwt on 2017/4/8.
 * 使用接口来产生混型
 */
interface TimeStamped{
    long getStamp();
}
class TimeStampedImp implements TimeStamped{
    private final long timeStamp;

    public TimeStampedImp(){
        timeStamp = new Date().getTime();
    }

    @Override
    public long getStamp() {
        return timeStamp;
    }
}
interface SerialNumbered{
    long getSerialNumber();
}

class SerialNumberImpl implements SerialNumbered{
    private static long counter = 1;
    private final long serialNumber = counter++;

    @Override
    public long getSerialNumber() {
        return serialNumber;
    }
}
interface Basic{
    void set(String val);
    String get();

}
class BasicImpl implements Basic{
    private String value;
    @Override
    public void set(String val) {
        this.value = val;
    }

    @Override
    public String get() {
        return value;
    }
}
class Mixin extends BasicImpl implements TimeStamped,SerialNumbered{
    private TimeStamped timeStamped = new TimeStampedImp();

    private SerialNumbered serialNumbered = new SerialNumberImpl();
    @Override
    public long getSerialNumber() {
        return serialNumbered.getSerialNumber();
    }

    @Override
    public long getStamp() {
        return timeStamped.getStamp();
    }

}
public class Mixins{

    public static void main(String[] args) {
        Mixin mixin1 = new Mixin(),mixin2 = new Mixin();
        mixin1.set("test string 1");
        mixin2.set("test string 2");
        System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumber());
        System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSerialNumber());
    }
}
