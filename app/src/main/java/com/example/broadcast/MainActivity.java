package com.example.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        LocalBroadcastManager.getInstance(this).registerReceiver(receiver,
                new IntentFilter("action"));
    }

    @Override
    protected void onPause() {
        super.onPause();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(receiver);
    }

    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int num = intent.getIntExtra("numFrag", 1);
            Toast.makeText(getApplication(),"Фрагмент  " + num, Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment0 = new Frag1();
        Fragment fragment1 = new Frag2();
        Fragment fragment2 = new Frag3();
        Fragment fragment3 = new Frag4();
        Fragment fragment4 = new Frag5();
        Fragment fragment5 = new Frag6();
        Fragment fragment6 = new Frag7();
        Fragment fragment7 = new Frag8();
        Fragment fragment8 = new Frag9();
        Fragment fragment9 = new Frag10();
        Fragment fragment10 = new Frag11();
        Fragment fragment11 = new Frag12();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout0, fragment0)
                .replace(R.id.frameLayout1, fragment1)
                .replace(R.id.frameLayout2, fragment2)
                .replace(R.id.frameLayout3, fragment3)
                .replace(R.id.frameLayout4, fragment4)
                .replace(R.id.frameLayout5, fragment5)
                .replace(R.id.frameLayout6, fragment6)
                .replace(R.id.frameLayout7, fragment7)
                .replace(R.id.frameLayout8, fragment8)
                .replace(R.id.frameLayout9, fragment9)
                .replace(R.id.frameLayout10, fragment10)
                .replace(R.id.frameLayout11, fragment11)
                .commit();


    }
}
