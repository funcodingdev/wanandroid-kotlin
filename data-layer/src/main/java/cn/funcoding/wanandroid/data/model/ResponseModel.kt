package cn.funcoding.wanandroid.data.model

data class ResponseModel<out T>(
    private val `data`: T,
    val errorCode: Int,
    val errorMsg: String
) {

    fun isSuccessful(): Boolean {
        return errorCode == 0 && data != null
    }

    fun apiData() = data

    fun apiException(): ApiException = ApiException(errorCode, errorMsg)
}