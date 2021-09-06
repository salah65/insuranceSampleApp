package com.example.sampleinsuranceapp.data.retrofit

import com.example.sampleinsuranceapp.domain.model.User
import retrofit2.http.GET


interface Endpoints {
    //added here all api endpoints
    @GET("")
    fun signInWithEmailAndPassword(email: String, password: String): User?

    fun signUp(user: User)

    fun resetPassword(email: String)


}