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

public class Groups_1Coe_Activity extends AppCompatActivity {

    private AdView mAdView;
    private AdView mAdView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups_1_coe_);

        mAdView = (AdView) findViewById(R.id.adViewCoe1);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);

        mAdView2 = (AdView) findViewById(R.id.adViewCoe2);
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

        final Button bcoe1 = (Button) findViewById(R.id.bcoe1);
        final Button bcoe2 = (Button) findViewById(R.id.bcoe2);
        final Button bcoe3 = (Button) findViewById(R.id.bcoe3);
        final Button bcoe4 = (Button) findViewById(R.id.bcoe4);
        final Button bcoe5 = (Button) findViewById(R.id.bcoe5);
        final Button bcoe6 = (Button) findViewById(R.id.bcoe6);
        final Button bcoe7 = (Button) findViewById(R.id.bcoe7);
        final Button bcoe8 = (Button) findViewById(R.id.bcoe8);
        final Button bcoe9 = (Button) findViewById(R.id.bcoe9);
        final TextView tvHolidaysCalender = (TextView) findViewById(R.id.tvHolidayCalender);
        final TextView tvTUEssentials = (TextView) findViewById(R.id.tvTUEssentials);

        bcoe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Groups_1Coe_Activity.this,HomeActivity.class);
                intent.putExtra("GroupName", "COE 1");
                Groups_1Coe_Activity.this.startActivity(intent);
            }
        });

        bcoe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Groups_1Coe_Activity.this,HomeActivity.class);
                intent.putExtra("GroupName", "COE 2");
                Groups_1Coe_Activity.this.startActivity(intent);
            }
        });

        bcoe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Groups_1Coe_Activity.this,HomeActivity.class);
                intent.putExtra("GroupName", "COE 3");
                Groups_1Coe_Activity.this.startActivity(intent);
            }
        });

        bcoe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Groups_1Coe_Activity.this,HomeActivity.class);
                intent.putExtra("GroupName", "COE 4");
                Groups_1Coe_Activity.this.startActivity(intent);
            }
        });

        bcoe5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Groups_1Coe_Activity.this,HomeActivity.class);
                intent.putExtra("GroupName", "COE 5");
                Groups_1Coe_Activity.this.startActivity(intent);
            }
        });

        bcoe6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Groups_1Coe_Activity.this,HomeActivity.class);
                intent.putExtra("GroupName", "COE 6");
                Groups_1Coe_Activity.this.startActivity(intent);
            }
        });

        bcoe7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Groups_1Coe_Activity.this,HomeActivity.class);
                intent.putExtra("GroupName", "COE 7");
                Groups_1Coe_Activity.this.startActivity(intent);
            }
        });

        bcoe8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Groups_1Coe_Activity.this,HomeActivity.class);
                intent.putExtra("GroupName", "COE 8");
                Groups_1Coe_Activity.this.startActivity(intent);
            }
        });

        bcoe9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Groups_1Coe_Activity.this,HomeActivity.class);
                intent.putExtra("GroupName", "COE 9");
                Groups_1Coe_Activity.this.startActivity(intent);
            }
        });

        tvHolidaysCalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Groups_1Coe_Activity.this, MainActivity.class);
                intent.putExtra("GroupName","Holidays");
                intent.putExtra("GroupDay","Holidays");
                Groups_1Coe_Activity.this.startActivity(intent);
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
