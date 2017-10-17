package com.jsonqiu.bmvpdemo.network.manager;

import android.content.Context;

import com.jsonqiu.bmvpdemo.network.RetrofitHelper;
import com.jsonqiu.bmvpdemo.network.RetrofitService;
import com.jsonqiu.bmvpdemo.network.entity.BookBean;

import rx.Observable;


/**
 * Created by JsonQiu on 2017/10/17 14:16.
 */

public class DataManager {
    private RetrofitService mRetrofitService;
    public DataManager(Context context){
        this.mRetrofitService = RetrofitHelper.getIntance(context).getService();
    }
    public Observable<BookBean> getSearchBooks(String a,String b,int c ,int d){
        return mRetrofitService.getSearchBooks(a,b,c,d);
    }
}
