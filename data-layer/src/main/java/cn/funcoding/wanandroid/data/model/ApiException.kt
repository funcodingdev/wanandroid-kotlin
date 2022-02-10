package cn.funcoding.wanandroid.data.model

class ApiException(var errorCode: Int, var errorMsg: String) : Exception()