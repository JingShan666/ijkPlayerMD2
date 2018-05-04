package com.example.administrator.ijkplayermd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button startPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startPlay= findViewById(R.id.startPlay);

        startPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity.this,PlayActivity.class);

                intent.putExtra("url","http://hot.vrs.sohu.com/ipad4705933_4736733202872_7916254.m3u8?plat=6uid=3fea22150c594145a20b2526c33e1ea3&pt=5&prod=app&pg=1");
                intent.putExtra("title","魔都风云第1集");
                intent.putExtra("type",0);


                startActivity(intent);



            }
        });
    }
}
