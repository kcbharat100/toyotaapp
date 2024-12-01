package com.bharat.toyotaapp.util

sealed class Resource<out T>{
    data object Loading: Resource<Nothing>()
    data class Data<T>(val data: T): Resource<T>()
    data class Error<T>(val errorMessage: String): Resource<Nothing>()

}
