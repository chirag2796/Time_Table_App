package com.cgos.chirag.tutimetable;

/**
 * Created by CHIRAG on 27-07-2016.
 */
public class ToastCheck {

    String toastCheck(String subject){

        switch (subject){
            case "Human Values": subject="UHU003";
                break;
            case "VLSI": subject="UEC503";
                break;
            case "Microwave": subject="UEC505";
                break;
            case "Microprocessor": subject="UEC502";
                break;
            case "Digital Comm": subject="UEC501";
                break;
            case "FREE": subject="Free";
                break;
           // case "Embedded": subject="UEC504";
           //     break;
            case "Big Data Analytics": subject="UCS506";
                break;
            case "Comp Networks": subject="UCS402";
                break;
            case "Software Eng": subject="UCS503";
                break;
            case "Os": subject="UCS303";
                break;
            case "Comp Arch": subject="UCS507";
                break;
            case "Graphics": subject="UCS508";
                break;
            case "Machine Learning": subject="UML501";
                break;

            case "Chem Rx Eng.": subject="UCH501";
                break;
            case "Mass Transfer": subject="UCH502";
                break;
            case "Industrial Poll": subject="UCH503";
                break;
            case "Energy Tech": subject="UCH504";
                break;
            case "Process Eq Design": subject="UCH505";
                break;
            case "Process I&C": subject="UCH506";
                break;
            case "EVS": subject="UEN003";
                break;

            ///sem6
            case "Data Structures": subject="UCS406";
                break;
            case "OT": subject="UMA031";
                break;
            case "LICA": subject="UEC613";
                break;
            case "Antenna": subject="UEC601";
                break;
            case "Embedded": subject="";
                break;

            case "Control Systems": subject = "UEC604";
                break;
            case "Fiber Optics": subject = "UEC802";
                break;
            case "ASIC": subject = "UEC701";
                break;
            case "Wireless Comm": subject = "UEC804";
                break;
            case "Soft Computing": subject = "UEC723";
                break;


            default: subject="";
        }

        return subject;
    }
}
