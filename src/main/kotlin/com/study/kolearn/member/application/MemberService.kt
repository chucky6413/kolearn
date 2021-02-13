package com.study.kolearn.member.application

import com.study.kolearn.member.domain.MemberRepository
import com.study.kolearn.member.domain.Member
import org.springframework.stereotype.Service

@Service
class MemberService(private val memberRepository: MemberRepository) {
    fun saveMember(member: Member) {
        memberRepository.save(member)
    }

    fun getMember(id: Long): Member {
        return memberRepository.findById(id).orElseThrow { NoMemberException("not found member") }
    }

    fun getAllMembers(): List<Member> {
        return memberRepository.findAll()
    }

    fun delete(id: Long) {
        memberRepository.deleteById(id)
    }
}