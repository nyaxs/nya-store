package com.nyaxs.nyastore.mapper;

import com.nyaxs.nyastore.entity.Member;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.nyastore.mapper
 * @date 2020/7/12 20:55
 */
public interface MemberMapper {

    public int getMemberById();

    public int getMemberByName();

    public int getMemberByPhone();

    public int createMember(Member member);

    public int deleteMemberById(int id);

    public int deleteMemberByName(String name);

    public int updateMemberById(Member member);

    public int updateMemberByName(Member member);

}
