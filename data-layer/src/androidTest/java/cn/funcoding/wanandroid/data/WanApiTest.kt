package cn.funcoding.wanandroid.data

import androidx.test.ext.junit.runners.AndroidJUnit4
import cn.funcoding.wanandroid.data.api.WanApi
import cn.funcoding.wanandroid.data.model.LoginModel
import cn.funcoding.wanandroid.data.model.ResponseModel
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class WanApiTest {

    @Test
    fun register() {
        runBlocking {
            val responseModel: ResponseModel<LoginModel> =
                WanApi.accountService.register("测试账号123", "12345667", "12345667")

        }
    }

}