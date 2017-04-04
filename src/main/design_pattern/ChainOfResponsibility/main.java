package main.design_pattern.ChainOfResponsibility;

/**
 * @author supo
 * @Date 2017/3/6 19:33.
 * Copyright © mizhuanglicai
 */
public class main {

    public static void main(String[] args) {
        ConsumeHandler projectHandler = new ProjectHandler();
        ConsumeHandler deptHandler = new DeptHandler();
        ConsumeHandler generalHandler = new GeneralHandler();
        projectHandler.setNextHandler(deptHandler);
        deptHandler.setNextHandler(generalHandler);
        projectHandler.doHandler("lwx",450);
        projectHandler.doHandler("lwx",600);
        projectHandler.doHandler("zy",600);
        projectHandler.doHandler("zy",1500);
        projectHandler.doHandler("lwxzy",1500);
    }
}
