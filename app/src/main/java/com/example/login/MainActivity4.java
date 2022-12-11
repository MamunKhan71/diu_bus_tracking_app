package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         requestWindowFeature(1);
         getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS );

         if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
              getWindow().setStatusBarColor(Color.TRANSPARENT);
         };
        setContentView(R.layout.activity_main4);

        Intent intent=getIntent();
        String s=intent.getStringExtra("pass");
        TextView tv1=findViewById(R.id.tv1);
        tv1.setGravity(Gravity.CENTER);
        String design = "\n---------------------------\n";
        String bus_info = "\nBus: Rajanigandha 1\nTime: 11PM";
        String pre_text = "\nYour seat has been confirmed! \n"+design+"Seat No:";
        int newValue = Integer.parseInt(s);
        if (newValue==1||newValue==11) {tv1.setText(pre_text+" A"+s+bus_info+design);}
        if (newValue==2||newValue==12) {tv1.setText(pre_text+" B"+s+bus_info+design);}
        if (newValue==3||newValue==13) {tv1.setText(pre_text+" C"+s+bus_info+design);}
        if (newValue==4||newValue==14) {tv1.setText(pre_text+" D"+s+bus_info+design);}
        if (newValue==5||newValue==15) {tv1.setText(pre_text+" E"+s+bus_info+design);}
        if (newValue==6||newValue==16) {tv1.setText(pre_text+" F"+s+bus_info+design);}
        if (newValue==7||newValue==17) {tv1.setText(pre_text+" G"+s+bus_info+design);}
        if (newValue==8||newValue==18) {tv1.setText(pre_text+" H"+s+bus_info+design);}
        if (newValue==9||newValue==19) {tv1.setText(pre_text+" I"+s+bus_info+design);}
        if (newValue==10||newValue==20) {tv1.setText(pre_text+" J"+s+bus_info+design);}
        if (newValue==21||newValue==31) {tv1.setText(pre_text+" K"+s+bus_info+design);}
        if (newValue==22||newValue==32) {tv1.setText(pre_text+" L"+s+bus_info+design);}
        if (newValue==23||newValue==33) {tv1.setText(pre_text+" M"+s+bus_info+design);}
        if (newValue==24||newValue==34) {tv1.setText(pre_text+" N"+s+bus_info+design);}
        if (newValue==25||newValue==35) {tv1.setText(pre_text+" O"+s+bus_info+design);}
        if (newValue==26||newValue==36) {tv1.setText(pre_text+" P"+s+bus_info+design);}
        if (newValue==27||newValue==37) {tv1.setText(pre_text+" Q"+s+bus_info+design);}
        if (newValue==28||newValue==38) {tv1.setText(pre_text+" R"+s+bus_info+design);}
        if (newValue==29||newValue==39) {tv1.setText(pre_text+" S"+s+bus_info+design);}
        if (newValue==30||newValue==40) {tv1.setText(pre_text+" T"+s+bus_info+design);}


        
    }
}