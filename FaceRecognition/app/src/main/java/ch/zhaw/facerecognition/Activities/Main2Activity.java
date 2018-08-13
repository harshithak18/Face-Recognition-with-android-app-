package ch.zhaw.facerecognition.Activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ch.zhaw.facerecognition.R;

public class Main2Activity extends AppCompatActivity {
    private static  Button button_sbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        onClickButtonListner();
        onClickButton1Listner();
    }

    public void onClickButtonListner () {
        button_sbm = (Button) findViewById(R.id.login);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Main2Activity.this,Faculty.class);
                        startActivity(intent);
                    }
                }
        );

    }
    public void onClickButton1Listner () {
        button_sbm = (Button) findViewById(R.id.admin);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Main2Activity.this, LoginActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
    public void browser1(View view){
            Intent browser1intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cittumkur.org/"));
            startActivity(browser1intent);
        }



}
