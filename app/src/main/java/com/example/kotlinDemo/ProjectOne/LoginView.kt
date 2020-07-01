package com.example.kotlinDemo.ProjectOne

interface LoginView {

    // 成功 怎么办
    fun success(data: LoginResponse?)

    // 失败 怎么办
    fun failure(errorMsg: String?)
}