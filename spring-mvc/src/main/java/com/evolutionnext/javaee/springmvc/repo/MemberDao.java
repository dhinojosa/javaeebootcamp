package com.evolutionnext.javaee.springmvc.repo;

import java.util.List;

import com.evolutionnext.javaee.springmvc.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
