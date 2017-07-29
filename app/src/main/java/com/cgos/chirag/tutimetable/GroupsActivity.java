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

public class GroupsActivity extends AppCompatActivity {

    private AdView mAdView;
    private AdView mAdView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);

        ///sem6

        Intent intent = new Intent(GroupsActivity.this,HomeActivity.class);
        intent.putExtra("GroupName", "ECE 2");
        GroupsActivity.this.startActivity(intent);

        //

        mAdView = (AdView) findViewById(R.id.adViewEce1);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);

        mAdView2 = (AdView) findViewById(R.id.adViewEce2);
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

        final Button bece1 = (Button) findViewById(R.id.bcoe1);
        final Button bece2 = (Button) findViewById(R.id.bece2);
        final Button bece3 = (Button) findViewById(R.id.bcoe3);
        final Button bece4 = (Button) findViewById(R.id.bcoe4);
        final Button bece5 = (Button) findViewById(R.id.bcoe5);
        final Button bece6 = (Button) findViewById(R.id.bcoe6);
        final Button bece7 = (Button) findViewById(R.id.bcoe7);
        final Button bece8 = (Button) findViewById(R.id.bcoe8);
        final Button bece9 = (Button) findViewById(R.id.bcoe9);
        final TextView tvHolidaysCalender = (TextView) findViewById(R.id.tvHolidayCalender);
        final TextView tvTUEssentials = (TextView) findViewById(R.id.tvTUEssentials);

        bece1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GroupsActivity.this,HomeActivity.class);
                intent.putExtra("GroupName", "ECE 1");
                GroupsActivity.this.startActivity(intent);
            }
        });

        bece2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GroupsActivity.this,HomeActivity.class);
                intent.putExtra("GroupName", "ECE 2");
                GroupsActivity.this.startActivity(intent);
            }
        });

        bece3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GroupsActivity.this,HomeActivity.class);
                intent.putExtra("GroupName", "ECE 3");
                GroupsActivity.this.startActivity(intent);
            }
        });

        bece4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GroupsActivity.this,HomeActivity.class);
                intent.putExtra("GroupName", "ECE 4");
                GroupsActivity.this.startActivity(intent);
            }
        });

        bece5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GroupsActivity.this,HomeActivity.class);
                intent.putExtra("GroupName", "ECE 5");
                GroupsActivity.this.startActivity(intent);
            }
        });

        bece6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GroupsActivity.this,HomeActivity.class);
                intent.putExtra("GroupName", "ECE 6");
                GroupsActivity.this.startActivity(intent);
            }
        });

        bece7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GroupsActivity.this,HomeActivity.class);
                intent.putExtra("GroupName", "ECE 7");
                GroupsActivity.this.startActivity(intent);
            }
        });

        bece8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GroupsActivity.this,HomeActivity.class);
                intent.putExtra("GroupName", "ECE 8");
                GroupsActivity.this.startActivity(intent);
            }
        });

        bece9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GroupsActivity.this,HomeActivity.class);
                intent.putExtra("GroupName", "ECE 9");
                GroupsActivity.this.startActivity(intent);
            }
        });

        tvHolidaysCalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GroupsActivity.this, MainActivity.class);
                intent.putExtra("GroupName","Holidays");
                intent.putExtra("GroupDay","Holidays");
                GroupsActivity.this.startActivity(intent);
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
