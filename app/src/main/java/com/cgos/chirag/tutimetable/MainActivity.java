package com.cgos.chirag.tutimetable;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;

import com.google.android.gms.ads.AdView;


public class MainActivity extends AppCompatActivity {

   // InterstitialAd mInterstitialAd;
   private AdView mAdView;

    ListView listView;
    String[] subject_code;
    String[] room_code;
    String[] time_code;
    int[] subject_thumbs_resource;
    SubjectAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* mInterstitialAd = new InterstitialAd(this);

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
        });*/

        mAdView = (AdView) findViewById(R.id.adViewMain1);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);

        Intent intent = getIntent();
        final String GroupName = intent.getStringExtra("GroupName");
        final String GroupDay = intent.getStringExtra("GroupDay");

        Title(GroupName,GroupDay);

        DataResource1 d1 = new DataResource1();
        DataResource2 d2 = new DataResource2();
        final ToastCheck t1 = new ToastCheck();
        
        d2.BranchName = GroupName.substring(0,3);

        final TextView tvSubject = (TextView)findViewById(R.id.tvSubject);
        listView = (ListView)findViewById(R.id.buckysListView);

        time_code = d1.time;

        getDataResource1(GroupName,GroupDay,d1,d2);

        int i=0;
        adapter = new SubjectAdapter(getApplicationContext(), R.layout.custom_row);
        listView.setAdapter(adapter);
        for(String titles: subject_code){
            SubjectDataProvider dataProvider = new SubjectDataProvider(subject_thumbs_resource[i], subject_code[i], room_code[i], time_code[i]);
            adapter.add(dataProvider);
            i++;
        }

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                        TextView tvSubject = (TextView)view.findViewById(R.id.tvSubject);
                        String toastValue = tvSubject.getText().toString();
                        toastValue = t1.toastCheck(toastValue);
                        Toast.makeText(MainActivity.this, toastValue, Toast.LENGTH_SHORT).show();

                    }
                }
        );

    }

    public void getDataResource1(String GroupName, String GroupDay, DataResource1 d1, DataResource2 d2){
        if(GroupName.equals("ECE 1") && GroupDay.equals("Mon")) {
            subject_code = d1.Ece1M_s;
            room_code = d1.Ece1M_r;
            subject_thumbs_resource = d1.Ece1M_th;
        }
        else if(GroupName.equals("ECE 1") && GroupDay.equals("Tue")) {
            subject_code = d1.Ece1T_s;
            room_code = d1.Ece1T_r;
            subject_thumbs_resource = d1.Ece1T_th;
        }
        else if(GroupName.equals("ECE 1") && GroupDay.equals("Wed")) {
            subject_code = d1.Ece1W_s;
            room_code = d1.Ece1W_r;
            subject_thumbs_resource = d1.Ece1W_th;
        }
        else if(GroupName.equals("ECE 1") && GroupDay.equals("Thur")) {
            subject_code = d1.Ece1Th_s;
            room_code = d1.Ece1Th_r;
            subject_thumbs_resource = d1.Ece1Th_th;
        }
        else if(GroupName.equals("ECE 1") && GroupDay.equals("Fri")) {
            subject_code = d1.Ece1F_s;
            room_code = d1.Ece1F_r;
            subject_thumbs_resource = d1.Ece1F_th;
        }
        else if(GroupName.equals("ECE 2") && GroupDay.equals("Mon")) {
            subject_code = d1.Ece2M_s;
            room_code = d1.Ece2M_r;
            subject_thumbs_resource = d1.Ece2M_th;
        }
        else if(GroupName.equals("ECE 2") && GroupDay.equals("Tue")) {
            subject_code = d1.Ece2T_s;
            room_code = d1.Ece2T_r;
            subject_thumbs_resource = d1.Ece2T_th;
        }
        else if(GroupName.equals("ECE 2") && GroupDay.equals("Wed")) {
            subject_code = d1.Ece2W_s;
            room_code = d1.Ece2W_r;
            subject_thumbs_resource = d1.Ece2W_th;
        }
        else if(GroupName.equals("ECE 2") && GroupDay.equals("Thur")) {
            subject_code = d1.Ece2Th_s;
            room_code = d1.Ece2Th_r;
            subject_thumbs_resource = d1.Ece2Th_th;
        }

        else if(GroupName.equals("ECE 2") && GroupDay.equals("Fri")) {
            subject_code = d1.Ece2F_s;
            room_code = d1.Ece2F_r;
            subject_thumbs_resource = d1.Ece2F_th;
        }
        else if(GroupName.equals("ECE 3") && GroupDay.equals("Mon")) {
            subject_code = d1.Ece3M_s;
            room_code = d1.Ece3M_r;
            subject_thumbs_resource = d1.Ece3M_th;
        }
        else if(GroupName.equals("ECE 3") && GroupDay.equals("Tue")) {
            subject_code = d1.Ece3T_s;
            room_code = d1.Ece3T_r;
            subject_thumbs_resource = d1.Ece3T_th;
        }
        else if(GroupName.equals("ECE 3") && GroupDay.equals("Wed")) {
            subject_code = d1.Ece3W_s;
            room_code = d1.Ece3W_r;
            subject_thumbs_resource = d1.Ece3W_th;
        }
        else if(GroupName.equals("ECE 3") && GroupDay.equals("Thur")) {
            subject_code = d1.Ece3Th_s;
            room_code = d1.Ece3Th_r;
            subject_thumbs_resource = d1.Ece3Th_th;
        }

        else if(GroupName.equals("ECE 3") && GroupDay.equals("Fri")) {
            subject_code = d1.Ece3F_s;
            room_code = d1.Ece3F_r;
            subject_thumbs_resource = d1.Ece3F_th;
        }
        else if(GroupName.equals("ECE 4") && GroupDay.equals("Mon")) {
            subject_code = d1.Ece4M_s;
            room_code = d1.Ece4M_r;

            subject_thumbs_resource = d1.Ece4M_th;
        }
        else if(GroupName.equals("ECE 4") && GroupDay.equals("Tue")) {
            subject_code = d1.Ece4T_s;
            room_code = d1.Ece4T_r;
            subject_thumbs_resource = d1.Ece4T_th;
        }
        else if(GroupName.equals("ECE 4") && GroupDay.equals("Wed")) {
            subject_code = d1.Ece4W_s;
            room_code = d1.Ece4W_r;
            subject_thumbs_resource = d1.Ece4W_th;
        }
        else if(GroupName.equals("ECE 4") && GroupDay.equals("Thur")) {
            subject_code = d1.Ece4Th_s;
            room_code = d1.Ece4Th_r;
            subject_thumbs_resource = d1.Ece4Th_th;
        }

        else if(GroupName.equals("ECE 4") && GroupDay.equals("Fri")) {
            subject_code = d1.Ece4F_s;
            room_code = d1.Ece4F_r;
            subject_thumbs_resource = d1.Ece4F_th;
        }
        else if(GroupName.equals("ECE 5") && GroupDay.equals("Mon")) {
            subject_code = d1.Ece5M_s;
            room_code = d1.Ece5M_r;

            subject_thumbs_resource = d1.Ece5M_th;
        }
        else if(GroupName.equals("ECE 5") && GroupDay.equals("Tue")) {
            subject_code = d1.Ece5T_s;
            room_code = d1.Ece5T_r;
            subject_thumbs_resource = d1.Ece5T_th;
        }
        else if(GroupName.equals("ECE 5") && GroupDay.equals("Wed")) {
            subject_code = d1.Ece5W_s;
            room_code = d1.Ece5W_r;
            subject_thumbs_resource = d1.Ece5W_th;
        }
        else if(GroupName.equals("ECE 5") && GroupDay.equals("Thur")) {
            subject_code = d1.Ece5Th_s;
            room_code = d1.Ece5Th_r;
            subject_thumbs_resource = d1.Ece5Th_th;
        }

        else if(GroupName.equals("ECE 5") && GroupDay.equals("Fri")) {
            subject_code = d1.Ece5F_s;
            room_code = d1.Ece5F_r;
            subject_thumbs_resource = d1.Ece5F_th;
        }
        else if(GroupName.equals("ECE 6") && GroupDay.equals("Mon")) {
            subject_code = d1.Ece6M_s;
            room_code = d1.Ece6M_r;
            subject_thumbs_resource = d1.Ece6M_th;
        }
        else if(GroupName.equals("ECE 6") && GroupDay.equals("Tue")) {
            subject_code = d1.Ece6T_s;
            room_code = d1.Ece6T_r;
            subject_thumbs_resource = d1.Ece6T_th;
        }
        else if(GroupName.equals("ECE 6") && GroupDay.equals("Wed")) {
            subject_code = d1.Ece6W_s;
            room_code = d1.Ece6W_r;
            subject_thumbs_resource = d1.Ece6W_th;
        }
        else if(GroupName.equals("ECE 6") && GroupDay.equals("Thur")) {
            subject_code = d1.Ece6Th_s;
            room_code = d1.Ece6Th_r;
            subject_thumbs_resource = d1.Ece6Th_th;
        }
        else if(GroupName.equals("ECE 6") && GroupDay.equals("Fri")) {
            subject_code = d1.Ece6F_s;
            room_code = d1.Ece6F_r;
            subject_thumbs_resource = d1.Ece6F_th;
        }

        else if(GroupName.equals("ECE 7") && GroupDay.equals("Mon")) {
            subject_code = d1.Ece7M_s;
            room_code = d1.Ece7M_r;
            subject_thumbs_resource = d1.Ece7M_th;
        }
        else if(GroupName.equals("ECE 7") && GroupDay.equals("Tue")) {
            subject_code = d1.Ece7T_s;
            room_code = d1.Ece7T_r;
            subject_thumbs_resource = d1.Ece7T_th;
        }
        else if(GroupName.equals("ECE 7") && GroupDay.equals("Wed")) {
            subject_code = d1.Ece7W_s;
            room_code = d1.Ece7W_r;
            subject_thumbs_resource = d1.Ece7W_th;
        }
        else if(GroupName.equals("ECE 7") && GroupDay.equals("Thur")) {
            subject_code = d1.Ece7Th_s;
            room_code = d1.Ece7Th_r;
            subject_thumbs_resource = d1.Ece7Th_th;
        }
        else if(GroupName.equals("ECE 7") && GroupDay.equals("Fri")) {
            subject_code = d1.Ece7F_s;
            room_code = d1.Ece7F_r;
            subject_thumbs_resource = d1.Ece7F_th;
        }

        else if(GroupName.equals("ECE 8") && GroupDay.equals("Mon")) {
            subject_code = d1.Ece8M_s;
            room_code = d1.Ece8M_r;
            subject_thumbs_resource = d1.Ece8M_th;
        }
        else if(GroupName.equals("ECE 8") && GroupDay.equals("Tue")) {
            subject_code = d1.Ece8T_s;
            room_code = d1.Ece8T_r;
            subject_thumbs_resource = d1.Ece8T_th;
        }
        else if(GroupName.equals("ECE 8") && GroupDay.equals("Wed")) {
            subject_code = d1.Ece8W_s;
            room_code = d1.Ece8W_r;
            subject_thumbs_resource = d1.Ece8W_th;
        }
        else if(GroupName.equals("ECE 8") && GroupDay.equals("Thur")) {
            subject_code = d1.Ece8Th_s;
            room_code = d1.Ece8Th_r;
            subject_thumbs_resource = d1.Ece8Th_th;
        }
        else if(GroupName.equals("ECE 8") && GroupDay.equals("Fri")) {
            subject_code = d1.Ece8F_s;
            room_code = d1.Ece8F_r;
            subject_thumbs_resource = d1.Ece8F_th;
        }

        else if(GroupName.equals("ECE 8=") && GroupDay.equals("Mon")) {
            subject_code = d1.Ece9M_s;
            room_code = d1.Ece9M_r;
            subject_thumbs_resource = d1.Ece9M_th;
        }
        else if(GroupName.equals("ECE 9") && GroupDay.equals("Tue")) {
            subject_code = d1.Ece9T_s;
            room_code = d1.Ece9T_r;
            subject_thumbs_resource = d1.Ece9T_th;
        }
        else if(GroupName.equals("ECE 9") && GroupDay.equals("Wed")) {
            subject_code = d1.Ece9W_s;
            room_code = d1.Ece9W_r;
            subject_thumbs_resource = d1.Ece9W_th;
        }
        else if(GroupName.equals("ECE 9") && GroupDay.equals("Thur")) {
            subject_code = d1.Ece9Th_s;
            room_code = d1.Ece9Th_r;
            subject_thumbs_resource = d1.Ece9Th_th;
        }
        else if(GroupName.equals("ECE 9") && GroupDay.equals("Fri")) {
            subject_code = d1.Ece9F_s;
            room_code = d1.Ece9F_r;
            subject_thumbs_resource = d1.Ece9F_th;
        }
        else if(GroupName.equals("Holidays") && GroupDay.equals("Holidays")) {
            time_code = d1.holidays_date;
            subject_code = d1.holidays_event;
            room_code = d1.holidays_day;
            subject_thumbs_resource = d1.holidays_th;
        }

        /////COE/////

        else if(GroupName.equals("COE 1") && GroupDay.equals("Mon")) {
            subject_code = d1.Coe1M_s;
            room_code = d1.Coe1M_r;
            subject_thumbs_resource = d1.Coe1M_th;
        }
        else if(GroupName.equals("COE 1") && GroupDay.equals("Tue")) {
            subject_code = d1.Coe1T_s;
            room_code = d1.Coe1T_r;
            subject_thumbs_resource = d1.Coe1T_th;
        }
        else if(GroupName.equals("COE 1") && GroupDay.equals("Wed")) {
            subject_code = d1.Coe1W_s;
            room_code = d1.Coe1W_r;
            subject_thumbs_resource = d1.Coe1W_th;
        }
        else if(GroupName.equals("COE 1") && GroupDay.equals("Thur")) {
            subject_code = d1.Coe1Th_s;
            room_code = d1.Coe1Th_r;
            subject_thumbs_resource = d1.Coe1Th_th;
        }
        else if(GroupName.equals("COE 1") && GroupDay.equals("Fri")) {
            subject_code = d1.Coe1F_s;
            room_code = d1.Coe1F_r;
            subject_thumbs_resource = d1.Coe1F_th;
        }
        else if(GroupName.equals("COE 2") && GroupDay.equals("Mon")) {
            subject_code = d1.Coe2M_s;
            room_code = d1.Coe2M_r;
            subject_thumbs_resource = d1.Coe2M_th;
        }
        else if(GroupName.equals("COE 2") && GroupDay.equals("Tue")) {
            subject_code = d1.Coe2T_s;
            room_code = d1.Coe2T_r;
            subject_thumbs_resource = d1.Coe2T_th;
        }
        else if(GroupName.equals("COE 2") && GroupDay.equals("Wed")) {
            subject_code = d1.Coe2W_s;
            room_code = d1.Coe2W_r;
            subject_thumbs_resource = d1.Coe2W_th;
        }
        else if(GroupName.equals("COE 2") && GroupDay.equals("Thur")) {
            subject_code = d1.Coe2Th_s;
            room_code = d1.Coe2Th_r;
            subject_thumbs_resource = d1.Coe2Th_th;
        }

        else if(GroupName.equals("COE 2") && GroupDay.equals("Fri")) {
            subject_code = d1.Coe2F_s;
            room_code = d1.Coe2F_r;
            subject_thumbs_resource = d1.Coe2F_th;
        }
        else if(GroupName.equals("COE 3") && GroupDay.equals("Mon")) {
            subject_code = d1.Coe3M_s;
            room_code = d1.Coe3M_r;
            subject_thumbs_resource = d1.Coe3M_th;
        }
        else if(GroupName.equals("COE 3") && GroupDay.equals("Tue")) {
            subject_code = d1.Coe3T_s;
            room_code = d1.Coe3T_r;
            subject_thumbs_resource = d1.Coe3T_th;
        }
        else if(GroupName.equals("COE 3") && GroupDay.equals("Wed")) {
            subject_code = d1.Coe3W_s;
            room_code = d1.Coe3W_r;
            subject_thumbs_resource = d1.Coe3W_th;
        }
        else if(GroupName.equals("COE 3") && GroupDay.equals("Thur")) {
            subject_code = d1.Coe3Th_s;
            room_code = d1.Coe3Th_r;
            subject_thumbs_resource = d1.Coe3Th_th;
        }

        else if(GroupName.equals("COE 3") && GroupDay.equals("Fri")) {
            subject_code = d1.Coe3F_s;
            room_code = d1.Coe3F_r;
            subject_thumbs_resource = d1.Coe3F_th;
        }
        else if(GroupName.equals("COE 4") && GroupDay.equals("Mon")) {
            subject_code = d1.Coe4M_s;
            room_code = d1.Coe4M_r;

            subject_thumbs_resource = d1.Coe4M_th;
        }
        else if(GroupName.equals("COE 4") && GroupDay.equals("Tue")) {
            subject_code = d1.Coe4T_s;
            room_code = d1.Coe4T_r;
            subject_thumbs_resource = d1.Coe4T_th;
        }
        else if(GroupName.equals("COE 4") && GroupDay.equals("Wed")) {
            subject_code = d1.Coe4W_s;
            room_code = d1.Coe4W_r;
            subject_thumbs_resource = d1.Coe4W_th;
        }
        else if(GroupName.equals("COE 4") && GroupDay.equals("Thur")) {
            subject_code = d1.Coe4Th_s;
            room_code = d1.Coe4Th_r;
            subject_thumbs_resource = d1.Coe4Th_th;
        }

        else if(GroupName.equals("COE 4") && GroupDay.equals("Fri")) {
            subject_code = d1.Coe4F_s;
            room_code = d1.Coe4F_r;
            subject_thumbs_resource = d1.Coe4F_th;
        }
        else if(GroupName.equals("COE 5") && GroupDay.equals("Mon")) {
            subject_code = d1.Coe5M_s;
            room_code = d1.Coe5M_r;

            subject_thumbs_resource = d1.Coe5M_th;
        }
        else if(GroupName.equals("COE 5") && GroupDay.equals("Tue")) {
            subject_code = d1.Coe5T_s;
            room_code = d1.Coe5T_r;
            subject_thumbs_resource = d1.Coe5T_th;
        }
        else if(GroupName.equals("COE 5") && GroupDay.equals("Wed")) {
            subject_code = d1.Coe5W_s;
            room_code = d1.Coe5W_r;
            subject_thumbs_resource = d1.Coe5W_th;
        }
        else if(GroupName.equals("COE 5") && GroupDay.equals("Thur")) {
            subject_code = d1.Coe5Th_s;
            room_code = d1.Coe5Th_r;
            subject_thumbs_resource = d1.Coe5Th_th;
        }

        else if(GroupName.equals("COE 5") && GroupDay.equals("Fri")) {
            subject_code = d1.Coe5F_s;
            room_code = d1.Coe5F_r;
            subject_thumbs_resource = d1.Coe5F_th;
        }
        else if(GroupName.equals("COE 6") && GroupDay.equals("Mon")) {
            subject_code = d1.Coe6M_s;
            room_code = d1.Coe6M_r;
            subject_thumbs_resource = d1.Coe6M_th;
        }
        else if(GroupName.equals("COE 6") && GroupDay.equals("Tue")) {
            subject_code = d1.Coe6T_s;
            room_code = d1.Coe6T_r;
            subject_thumbs_resource = d1.Coe6T_th;
        }
        else if(GroupName.equals("COE 6") && GroupDay.equals("Wed")) {
            subject_code = d1.Coe6W_s;
            room_code = d1.Coe6W_r;
            subject_thumbs_resource = d1.Coe6W_th;
        }
        else if(GroupName.equals("COE 6") && GroupDay.equals("Thur")) {
            subject_code = d1.Coe6Th_s;
            room_code = d1.Coe6Th_r;
            subject_thumbs_resource = d1.Coe6Th_th;
        }
        else if(GroupName.equals("COE 6") && GroupDay.equals("Fri")) {
            subject_code = d1.Coe6F_s;
            room_code = d1.Coe6F_r;
            subject_thumbs_resource = d1.Coe6F_th;
        }

        else if(GroupName.equals("COE 7") && GroupDay.equals("Mon")) {
            subject_code = d1.Coe7M_s;
            room_code = d1.Coe7M_r;
            subject_thumbs_resource = d1.Coe7M_th;
        }
        else if(GroupName.equals("COE 7") && GroupDay.equals("Tue")) {
            subject_code = d1.Coe7T_s;
            room_code = d1.Coe7T_r;
            subject_thumbs_resource = d1.Coe7T_th;
        }
        else if(GroupName.equals("COE 7") && GroupDay.equals("Wed")) {
            subject_code = d1.Coe7W_s;
            room_code = d1.Coe7W_r;
            subject_thumbs_resource = d1.Coe7W_th;
        }
        else if(GroupName.equals("COE 7") && GroupDay.equals("Thur")) {
            subject_code = d1.Coe7Th_s;
            room_code = d1.Coe7Th_r;
            subject_thumbs_resource = d1.Coe7Th_th;
        }
        else if(GroupName.equals("COE 7") && GroupDay.equals("Fri")) {
            subject_code = d1.Coe7F_s;
            room_code = d1.Coe7F_r;
            subject_thumbs_resource = d1.Coe7F_th;
        }

        else if(GroupName.equals("COE 8") && GroupDay.equals("Mon")) {
            subject_code = d1.Coe8M_s;
            room_code = d1.Coe8M_r;
            subject_thumbs_resource = d1.Coe8M_th;
        }
        else if(GroupName.equals("COE 8") && GroupDay.equals("Tue")) {
            subject_code = d1.Coe8T_s;
            room_code = d1.Coe8T_r;
            subject_thumbs_resource = d1.Coe8T_th;
        }
        else if(GroupName.equals("COE 8") && GroupDay.equals("Wed")) {
            subject_code = d1.Coe8W_s;
            room_code = d1.Coe8W_r;
            subject_thumbs_resource = d1.Coe8W_th;
        }
        else if(GroupName.equals("COE 8") && GroupDay.equals("Thur")) {
            subject_code = d1.Coe8Th_s;
            room_code = d1.Coe8Th_r;
            subject_thumbs_resource = d1.Coe8Th_th;
        }
        else if(GroupName.equals("COE 8") && GroupDay.equals("Fri")) {
            subject_code = d1.Coe8F_s;
            room_code = d1.Coe8F_r;
            subject_thumbs_resource = d1.Coe8F_th;
        }

        else if(GroupName.equals("COE 9") && GroupDay.equals("Mon")) {
            subject_code = d1.Coe9M_s;
            room_code = d1.Coe9M_r;
            subject_thumbs_resource = d1.Coe9M_th;
        }
        else if(GroupName.equals("COE 9") && GroupDay.equals("Tue")) {
            subject_code = d1.Coe9T_s;
            room_code = d1.Coe9T_r;
            subject_thumbs_resource = d1.Coe9T_th;
        }
        else if(GroupName.equals("COE 9") && GroupDay.equals("Wed")) {
            subject_code = d1.Coe9W_s;
            room_code = d1.Coe9W_r;
            subject_thumbs_resource = d1.Coe9W_th;
        }
        else if(GroupName.equals("COE 9") && GroupDay.equals("Thur")) {
            subject_code = d1.Coe9Th_s;
            room_code = d1.Coe9Th_r;
            subject_thumbs_resource = d1.Coe9Th_th;
        }
        else if(GroupName.equals("COE 9") && GroupDay.equals("Fri")) {
            subject_code = d1.Coe9F_s;
            room_code = d1.Coe9F_r;
            subject_thumbs_resource = d1.Coe9F_th;
        }
        else if(GroupName.equals("Holidays") && GroupDay.equals("Holidays")) {
            time_code = d1.holidays_date;
            subject_code = d1.holidays_event;
            room_code = d1.holidays_day;
            subject_thumbs_resource = d1.holidays_th;
        }

        else {
            String GroupNameDay = GroupName+" "+GroupDay;

            switch (GroupNameDay){
                case "CML 1 Mon": d2.getSubject(d2.Cml1M);
                    break;
                case "CML 1 Tue": d2.getSubject(d2.Cml1T);
                    break;
                case "CML 1 Wed": d2.getSubject(d2.Cml1W);
                    break;
                case "CML 1 Thur": d2.getSubject(d2.Cml1Th);
                    break;
                case "CML 1 Fri": d2.getSubject(d2.Cml1F);
                    break;
                case "CML 2 Mon": d2.getSubject(d2.Cml2M);
                    break;
                case "CML 2 Tue": d2.getSubject(d2.Cml2T);
                    break;
                case "CML 2 Wed": d2.getSubject(d2.Cml2W);
                    break;
                case "CML 2 Thur": d2.getSubject(d2.Cml2Th);
                    break;
                case "CML 2 Fri": d2.getSubject(d2.Cml2F);
                    break;
                case "CML 3 Mon": d2.getSubject(d2.Cml3M);
                    break;
                case "CML 3 Tue": d2.getSubject(d2.Cml3T);
                    break;
                case "CML 3 Wed": d2.getSubject(d2.Cml3W);
                    break;
                case "CML 3 Thur": d2.getSubject(d2.Cml3Th);
                    break;
                case "CML 3 Fri": d2.getSubject(d2.Cml3F);
                    break;
                case "CHE 1 Mon": d2.getSubject(d2.Che1M);
                    break;
                case "CHE 1 Tue": d2.getSubject(d2.Che1T);
                    break;
                case "CHE 1 Wed": d2.getSubject(d2.Che1W);
                    break;
                case "CHE 1 Thur": d2.getSubject(d2.Che1Th);
                    break;
                case "CHE 1 Fri": d2.getSubject(d2.Che1F);
                    break;
                case "CHE 2 Mon": d2.getSubject(d2.Che2M);
                    break;
                case "CHE 2 Tue": d2.getSubject(d2.Che2T);
                    break;
                case "CHE 2 Wed": d2.getSubject(d2.Che2W);
                    break;
                case "CHE 2 Thur": d2.getSubject(d2.Che2Th);
                    break;
                case "CHE 2 Fri": d2.getSubject(d2.Che2F);
                    break;
                case "CHE 3 Mon": d2.getSubject(d2.Che3M);
                    break;
                case "CHE 3 Tue": d2.getSubject(d2.Che3T);
                    break;
                case "CHE 3 Wed": d2.getSubject(d2.Che3W);
                    break;
                case "CHE 3 Thur": d2.getSubject(d2.Che3Th);
                    break;
                case "CHE 3 Fri": d2.getSubject(d2.Che3F);
                    break;
            }


            subject_code = d2.subject;
            room_code = d2.room;
            subject_thumbs_resource = d2.thumb;
        }

    }

    public void Title(String GroupName, String GroupDay){
        String title;

        switch (GroupDay){
            case "Mon": title = "Monday " + GroupName;
                        break;
            case "Tue": title = "Tuesday " + GroupName;
                        break;
            case "Wed": title = "Wednesday " + GroupName;
                        break;
            case "Thur": title = "Thursday " + GroupName;
                        break;
            case "Fri": title = "Friday " + GroupName;
                        break;
            case "Holidays": title = "Holiday Calender";
                        break;
            default:    title="TU Time Table";
        }
        this.setTitle(title);
    }

   /* private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }*/

    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }
}