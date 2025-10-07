package com.example.lab04;

import android.os.Bundle;
import android.view.MotionEvent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int[] ids;
    int count = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ids = new int[]{R.layout.layout1,R.layout.layout2,R.layout.layout3,R.layout.layout4,R.layout.layout5,R.layout.layout6,R.layout.layout7};

        }
        public boolean onTouchEvent(MotionEvent event){
        if(event.getAction()==MotionEvent.ACTION_DOWN){
            count=(++count)%ids.length;
            setContentView(ids[count]);
        }
            return true;
        }
    }
