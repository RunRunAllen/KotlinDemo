package com.example.kotlinDemo.ProjectOne

data class LoginResponseWrapper<T>(val data: T, val errorCode: Int, val errorMsg: String)