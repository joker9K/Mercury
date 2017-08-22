package main.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by zhangwt on 2017/5/9.
 */
public class Test10 {

    public static Method getCurrentMethod(){
        StackTraceElement[]yste=Thread.currentThread().getStackTrace();
        if(yste.length<2){
            return null;
        }
        /**getMethodName**/
        String str="";
        for(int i=0;i<yste.length;i++){
            if(yste[i].getMethodName().equals("getCurrentMethod")){
                Class<?>cC=null;
                try{
                    cC=Class.forName(yste[i+1].getClassName());
                }catch(ClassNotFoundException e){
                    e.printStackTrace();
                }
                Method[]ym=cC.getMethods();
                str=yste[i+1].toString();
                str=str.substring(0,str.lastIndexOf('('));
                for(int j=0;j<ym.length;j++){
                    if(str.endsWith(ym[j].getName())){
                        return ym[j];
                    }
                }
            }
        }
        return null;
    }
}
