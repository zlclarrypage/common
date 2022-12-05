package com.rise.common.entity;

import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author 张牧之
 * @date 2022-12-05 20:19:14
 * @Email zhanglichang99@gmail.com
 */

@Data
@NoArgsConstructor
public class BaseResult<T> {
    private int code;
    private String message;
    private T data;

    public BaseResult<T> success () {
        this.code = StatusEnum.SUCCESS.getCode();
        this.message = StatusEnum.SUCCESS.getMessage();
        return this;
    }

    public BaseResult<T> success (T data) {
        this.code = StatusEnum.SUCCESS.getCode();
        this.message = StatusEnum.SUCCESS.getMessage();
        this.data = data;
        return this;
    }
}
