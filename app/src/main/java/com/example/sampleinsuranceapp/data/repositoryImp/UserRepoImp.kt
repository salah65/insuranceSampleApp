package com.example.sampleinsuranceapp.data.repositoryImp

import com.example.sampleinsuranceapp.data.core.USER
import com.example.sampleinsuranceapp.data.gateway.CacheGateway
import com.example.sampleinsuranceapp.data.gateway.cacheGateway
import com.example.sampleinsuranceapp.domain.model.User
import com.example.sampleinsuranceapp.domain.repository.UserRepo

class UserRepoImp(private val inMemoryCache: CacheGateway = cacheGateway) : UserRepo {
    override fun cacheUser(user: User) {
        inMemoryCache.save(USER, user)
    }

    override fun getCachedUser(): User {
        return inMemoryCache.load(USER) ?: User()
    }
}