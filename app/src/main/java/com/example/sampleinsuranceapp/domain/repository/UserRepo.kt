package com.example.sampleinsuranceapp.domain.repository

import com.example.sampleinsuranceapp.data.repositoryImp.UserRepoImp
import com.example.sampleinsuranceapp.domain.model.User

//-------------- add here all user entity operations
val userRepository by lazy { UserRepoImp() }
interface UserRepo {
    fun cacheUser(user:User)
    fun getCachedUser():User
}