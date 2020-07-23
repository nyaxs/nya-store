package com.nyaxs.nyastore.entity.version1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;


/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.nyastore.Member
 * @date 2020/7/11 20:27
 */
@Data
@AllArgsConstructor
public class Managers {

    private int id;
    private String name;
    private String nickName;
    private String password;
    private String email;
    private LocalDate createTime;
    private int status;
    private int levelId;
    private int phone;
    public Managers(){
        nickName = "花生28";
        createTime = LocalDate.now();
    }
}
