package main.think_in_java.generics;

import java.awt.*;

/**
 * Created by zhangwt on 2017/4/8.
 * 泛型参数设置边界
 */
interface HasColor{
    Color getColor();
}

class Colored<T extends HasColor>{
    T item;
    Colored(T item){this.item = item;}
    T getItem(){return item;}
    Color color(){return item.getColor();}

}

class Dimension{public int x,y,z;}

//类必须在前面,接口在后面
/*
class ColoredDimension<T extends HasColor & Dimension>{

}
*/

class ColoredDimension<T extends Dimension & HasColor>{
    T item;
    ColoredDimension(T item){this.item = item;}
    T getItem(){return item;}
    Color color(){return item.getColor();}
    int getX(){return item.x;}
    int getY(){return item.y;}
    int getZ(){return item.z;}
}

interface Weight{
    int weight();
}
//只能有一个具体的类,可以有多个接口
class Solid<T extends Dimension & HasColor & Weight>{
    T item;
    Solid(T item){this.item = item;}
    T getItem(){
        return item;
    }
    Color color(){
        return item.getColor();
    }

    int getX(){
        return item.x;
    }

    int getY(){
        return item.y;
    }
    int getZ(){
        return item.z;
    }
    int weight(){
        return item.weight();
    }
}
class Bounded extends Dimension implements HasColor,Weight{
    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int weight() {
        return 0;
    }
}
public class GenericBasicBonuds {
    public static void main(String[] args) {
        Solid<Bounded> solid = new Solid<>(new Bounded());
        solid.color();
        solid.weight();
        solid.getY();
    }
}
