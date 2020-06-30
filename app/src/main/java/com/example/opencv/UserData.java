package com.example.opencv;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UserData {
    private String number ="";
    private String name ="";
    private String phone ="";
    private String district ="";
    private String residence ="";
    private String out_yu ="";
    private String touch_hubei_people ="";
    private String touch_confirmed_suspected ="";

    private String confirmed_suspected ="";
    private String heat ="";
    private String symptom ="";
    private String confirmed ="";
    private String suspected ="";
    private String ill_history ="";

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public void setOut_yu(String out_yu) {
        this.out_yu = out_yu;
    }

    public void setTouch_hubei_people(String touch_hubei_people) {
        this.touch_hubei_people = touch_hubei_people;
    }

    public void setTouch_confirmed_suspected(String touch_confirm_suspected) {
        this.touch_confirmed_suspected = touch_confirm_suspected;
    }

    public void setConfirmed_suspected(String confirmed_suspected) {
        this.confirmed_suspected = confirmed_suspected;
    }

    public void setHeat(String heat) {
        this.heat = heat;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public void setSuspected(String suspected) {
        this.suspected = suspected;
    }

    public void setIll_history(String ill_history) {
        this.ill_history = ill_history;
    }

    @Override
    public String toString() {
        try {
            return
                    "number=" + number  +
                            "&name=" + URLEncoder.encode(name,"utf-8")  +
                            "&phone=" + phone  +
                            "&district=" +  URLEncoder.encode(district,"utf-8") +
                            "&residence=" +  URLEncoder.encode(residence,"utf-8") +
                            "&out_yu=" +  URLEncoder.encode(out_yu,"utf-8") +
                            "&touch_hubei_people=" +  URLEncoder.encode(touch_hubei_people,"utf-8") +
                            "&touch_confirm_suspected=" +  URLEncoder.encode(touch_confirmed_suspected,"utf-8") +
                            "&confirmed_suspected=" +  URLEncoder.encode(confirmed_suspected,"utf-8") +
                            "&heat=" +  URLEncoder.encode(heat,"utf-8") +
                            "&symptom=" +  URLEncoder.encode(symptom,"utf-8") +
                            "&confirmed=" +  URLEncoder.encode(confirmed,"utf-8") +
                            "&suspected=" +  URLEncoder.encode(suspected,"utf-8") +
                            "&ill_history=" +  URLEncoder.encode(ill_history,"utf-8") ;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }
}
