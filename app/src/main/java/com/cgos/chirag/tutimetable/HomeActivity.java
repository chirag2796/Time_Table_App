package com.cgos.chirag.tutimetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class HomeActivity extends AppCompatActivity {

    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mInterstitialAd = new InterstitialAd(this);

        // set the ad unit ID
        mInterstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen));

        AdRequest adRequest = new AdRequest.Builder()
                .build();

        // Load ads into Interstitial Ads
        mInterstitialAd.loadAd(adRequest);

        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }
        });


        Intent intent = getIntent();
        final String GroupName = intent.getStringExtra("GroupName");
        final TextView tvcheck = (TextView) findViewById(R.id.tvCheck);

        this.setTitle("III Year "+GroupName.substring(0,3));
        tvcheck.setText(GroupName);


        final Button bMonday = (Button) findViewById(R.id.bMonday);
        final Button bTuesday = (Button) findViewById(R.id.bTuesday);
        final Button bWednesday = (Button) findViewById(R.id.bWednesday);
        final Button bThursday = (Button) findViewById(R.id.bThursday);
        final Button bFriday = (Button) findViewById(R.id.bFriday);

       bMonday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                intent.putExtra("GroupDay", "Mon");
                intent.putExtra("GroupName",GroupName);
                HomeActivity.this.startActivity(intent);
            }
        });

        bTuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                intent.putExtra("GroupDay", "Tue");
                intent.putExtra("GroupName",GroupName);
                HomeActivity.this.startActivity(intent);
            }
        });

        bWednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                intent.putExtra("GroupDay", "Wed");
                intent.putExtra("GroupName",GroupName);
                HomeActivity.this.startActivity(intent);
            }
        });

        bThursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                intent.putExtra("GroupDay", "Thur");
                intent.putExtra("GroupName",GroupName);
                HomeActivity.this.startActivity(intent);
            }
        });

        bFriday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                intent.putExtra("GroupDay", "Fri");
                intent.putExtra("GroupName",GroupName);
                HomeActivity.this.startActivity(intent);
            }
        });


    }

    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }
}
