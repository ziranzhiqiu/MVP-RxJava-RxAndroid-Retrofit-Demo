package com.jsonqiu.bmvpdemo.network.view;

import com.jsonqiu.bmvpdemo.network.entity.BookBean;

/**
 * Created by JsonQiu on 2017/10/17 14:25.
 */

public interface BookView extends MyView {
    void onSuccess(BookBean bookBean);
    void onError(String result);
}
