package org.example.test;

import org.example.enums.ColorEnum;
import org.example.enums.MessageEnum;

/**
 * @author zhangchuan
 * @date 2020-09-09
 */
public class EnumTest {

    public static void main(String[] args) {

        System.out.println(ColorEnum.GREEN);
        System.out.println(ColorEnum.GREEN.getName());
        System.out.println(ColorEnum.GREEN.getIndex());
        System.out.println(ColorEnum.GREEN.index());

        System.out.println(MessageEnum.RESPONSE_SUCCESS.getCode());
        System.out.println(MessageEnum.RESPONSE_FAIL.getCode());

    }

}
