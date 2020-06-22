package com.example.kotlinDemo.ProjectOne

import android.content.Context
import io.reactivex.Observer
import io.reactivex.disposables.Disposable


abstract class APIResponse<T>(val context: Context) : Observer<LoginResponseWrapper<T>> {

    private var isShow: Boolean = false

    // 成功 怎么办
    abstract fun success(data: T?)

    // 失败 怎么办
    abstract fun failure(errorMsg: String?)

    override fun onSubscribe(d: Disposable) {
        if (isShow) {
            LoadingDialog.show(context = context)
        }
    }

    override fun onNext(t: LoginResponseWrapper<T>) {
        if (t.data == null) {
            // 失败
            failure("登录失败了，请检查原因：msg:${t.errorMsg}")
        } else {
            // 成功
            success(t.data)
        }
    }

    override fun onComplete() {
        LoadingDialog.cancel()
    }


    override fun onError(e: Throwable) {
        // 取消加载
        LoadingDialog.cancel()

        failure(e.message)
    }
}