package com.cgos.chirag.tutimetable;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Groups_1Cml_Activity extends AppCompatActivity {

    private AdView mAdView;
    private AdView mAdView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups_1_cml_);

        mAdView = (AdView) findViewById(R.id.adViewCml1);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);

        mAdView2 = (AdView) findViewById(R.id.adViewCml2);
        AdRequest adRequest2 = new AdRequest.Builder()
                .build();
        mAdView2.loadAd(adRequest2);

        OnClickButtonListener();
    }
    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        if (mAdView2 != null) {
            mAdView2.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
        if (mAdView2 != null) {
            mAdView2.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        if (mAdView2 != null) {
            mAdView2.destroy();
        }
        super.onDestroy();
    }

    public void OnClickButtonListener(){

        final Button bcml1 = (Button) findViewById(R.id.bcml1);
        final Button bcml2 = (Button) findViewById(R.id.bcml2);
        final Button bcml3 = (Button) findViewById(R.id.bcml3);
        final TextView tvHolidaysCalender = (TextView) findViewById(R.id.tvHolidayCalender);
        final TextView tvTUEssentials = (TextView) findViewById(R.id.tvTUEssentials);

        bcml1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Groups_1Cml_Activity.this,HomeActivity.class);
                intent.putExtra("GroupName", "CML 1");
                Groups_1Cml_Activity.this.startActivity(intent);
            }
        });

        bcml2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Groups_1Cml_Activity.this,HomeActivity.class);
                intent.putExtra("GroupName", "CML 2");
                Groups_1Cml_Activity.this.startActivity(intent);
            }
        });

        bcml3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Groups_1Cml_Activity.this,HomeActivity.class);
                intent.putExtra("GroupName", "CML 3");
                Groups_1Cml_Activity.this.startActivity(intent);
            }
        });

        tvHolidaysCalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Groups_1Cml_Activity.this, MainActivity.class);
                intent.putExtra("GroupName","Holidays");
                intent.putExtra("GroupDay","Holidays");
                Groups_1Cml_Activity.this.startActivity(intent);
            }
        });

        tvTUEssentials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + "com.cgos.tues1.chirag.tuessentials")));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.cgos.tues1.chirag.tuessentials")));
                }
            }
        });

    }
}