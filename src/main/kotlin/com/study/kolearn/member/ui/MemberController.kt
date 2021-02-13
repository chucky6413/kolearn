package com.study.kolearn.member.ui

import com.study.kolearn.member.application.MemberService
import com.study.kolearn.member.domain.Member
import com.study.kolearn.common.config.SwaggerConfig
import io.swagger.annotations.Api
import mu.KotlinLogging
import org.springframework.web.bind.annotation.*

@Api(value = SwaggerConfig.MEMBER_TAG, tags = [SwaggerConfig.MEMBER_TAG])
@RestController
class MemberController(private val memberService: MemberService) {
    companion object {
        private val logger = KotlinLogging.logger {}
    }

    @PostMapping("/api/members/member")
    fun saveMember(@RequestBody member: Member) {
        memberService.saveMember(member)
    }

    @GetMapping("/api/members/{id}")
    fun getMember(@PathVariable id: Long): Member {
        logger.info("getMember by $id")
        return memberService.getMember(id)
    }

    @GetMapping("/api/members")
    fun getAllMembers(): List<Member> {
        logger.info("getAllMembers")
        return memberService.getAllMembers()
    }

    @DeleteMapping("/api/members/{id}")
    fun deleteMember(@PathVariable id: Long) {
        memberService.delete(id)
    }

}