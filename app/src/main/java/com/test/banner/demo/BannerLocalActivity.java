package com.test.banner.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.test.banner.R;
import com.test.banner.loader.GlideImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

public class BannerLocalActivity extends AppCompatActivity {

    Banner banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_local);
        initView();
    }

    private void initView() {
        banner = findViewById(R.id.banner);
        //本地图片数据（资源文件）
        List<Object> list = new ArrayList<>();
        list.add(R.mipmap.b1);
        list.add(R.mipmap.b2);
        list.add(R.mipmap.b3);


        banner.setImages(list)
                .setImageLoader(new GlideImageLoader())
                .start();
    }
}
