package com.cgos.chirag.tutimetable;

import java.util.ArrayList;

/**
 * Created by CHIRAG on 30-07-2016.
 */
public class DataResource2 {
    String subject[] = new String[9];
    String room[] = new String[9];
    int thumb[] = new int[9];
    String BranchName;

    final String[] time = {
            "8-9",
            "9-10",
            "10-11",
            "11-12",
            "12-1",
            "1-2",
            "2-3",
            "3-4",
            "4-5"

    };

    private int[] th = {
            R.mipmap.l,R.mipmap.t,R.mipmap.p,R.mipmap.f
    };

    private String[] CmlS={
            "Big Data Analytics",
            "Comp Networks",
            "Software Eng",
            "Os",
            "Comp Arch",
            "Graphics",
            "Machine Learning",
            "FREE"
    };

    private String[] CmlR = {
            "B105",
            "BEMLDA LAB",
            "CAG LAB",
            "SEM 1 LAB",
            "CS 3 LAB",
            "CS 4 LAB",
            ""
    };

    private String[] CheS={
            "FREE",
            "Chem Rx Eng.",
            "Mass Transfer",
            "Industrial Poll",
            "Energy Tech",
            "Process Eq Design",
            "Process I&C",
            "EVS"
    };

    private String[] CheR = {
            "","B109","D207","D206",
            "B105","D115","D201","B308",
            "B307","D204","D203","D202",
            "ET LAB","CRE LAB","IPA LAB","PIC LAB",
            "F108", "B107"
    };





    final String Cml1M =  "003207456110006000220003000";
    final String Cml1T =  "773357034663306000332203000";
    final String Cml1W =  "034417156002216000002223000";
    final String Cml1Th = "775571277663360066330030033";
    final String Cml1F =  "146676222001160011002230022";
    final String Cml2M =  "333207456220006000220003000";
    final String Cml2T =  "772257034664406000332203000";
    final String Cml2W =  "035517156003326000002223000";
    final String Cml2Th = "776671277664460066332230033";
    final String Cml2F =  "145576233003360033002230022";
    final String Cml3M =  "223207456330006000220003000";
    final String Cml3T =  "770057034665506000332203000";
    final String Cml3W =  "036617156004436000002223000";
    final String Cml3Th = "774471277665560066332230033";
    final String Cml3F =  "145576233003360033002230022";
    final String Che1M =  "052630540012220330310003003";
    final String Che1T =  "63440153333cc033ee002230022";
    final String Che1W =  "522101470334403350001130003";
    final String Che1Th = "62360667022g30ff70000132203";
    final String Che1F =  "4341000112aab000dd011033322";
    final String Che2M =  "002630540002220330330003003";
    final String Che2T =  "6316015403311033h0001130013";
    final String Che2W =  "52440147033cc03350002230003";
    final String Che2Th = "62350117022g10dd70000132203";
    final String Che2F =  "4661023332ffb0hhee022031122";
    final String Che3M =  "002630545002220333330003001";
    final String Che3T =  "63110156633dd033ff002230022";
    final String Che3W =  "520001476330003355003330001";
    final String Che3Th = "62320447322g60ee78000132201";
    final String Che3F =  "410100444290b009cc013033122";





    public void getSubject(String data){
        for(int i=0;i<9;i++) {
            switch (BranchName) {
                case "CML":
                    this.subject[i] = CmlS[Character.getNumericValue(data.charAt(i))];
                    this.room[i] = CmlR[Character.getNumericValue(data.charAt(i + 9))];

                case "CHE":
                    this.subject[i] = CheS[Character.getNumericValue(data.charAt(i))];
                    this.room[i] = CheR[Character.getNumericValue(data.charAt(i + 9))];

            }
            this.thumb[i] = th[Character.getNumericValue(data.charAt(i + 18))];
        }
    }



}