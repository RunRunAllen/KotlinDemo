package com.example.kotlinDemo.ProjectOne

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinDemo.R
import kotlinx.android.synthetic.main.activity_user_login.*

class LoginActivity : AppCompatActivity(), LoginView {
    var TAG: String = LoginActivity::class.java.simpleName
    lateinit var p: LoginPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_login)
        p = LoginPrsenterIml()
        initView()
    }

    private fun initView() {
        user_login_bt.setOnClickListener { v ->
            when (v?.id) {
                R.id.user_login_bt -> {
                    val userNameStr = user_phone_et.text.toString()
                    val userPwdStr = user_password_et.text.toString()

                    val client = APIClient.getInstance().instanceRetrofit(WanAndroidApi::class.java)
                   // p.loginAction(userNameStr, userPwdStr)
//                    client.loginAction(userNameStr, userPwdStr)
//                        .subscribeOn(Schedulers.io())
//                        .observeOn(AndroidSchedulers.mainThread())
//                        .subscribe {
//                            object : APIResponse<LoginResponse>(context = applicationContext) {
//                                override fun success(data: LoginResponse?) {
//                                    Log.i(TAG, "====success===")
//                                }
//
//                                override fun failure(errorMsg: String?) {
//                                    Log.i(TAG, "====failure===")
//                                }
//                            }
//                        }
                }
                else -> {
                    Log.i(TAG, "haha")
                }
            }
        }
    }

    override fun success(data: LoginResponse?) {
    }

    override fun failure(errorMsg: String?) {
    }

}