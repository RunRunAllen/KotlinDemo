package com.example.kotlinDemo.ProjectOne

import android.content.Context

class LoginPrsenterIml : LoginPresenter, LoginPresenter.OnLoginListener {


    private val loginModel = LoginModelIml()

    override fun loginAction(context: Context, userNameStr: String, userPwdStr: String) {

        //loginModel.login(context, userNameStr, userPwdStr,)
    }


    override fun success(data: LoginResponse?) {

    }

    override fun failure(errorMsg: String?) {

    }
}