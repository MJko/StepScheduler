package mj.stepscheduler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class App_Main_Activity extends Activity implements View.OnClickListener {


    @Override   //extends Activity를 해서 Activity 안에 들어있는 onCreate를 재정의
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_main_activity);

        //버튼 정의
        Button wishlist_btn = (Button)findViewById(R.id.wishlist_btn);
        Button todolist_btn = (Button)findViewById(R.id.todolist_btn);
        Button calenar_btn = (Button)findViewById(R.id.calendar_btn);
        Button specialday_btn = (Button)findViewById(R.id.specialday_btn);
        Button timetable_btn = (Button)findViewById(R.id.timetable_btn);
        Button setting_btn = (Button)findViewById(R.id.setting_btn);

        //각 버튼의 setOnClickListener안의 onClick 메소드를 'this'(현재) class의 onClick으로 set함
        wishlist_btn.setOnClickListener(this);
        todolist_btn.setOnClickListener(this);
        calenar_btn.setOnClickListener(this);
        specialday_btn.setOnClickListener(this);
        timetable_btn.setOnClickListener(this);
        setting_btn.setOnClickListener(this);

    }

    //Class선언에서 implement 부분에 View.OnClickListener의 onclick 메소드 재정의

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.wishlist_btn :
                Intent wishintent = new Intent(App_Main_Activity.this, WishList_Main_Activity.class);
                startActivity(wishintent);
                break;
            case R.id.todolist_btn:
                Intent todointent = new Intent(App_Main_Activity.this, TodoList_Main_Activity.class);
                startActivity(todointent);
                break;
            case R.id.calendar_btn:
                Intent calintent = new Intent(App_Main_Activity.this, Calendar_Main_Activity.class);
                startActivity(calintent);
                break;
            case R.id.specialday_btn:
                Intent specialintent = new Intent(App_Main_Activity.this, SpecialDay_Main_Activity.class);
                startActivity(specialintent);
                break;
            case R.id.timetable_btn:
                Intent timeintent = new Intent(App_Main_Activity.this, TimeTable_Main_Activity.class);
                startActivity(timeintent);
                break;
            case R.id.setting_btn:
                Intent setintent = new Intent(App_Main_Activity.this, Setting_Main_Activity.class);
                startActivity(setintent);
                break;
        }
    }
}
