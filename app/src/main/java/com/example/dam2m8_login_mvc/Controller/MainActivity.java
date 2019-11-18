package com.example.dam2m8_login_mvc.Controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.dam2m8_login_mvc.Model.Usuario;
import com.example.dam2m8_login_mvc.R;
import com.example.dam2m8_login_mvc.View.LoginFragment;

public class MainActivity extends AppCompatActivity implements LoginFragment.LoginListener {

    Usuario user1;
    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user1 = new Usuario("juan", "solo");

        //Cargar la Vista adecuada
        fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.fragment_container, new LoginFragment()).commit();




    }

    @Override
    public Boolean checkLogin(String user, String passwd) {

        if(user.equals(user1.getUsername()) && passwd.equals(user1.getPassword())){
            return true;
        }

        return false;
    }
}
