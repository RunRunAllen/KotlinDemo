package com.example.kotlinDemo.ProjectOne

import android.content.Context

interface LoginModule {

    fun login(
        context: Context,
        userName: String,
        password: String,
        listener: LoginPresenter.OnLoginListener
    )

    // 取消请求 动作
    fun cancelRequest()
}