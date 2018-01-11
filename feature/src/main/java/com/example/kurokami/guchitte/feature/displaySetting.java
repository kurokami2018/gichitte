package com.example.kurokami.guchitte.feature;

import android.os.Bundle;

//ボタンがタップされた時、説明画面が開く
public class displaySetting extends MainActivity{

    //activity_main.xml(つぶやき画面)から移動するためのコード
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }

    displaySetting(){

    }
    void tapGetter_S(){
        //画面がタップされた時説明画面が開く

    }
    void tapGetter_C(){
        //画面がタップされた時説明画面が閉じる

    }
}

