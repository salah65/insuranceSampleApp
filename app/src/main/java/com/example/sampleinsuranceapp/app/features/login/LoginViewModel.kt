package com.example.sampleinsuranceapp.app.features.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sampleinsuranceapp.data.retrofit.Resource
import com.example.sampleinsuranceapp.data.useCase.loginWithEmailAndPasswordUseCase
import com.example.sampleinsuranceapp.domain.model.User
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {
    // make a mutable liveData Private to avoid changing it's value from out side viewModel
    private val _mutableLoginLiveData = MutableLiveData<Resource<User>>()
    val loginLiveData: LiveData<Resource<User>> = _mutableLoginLiveData


    fun loginWithEmailAndPassword(email: String, password: String) {
        viewModelScope.launch(IO) {
            _mutableLoginLiveData.postValue(Resource.loading())
            val user = loginWithEmailAndPasswordUseCase(email, password)
            delay(2000) // to simulate request time
            user?.let {
                _mutableLoginLiveData.postValue(Resource.success(it))
            } ?: _mutableLoginLiveData.postValue(
                Resource.error(
                    "Email or password not valid",
                    "error"
                )
            )
        }
    }




}