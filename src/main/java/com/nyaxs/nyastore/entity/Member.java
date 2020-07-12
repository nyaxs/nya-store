package com.nyaxs.nyastore.entity;

import lombok.Data;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.nyastore.Member
 * @date 2020/7/11 20:27
 */
@Data
public class Member {
    private int id;
    private String name;
    private String nickName;
    private String createTime;
    private String password;
    private int gender;
    private int status;
    private String personalizedSignature;
    private int levelId;
    private int phone;
    private String birthday;
}
