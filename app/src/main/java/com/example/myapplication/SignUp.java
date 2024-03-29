package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void sign_up(View view){
        EditText email = findViewById(R.id.editTextTextEmailAddress1);
        EditText password = findViewById(R.id.editTextTextPassword1);

        String email1 = email.getText().toString();
        String password1 = password.getText().toString();

        Intent intent = new Intent(this, SignIn.class);
        intent.putExtra("email", email1);
        intent.putExtra("password", password1);
        startActivity(intent);


    }

    public void back(View view) {
        Intent intent = new Intent(SignUp.this, SignIn.class);
        SignUp.this.startActivity(intent);


}
}