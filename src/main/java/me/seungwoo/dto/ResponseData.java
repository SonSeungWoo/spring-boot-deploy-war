package me.seungwoo.dto;

import lombok.Data;

/**
 * Created by Leo.
 * User: ssw
 * Date: 2019-02-07
 * Time: 15:06
 */
@Data
public class ResponseData<T> {
    private T data;
}
