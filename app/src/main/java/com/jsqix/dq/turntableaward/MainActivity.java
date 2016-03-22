package com.jsqix.dq.turntableaward;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;

import com.jsqix.dq.turntableaward.view.Circleview;
import com.jsqix.dq.turntableaward.view.LuckyPanView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Circleview claert;
    private LuckyPanView mLuckyPanView;
    private ImageView mStartBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout layout = (FrameLayout) findViewById(R.id.Lottery);
        int screnWidth = getWindowManager().getDefaultDisplay().getWidth();
        /**
         * 添加随机数，制定奖项数量为上限，一般抽奖中什么都是服务器返回的，可以在请求服务器接口成功在制定转盘转到那个奖项
         */
        final Random random = new Random();
        claert = new Circleview(this, screnWidth);
        layout.addView(claert, new LayoutParams(LayoutParams.FILL_PARENT, DensityUtil.dip2px(this, 300)));

        findViewById(R.id.begin_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int place = random.nextInt(7);
                Log.e("当前的位置", place + "");
                claert.setStopPlace(place);
                claert.setStopRoter(false);
            }
        });
        findViewById(R.id.end_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                claert.setStopRoter(true);
            }
        });

        mLuckyPanView = (LuckyPanView) findViewById(R.id.id_luckypan);
        mStartBtn = (ImageView) findViewById(R.id.id_start_btn);

        mStartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mLuckyPanView.isStart()) {
                    mStartBtn.setImageResource(R.mipmap.stop);
                    mLuckyPanView.luckyStart(2);
                } else {
                    if (!mLuckyPanView.isShouldEnd())

                    {
                        mStartBtn.setImageResource(R.mipmap.start);
                        mLuckyPanView.luckyEnd();
                    }
                }
            }
        });
    }

}
