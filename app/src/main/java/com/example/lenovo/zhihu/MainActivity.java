package com.example.lenovo.zhihu;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {
    //底部菜单的5个Linearlayout
    private LinearLayout lin01, lin02, lin03, lin04, lin05;
    //底部菜单的5个ImageView;
    private ImageView img01, img02, img03, img04, img05;

    //中间区域
    private ViewPager viewPager;
    //ViewPager适配器  ContentAdapter
    private ContentAdapter adapter;

    private List<View> views;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

        //隐藏掉 标题栏
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
            actionBar.hide();

        //初始化控件
        initView();
        //初始化底部按钮事件
        initEvent();

    }

    private void initEvent() {

        //设置按钮监听
        lin01.setOnClickListener(this);
        lin02.setOnClickListener(this);
        lin03.setOnClickListener(this);
        lin04.setOnClickListener(this);
        lin05.setOnClickListener(this);

        //设置viewPager的滑动监听。
        viewPager.setOnPageChangeListener(this);

    }
    private void initView(){
        //底部5个 Linearlayout的初始化
        this.lin01 = (LinearLayout)findViewById(R.id.lin01);
        this.lin02 = (LinearLayout)findViewById(R.id.lin02);
        this.lin03 = (LinearLayout)findViewById(R.id.lin03);
        this.lin04 = (LinearLayout)findViewById(R.id.lin04);
        this.lin05 = (LinearLayout)findViewById(R.id.lin05);

        //底部5个 ImageView的初始化
        this.img01 = (ImageView)findViewById(R.id.img_01);
        this.img02 = (ImageView)findViewById(R.id.img_02);
        this.img03 = (ImageView)findViewById(R.id.img_03);
        this.img04 = (ImageView)findViewById(R.id.img_04);
        this.img05 = (ImageView)findViewById(R.id.img_05);

        //中间内容区域 ViewPager
        this.viewPager = (ViewPager)findViewById(R.id.vp_content);

        //适配器
        View page_01 = View.inflate(MainActivity.this,R.layout.page01,null);
        View page_02 = View.inflate(MainActivity.this,R.layout.page02,null);
        View page_03 = View.inflate(MainActivity.this,R.layout.page03,null);
        View page_04 = View.inflate(MainActivity.this,R.layout.page04,null);
        View page_05 = View.inflate(MainActivity.this,R.layout.page05,null);

        views = new ArrayList<View>();
        views.add(page_01);views.add(page_02);views.add(page_03);
        views.add(page_04);views.add(page_05);

        this.adapter = new ContentAdapter(views);
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onPageScrollStateChanged(int state) {
    }
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
            restartButton();
        switch (position){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;

        }
    }

    @Override
    public void onClick(View v) {
        //每次点击的时候，将所有的底部按钮颜色全部改为灰色。
        restartButton();
        switch (v.getId()){
            case R.id.lin01:
                viewPager.setCurrentItem(0);
                img01.setImageResource(R.drawable.a1_press);
                break;
            case R.id.lin02:
                viewPager.setCurrentItem(1);
                img02.setImageResource(R.drawable.a2_press);
                break;
            case R.id.lin03:
                viewPager.setCurrentItem(2);
                img03.setImageResource(R.drawable.a3_press);
                break;
            case R.id.lin04:
                viewPager.setCurrentItem(3);
                img04.setImageResource(R.drawable.a4_press);
                break;
            case R.id.lin05:
                viewPager.setCurrentItem(4);
                img05.setImageResource(R.drawable.a5_press);
                break;
            default:
                break;
        }
    }
    private void restartButton(){
            img01.setImageResource(R.drawable.a1);
            img02.setImageResource(R.drawable.a2);
            img03.setImageResource(R.drawable.a3);
            img04.setImageResource(R.drawable.a4);
            img05.setImageResource(R.drawable.a5);
    }
}
