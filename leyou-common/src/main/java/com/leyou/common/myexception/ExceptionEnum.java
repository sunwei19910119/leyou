package com.leyou.common.myexception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {
    BRAND_NOT_FOUND(404,"品牌不存在"),
    UPLOAD_ERROR(500,"文件上传失败"),
    ;

    private int code;
    private String msg;
}
