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



//月(年)が変わった時のデータ取得方法
//→ 前回ログインしたときの月(month)が保存できれば...！！


List beforeDate=new ArrayList();
beforeDate.add(month);



public class monthChecker extends AppCompatActivity{

  public static void main(String[] args){
    
  
    //日付取得
    public int getCalender(){
      Calender cal = Calender.getInstance(); //カレンダーオブジェクトを生成
      //System.out.println(calender.getTime().toString());
      
      int month=cal.get(Calender.YEAR); //月を取得
      int date=cal.get(Calender.MONTH); //日にちを取得
      
      return month;
    }
    
    
    public 
}
