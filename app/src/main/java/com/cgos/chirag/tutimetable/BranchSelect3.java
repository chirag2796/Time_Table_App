package com.cgos.chirag.tutimetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class BranchSelect3 extends AppCompatActivity {

    private AdView mAdView;
    private AdView mAdView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch_select3);

        //sem6
        Intent intent = new Intent(BranchSelect3.this,GroupsActivity.class);
        BranchSelect3.this.startActivity(intent);

        //



        mAdView = (AdView) findViewById(R.id.adViewBranch1);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);

        mAdView2 = (AdView) findViewById(R.id.adViewBranch2);
        AdRequest adRequest2 = new AdRequest.Builder()
                .build();
        mAdView2.loadAd(adRequest2);

        OnClickButtonListener();
    }

    public void OnClickListItemListener(){

    }

    public void OnClickButtonListener(){
        final Button bECE = (Button)findViewById(R.id.bECE);
        final Button bCOE = (Button)findViewById(R.id.bCOE);
        final Button bCML = (Button)findViewById(R.id.bCML);
        final Button bCHE = (Button)findViewById(R.id.bCHE);

        bECE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BranchSelect3.this,GroupsActivity.class);
                BranchSelect3.this.startActivity(intent);
            }
        });
        bCOE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BranchSelect3.this,Groups_1Coe_Activity.class);
                BranchSelect3.this.startActivity(intent);
            }
        });
        bCML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BranchSelect3.this,Groups_1Cml_Activity.class);
                BranchSelect3.this.startActivity(intent);
            }
        });
        bCHE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BranchSelect3.this,Groups_1Che_Activity.class);
                BranchSelect3.this.startActivity(intent);
            }
        });    }

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
}
