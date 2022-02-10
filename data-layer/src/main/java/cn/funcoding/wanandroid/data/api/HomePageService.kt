package cn.funcoding.wanandroid.data.api

import cn.funcoding.wanandroid.data.model.*
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * 首页相关
 */
interface HomePageService {

    /**
     * 首页文章列表
     */
    @GET("article/list/{pageIndex}/json")
    suspend fun getArticleList(
        @Path("pageIndex") pageIndex: Int
    ): ResponseModel<PaginationModel<ArticleModel>>

    /**
     * 首页banner
     */
    @GET("banner/json")
    suspend fun getHomeBannerList(): ResponseModel<List<BannerModel>>

    /**
     * 常用网站
     */
    @GET("friend/json")
    suspend fun getCommonUsedWebsiteList(): ResponseModel<List<WebsiteModel>>

    /**
     * 搜索热词
     */
    @GET("hotkey/json")
    suspend fun getHotkeyList(): ResponseModel<List<HotkeyModel>>

    /**
     * 置顶文章
     */
    @GET("article/top/json")
    suspend fun getTopArticleList(): ResponseModel<List<ArticleModel>>
}