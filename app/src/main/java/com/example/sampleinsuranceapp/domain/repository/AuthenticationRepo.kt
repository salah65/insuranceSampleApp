package com.example.sampleinsuranceapp.domain.repository

import com.example.sampleinsuranceapp.data.repositoryImp.AuthenticationRepoImp
import com.example.sampleinsuranceapp.domain.model.User

val authenticationRepository by lazy { AuthenticationRepoImp() }

interface AuthenticationRepo {
    fun signInWithEmailAndPassword(email: String, password: String): User?
    fun signInWithGoogleAccount()
    fun signInWithFacebookAccount()
    fun signUp(user: User)
    fun resetPassword(email: String)
}