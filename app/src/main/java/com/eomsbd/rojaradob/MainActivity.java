package com.eomsbd.rojaradob;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.eomsbd.rojaradob.R;

import java.util.List;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private final static String TAG_FRAGMENT = "TAG_FRAGMENT";

    private Button button1;
    Button tips1;
    Button tips2;
    Button tips3;
    Button tips4;
    Button tips5;


    private FrameLayout fragmentContiner;
    TextView layout;
    ScrollView constraintLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.container);
        tips1 = (Button) findViewById(R.id.btn1);
        tips2 = (Button) findViewById(R.id.btn2);
        tips3 = (Button) findViewById(R.id.btn3);
        tips4 = (Button) findViewById(R.id.btn4);
        tips5 = (Button) findViewById(R.id.btn5);


        tips1.setOnClickListener(this);
        tips2.setOnClickListener(this);
        tips3.setOnClickListener(this);
        tips4.setOnClickListener(this);
        tips5.setOnClickListener(this);

    }





    @Override
    public void onBackPressed() {
        tellFragments();
        super.onBackPressed();

    }


    private void tellFragments() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        for (Fragment f : fragments) {
             if (f != null && f instanceof Tips1_Fragment) {
                ((Tips1_Fragment) f).onBackPressed();
            } else if (f != null && f instanceof Tips2_Fragment) {
                ((Tips2_Fragment) f).onBackPressed();
            } else if (f != null && f instanceof Tips3_Fragment) {
                ((Tips3_Fragment) f).onBackPressed();
            } else if (f != null && f instanceof Tips4_Fragment) {
                ((Tips4_Fragment) f).onBackPressed();
            } else if (f != null && f instanceof Tips5_Fragment) {
                ((Tips5_Fragment) f).onBackPressed();
            }

        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btn1) {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            Tips1_Fragment fragment = new Tips1_Fragment();
            transaction.add(R.id.frame, fragment).commit();
            constraintLayout.setVisibility(View.GONE);

        } else if (id == R.id.btn2) {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            Tips2_Fragment fragment = new Tips2_Fragment();
            transaction.add(R.id.frame, fragment).commit();
            constraintLayout.setVisibility(View.GONE);

        } else if (id == R.id.btn3) {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            Tips3_Fragment fragment = new Tips3_Fragment();
            transaction.add(R.id.frame, fragment).commit();
            constraintLayout.setVisibility(View.GONE);

        } else if (id == R.id.btn4) {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            Tips4_Fragment fragment = new Tips4_Fragment();
            transaction.add(R.id.frame, fragment).commit();
            constraintLayout.setVisibility(View.GONE);

        } else if (id == R.id.btn5) {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            Tips5_Fragment fragment = new Tips5_Fragment();
            transaction.add(R.id.frame, fragment).commit();
            constraintLayout.setVisibility(View.GONE);

        }
    }




}

