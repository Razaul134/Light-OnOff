package com.example.lightapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
        private  Switch switch_VW;
        private TextView TextView_SHTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch_VW = findViewById(R.id.switch_VW);
        TextView_SHTV = findViewById(R.id.TextView_SHTV);

        initialization();
        switch_VW();

    }

    private void switch_VW() {
        new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this, "light is on", Toast.LENGTH_SHORT).show();
                    TextView_SHTV.setVisibility(View.VISIBLE);
                }
                else {
                    Toast.makeText(MainActivity.this, "light is off", Toast.LENGTH_SHORT).show();
                    TextView_SHTV.setVisibility(View.GONE);
                }
            }
        };
    }

    private void initialization() {
        switch_VW = findViewById(R.id.switch_VW);
        TextView_SHTV = findViewById(R.id.TextView_SHTV);


    }
}

/*





         switch_VW.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if (b) {
                    Toast.makeText(MainActivity.this, "灯开了!!!", Toast.LENGTH_SHORT).show();
                    TextView_SHTV.setVisibility(View.VISIBLE);

                } else {
                    Toast.makeText(MainActivity.this, "灯关了!!!", Toast.LENGTH_SHORT).show();
                    TextView_SHTV.setVisibility(View.GONE);
                }
            }
        });
        }*/