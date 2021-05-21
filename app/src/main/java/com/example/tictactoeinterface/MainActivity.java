package com.example.tictactoeinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBtns();
    }

    private void gameLogic() {
        TextView tv =  (TextView) findViewById(R.id.turnTxtView);
        Button xoTv1 =   findViewById(R.id.xoBtn1);
        Button xoTv2 =   findViewById(R.id.xoBtn2);
        Button xoTv3 =   findViewById(R.id.xoBtn3);
        Button xoTv4 =   findViewById(R.id.xoBtn4);
        Button xoTv5 =   findViewById(R.id.xoBtn5);
        Button xoTv6 =   findViewById(R.id.xoBtn6);
        Button xoTv7 =   findViewById(R.id.xoBtn7);
        Button xoTv8 =   findViewById(R.id.xoBtn8);
        Button xoTv9 =   findViewById(R.id.xoBtn9);
        if(count >= 9){
            tv.setText("TIE");
        }
                //Diagonal 1
        if ((xoTv1.getText() == "X" && xoTv5.getText() == "X" && xoTv9.getText() == "X") ||
                // Diagonal 2
            xoTv3.getText() == "X" && xoTv5.getText() == "X" && xoTv7.getText() == "X" ||
                // Vertical 1
            xoTv1.getText() == "X" && xoTv2.getText() == "X" && xoTv3.getText() == "X" ||
                // Vertical 2
            xoTv4.getText() == "X" && xoTv5.getText() == "X" && xoTv6.getText() == "X" ||
                // Vertical 3
            xoTv7.getText() == "X" && xoTv8.getText() == "X" && xoTv9.getText() == "X" ||
                // Horizontal 1
            xoTv1.getText() == "X" && xoTv4.getText() == "X" && xoTv7.getText() == "X" ||
                // Horizontal 2
            xoTv2.getText() == "X" && xoTv5.getText() == "X" && xoTv8.getText() == "X" ||
                // Horizontal 3
            xoTv3.getText() == "X" && xoTv6.getText() == "X" && xoTv9.getText() == "X"
        ){
            tv.setText("X Wins!!");
        }else if ((xoTv1.getText() == "O" && xoTv5.getText() == "O" && xoTv9.getText() == "O") ||
                // Diagonal 2
                xoTv3.getText() == "O" && xoTv5.getText() == "O" && xoTv7.getText() == "O" ||
                // Vertical 1
                xoTv1.getText() == "O" && xoTv2.getText() == "O" && xoTv3.getText() == "O" ||
                // Vertical 2
                xoTv4.getText() == "O" && xoTv5.getText() == "O" && xoTv6.getText() == "O" ||
                // Vertical 3
                xoTv7.getText() == "O" && xoTv8.getText() == "O" && xoTv9.getText() == "O" ||
                // Horizontal 1
                xoTv1.getText() == "O" && xoTv4.getText() == "O" && xoTv7.getText() == "O" ||
                // Horizontal 2
                xoTv2.getText() == "O" && xoTv5.getText() == "O" && xoTv8.getText() == "O" ||
                // Horizontal 3
                xoTv3.getText() == "O" && xoTv6.getText() == "O" && xoTv9.getText() == "O"
        ){
            tv.setText("O Wins!!");
        }
    }

    public void newGameBtnClick(View v){
        setBtns();
        count = 0;
    }

    private void setBtns() {
        TextView tv =  (TextView) findViewById(R.id.turnTxtView);
        Button xoTv1 = findViewById(R.id.xoBtn1);
        Button xoTv2 = findViewById(R.id.xoBtn2);
        Button xoTv3 = findViewById(R.id.xoBtn3);
        Button xoTv4 = findViewById(R.id.xoBtn4);
        Button xoTv5 = findViewById(R.id.xoBtn5);
        Button xoTv6 = findViewById(R.id.xoBtn6);
        Button xoTv7 = findViewById(R.id.xoBtn7);
        Button xoTv8 = findViewById(R.id.xoBtn8);
        Button xoTv9 = findViewById(R.id.xoBtn9);
        xoTv1.setText("");
        xoTv2.setText("");
        xoTv3.setText("");
        xoTv4.setText("");
        xoTv5.setText("");
        xoTv6.setText("");
        xoTv7.setText("");
        xoTv8.setText("");
        xoTv9.setText("");
        tv.setText("Player X's Turn");
    }

    public void xoBtn1Click(View v){
        TextView tv = (TextView) findViewById(R.id.turnTxtView);
        Button xoTv1 = findViewById(R.id.xoBtn1);
        if(xoTv1.getText() == "") {
            count++;
            if (tv.getText() == "Player X's Turn") {
                xoTv1.setText("X");
                tv.setText("Player O's Turn");
            }else if (tv.getText() == "Player O's Turn") {
                xoTv1.setText("O");
                tv.setText("Player X's Turn");
            }
        }
        gameLogic();
    }
    public void xoBtn2Click(View v){
        TextView tv = (TextView) findViewById(R.id.turnTxtView);
        Button xoTv2 = findViewById(R.id.xoBtn2);
        if(xoTv2.getText() == "") {
            count++;
            if (tv.getText() == "Player X's Turn") {
                xoTv2.setText("X");
                tv.setText("Player O's Turn");
            }else if (tv.getText() == "Player O's Turn") {
                xoTv2.setText("O");
                tv.setText("Player X's Turn");
            }
        }
        gameLogic();
    }
    public void xoBtn3Click(View v){
        TextView tv = (TextView) findViewById(R.id.turnTxtView);
        Button xoTv3 = findViewById(R.id.xoBtn3);
        if(xoTv3.getText() == "") {
            count++;
            if (tv.getText() == "Player X's Turn") {
                xoTv3.setText("X");
                tv.setText("Player O's Turn");
            }else if (tv.getText() == "Player O's Turn") {
                xoTv3.setText("O");
                tv.setText("Player X's Turn");
            }
        }
        gameLogic();
    }
    public void xoBtn4Click(View v){
        TextView tv = (TextView) findViewById(R.id.turnTxtView);
        Button xoTv4 = findViewById(R.id.xoBtn4);
        if(xoTv4.getText() == "") {
            count++;
            if (tv.getText() == "Player X's Turn") {
                xoTv4.setText("X");
                tv.setText("Player O's Turn");
            }else if (tv.getText() == "Player O's Turn") {
                xoTv4.setText("O");
                tv.setText("Player X's Turn");
            }
        }
        gameLogic();
    }
    public void xoBtn5Click(View v){
        TextView tv =  (TextView) findViewById(R.id.turnTxtView);
        Button xoTv5 =   findViewById(R.id.xoBtn5);
        if(xoTv5.getText() == "") {
            count++;
            if (tv.getText() == "Player X's Turn") {
                xoTv5.setText("X");
                tv.setText("Player O's Turn");
            }else if (tv.getText() == "Player O's Turn") {
                xoTv5.setText("O");
                tv.setText("Player X's Turn");
            }
        }
        gameLogic();
    }
    public void xoBtn6Click(View v){
        TextView tv =  (TextView) findViewById(R.id.turnTxtView);
        Button xoTv6 =   findViewById(R.id.xoBtn6);
        if(xoTv6.getText() == "") {
            count++;
            if (tv.getText() == "Player X's Turn") {
                xoTv6.setText("X");
                tv.setText("Player O's Turn");
            }else if (tv.getText() == "Player O's Turn") {
                xoTv6.setText("O");
                tv.setText("Player X's Turn");
            }
        }
        gameLogic();
    }
    public void xoBtn7Click(View v){
        TextView tv =  (TextView) findViewById(R.id.turnTxtView);
        Button xoTv7 =   findViewById(R.id.xoBtn7);
        if(xoTv7.getText() == "") {
            count++;
            if (tv.getText() == "Player X's Turn") {
                xoTv7.setText("X");
                tv.setText("Player O's Turn");
            }else if (tv.getText() == "Player O's Turn") {
                xoTv7.setText("O");
                tv.setText("Player X's Turn");
            }
        }
        gameLogic();
    }
    public void xoBtn8Click(View v){
        TextView tv =  (TextView) findViewById(R.id.turnTxtView);
        Button xoTv8 =   findViewById(R.id.xoBtn8);
        if(xoTv8.getText() == "") {
            count++;
            if (tv.getText() == "Player X's Turn") {
                xoTv8.setText("X");
                tv.setText("Player O's Turn");
            }else if (tv.getText() == "Player O's Turn") {
                xoTv8.setText("O");
                tv.setText("Player X's Turn");
            }
        }
        gameLogic();
    }
    public void xoBtn9Click(View v){
        TextView tv =  (TextView) findViewById(R.id.turnTxtView);
        Button xoTv9 =   findViewById(R.id.xoBtn9);
        if(xoTv9.getText() == "") {
            count++;
            if (tv.getText() == "Player X's Turn") {
                xoTv9.setText("X");
                tv.setText("Player O's Turn");
            }else if (tv.getText() == "Player O's Turn") {
                xoTv9.setText("O");
                tv.setText("Player X's Turn");
            }
        }
        gameLogic();
    }
}