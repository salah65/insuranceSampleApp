package com.example.sampleinsuranceapp.data.repositoryImp

import com.example.sampleinsuranceapp.data.gateway.ServerGateway
import com.example.sampleinsuranceapp.data.gateway.serverGateway
import com.example.sampleinsuranceapp.domain.model.User
import com.example.sampleinsuranceapp.domain.repository.AuthenticationRepo

class AuthenticationRepoImp(private val server: ServerGateway = serverGateway) :
    AuthenticationRepo {
    override fun signInWithEmailAndPassword(email: String, password: String): User? {
        return server.signInWithEmailAndPassword(email, password)
    }

    override fun signInWithGoogleAccount() {

    }

    override fun signInWithFacebookAccount() {
    }

    override fun signUp(user: User) {
        server.signUp(user)
    }

    override fun resetPassword(email: String) {
        server.resetPassword(email)
    }

}