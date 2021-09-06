package com.example.sampleinsuranceapp.data.useCase

import com.example.sampleinsuranceapp.domain.model.User
import com.example.sampleinsuranceapp.domain.repository.AuthenticationRepo
import com.example.sampleinsuranceapp.domain.repository.UserRepo
import com.example.sampleinsuranceapp.domain.repository.authenticationRepository
import com.example.sampleinsuranceapp.domain.repository.userRepository

//----- simple login with email flow will request login from the server and after that will cache the returned user in memory cache

fun loginWithEmailAndPasswordUseCase(
    email: String,
    password: String,
    userRepo: UserRepo = userRepository,
    authenticationRepo: AuthenticationRepo = authenticationRepository
): User? {
    return authenticationRepo.signInWithEmailAndPassword(email, password)?.also { user: User ->
        userRepo.cacheUser(user)
    }
}