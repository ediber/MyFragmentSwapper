package com.edi.myfragmentswapper;

import android.app.PendingIntent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.edi.myfragmentswapper.fragments.Fragment1;
import com.edi.myfragmentswapper.fragments.Fragment2;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "-edi-";
    private View frag1Initial;
    private View frag2Initial;
    private FragmentSwapper fragmentSwapper;
    private View frag1Exist;
    private View frag2Exist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate");

        fragmentSwapper = FragmentSwapper.getInstance(getSupportFragmentManager());

        frag1Initial = findViewById(R.id.frag1_initial);
        frag2Initial = findViewById(R.id.frag2_initial);
        frag1Exist = findViewById(R.id.frag1_exist);
        frag2Exist = findViewById(R.id.frag2_exist);



        frag1Initial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                fragmentSwapper.swapToFragment(Fragment1.class, bundle, R.id.frame, true, false);
            }
        });

        frag2Initial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                fragmentSwapper.swapToFragment(Fragment2.class, bundle, R.id.frame, true, true);
            }
        });

        frag1Exist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                fragmentSwapper.swapToFragment(Fragment1.class, bundle, R.id.frame, false, false);
            }
        });

        frag2Exist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                fragmentSwapper.swapToFragment(Fragment2.class, bundle, R.id.frame, false, false);
            }
        });

    }


    @Override
    public void onBackPressed() {
        int count = getFragmentManager().getBackStackEntryCount();

        if (count == 0) {
            super.onBackPressed();
            //additional code
        } else {
            getFragmentManager().popBackStack();
        }
    }

}
