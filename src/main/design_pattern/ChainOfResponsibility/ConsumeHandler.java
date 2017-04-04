package main.design_pattern.ChainOfResponsibility;

/**
 * @author supo
 * @Date 2017/3/6 19:17.
 * Copyright © mizhuanglicai
 */
public abstract class ConsumeHandler {
    private ConsumeHandler nextHandler;

    public ConsumeHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(ConsumeHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     *
     * @param user 申请人
     * @param free 报销费用
     */
    public abstract void doHandler(String user,double free);
}
