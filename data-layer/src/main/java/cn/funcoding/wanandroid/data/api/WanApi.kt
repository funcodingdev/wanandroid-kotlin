package cn.funcoding.wanandroid.data.api

object WanApi {
    val accountService: AccountService = ServiceCreator.create()
    val homePageService: HomePageService = ServiceCreator.create()
}