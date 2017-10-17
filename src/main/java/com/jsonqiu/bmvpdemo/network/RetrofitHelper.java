package com.jsonqiu.bmvpdemo.network;

import android.content.Context;

import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by JsonQiu on 2017/10/17 13:56.
 */

public class RetrofitHelper {

    private Context mContext;

    OkHttpClient okHttpClient = new OkHttpClient();
    GsonConverterFactory factory = GsonConverterFactory.create(new GsonBuilder().create());

    private static RetrofitHelper helper = null;

    private Retrofit mRetrofit = null;

    public static RetrofitHelper getIntance(Context context) {
        if (helper == null) {
            helper = new RetrofitHelper(context);
        }
        return helper;
    }

    private RetrofitHelper(Context context) {
        mContext = context;
        createRetrofit();
    }

    private void createRetrofit() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl("https://api.douban.com/v2/")
                .client(okHttpClient)
                .addConverterFactory(factory)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public RetrofitService getService() {
        return mRetrofit.create(RetrofitService.class);
    }

}
