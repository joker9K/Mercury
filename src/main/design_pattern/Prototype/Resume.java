package main.design_pattern.Prototype;

/**
 * @author supo
 * @Date 2016/11/16 19:43.
 * Copyright © mizhuanglicai
 */
public class Resume implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private main.design_pattern.Prototype.WorkExperience workExperience;

    public Resume(String name){
        this.name = name;
        workExperience = new main.design_pattern.Prototype.WorkExperience();
    }

    private Resume(main.design_pattern.Prototype.WorkExperience workExperience){
        this.workExperience = (main.design_pattern.Prototype.WorkExperience)workExperience.clone();
    }

    //设置个人信息
    public void setPersonalInfo(String sex,String age){
        this.sex = sex;
        this.age = age;
    }
    //设置工作经历
    public void setWorkExperience(String workDate,String company){
        workExperience.setWorkDate(workDate);
        workExperience.setCompany(company);
    }

    //显示
    public void display(){
        System.out.format("%s%s%s",name,sex,age);
        System.out.format("工作经历:%s%s",workExperience.getWorkDate(),workExperience.getCompany());
    }

    @Override
    protected Object clone(){
        Resume obj = new Resume(this.workExperience);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }
}
