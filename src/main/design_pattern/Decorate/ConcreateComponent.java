package main.design_pattern.Decorate;

/**
 * @author supo
 * @Date 2016/11/9 21:01.
 * Copyright © mizhuanglicai
 */
public class ConcreateComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
