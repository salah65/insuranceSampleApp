package com.example.sampleinsuranceapp.domain.model

import java.io.Serializable

data class User(
    private val firstName: String? = null,
    private val LastName: String? = null,
    private val mobileNumber: String? = null,
    private val email: String? = null,
    private val password: String? = null

):Serializable
