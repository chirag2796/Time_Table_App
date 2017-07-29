package com.cgos.chirag.tutimetable;

/**
 * Created by CHIRAG on 25-07-2016.
 */
public class DataResource1 {

    final String[] holidays_date = {
                "Jan 16",
                "Jan 26",
                "Feb 22",
                "Mar 03",
                "Mar 24",
                "Apr 13",
                "Apr 15",
                "Aug 15",
                "Aug 25",
                "Oct 02",
                "Oct 11",
                "Oct 16",
                "Oct 30",
                "Nov 14",
                "Dec 04",
                "Dec 25"
    };

    final String[] holidays_day = {
            "Sat",
            "Tue",
            "Mon",
            "Mon",
            "Thur",
            "Wed",
            "Fri",
            "Mon",
            "Thur",
            "Sun",
            "Tue",
            "Sun",
            "Sun",
            "Mon",
            "Sun",
            "Sun"
    };

    final String[] holidays_event = {
            "Gurupurab",
            "Republic Day",
            "Ravi Dass Jayanti",
            "Maha Shivratri",
            "Holi",
            "Baisakhi",
            "Ram Navami",
            "Independence Day",
            "Janamashtmi",
            "Gandhi Jayanti",
            "Dussehra",
            "Balmiki Jayanti",
            "Sun: Diwali",
            "Mon: Gurupurab",
            "Martydom of Sh. Guru Teg Bahadur Ji",
            "Christmas"
    };

    final int[] holidays_th = {
            R.mipmap.h, R.mipmap.h, R.mipmap.h, R.mipmap.h, R.mipmap.h, R.mipmap.h, R.mipmap.h, R.mipmap.h, R.mipmap.h,
            R.mipmap.h, R.mipmap.h, R.mipmap.h, R.mipmap.h, R.mipmap.h, R.mipmap.h, R.mipmap.h
    };

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

    final String[] Ece1M_s = {
            "FREE",
            "Human Values",
            "Digital Comm",
            "Microwave",
            "Embedded",
            "FREE",
            "FREE",
            "Microprocessor",
            "Microprocessor"
    };

    final String[] Ece1M_r = {
            "",
            "E108",
            "E108",
            "E108",
            "E108",
            "",
            "",
            "MC Lab",
            "MC Lab"
    };

    final int[] Ece1M_th = {
            R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece1T_s = {
            "FREE",
            "VLSI",
            "Microwave",
            "Microprocessor",
            "FREE",
            "Digital Comm",
            "Microprocessor",
            "VLSI",
            "VLSI"
    };

    final String[] Ece1T_r = {
            "",
            "E108",
            "E108",
            "E108",
            "",
            "D116",
            "D116",
            "VLSI Lab",
            "VLSI Lab"
    };

    final int[] Ece1T_th = {
            R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.t, R.mipmap.t, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece1W_s = {
            "VLSI",
            "Microwave",
            "Digital Comm",
            "VLSI",
            "FREE",
            "FREE",
            "FREE",
            "Digital Comm",
            "Digital Comm"
    };

    final String[] Ece1W_r = {
            "E209",
            "E108",
            "E108",
            "E108",
            "",
            "",
            "",
            "COMM Lab",
            "COMM Lab"
    };

    final int[] Ece1W_th = {
            R.mipmap.t, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece1Th_s = {
            "Human Values",
            "Embedded",
            "Microprocessor",
            "VLSI",
            "FREE",
            "FREE",
            "FREE",
            "Embedded",
            "Microwave",
    };

    final String[] Ece1Th_r = {
            "E108",
            "E108",
            "E108",
            "E108",
            "",
            "",
            "",
            "D116",
            "D116",
    };

    final int[] Ece1Th_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.t, R.mipmap.t
    };

    final String[] Ece1F_s = {
            "FREE",
            "FREE",
            "Digital Comm",
            "Microprocessor",
            "Embedded",
            "FREE",
            "Human Values",
            "Microwave",
            "Microwave"
    };

    final String[] Ece1F_r = {
            "",
            "",
            "E108",
            "E108",
            "E108",
            "",
            "D116",
            "AWP LAB",
            "AWP LAB"
    };

    final int[] Ece1F_th = {
            R.mipmap.f, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.t, R.mipmap.p, R.mipmap.p
    };

   /* final String[] Ece2M_s = {
            "FREE",
            "Human Values",
            "Digital Comm",
            "Microwave",
            "Embedded",
            "FREE",
            "FREE",
            "VLSI",
            "VLSI"
    };

    final String[] Ece2M_r = {
            "",
            "E108",
            "E108",
            "E108",
            "E108",
            "",
            "",
            "VLSI Lab",
            "VLSI Lab"
    };

    final int[] Ece2M_th = {
            R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece2T_s = {
            "FREE",
            "VLSI",
            "Microwave",
            "Microprocessor",
            "Digital Comm",
            "FREE",
            "FREE",
            "Microprocessor",
            "Microprocessor"
    };

    final String[] Ece2T_r = {
            "",
            "E108",
            "E108",
            "E108",
            "D115",
            "",
            "",
            "MC Lab",
            "MC Lab"
    };

    final int[] Ece2T_th = {
            R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.t, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece2W_s = {
            "FREE",
            "Microwave",
            "Digital Comm",
            "VLSI",
            "FREE",
            "Microprocessor",
            "VLSI",
            "Microwave",
            "Microwave"
    };

    final String[] Ece2W_r = {
            "",
            "E108",
            "E108",
            "E108",
            "",
            "D115",
            "D115",
            "AWP Lab",
            "AWP Lab"
    };

    final int[] Ece2W_th = {
            R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.t, R.mipmap.t, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece2Th_s = {
            "Human Values",
            "Embedded",
            "Microprocessor",
            "VLSI",
            "Human Values",
            "FREE",
            "FREE",
            "FREE",
            "FREE",
    };

    final String[] Ece2Th_r = {
            "E108",
            "E108",
            "E108",
            "E108",
            "D115",
            "",
            "",
            "",
            "",
    };

    final int[] Ece2Th_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.t, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece2F_s = {
            "Embedded",
            "Microwave",
            "Digital Comm",
            "Microprocessor",
            "Embedded",
            "FREE",
            "FREE",
            "Digital Comm",
            "Digital Comm"
    };

    final String[] Ece2F_r = {
            "E207",
            "E207",
            "E108",
            "E108",
            "E108",
            "",
            "",
            "COMM LAB",
            "COMM LAB"
    };

    final int[] Ece2F_th = {
            R.mipmap.t, R.mipmap.t, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece3M_s = {
            "FREE",
            "Human Values",
            "Digital Comm",
            "Microwave",
            "Embedded",
            "FREE",
            "FREE",
            "Digital Comm",
            "Digital Comm"
    };
*/
//sem 6
    final String[] Ece2M_s = {
            "FREE",
            "Data Structures",
            "LICA",
            "Embedded",
            "OT",
            "FREE",
            "Entrepreneurship",
            "Entrepreneurship",
            "Entrepreneurship"
    };

    final String[] Ece2M_r = {
            "",
            "E101",
            "E101",
            "E101",
            "E101",
            "",
            "T105",
            "E101",
            "E101"
    };

    final int[] Ece2M_th = {
            R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.l, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece2T_s = {
            "LICA",
            "LICA",
            "Antenna",
            "Data Structures",
            "FREE",
            "Embedded",
            "Embedded",
            "Data Structures",
            "Data Structures"
    };

    final String[] Ece2T_r = {
            "FOC LAB",
            "FOC LAB",
            "E101",
            "E101",
            "",
            "MC LAB",
            "MC LAB",
            "MCA1 LAB",
            "MCA1 LAB"
    };

    final int[] Ece2T_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece2W_s = {
            "OT",
            "Embedded",
            "LICA",
            "Antenna",
            "FREE",
            "OT",
            "FREE",
            "Antenna",
            "Antenna"
    };

    final String[] Ece2W_r = {
            "E101",
            "E101",
            "E208",
            "E208",
            "",
            "E101",
            "",
            "AWP Lab",
            "AWP Lab"
    };

    final int[] Ece2W_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.t, R.mipmap.t, R.mipmap.f, R.mipmap.t, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece2Th_s = {
            "FREE",
            "Embedded",
            "LICA",
            "Antenna",
            "Data Structures",
            "FREE",
            "OT",
            "FREE",
            "FREE",
    };

    final String[] Ece2Th_r = {
            "",
            "E101",
            "E101",
            "E101",
            "E101",
            "",
            "E101",
            "",
            "",
    };

    final int[] Ece2Th_th = {
            R.mipmap.f, R.mipmap.t, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.l, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece2F_s = {
            "Embedded",
            "Antenna",
            "Data Structures",
            "FREE",
            "FREE",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Ece2F_r = {
            "E101",
            "E101",
            "E101",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    final int[] Ece2F_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece3M_s = {
            "FREE",
            "Human Values",
            "Digital Comm",
            "Microwave",
            "Embedded",
            "FREE",
            "FREE",
            "Digital Comm",
            "Digital Comm"
    };


    final String[] Ece3M_r = {
            "",
            "E108",
            "E108",
            "E108",
            "E108",
            "",
            "",
            "COMM LAB",
            "COMM LAB"
    };

    final int[] Ece3M_th = {
            R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece3T_s = {
            "FREE",
            "VLSI",
            "Microwave",
            "Microprocessor",
            "FREE",
            "FREE",
            "FREE",
            "Microwave",
            "Microwave"
    };

    final String[] Ece3T_r = {
            "",
            "E108",
            "E108",
            "E108",
            "",
            "",
            "",
            "AWP LAB",
            "AWP LAB"
    };

    final int[] Ece3T_th = {
            R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece3W_s = {
            "Human Values",
            "Microwave",
            "Digital Comm",
            "VLSI",
            "FREE",
            "FREE",
            "FREE",
            "Microprocessor",
            "Microprocessor"
    };

    final String[] Ece3W_r = {
            "D207",
            "E108",
            "E108",
            "E108",
            "",
            "D115",
            "D115",
            "MC Lab",
            "MC Lab"
    };

    final int[] Ece3W_th = {
            R.mipmap.t, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece3Th_s = {
            "Human Values",
            "Embedded",
            "Microprocessor",
            "VLSI",
            "FREE",
            "Microwave",
            "Embedded",
            "FREE",
            "FREE",
    };

    final String[] Ece3Th_r = {
            "E108",
            "E108",
            "E108",
            "E108",
            "",
            "D116",
            "D116",
            "",
            "",
    };

    final int[] Ece3Th_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.t, R.mipmap.t, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece3F_s = {
            "Digital Comm",
            "Microprocessor",
            "Digital Comm",
            "Microprocessor",
            "Embedded",
            "FREE",
            "VLSI",
            "Digital Comm",
            "Digital Comm"
    };

    final String[] Ece3F_r = {
            "E209",
            "E209",
            "E108",
            "E108",
            "E108",
            "",
            "E207",
            "VLSI LAB",
            "VLSI LAB"
    };

    final int[] Ece3F_th = {
            R.mipmap.t, R.mipmap.t, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.t, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece4M_s = {
            "Digital Comm",
            "Microwave",
            "Microprocessor",
            "Human Values",
            "FREE",
            "Digital Comm",
            "Microprocessor",
            "Human Values",
            "VLSI"
    };

    final String[] Ece4M_r = {
            "E207",
            "E207",
            "E207",
            "E207",
            "",
            "E207",
            "E207",
            "D201",
            ""
    };

    final int[] Ece4M_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.t, R.mipmap.t, R.mipmap.t, R.mipmap.f
    };

    final String[] Ece4T_s = {
            "Digital Comm",
            "Digital Comm",
            "Microwave",
            "Microprocessor",
            "Digital Comm",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Ece4T_r = {
            "COMM LAB",
            "COMM LAB",
            "E207",
            "E207",
            "E207",
            "",
            "",
            "",
            ""
    };

    final int[] Ece4T_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece4W_s = {
            "Embedded",
            "Digital Comm",
            "VLSI",
            "Human Values",
            "FREE",
            "VLSI",
            "Embedded",
            "VLSI",
            "VLSI"
    };

    final String[] Ece4W_r = {
            "E207",
            "E207",
            "E207",
            "E207",
            "",
            "E207",
            "E207",
            "VLSI LAB",
            "VLSI LAB"
    };

    final int[] Ece4W_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.t, R.mipmap.t, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece4Th_s = {
            "Microwave",
            "Microwave",
            "Microprocessor",
            "Embedded",
            "VLSI",
            "FREE",
            "FREE",
            "FREE",
            "FREE",
    };

    final String[] Ece4Th_r = {
            "AWP LAB",
            "AWP LAB",
            "E207",
            "E207",
            "E207",
            "",
            "",
            "",
            "",
    };

    final int[] Ece4Th_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece4F_s = {
            "FREE",
            "Microwave",
            "Microwave",
            "Embedded",
            "VLSI",
            "FREE",
            "FREE",
            "Microprocessor",
            "Microprocessor"
    };

    final String[] Ece4F_r = {
            "",
            "E210",
            "E207",
            "E207",
            "E207",
            "",
            "",
            "MC LAB",
            "MC LAB"
    };

    final int[] Ece4F_th = {
            R.mipmap.f, R.mipmap.t, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece5M_s = {
            "Digital Comm",
            "Microwave",
            "Microprocessor",
            "Human Values",
            "FREE",
            "Human Values",
            "Microwave",
            "Digital Comm",
            "Microprocessor"
    };

    final String[] Ece5M_r = {
            "E207",
            "E207",
            "E207",
            "E207",
            "",
            "D203",
            "D116",
            "E207",
            "E207"
    };

    final int[] Ece5M_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.t, R.mipmap.t, R.mipmap.t, R.mipmap.t
    };

    final String[] Ece5T_s = {
            "Microprocessor",
            "Microprocessor",
            "Microwave",
            "Microprocessor",
            "Digital Comm",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Ece5T_r = {
            "MC LAB",
            "MC LAB",
            "E207",
            "E207",
            "E207",
            "",
            "",
            "",
            ""
    };

    final int[] Ece5T_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece5W_s = {
            "Embedded",
            "Digital Comm",
            "VLSI",
            "Human Values",
            "FREE",
            "VLSI",
            "Embedded",
            "FREE",
            "FREE"
    };

    final String[] Ece5W_r = {
            "E207",
            "E207",
            "E207",
            "E207",
            "",
            "D116",
            "D116",
            "",
            ""
    };

    final int[] Ece5W_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.t, R.mipmap.t, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece5Th_s = {
            "VLSI",
            "VLSI",
            "Microprocessor",
            "Embedded",
            "VLSI",
            "FREE",
            "FREE",
            "Microwave",
            "Microwave",
    };

    final String[] Ece5Th_r = {
            "VLSI LAB",
            "VLSI LAB",
            "E207",
            "E207",
            "E207",
            "",
            "",
            "AWP LAB",
            "AWP LAB",
    };

    final int[] Ece5Th_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece5F_s = {
            "Digital Comm",
            "Digital Comm",
            "Microwave",
            "Embedded",
            "VLSI",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Ece5F_r = {
            "COMM LAB",
            "COMM LAB",
            "E207",
            "E207",
            "E207",
            "",
            "",
            "",
            ""
    };

    final int[] Ece5F_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece6M_s = {
            "Digital Comm",
            "Microwave",
            "Microprocessor",
            "Human Values",
            "FREE",
            "Digital Comm",
            "Microprocessor",
            "",
            ""
    };

    final String[] Ece6M_r = {
            "E207",
            "E207",
            "E207",
            "E207",
            "",
            "D202",
            "D202",
            "",
            ""
    };

    final int[] Ece6M_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.t, R.mipmap.t, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece6T_s = {
            "VLSI",
            "VLSI",
            "Microwave",
            "Microprocessor",
            "Digital Comm",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Ece6T_r = {
            "VLSI LAB",
            "VLSI LAB",
            "E207",
            "E207",
            "E207",
            "",
            "",
            "",
            ""
    };

    final int[] Ece6T_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece6W_s = {
            "Embedded",
            "Digital Comm",
            "VLSI",
            "Human Values",
            "Human Values",
            "",
            "",
            "VLSI",
            "Embedded"
    };

    final String[] Ece6W_r = {
            "E207",
            "E207",
            "E207",
            "E207",
            "D115",
            "",
            "",
            "D116",
            "D116"
    };

    final int[] Ece6W_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.t, R.mipmap.f, R.mipmap.f, R.mipmap.t, R.mipmap.t
    };

    final String[] Ece6Th_s = {
            "Microprocessor",
            "Microprocessor",
            "Microprocessor",
            "Embedded",
            "VLSI",
            "FREE",
            "Microwave",
            "Digital Comm",
            "Digital Comm",
    };

    final String[] Ece6Th_r = {
            "MC LAB",
            "MC LAB",
            "E207",
            "E207",
            "E207",
            "",
            "D115",
            "COMM LAB",
            "COMM LAB",
    };

    final int[] Ece6Th_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.t, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece6F_s = {
            "Microwave",
            "Microwave",
            "Microwave",
            "Embedded",
            "VLSI",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Ece6F_r = {
            "AWP LAB",
            "AWP LAB",
            "E207",
            "E207",
            "E207",
            "",
            "",
            "",
            ""
    };

    final int[] Ece6F_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece7M_s = {
            "Microwave",
            "Microwave",
            "Digital Comm",
            "Microwave",
            "Embedded",
            "FREE",
            "FREE",
            "VLSI",
            "Embedded"
    };

    final String[] Ece7M_r = {
            "AWP LAB",
            "AWP LAB",
            "E107",
            "E107",
            "E107",
            "",
            "",
            "D202",
            "D202"
    };

    final int[] Ece7M_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.t, R.mipmap.t
    };

    final String[] Ece7T_s = {
            "Digital Comm",
            "Microprocessor",
            "Microprocessor",
            "VLSI",
            "FREE",
            "Digital Comm",
            "Digital Comm",
            "Microwave",
            "Human Values"
    };

    final String[] Ece7T_r = {
            "E207",
            "E207",
            "E107",
            "E107",
            "",
            "COMM LAB",
            "COMM LAB",
            "E207",
            "D203"
    };

    final int[] Ece7T_th = {
            R.mipmap.t, R.mipmap.t, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.t, R.mipmap.t
    };

    final String[] Ece7W_s = {
            "Digital Comm",
            "Embedded",
            "Microprocessor",
            "Microprocessor",
            "Microprocessor",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Ece7W_r = {
            "E107",
            "E107",
            "MC LAB",
            "MC LAB",
            "E107",
            "",
            "",
            "",
            ""
    };

    final int[] Ece7W_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece7Th_s = {
            "VLSI",
            "Microwave",
            "VLSI",
            "VLSI",
            "Embedded",
            "FREE",
            "Human Values",
            "FREE",
            "FREE",
    };

    final String[] Ece7Th_r = {
            "E107",
            "E107",
            "VLSI LAB",
            "VLSI LAB",
            "E107",
            "",
            "E107",
            "",
            "",
    };

    final int[] Ece7Th_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.f, R.mipmap.l, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece7F_s = {
            "Human Values",
            "VLSI",
            "Microprocessor",
            "Digital Comm",
            "Microwave",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Ece7F_r = {
            "E107",
            "E107",
            "E107",
            "E107",
            "E107",
            "",
            "",
            "",
            ""
    };

    final int[] Ece7F_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece8M_s = {
            "FREE",
            "Microprocessor",
            "Digital Comm",
            "Microwave",
            "Embedded",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Ece8M_r = {
            "",
            "E210",
            "E107",
            "E107",
            "E107",
            "",
            "",
            "",
            ""
    };

    final int[] Ece8M_th = {
            R.mipmap.f, R.mipmap.t, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece8T_s = {
            "Microwave",
            "Microwave",
            "Microprocessor",
            "VLSI",
            "FREE",
            "VLSI",
            "VLSI",
            "FREE",
            "FREE"
    };

    final String[] Ece8T_r = {
            "AWP LAB",
            "AWP LAB",
            "E107",
            "E107",
            "",
            "VLSI LAB",
            "VLSI LAB",
            "",
            ""
    };

    final int[] Ece8T_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece8W_s = {
            "Digital Comm",
            "Embedded",
            "Digital Comm",
            "Digital Comm",
            "Microprocessor",
            "FREE",
            "Human Values",
            "Microwave",
            "Digital Comm"
    };

    final String[] Ece8W_r = {
            "E107",
            "E107",
            "COMM LAB",
            "COMM LAB",
            "E107",
            "",
            "D202",
            "D203",
            "D203"
    };

    final int[] Ece8W_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.f, R.mipmap.t, R.mipmap.t, R.mipmap.t
    };

    final String[] Ece8Th_s = {
            "VLSI",
            "Microwave",
            "Microprocessor",
            "Microprocessor",
            "Embedded",
            "FREE",
            "Human Values",
            "VLSI",
            "Embedded",
    };

    final String[] Ece8Th_r = {
            "E107",
            "E107",
            "MC LAB",
            "MC LAB",
            "E107",
            "",
            "E107",
            "E201",
            "E201",
    };

    final int[] Ece8Th_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.f, R.mipmap.l, R.mipmap.t, R.mipmap.t
    };

    final String[] Ece8F_s = {
            "Human Values",
            "VLSI",
            "Microprocessor",
            "Digital Comm",
            "Microwave",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Ece8F_r = {
            "E107",
            "E107",
            "E107",
            "E107",
            "E107",
            "",
            "",
            "",
            ""
    };

    final int[] Ece8F_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece9M_s = {
            "Microprocessor",
            "Digital Comm",
            "Digital Comm",
            "Microwave",
            "Embedded",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Ece9M_r = {
            "E209",
            "E211",
            "E107",
            "E107",
            "E107",
            "",
            "",
            "",
            ""
    };

    final int[] Ece9M_th = {
            R.mipmap.t, R.mipmap.t, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece9T_s = {
            "Human Values",
            "Microwave",
            "Microprocessor",
            "VLSI",
            "FREE",
            "Microprocessor",
            "Microprocessor",
            "VLSI",
            "Embedded"
    };

    final String[] Ece9T_r = {
            "D116",
            "E210",
            "E107",
            "E107",
            "",
            "MC LAB",
            "MC LAB",
            "D206",
            "D206"
    };

    final int[] Ece9T_th = {
            R.mipmap.t, R.mipmap.t, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.t, R.mipmap.t
    };

    final String[] Ece9W_s = {
            "Digital Comm",
            "Embedded",
            "Microwave",
            "Microwave",
            "Microprocessor",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Ece9W_r = {
            "E107",
            "E107",
            "AWP LAB",
            "AWP LAB",
            "E107",
            "",
            "",
            "",
            ""
    };

    final int[] Ece9W_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };

    final String[] Ece9Th_s = {
            "VLSI",
            "Microwave",
            "Digital Comm",
            "Digital Comm",
            "Embedded",
            "FREE",
            "Human Values",
            "VLSI",
            "VLSI",
    };

    final String[] Ece9Th_r = {
            "E107",
            "E107",
            "COMM LAB",
            "COMM LAB",
            "E107",
            "",
            "E107",
            "VLSI LAB",
            "VLSI LAB",
    };

    final int[] Ece9Th_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.f, R.mipmap.l, R.mipmap.p, R.mipmap.p
    };

    final String[] Ece9F_s = {
            "Human Values",
            "VLSI",
            "Microprocessor",
            "Digital Comm",
            "Microwave",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Ece9F_r = {
            "E107",
            "E107",
            "E107",
            "E107",
            "E107",
            "",
            "",
            "",
            ""
    };

    final int[] Ece9F_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };

////////////////////////////////////    COE /////////////////////////////////////////////////


    final String[] Coe1M_s = {
            "Big Data Analytics",
            "Software Eng",
            "Comp Networks",
            "Comp Arch",
            "Graphics",
            "FREE",
            "FREE",
            "Os",
            "Os"
    };

    final String[] Coe1M_r = {
            "T301",
            "T301",
            "BEMLDA LAB",
            "T301",
            "T301",
            "",
            "",
            "SEM 1 LAB",
            "SEM 1 LAB"
    };

    final int[] Coe1M_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };

    final String[] Coe2M_s = {
            "Big Data Analytics",
            "Software Eng",
            "Comp Networks",
            "Comp Arch",
            "Graphics",
            "FREE",
            "FREE",
            "Software Eng",
            "Software Eng"
    };

    final String[] Coe2M_r = {
            "T301",
            "T301",
            "CAG LAB",
            "T301",
            "T301",
            "",
            "",
            "CS 3 LAB",
            "CS 3 LAB"
    };

    final int[] Coe2M_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };

    final String[] Coe3M_s = {
            "Big Data Analytics",
            "Software Eng",
            "Comp Networks",
            "Comp Arch",
            "Graphics",
            "FREE",
            "FREE",
            "Big Data Analytics",
            "Big Data Analytics"
    };

    final String[] Coe3M_r = {
            "T301",
            "T301",
            "SEM 1 LAB",
            "T301",
            "T301",
            "",
            "",
            "CS 4 LAB",
            "CS 4 LAB"
    };

    final int[] Coe3M_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };

    final String[] Coe1T_s = {
            "Software Eng",
            "Comp Networks",
            "Graphics",
            "Big Data Analytics",
            "FREE",
            "Os",
            "Comp Arch",
            "Big Data Analytics",
            "Big Data Analytics"
    };

    final String[] Coe1T_r = {
            "T301",
            "T301",
            "T301",
            "T301",
            "",
            "T301",
            "T301",
            "CS 3 LAB",
            "CS 3 LAB"
    };

    final int[] Coe1T_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.p
    };

    final String[] Coe2T_s = {
            "Software Eng",
            "Comp Networks",
            "Graphics",
            "Big Data Analytics",
            "FREE",
            "Os",
            "Comp Arch",
            "Os",
            "Os"
    };

    final String[] Coe2T_r = {
            "T301",
            "T301",
            "T301",
            "T301",
            "",
            "T301",
            "T301",
            "CS 4 LAB",
            "CS 4 LAB"
    };

    final int[] Coe2T_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.p
    };

    final String[] Coe3T_s = {
            "Software Eng",
            "Comp Networks",
            "Graphics",
            "Big Data Analytics",
            "FREE",
            "Os",
            "Comp Arch",
            "Software Eng",
            "Software Eng"
    };

    final String[] Coe3T_r = {
            "T301",
            "T301",
            "T301",
            "T301",
            "",
            "T301",
            "T301",
            "MCA 1 LAB",
            "MCA 1 LAB"
    };

    final int[] Coe3T_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.p
    };

    final String[] Coe1W_s = {
            "Software Eng",
            "Software Eng",
            "Comp Networks",
            "Software Eng",
            "FREE",
            "Os",
            "Big Data Analytics",
            "FREE",
            "FREE"
    };

    final String[] Coe1W_r = {
            "CS 4 LAB",
            "CS 4 LAB",
            "T301",
            "T301",
            "",
            "T301",
            "T301",
            "",
            ""
    };

    final int[] Coe1W_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f
    };
    final String[] Coe2W_s = {
            "Big Data Analytics",
            "Big Data Analytics",
            "Comp Networks",
            "Software Eng",
            "FREE",
            "Os",
            "Big Data Analytics",
            "FREE",
            "FREE"
    };

    final String[] Coe2W_r = {
            "MCA 1 LAB",
            "MCA 1 LAB",
            "T301",
            "T301",
            "",
            "T301",
            "T301",
            "",
            ""
    };

    final int[] Coe2W_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f
    };
    final String[] Coe3W_s = {
            "Os",
            "Os",
            "Comp Networks",
            "Software Eng",
            "FREE",
            "Os",
            "Big Data Analytics",
            "FREE",
            "FREE"
    };

    final String[] Coe3W_r = {
            "MCA 2 LAB",
            "MCA 2 LAB",
            "T301",
            "T301",
            "",
            "T301",
            "T301",
            "",
            ""
    };

    final int[] Coe3W_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f
    };
    final String[] Coe1Th_s = {
            "FREE",
            "FREE",
            "FREE",
            "FREE",
            "FREE",
            "Comp Arch",
            "Comp Arch",
            "Graphics",
            "Graphics"
    };

    final String[] Coe1Th_r = {
            "",
            "",
            "",
            "",
            "",
            "SEM 1 LAB",
            "SEM 1 LAB",
            "MCA 1 LAB",
            "MCA 1 LAB"
    };

    final int[] Coe1Th_th = {
            R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.p, R.mipmap.p
    };
    final String[] Coe2Th_s = {
            "FREE",
            "FREE",
            "FREE",
            "FREE",
            "FREE",
            "Graphics",
            "Graphics",
            "Comp Arch",
            "Comp Arch"
    };

    final String[] Coe2Th_r = {
            "",
            "",
            "",
            "",
            "",
            "CS 3 LAB",
            "CS 3 LAB",
            "MCA 2 LAB",
            "MCA 2 LAB"
    };

    final int[] Coe2Th_th = {
            R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.p, R.mipmap.p
    };
    final String[] Coe3Th_s = {
            "FREE",
            "FREE",
            "FREE",
            "FREE",
            "FREE",
            "Comp Arch",
            "Comp Arch",
            "FREE",
            "FREE"
    };

    final String[] Coe3Th_r = {
            "",
            "",
            "",
            "",
            "",
            "CS 4 LAB",
            "CS 4 LAB",
            "",
            ""
    };

    final int[] Coe3Th_th = {
            R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.f, R.mipmap.f
    };
    final String[] Coe1F_s = {
            "FREE",
            "FREE",
            "Os",
            "Comp Networks",
            "FREE",
            "Comp Arch",
            "Graphics",
            "FREE",
            "FREE"
    };

    final String[] Coe1F_r = {
            "",
            "",
            "T301",
            "T301",
            "",
            "T301",
            "T301",
            "",
            ""
    };

    final int[] Coe1F_th = {
            R.mipmap.f, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f
    };
    final String[] Coe2F_s = {
            "FREE",
            "FREE",
            "Os",
            "Comp Networks",
            "FREE",
            "Comp Arch",
            "Graphics",
            "FREE",
            "FREE"
    };

    final String[] Coe2F_r = {
            "",
            "",
            "T301",
            "T301",
            "",
            "T301",
            "T301",
            "",
            ""
    };

    final int[] Coe2F_th = {
            R.mipmap.f, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f
    };
    final String[] Coe3F_s = {
            "Graphics",
            "Graphics",
            "Os",
            "Comp Networks",
            "FREE",
            "Comp Arch",
            "Graphics",
            "FREE",
            "FREE"
    };

    final String[] Coe3F_r = {
            "CS 4 LAB",
            "CS 4 LAB",
            "T301",
            "T301",
            "",
            "T301",
            "T301",
            "",
            ""
    };

    final int[] Coe3F_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f
    };
    final String[] Coe4M_s = {
            "FREE",
            "FREE",
            "Graphics",
            "Graphics",
            "FREE",
            "Graphics",
            "Comp Networks",
            "Software Eng",
            "Comp Arch"
    };

    final String[] Coe4M_r = {
            "",
            "",
            "CS 4 LAB",
            "CS 4 LAB",
            "",
            "T302",
            "T302",
            "T302",
            "T302"
    };

    final int[] Coe4M_th = {
            R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l
    };
    final String[] Coe5M_s = {
            "FREE",
            "FREE",
            "Comp Arch",
            "Comp Arch",
            "FREE",
            "Graphics",
            "Comp Networks",
            "Software Eng",
            "Comp Arch"
    };

    final String[] Coe5M_r = {
            "",
            "",
            "MCA 1 LAB",
            "MCA 1 LAB",
            "",
            "T302",
            "T302",
            "T302",
            "T302"
    };

    final int[] Coe5M_th = {
            R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l
    };
    final String[] Coe6M_s = {
            "FREE",
            "FREE",
            "Graphics",
            "Graphics",
            "FREE",
            "Graphics",
            "Comp Networks",
            "Software Eng",
            "Comp Arch"
    };

    final String[] Coe6M_r = {
            "",
            "",
            "MCA 2 LAB",
            "MCA 2 LAB",
            "",
            "T302",
            "T302",
            "T302",
            "T302"
    };

    final int[] Coe6M_th = {
            R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l
    };
    final String[] Coe4T_s = {
            "Graphics",
            "Os",
            "FREE",
            "FREE",
            "FREE",
            "Os",
            "Os",
            "Comp Arch",
            "Graphics"
    };

    final String[] Coe4T_r = {
            "T302",
            "T302",
            "",
            "",
            "",
            "SEM 1 LAB",
            "SEM 1 LAB",
            "T302",
            "T302"
    };

    final int[] Coe4T_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l
    };
    final String[] Coe5T_s = {
            "Graphics",
            "Os",
            "FREE",
            "FREE",
            "FREE",
            "Software Eng",
            "Software Eng",
            "Comp Arch",
            "Graphics"
    };

    final String[] Coe5T_r = {
            "T302",
            "T302",
            "",
            "",
            "",
            "CS 3 LAB",
            "CS 3 LAB",
            "T302",
            "T302"
    };

    final int[] Coe5T_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l
    };
    final String[] Coe6T_s = {
            "Graphics",
            "Os",
            "FREE",
            "FREE",
            "FREE",
            "Big Data Analytics",
            "Big Data Analytics",
            "Comp Arch",
            "Graphics"
    };

    final String[] Coe6T_r = {
            "T302",
            "T302",
            "",
            "",
            "",
            "CS 4 LAB",
            "CS 4 LAB",
            "T302",
            "T302"
    };

    final int[] Coe6T_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l
    };
    final String[] Coe4W_s = {
            "Comp Networks",
            "Software Eng",
            "Big Data Analytics",
            "Comp Arch",
            "FREE",
            "FREE",
            "FREE",
            "Software Eng",
            "Software Eng"
    };

    final String[] Coe4W_r = {
            "T302",
            "T302",
            "T302",
            "T302",
            "",
            "",
            "",
            "BEMLDA LAB",
            "BEMLDA LAB"
    };

    final int[] Coe4W_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };
    final String[] Coe5W_s = {
            "Comp Networks",
            "Software Eng",
            "Big Data Analytics",
            "Comp Arch",
            "FREE",
            "FREE",
            "FREE",
            "Big Data Analytics",
            "Big Data Analytics"
    };

    final String[] Coe5W_r = {
            "T302",
            "T302",
            "T302",
            "T302",
            "",
            "",
            "",
            "CAG LAB",
            "CAG LAB"
    };

    final int[] Coe5W_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };
    final String[] Coe6W_s = {
            "Comp Networks",
            "Software Eng",
            "Big Data Analytics",
            "Comp Arch",
            "FREE",
            "FREE",
            "FREE",
            "Os",
            "Os"
    };

    final String[] Coe6W_r = {
            "T302",
            "T302",
            "T302",
            "T302",
            "",
            "",
            "",
            "SEM 1 LAB",
            "SEM 1 LAB"
    };

    final int[] Coe6W_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };
    final String[] Coe4Th_s = {
            "FREE",
            "Os",
            "Big Data Analytics",
            "Comp Networks",
            "Comp Networks",
            "FREE",
            "FREE",
            "Big Data Analytics",
            "Big Data Analytics"
    };

    final String[] Coe4Th_r = {
            "",
            "T302",
            "T302",
            "T302",
            "BEMLDA LAB",
            "",
            "",
            "BEMLDA LAB",
            "BEMLDA LAB"
    };

    final int[] Coe4Th_th = {
            R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };
    final String[] Coe5Th_s = {
            "FREE",
            "Os",
            "Big Data Analytics",
            "Comp Networks",
            "Comp Networks",
            "FREE",
            "FREE",
            "Os",
            "Os"
    };

    final String[] Coe5Th_r = {
            "",
            "T302",
            "T302",
            "T302",
            "CAG LAB",
            "",
            "",
            "CS 3 LAB",
            "CS 3 LAB"
    };

    final int[] Coe5Th_th = {
            R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };
    final String[] Coe6Th_s = {
            "FREE",
            "Os",
            "Big Data Analytics",
            "Comp Networks",
            "Comp Networks",
            "FREE",
            "FREE",
            "Software Eng",
            "Software Eng"
    };

    final String[] Coe6Th_r = {
            "",
            "T302",
            "T302",
            "T302",
            "SEM 1 LAB",
            "",
            "",
            "CS 4 LAB",
            "CS 4 LAB"
    };

    final int[] Coe6Th_th = {
            R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.f, R.mipmap.f, R.mipmap.p, R.mipmap.p
    };
    final String[] Coe4F_s = {
            "FREE",
            "Os",
            "Big Data Analytics",
            "Software Eng",
            "FREE",
            "Comp Arch",
            "Comp Arch",
            "FREE",
            "FREE"
    };

    final String[] Coe4F_r = {
            "",
            "T302",
            "T302",
            "T302",
            "",
            "SEM 1 LAB",
            "SEM 1 LAB",
            "",
            ""
    };

    final int[] Coe4F_th = {
            R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.f, R.mipmap.f
    };
    final String[] Coe5F_s = {
            "FREE",
            "Os",
            "Big Data Analytics",
            "Software Eng",
            "FREE",
            "Graphics",
            "Graphics",
            "FREE",
            "FREE"
    };

    final String[] Coe5F_r = {
            "",
            "T302",
            "T302",
            "T302",
            "",
            "CS 3 LAB",
            "CS 3 LAB",
            "",
            ""
    };

    final int[] Coe5F_th = {
            R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.f, R.mipmap.f
    };
    final String[] Coe6F_s = {
            "FREE",
            "Os",
            "Big Data Analytics",
            "Software Eng",
            "FREE",
            "Comp Arch",
            "Comp Arch",
            "FREE",
            "FREE"
    };

    final String[] Coe6F_r = {
            "",
            "T302",
            "T302",
            "T302",
            "",
            "CS 4 LAB",
            "CS 4 LAB",
            "",
            ""
    };

    final int[] Coe6F_th = {
            R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.f, R.mipmap.f
    };
    final String[] Coe7T_s = {
            "Big Data Analytics",
            "Big Data Analytics",
            "Software Eng",
            "Os",
            "Comp Networks",
            "FREE",
            "Comp Arch",
            "Software Eng",
            "FREE"
    };

    final String[] Coe7T_r = {
            "BEMLDA LAB",
            "BEMLDA LAB",
            "T302",
            "T302",
            "SEM 1 LAB",
            "",
            "T302",
            "T301",
            ""
    };

    final int[] Coe7T_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.f
    };
    final String[] Coe7M_s = {
            "Comp Arch",
            "Graphics",
            "Comp Networks",
            "Software Eng",
            "FREE",
            "Os",
            "Os",
            "FREE",
            "FREE"
    };

    final String[] Coe7M_r = {
            "T302",
            "T302",
            "T302",
            "T302",
            "",
            "SEM 1 LAB",
            "SEM 1 LAB",
            "",
            ""
    };

    final int[] Coe7M_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.f, R.mipmap.f
    };
    final String[] Coe7W_s = {
            "Graphics",
            "Comp Arch",
            "Graphics",
            "Graphics",
            "FREE",
            "Os",
            "Big Data Analytics",
            "Graphics",
            "FREE"
    };

    final String[] Coe7W_r = {
            "T301",
            "T301",
            "CS 4 LAB",
            "CS 4 LAB",
            "",
            "T302",
            "T302",
            "T302",
            ""
    };

    final int[] Coe7W_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.p, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f
    };
    final String[] Coe7Th_s = {
            "Software Eng",
            "Software Eng",
            "Big Data Analytics",
            "Comp Networks",
            "Os",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Coe7Th_r = {
            "CS 3 LAB",
            "CS 3 LAB",
            "T301",
            "T301",
            "T301",
            "",
            "",
            "",
            ""
    };

    final int[] Coe7Th_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };
    final String[] Coe7F_s = {
            "FREE",
            "Big Data Analytics",
            "Comp Arch",
            "Comp Arch",
            "Comp Networks",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Coe7F_r = {
            "",
            "T301",
            "CS 3 LAB",
            "CS 3 LAB",
            "T302",
            "",
            "",
            "",
            ""
    };

    final int[] Coe7F_th = {
            R.mipmap.f, R.mipmap.l, R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };
    final String[] Coe8T_s = {
            "Os",
            "Os",
            "Software Eng",
            "Os",
            "Comp Networks",
            "FREE",
            "Comp Arch",
            "Software Eng",
            "FREE"
    };

    final String[] Coe8T_r = {
            "CAG LAB",
            "CAG LAB",
            "T302",
            "T302",
            "CS 3 LAB",
            "",
            "T302",
            "T301",
            ""
    };

    final int[] Coe8T_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.f
    };
    final String[] Coe8M_s = {
            "Comp Arch",
            "Graphics",
            "Comp Networks",
            "Software Eng",
            "FREE",
            "Software Eng",
            "Software Eng",
            "FREE",
            "FREE"
    };

    final String[] Coe8M_r = {
            "T302",
            "T302",
            "T302",
            "T302",
            "",
            "CS 3 LAB",
            "CS 3 LAB",
            "",
            ""
    };

    final int[] Coe8M_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.f, R.mipmap.f
    };
    final String[] Coe8W_s = {
            "Graphics",
            "Comp Arch",
            "Comp Arch",
            "Comp Arch",
            "FREE",
            "Os",
            "Big Data Analytics",
            "Graphics",
            "FREE"
    };

    final String[] Coe8W_r = {
            "T301",
            "T301",
            "MCA 1 LAB",
            "MCA 1 LAB",
            "",
            "T302",
            "T302",
            "T302",
            ""
    };

    final int[] Coe8W_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.p, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f
    };
    final String[] Coe8Th_s = {
            "Big Data Analytics",
            "Big Data Analytics",
            "Big Data Analytics",
            "Comp Networks",
            "Os",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Coe8Th_r = {
            "CS 4 LAB",
            "CS 4 LAB",
            "T301",
            "T301",
            "T301",
            "",
            "",
            "",
            ""
    };

    final int[] Coe8Th_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };
    final String[] Coe8F_s = {
            "FREE",
            "Big Data Analytics",
            "Graphics",
            "Graphics",
            "Comp Networks",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Coe8F_r = {
            "",
            "T301",
            "CS 4 LAB",
            "CS 4 LAB",
            "T302",
            "",
            "",
            "",
            ""
    };

    final int[] Coe8F_th = {
            R.mipmap.f, R.mipmap.l, R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };
    final String[] Coe9T_s = {
            "Software Eng",
            "Software Eng",
            "Software Eng",
            "Os",
            "Comp Networks",
            "FREE",
            "Comp Arch",
            "Software Eng",
            "FREE"
    };

    final String[] Coe9T_r = {
            "SEM 1 LAB",
            "SEM 1 LAB",
            "T302",
            "T302",
            "CS 4 LAB",
            "",
            "T302",
            "T301",
            ""
    };

    final int[] Coe9T_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.f
    };
    final String[] Coe9M_s = {
            "Comp Arch",
            "Graphics",
            "Comp Networks",
            "Software Eng",
            "FREE",
            "Big Data Analytics",
            "Big Data Analytics",
            "FREE",
            "FREE"
    };

    final String[] Coe9M_r = {
            "T302",
            "T302",
            "T302",
            "T302",
            "",
            "CS 4 LAB",
            "CS 4 LAB",
            "",
            ""
    };

    final int[] Coe9M_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.p, R.mipmap.p, R.mipmap.f, R.mipmap.f
    };
    final String[] Coe9W_s = {
            "Graphics",
            "Comp Arch",
            "Graphics",
            "Graphics",
            "FREE",
            "Os",
            "Big Data Analytics",
            "Graphics",
            "FREE"
    };

    final String[] Coe9W_r = {
            "T301",
            "T301",
            "MCA 2 LAB",
            "MCA 2 LAB",
            "",
            "T302",
            "T302",
            "T302",
            ""
    };

    final int[] Coe9W_th = {
            R.mipmap.l, R.mipmap.l, R.mipmap.p, R.mipmap.p, R.mipmap.f, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f
    };
    final String[] Coe9Th_s = {
            "Os",
            "Os",
            "Big Data Analytics",
            "Comp Networks",
            "Os",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Coe9Th_r = {
            "MCA 1 LAB",
            "MCA 1 LAB",
            "T301",
            "T301",
            "T301",
            "",
            "",
            "",
            ""
    };

    final int[] Coe9Th_th = {
            R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.l, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };
    final String[] Coe9F_s = {
            "FREE",
            "Big Data Analytics",
            "Comp Arch",
            "Comp Arch",
            "Comp Networks",
            "FREE",
            "FREE",
            "FREE",
            "FREE"
    };

    final String[] Coe9F_r = {
            "",
            "T301",
            "MCA 1 LAB",
            "MCA 1 LAB",
            "T302",
            "",
            "",
            "",
            ""
    };

    final int[] Coe9F_th = {
            R.mipmap.f, R.mipmap.l, R.mipmap.p, R.mipmap.p, R.mipmap.l, R.mipmap.f, R.mipmap.f, R.mipmap.f, R.mipmap.f
    };

}
