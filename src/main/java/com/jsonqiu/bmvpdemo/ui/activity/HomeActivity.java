package com.jsonqiu.bmvpdemo.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jsonqiu.bmvpdemo.R;
import com.jsonqiu.bmvpdemo.network.entity.BookBean;
import com.jsonqiu.bmvpdemo.network.prestener.BookPrestener;
import com.jsonqiu.bmvpdemo.network.view.BookView;

public class HomeActivity extends AppCompatActivity {

    private Button btnClick;
    private TextView tvDocument;

    private BookPrestener mBookPrestener = new BookPrestener(this);
    private HomeActivity mContext;
    private BookView mBookView = new BookView() {
        @Override
        public void onSuccess(BookBean bookBean) {
           tvDocument.setText("A"+"\n"+"B"+"\n"+"C"+"\n"+"D"+"\n"+"E"+"\n"+"F"+bookBean+"" +"\n"+"A"+"\n"+"B"+"\n"+"C"+"\n"+"D"+"\n"+"E"+"\n"+"F");
        }

        @Override
        public void onError(String result) {
            tvDocument.setText(result);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mContext = this;

        btnClick = (Button) findViewById(R.id.button);
        tvDocument = (TextView) findViewById(R.id.text);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBookPrestener.getSearchBooks("金瓶梅",null,0,1);
            }
        });
        mBookPrestener.onCreate();
        mBookPrestener.attachView(mBookView);
    }

}
