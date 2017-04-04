package main.design_pattern.ChainOfResponsibility;

/**
 * @author supo
 * @Date 2017/3/6 19:22.
 * Copyright © mizhuanglicai
 */
public class DeptHandler extends ConsumeHandler{

    @Override
    public void doHandler(String user, double free) {
        if(free < 1000){
            if(user.equals("zy")){
                System.out.println("给予报销:"+free);
            }else {
                System.out.println("报销不通过");
            }
        }else {
            if(getNextHandler() != null){
                getNextHandler().doHandler(user,free);
            }
        }
    }
}
