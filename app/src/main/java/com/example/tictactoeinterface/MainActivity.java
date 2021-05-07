package com.example.tictactoeinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newGameBtnClick(View v){
        TextView tv =  (TextView) findViewById(R.id.turnTxtView);
        Button xoTv1 =   findViewById(R.id.xoBtn1);
        xoTv1.setText("");
        Button xoTv2 =   findViewById(R.id.xoBtn2);
        xoTv2.setText("");
        Button xoTv3 =   findViewById(R.id.xoBtn3);
        xoTv3.setText("");
        Button xoTv4 =   findViewById(R.id.xoBtn4);
        xoTv4.setText("");
        Button xoTv5 =   findViewById(R.id.xoBtn5);
        xoTv5.setText("");
        Button xoTv6 =   findViewById(R.id.xoBtn6);
        xoTv6.setText("");
        Button xoTv7 =   findViewById(R.id.xoBtn7);
        xoTv7.setText("");
        Button xoTv8 =   findViewById(R.id.xoBtn8);
        xoTv8.setText("");
        Button xoTv9 =   findViewById(R.id.xoBtn9);
        xoTv9.setText("");
        tv.setText("Player X's Turn");
    }

    public void xoBtn1Click(View v){
        TextView tv =  (TextView) findViewById(R.id.turnTxtView);
        Button xoTv1 =   findViewById(R.id.xoBtn1);
        if(xoTv1.getText() == "") {
            if (tv.getText() == "Player X's Turn") {
                xoTv1.setText("X");
                tv.setText("Player O's Turn");
            } else {
                xoTv1.setText("O");
                tv.setText("Player X's Turn");
            }
        }
    }
    public void xoBtn2Click(View v){
        TextView tv =  (TextView) findViewById(R.id.turnTxtView);
        Button xoTv2 =   findViewById(R.id.xoBtn2);
        if(xoTv2.getText() == "") {
            if (tv.getText() == "Player X's Turn") {
                xoTv2.setText("X");
                tv.setText("Player O's Turn");
            } else {
                xoTv2.setText("O");
                tv.setText("Player X's Turn");
            }
        }
    }
    public void xoBtn3Click(View v){
        TextView tv =  (TextView) findViewById(R.id.turnTxtView);
        Button xoTv3 =   findViewById(R.id.xoBtn3);
        if(xoTv3.getText() == "") {
            if (tv.getText() == "Player X's Turn") {
                xoTv3.setText("X");
                tv.setText("Player O's Turn");
            } else {
                xoTv3.setText("O");
                tv.setText("Player X's Turn");
            }
        }
    }
    public void xoBtn4Click(View v){
        TextView tv =  (TextView) findViewById(R.id.turnTxtView);
        Button xoTv4 =   findViewById(R.id.xoBtn4);
        if(xoTv4.getText() == "") {
            if (tv.getText() == "Player X's Turn") {
                xoTv4.setText("X");
                tv.setText("Player O's Turn");
            } else {
                xoTv4.setText("O");
                tv.setText("Player X's Turn");
            }
        }
    }
    public void xoBtn5Click(View v){
        TextView tv =  (TextView) findViewById(R.id.turnTxtView);
        Button xoTv5 =   findViewById(R.id.xoBtn5);
        if(xoTv5.getText() == "") {
            if (tv.getText() == "Player X's Turn") {
                xoTv5.setText("X");
                tv.setText("Player O's Turn");
            } else {
                xoTv5.setText("O");
                tv.setText("Player X's Turn");
            }
        }
    }
    public void xoBtn6Click(View v){
        TextView tv =  (TextView) findViewById(R.id.turnTxtView);
        Button xoTv6 =   findViewById(R.id.xoBtn6);
        if(xoTv6.getText() == "") {
            if (tv.getText() == "Player X's Turn") {
                xoTv6.setText("X");
                tv.setText("Player O's Turn");
            } else {
                xoTv6.setText("O");
                tv.setText("Player X's Turn");
            }
        }
    }
    public void xoBtn7Click(View v){
        TextView tv =  (TextView) findViewById(R.id.turnTxtView);
        Button xoTv7 =   findViewById(R.id.xoBtn7);
        if(xoTv7.getText() == "") {
            if (tv.getText() == "Player X's Turn") {
                xoTv7.setText("X");
                tv.setText("Player O's Turn");
            } else {
                xoTv7.setText("O");
                tv.setText("Player X's Turn");
            }
        }
    }
    public void xoBtn8Click(View v){
        TextView tv =  (TextView) findViewById(R.id.turnTxtView);
        Button xoTv8 =   findViewById(R.id.xoBtn8);
        if(xoTv8.getText() == "") {
            if (tv.getText() == "Player X's Turn") {
                xoTv8.setText("X");
                tv.setText("Player O's Turn");
            } else {
                xoTv8.setText("O");
                tv.setText("Player X's Turn");
            }
        }
    }
    public void xoBtn9Click(View v){
        TextView tv =  (TextView) findViewById(R.id.turnTxtView);
        Button xoTv9 =   findViewById(R.id.xoBtn9);
        if(xoTv9.getText() == "") {
            if (tv.getText() == "Player X's Turn") {
                xoTv9.setText("X");
                tv.setText("Player O's Turn");
            } else {
                xoTv9.setText("O");
                tv.setText("Player X's Turn");
            }
        }
    }
}