package cn.funcoding.wanandroid.data.api

import cn.funcoding.wanandroid.data.model.LoginModel
import cn.funcoding.wanandroid.data.model.ResponseModel
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface AccountService {

    /**
     * 登陆
     */
    @POST("user/login")
    suspend fun login(
        @Query("username") username: String,
        @Query("password") password: String
    ): ResponseModel<LoginModel>


    /**
     * 注册
     */
    @POST("user/register")
    suspend fun register(
        @Query("username") username: String,
        @Query("password") password: String,
        @Query("repassword") repassword: String
    ): ResponseModel<LoginModel>

    /**
     * 登出
     */
    @GET("user/logout/json")
    suspend fun logout(): ResponseModel<Any>
}