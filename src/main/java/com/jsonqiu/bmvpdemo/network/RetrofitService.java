package com.jsonqiu.bmvpdemo.network;

import com.jsonqiu.bmvpdemo.network.entity.BookBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by JsonQiu on 2017/10/17 13:52.
 */

public interface RetrofitService {
    @GET("book/search")
    Observable<BookBean> getSearchBooks(
            @Query("q") String name,
            @Query("tag") String tag,
            @Query("start") int start,
            @Query("count") int count
    );
}
