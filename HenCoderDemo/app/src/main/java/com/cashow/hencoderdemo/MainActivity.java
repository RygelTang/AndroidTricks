package com.cashow.hencoderdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cashow.hencoderdemo.chapter_1_1.Chapter_1_1_Activity;
import com.cashow.hencoderdemo.chapter_1_2.Chapter_1_2_Activity;
import com.cashow.hencoderdemo.chapter_1_3.Chapter_1_3_Activity;
import com.cashow.hencoderdemo.chapter_1_4.Chapter_1_4_Activity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        onChapter4Click();
    }

    @OnClick(R.id.button_chapter_1)
    void onChapter1Click() {
        startActivity(new Intent(this, Chapter_1_1_Activity.class));
    }

    @OnClick(R.id.button_chapter_2)
    void onChapter2Click() {
        startActivity(new Intent(this, Chapter_1_2_Activity.class));
    }

    @OnClick(R.id.button_chapter_3)
    void onChapter3Click() {
        startActivity(new Intent(this, Chapter_1_3_Activity.class));
    }

    @OnClick(R.id.button_chapter_4)
    void onChapter4Click() {
        startActivity(new Intent(this, Chapter_1_4_Activity.class));
    }
}
