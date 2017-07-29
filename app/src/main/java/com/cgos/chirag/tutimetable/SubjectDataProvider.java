package com.cgos.chirag.tutimetable;

/**
 * Created by CHIRAG on 25-07-2016.
 */
public class SubjectDataProvider {
    private int subject_thumbs_resource;
    private String subject_code;
    private String room_code;
    private String time_code;

    public String getTime_code() {
        return time_code;
    }

    public void setTime_code(String time_code) {
        this.time_code = time_code;
    }

    public SubjectDataProvider(int subject_thumbs_resource, String subject_code, String room_code, String time_code){
        this.setSubject_thumbs_resource(subject_thumbs_resource);
        this.setSubject_code(subject_code);
        this.setRoom_code(room_code);
        this.setTime_code(time_code);

    }

    public int getSubject_thumbs_resource() {
        return subject_thumbs_resource;
    }

    public void setSubject_thumbs_resource(int subject_thumbs_resource) {
        this.subject_thumbs_resource = subject_thumbs_resource;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public String getRoom_code() {
        return room_code;
    }

    public void setRoom_code(String room_code) {
        this.room_code = room_code;
    }


}

