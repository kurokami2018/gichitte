package com.example.kurokami.guchitte.feature;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

import static android.support.v4.app.AppLaunchChecker.hasStartedFromLauncher;
import static android.support.v4.app.AppLaunchChecker.onActivityCreate;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //月間画面に移動
        Button monthButton = (Button)findViewById(R.id.monthButton);
        monthButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.kurokami.guchitte.feature", "com.example.kurokami.guchitte.feature.monthly");
                startActivity(intent);
            }
        });

        Button settingButton = (Button)findViewById(R.id.settingButton);
        settingButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.kurokami.guchitte.feature", "com.example.kurokami.guchitte.feature.displaySetting");
                startActivity(intent);
            }
        });

        //呟く
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                TextView textView = (TextView) findViewById(R.id.textView);
                AlphaAnimation fadein_image = new AlphaAnimation(0.0f, 1.0f);
                fadein_image.setDuration(1000);
                inputMessage.inputMessage(editText,textView);
            }
        });

    }


    public void main( String[] args ){
        forBeginner();//アプリを初回起動の時だけ出てくる説明画像を表示する

        //インスタンス生成
        int gruCounter;//愚痴カウンタ、保存される必要あり
        int month=monthCheck.getCalender();//今月が何月なのか取得、毎回取得保存する必要なし。適当な名前なのであとで直す

        Gson gson = new Gson();
        //ファイル(data)から各月のデータを取得してリストを作成する
        SharedPreferences sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);

        ArrayList<Integer> jan_list = new ArrayList<Integer>();//1月のデータArrayリストのインスタンス生成
        List jan = gson.fromJson(sharedPreferences.getString("jan_data", null), new TypeToken<List>(){}.getType());

        ArrayList<Integer> feb_list = new ArrayList<Integer>();//2月
        List feb = gson.fromJson(sharedPreferences.getString("feb_data", null), new TypeToken<List>(){}.getType());

        ArrayList<Integer> mar_list = new ArrayList<Integer>();//3月
        List mar = gson.fromJson(sharedPreferences.getString("mar_data", null), new TypeToken<List>(){}.getType());

        ArrayList<Integer> apr_list = new ArrayList<Integer>();//4月
        List apr = gson.fromJson(sharedPreferences.getString("apr_data", null), new TypeToken<List>(){}.getType());

        ArrayList<Integer> may_list = new ArrayList<Integer>();//5月
        List may = gson.fromJson(sharedPreferences.getString("may_data", null), new TypeToken<List>(){}.getType());

        ArrayList<Integer> jun_list = new ArrayList<Integer>();//6月
        List jun = gson.fromJson(sharedPreferences.getString("jun_data", null), new TypeToken<List>(){}.getType());

        ArrayList<Integer> jul_list = new ArrayList<Integer>();//7月
        List jul = gson.fromJson(sharedPreferences.getString("jul_data", null), new TypeToken<List>(){}.getType());

        ArrayList<Integer> aug_list = new ArrayList<Integer>();//8月
        List aug = gson.fromJson(sharedPreferences.getString("aug_data", null), new TypeToken<List>(){}.getType());

        ArrayList<Integer> sep_list = new ArrayList<Integer>();//9月
        List sep = gson.fromJson(sharedPreferences.getString("sep_data", null), new TypeToken<List>(){}.getType());

        ArrayList<Integer> oct_list = new ArrayList<Integer>();//10月
        List oct = gson.fromJson(sharedPreferences.getString("oct_data", null), new TypeToken<List>(){}.getType());

        ArrayList<Integer> nov_list = new ArrayList<Integer>();//11月
        List nov = gson.fromJson(sharedPreferences.getString("nov_data", null), new TypeToken<List>(){}.getType());

        ArrayList<Integer> dec_list = new ArrayList<Integer>();//12月
        List dec = gson.fromJson(sharedPreferences.getString("dec_data", null), new TypeToken<List>(){}.getType());

        int colorNumber=bottleMaker.gruConterChecker(this.gruCounter);
        if(colorNumber!=0)this.gruCounter=0;
        else{
            //colorNumberをリストに追加する
            Gson gson=new Gson();
            String key;String list;
            if(month==1){key="jan_data";list="jan";}
            if(this.month==2){key="feb_data";list="feb";}
            if(this.month==3){key="mar_data";list="mar";}
            if(this.month==4){key="apr_data";list="apr";}
            if(this.month==5){key="may_data";list="may";}
            if(this.month==6){key="jun_data";list="jun";}
            if(this.month==7){key="jul_data";list="jul";}
            if(this.month==8){key="aug_data";list="aug";}
            if(this.month==9){key="sep_data";list="sep";}
            if(this.month==10){key="oct_data";list="oct";}
            if(this.month==11){key="nov_data";list="nov";}
            if(this.month==12){key="dec_data";list="dec";}

            SharedPreferences sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
            List list = gson.fromJson(sharedPreferences.getString(key, null), new TypeToken<List>(){}.getType());
            list.add(colorNumber);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("data", gson.toJson(list));
            editor.apply();
        }

    }

    public void forBeginner() {
        boolean before = hasStartedFromLauncher(getApplicationContext());onActivityCreate(this);
        if (before == false) {
            ImageView imageView = new ImageView(this);//表示する場所と思われるthisか？
            imageView.setImageResource(res.drawable.scene_1);
            setContentView(imageView);
            //ファイル名わかったら書き換えること

            //タップされたら画面を閉じるみたいな機能をつけて完了のはず
        }
    }
}
