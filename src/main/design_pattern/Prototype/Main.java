package main.design_pattern.Prototype;

/**
 * @author supo
 * @Date 2016/11/16 19:57.
 * Copyright © mizhuanglicai
 */
public class Main {

    public static void main(String[] args) {
        main.design_pattern.Prototype.Resume a = new main.design_pattern.Prototype.Resume("大鸟");
        a.setPersonalInfo("男","29");
        a.setWorkExperience("1998-2000","XX公司");
        main.design_pattern.Prototype.Resume b= (main.design_pattern.Prototype.Resume)a.clone();
        b.setWorkExperience("1998-2006","YY公司");
        main.design_pattern.Prototype.Resume c= (main.design_pattern.Prototype.Resume)a.clone();
        c.setWorkExperience("1998-2003","ZZ公司");
        a.display();
        b.display();
        c.display();

    }
}
