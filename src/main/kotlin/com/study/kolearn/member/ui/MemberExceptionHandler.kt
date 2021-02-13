package com.study.kolearn.member.ui

import com.study.kolearn.common.model.ErrorResponse
import com.study.kolearn.member.application.NoMemberException
import mu.KotlinLogging
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class MemberExceptionHandler {
    companion object {
        private val logger = KotlinLogging.logger {}
    }

    @ExceptionHandler(NoMemberException::class)
    fun noMemberExceptionHandle(error: NoMemberException): ResponseEntity<ErrorResponse> {
        logger.error(error) { "${error.message}" }
        return ResponseEntity(ErrorResponse("404", error.message!!), HttpStatus.NOT_FOUND)
    }
}