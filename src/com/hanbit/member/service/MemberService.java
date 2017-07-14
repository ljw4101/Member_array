package com.hanbit.member.service;

import com.hanbit.member.domain.MemberBean;

public interface MemberService {
	//setter
	public void addMember(MemberBean member);
	public void upadtePw(MemberBean member);
	public void delMember(String id);
	//getter
	public MemberBean[] getMembers();	//목록: MemberBean을 배열로 담음
	public int countMembers();
	public MemberBean findByID(String id);
	public MemberBean[] findByName(String name);
}
