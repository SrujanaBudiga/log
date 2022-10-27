package com.example.log;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.log.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText pas,usr;
    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        usr = (EditText) findViewById(R.id.username);
        pas = (EditText) findViewById(R.id.password);
    }

    public void loginBtn(View view){
        String user = usr.getText().toString();
        String pass = pas.getText().toString();

        background bg = new background(this);
        bg.execute(user,pass);

    }
}