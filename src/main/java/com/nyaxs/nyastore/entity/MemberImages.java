package com.nyaxs.nyastore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.nyastore.Member
 * @date 2020/7/11 20:27
 */
@Data
@AllArgsConstructor
public class MemberImages {

    private int id;
    private int memberId;
    private String address;
}
