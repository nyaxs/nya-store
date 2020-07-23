package com.nyaxs.nyastore.entity.version1;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class MemberImages {
    private int id;
    private int memberId;
    private String address;
}
