package org.example.enums;

/**
 *
 * @author zhangchuan
 * @date 2020-09-09
 */
public enum MessageEnum {

    /**
     * 常量
     */
    RESPONSE_SUCCESS(200,"成功"),RESPONSE_FAIL(400,"失败");

    /**
     * 返回码
     */
    private int code;
    /**
     * 返回信息
     */
    private String msg;

    MessageEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
