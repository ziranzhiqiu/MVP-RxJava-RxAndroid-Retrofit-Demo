package com.jsonqiu.bmvpdemo.network.prestener;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.jsonqiu.bmvpdemo.network.entity.BookBean;
import com.jsonqiu.bmvpdemo.network.manager.DataManager;
import com.jsonqiu.bmvpdemo.network.view.BookView;
import com.jsonqiu.bmvpdemo.network.view.MyView;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by JsonQiu on 2017/10/17 14:25.
 * MVP中的   P ,是连接 M（Model）  与 V(View、Activity)  的 桥梁
 */

public class BookPrestener implements MyPrestener {
    private final Context mContext;
    private DataManager mManager;
    private CompositeSubscription mCompositeSubscription;
    private BookView mBookView;
    private BookBean mBook;

    public BookPrestener(Context context){
        mContext = context;
    }

    @Override
    public void onCreate() {
        mManager = new DataManager(mContext);
        mCompositeSubscription = new CompositeSubscription();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {
        if (mCompositeSubscription.hasSubscriptions())
            mCompositeSubscription.unsubscribe();
    }
    @Override
    public void attachView(MyView view) {
        mBookView = (BookView) view;
    }

    public void getSearchBooks(String a,String b,int c,int d){
        mCompositeSubscription.add(
                mManager.getSearchBooks(a,b,c,d)
                    .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Observer<BookBean>() {
            @Override
            public void onCompleted() {
                if (mBook!=null)
                    mBookView.onSuccess(mBook);
            }

            @Override
            public void onError(Throwable e) {
                mBookView.onError("请求失败，请稍后再试");
                Log.e("BookPrestener","请求失败，请稍后再试");
            }

            @Override
            public void onNext(BookBean bookBean) {
                mBook = bookBean;
            }
        }));
    }

    @Override
    public void onDestory() {

    }

    @Override
    public void attachInComingIntent(Intent intent) {
    }
}
