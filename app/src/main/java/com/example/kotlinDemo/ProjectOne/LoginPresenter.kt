package com.example.kotlinDemo.ProjectOne

import android.content.Context

interface LoginPresenter {

    fun loginAction(context: Context, userNameStr: String, userPwdStr: String)

    interface OnLoginListener {
        // 成功 怎么办
        fun success(data: LoginResponse?)

        // 失败 怎么办
        fun failure(errorMsg: String?)
    }
}