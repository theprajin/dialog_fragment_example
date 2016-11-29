package com.infotechnocation.dialoguefragments;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.infotechnocation.dialoguefragments.fragments.DialogueFragment;
import com.infotechnocation.dialoguefragments.fragments.LoginFragment;
import com.infotechnocation.dialoguefragments.fragments.OnCompleteDismissListener;
import com.infotechnocation.dialoguefragments.fragments.RegisterFragment;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, OnCompleteDismissListener {
    Button btnlogin;
    Button btnregister;
    Button btndig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin = (Button) findViewById(R.id.btnlog1);
        btnregister = (Button) findViewById(R.id.btnreg1);
        btndig = (Button) findViewById(R.id.btndig);
        btnlogin.setOnClickListener(this);
        btnregister.setOnClickListener(this);
        btndig.setOnClickListener(this);
        ShowLoginFragment();
    }

    private void ShowLoginFragment() {
        //FragmentManager fragmentManager=getSupportFragmentManager();
        //FragmentTransaction fragmnetTransation=fragmentManager.beginTransaction();
        //FragmentManager replace(R.id.frame_Layout)


        getSupportFragmentManager().beginTransaction().replace(R.id.fl1, new LoginFragment()).commit();
    }

    public void ShowRegisterFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fl1, new RegisterFragment()).commit();

    }

    public void ShowDialog() {
        FragmentManager manager = getSupportFragmentManager();
        DialogueFragment myDialog = new DialogueFragment();
        /*myDialog.setmOnCompleteDismissListener(new OnCompleteDismissListener() {
            @Override
            public void getText(String email, String password) {
                Toast.makeText(MainActivity.this, email + "  " + password, Toast.LENGTH_SHORT).show();
            }
        });*/
        myDialog.show(manager, "MyDialog");


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnlog1:
                ShowLoginFragment();
                break;

            case R.id.btnreg1:
                ShowRegisterFragment();
                break;

            case R.id.btndig:
                ShowDialog();
                break;

        }

    }

    @Override
    public void getText(String email, String password) {

        Toast.makeText(MainActivity.this, email + "  " + password, Toast.LENGTH_SHORT).show();

    }
}