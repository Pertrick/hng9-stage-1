package com.HNG9.hng9backendtask1.controller

import com.HNG9.hng9backendtask1.dto.ProfileRequest
import com.HNG9.hng9backendtask1.dto.ProfileResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/profiles")
class ProfileController(val profileRequest: ProfileRequest) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getProfile(): ProfileResponse {
        return ProfileResponse(
            profileRequest.slackUsername,
            profileRequest.backend,
            profileRequest.age,
            profileRequest.bio)
    }
}