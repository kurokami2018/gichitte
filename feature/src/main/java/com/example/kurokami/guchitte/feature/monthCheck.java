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

/*
月(年)が変わった時のデータ取得方法 → 前回ログインしたときの月(month)が保存できれば...！！
[ログインするたびにmonth(月)を保存する。
次にログインした時に保存してあったmonthとその日に保存したmonthが違っていたら愚痴カウンターを0に(12月→1月のみ例外、白紙にする)。
同じだったら呟く画面を表示。]
※白紙にする=背景画像を挿入する
*/

/*
List beforeDate=new ArrayList();
beforeDate.add(month); わからん
*/

public class monthCheck extends MainActivity {

  public static int getCalender(Calendar cal) {

    int year = cal.get(Calendar.YEAR); //年を取得
    int month = cal.get(Calendar.MONTH)+1; //月を取得
    int day = cal.get(Calendar.DATE);//日を取得
    //return文どうすればいい？


  }
  
  

  
  public static void main(String[] args){
    
    int pastmonth; //仮に最終ログイン月をpastmonthとする
    
    if(pastmonth!=month){
      if(month==1){/*月間初期画面を表示する*/
                    /*愚痴回数カウンターを0にするメソッド*/
      }else{/*愚痴回数カウンタを0にするメソッド*/}};
    
    if(pastmonth==month){/*呟く画面を表示*/};
    
  }

}
