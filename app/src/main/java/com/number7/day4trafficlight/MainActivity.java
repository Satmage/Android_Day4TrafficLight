package com.number7.day4trafficlight;

import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout constraintLayout;
    private TextView mInfoColorText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.constraintLayout);
        mInfoColorText = findViewById(R.id.textViewGetColor);
    }

    public void onClickRedButton(View view) {
        mInfoColorText.setText(R.string.button_red);
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.colorRed));
    }

    public void onClickYellowButton(View view) {
        mInfoColorText.setText(R.string.button_yellow);
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.colorYellow));
    }

    // API 23+: getResources().getColor()
    public void onClickGreenButton(View view) {
        mInfoColorText.setText(R.string.button_green);
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.colorGreen));
    }

    // universal method: ContextCompat.getColor()
    public void onClickReturnButton(View view) {
        mInfoColorText.setText(R.string.text_get_color);
        constraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.colorKoral));
    }
}
