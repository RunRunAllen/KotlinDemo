package com.example.kotlinDemo.ProjectOne

import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface WanAndroidApi {

    @POST("/user/login")
    @FormUrlEncoded
    fun loginAction(@Field("username") userName: String, @Field("password") passWord: String)
    : Observable<LoginResponseWrapper<LoginResponse>>
}