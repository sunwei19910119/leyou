package com.leyou.auth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户信息
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserInfo {

    private Long id;

    private String username;
}
