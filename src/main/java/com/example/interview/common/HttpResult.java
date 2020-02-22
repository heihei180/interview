package com.example.interview.common;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class HttpResult<T> {
    int code;
    String msg;
    T data;
}
