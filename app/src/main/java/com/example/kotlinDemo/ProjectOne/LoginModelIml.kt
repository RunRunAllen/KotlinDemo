package com.example.kotlinDemo.ProjectOne

import android.annotation.SuppressLint
import android.content.Context
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class LoginModelIml : LoginModule {
    @SuppressLint("CheckResult")
    override fun login(
        context: Context,
        userName: String,
        password: String,
        listener: LoginPresenter.OnLoginListener
    ) {
        APIClient.getInstance().instanceRetrofit(WanAndroidApi::class.java)
            .loginAction(userName, password)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                object : APIResponse<LoginResponse>(context = context) {
                    override fun success(data: LoginResponse?) {
                        listener.success(data)
                    }

                    override fun failure(errorMsg: String?) {
                        listener.failure(errorMsg)
                    }
                }
            }
    }

    override fun cancelRequest() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}