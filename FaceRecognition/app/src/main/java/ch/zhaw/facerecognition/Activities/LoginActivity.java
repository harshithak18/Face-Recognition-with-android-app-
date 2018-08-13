package ch.zhaw.facerecognition.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;
import ch.zhaw.facerecognition.R;


public class LoginActivity extends AppCompatActivity {
    private static EditText UserName;
    private static EditText Password;
    private static TextView login;
    private static Button login_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginButton();
    }
    public void LoginButton() {
        UserName = (EditText) findViewById(R.id.editText);
        Password = (EditText) findViewById(R.id.editText2);

        login_button = (Button) findViewById(R.id.button);


        login_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(UserName.getText().toString().equals("cit") && Password.getText().toString().equals("1234")){
                            Toast.makeText(LoginActivity.this, "Username and password is correct",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                            startActivity(intent);

                        } else {
                            Toast.makeText(LoginActivity.this, "Username and password is NOT correct",
                                    Toast.LENGTH_SHORT).show();

                        }
                    }
                }
        );
    }
}
