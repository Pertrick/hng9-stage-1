package com.HNG9.hng9backendtask1.dto

import org.springframework.stereotype.Component

@Component
class ProfileRequest(
    val slackUsername:String = "udoh patrick",
    val backend:Boolean = true,
    val age:Int  =25,
    val bio:String = "I am a Patrick Udoh, " +
            "a backend Developer with " +
            "stack majorly PHP(Laravel, Yii2, Code Igniter) and Java, Kotlin(Springboot)" +
            "I have about 2 years Experience working as a backend developer"
) {
}