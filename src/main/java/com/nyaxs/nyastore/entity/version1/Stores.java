package com.nyaxs.nyastore.entity.version1;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.nyastore.entity
 * @date 2020/7/16 16:59
 */
@Data
@AllArgsConstructor
public class Stores {
    private int id;
    private int memberId;
    private String name;
    private String description;
    public Stores(){
        name = "默认商店名";
        description = "默认商店描述";
    }
}
