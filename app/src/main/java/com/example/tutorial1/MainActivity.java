package com.example.tutorial1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;

import java.util.concurrent.CountedCompleter;

public class MainActivity extends AppCompatActivity {
    private MainActivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         binding = MainActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new homeFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){
                case R.id.home:
                    replaceFragment(new homeFragment());
                    break;
                case R.id.event:
                    replaceFragment(new eventFragment());
                    break;
            }
            return true;
        });

    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout,fragment);
        fragmentTransaction.commit();
    }

    private static class MainActivityBinding {
        public AlertDialog.Builder bottomNavigationView;

        public static MainActivityBinding inflate(LayoutInflater layoutInflater) {
            return null;
        }

        public int getRoot() {
            return 0;
        }
    }
}