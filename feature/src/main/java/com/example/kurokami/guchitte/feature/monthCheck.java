package com.example.kurokami.guchitte.feature;
import android.content.Context;
import android.widget.ImageView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.AppLaunchChecker;
import com.google.gson.Gson;
import android.content.SharedPreferences;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.util.Calender; //日付の操作・計算などを扱うクラス


public class monthChecker extends AppCompatActivity{

  public static void main(String[] args){
  
    //日付取得
    public int getCalender
      Calender cal = Calender.getInstance(); //カレンダーオブジェクトを生成
      //System.out.println(calender.getTime().toString());
      
      int month=cal.get(Calender.YEAR); //月を取得
      int date=cal.get(Calender.MONTH); //日にちを取得
      //return文どうすればいい？
      
      if(month==1){//月間画面を白紙に戻す？};
      
      if(date==1){//愚痴カウンターを0にする}else{
      
      //愚痴カウンターを1増やす};
      
      /*
      つぶやく画面を表示するコード
      */
 }
