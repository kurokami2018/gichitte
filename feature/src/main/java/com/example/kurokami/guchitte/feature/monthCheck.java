package com.example.kurokami.guchitte.feature;
import android.content.Context;
import android.widget.ImageView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.AppLaunchChecker;
import com.google.gson.Gson;
import android.content.SharedPreferences;

import java.util.Calendar;//日付の操作・計算などを扱うクラス
import java.util.List;
import com.google.gson.reflect.TypeToken;

//月(年)が変わった時のデータ取得方法
//→ 前回ログインしたときの月(month)が保存できれば...！！

/*
List beforeDate=new ArrayList();
beforeDate.add(month);
*/

public class monthCheck extends MainActivity {

  public static void getCalender(Calendar cal) {
    //System.out.println(calender.getTime().toString());

    int year = cal.get(Calendar.YEAR); //年を取得
    int month = cal.get(Calendar.MONTH)+1; //月を取得
    int day = cal.get(Calendar.DATE);//日を取得
    //return文どうすればいい？


  }
}

