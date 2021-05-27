package org.example.enums;

/**
 * Enum枚举的使用
 * @author zhangchuan
 * @date 2020-09-09
 */
public enum ColorEnum {
    /**
     * 定义枚举常量
     */
    REG("红色",1),GREEN("绿色",2);

    /**
     * 定义枚举常量参数值
     */
    private String name;
    private int index;

    /**
     * 获取枚举参数值
     * @return
     */
    public int index(){
        return this.index;
    }

    /**
     * 实力话枚举参数值
     * @param name
     * @param index
     */
    private ColorEnum(String name, int index){
        this.name=name;
        this.index=index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
