package com.rise.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author 张牧之
 * @date 2022-12-05 20:31:49
 * @Email zhanglichang99@gmail.com
 */


@AllArgsConstructor
@Getter
public enum StatusEnum {
    SUCCESS(200,"请求成功");

    private int code;
    private String message;
}
