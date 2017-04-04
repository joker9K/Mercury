package main.design_pattern.Builder;

/**
 *
 * 抽象建造者类Builder
 * Created by supo on 2016/11/28.
 */
public interface Builder {
    void buildPart1();
    void buildPart2();
    Product retrieveResult();
}
