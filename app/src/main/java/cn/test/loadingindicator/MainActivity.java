package cn.test.loadingindicator;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LoadingIndicatorView avi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout view=(LinearLayout) findViewById(R.id.avi);
        avi= new LoadingIndicatorView(this);
        avi.setIndicatorColor(Color.parseColor("#303F9F"));
        view.addView(avi);
    }

    public void hideClick(View view) {
       // avi.hide();
        avi.smoothToHide();
    }

    public void showClick(View view) {
        //avi.show();
        avi.smoothToShow();
    }
}
