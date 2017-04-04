package main.design_pattern.Prototype;

/**
 * @author supo
 * @Date 2016/11/16 19:39.
 * Copyright © mizhuanglicai
 */
public class WorkExperience implements Cloneable{
    private String  workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return  company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    protected Object clone(){
        return (Object)this.clone();
    }
}
