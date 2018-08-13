package ch.zhaw.facerecognition.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;


import ch.zhaw.facerecognition.R;
import ch.zhaw.facerecognitionlibrary.Helpers.FileHelper;

public class Faculty extends AppCompatActivity {
    private static Button callRecognition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);

        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
        FileHelper fh = new FileHelper();


        Button callRecognition = (Button) findViewById(R.id.button_recognition_view);
        if (!((new File(fh.DATA_PATH)).exists())) callRecognition.setEnabled(false);
        callRecognition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), RecognitionActivity.class));
            }
        });

    }



}
