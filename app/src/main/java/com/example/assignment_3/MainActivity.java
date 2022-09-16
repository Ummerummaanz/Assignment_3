package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn_Toast;
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=(TextView) findViewById(R.id.showcount);
        btn_Toast = (Button)findViewById(R.id.button_toast);
    }

    public void showToast(View view) {

       // Toast toast = Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT);
        //toast.show();
        String msg = "Hello!";
        int duration =Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this,msg,duration);
        String count = mShowCount.getText().toString();
        Intent intent = new Intent(this,HomeActivity.class);
        intent.putExtra("nkey",msg);
        intent.putExtra("ckey",count);

        startActivity(intent);




    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));

        }
    }
}