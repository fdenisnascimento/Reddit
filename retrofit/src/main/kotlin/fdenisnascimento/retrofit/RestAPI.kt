package fdenisnascimento.retrofit

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


/**
 * Created by Denis on 18/05/17.
 */

class RestAPI() {

    private val redditApi: RedditApi

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://www.reddit.com")
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
        redditApi = retrofit.create(RedditApi::class.java)
    }

    fun getNews(after: String, limit: String) : Call<RedditNewsResponse>
}
