package com.nyaxs.nyastore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.nyastore.Member
 * @date 2020/7/11 20:27
 */
@Data
@AllArgsConstructor
public class Member {

    private int id;
    private String name;
    private String nickName;
    private String password;
    private String email;
    private String personalizedSignature;
    private LocalDate birthday;
    private LocalDate createTime;
    private int gender;
    private int status;
    private int levelId;
    private int phone;
    public Member(){
        nickName = "花生28";
        createTime = LocalDate.now();
        personalizedSignature = "hello world";
    }
}
