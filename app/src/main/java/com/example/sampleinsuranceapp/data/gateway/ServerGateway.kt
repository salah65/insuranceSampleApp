package com.example.sampleinsuranceapp.data.gateway

import com.example.sampleinsuranceapp.data.retrofit.RetrofitInstance
import com.example.sampleinsuranceapp.domain.model.User

interface ServerGateway {

    fun signInWithEmailAndPassword(email: String, password: String): User?

    fun signUp(user: User)

    fun resetPassword(email: String)
}


val serverGateway by lazy { ServerGatewayImp() }

class ServerGatewayImp() : ServerGateway {

    override fun signInWithEmailAndPassword(email: String, password: String): User? {
//        return RetrofitInstance.getService().signInWithEmailAndPassword(email, password)
        return User("salah","samy")
    }

    override fun signUp(user: User) {
//        RetrofitInstance.getService().signUp(user)
    }

    override fun resetPassword(email: String) {
//        RetrofitInstance.getService().resetPassword(email)
    }

}