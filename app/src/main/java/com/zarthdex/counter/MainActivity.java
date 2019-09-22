package com.zarthdex.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int PointA = 0;

    public void clickThreePointA(View view){
        PointA = PointA + 3;
        displayThreePointA(PointA);
    }

    private void displayThreePointA(int setPointA){
        TextView label = (TextView)findViewById(R.id.pointA);
        label.setText(setPointA);
    }

}
