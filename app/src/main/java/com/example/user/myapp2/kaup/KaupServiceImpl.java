package com.example.user.myapp2.kaup;

/**
 * Created by USER on 2016-06-04.
 */
public class KaupServiceImpl implements KaupService{


    @Override
    public String getKaup(double weight, double height) {
        int idx =(int) (weight/(height*height)*10000);
        String result = "";

        if(idx>=30){
            result="비만";
        }else  if(idx>=24){
            result="과체중";
        }else  if(idx>=20){
            result="정상";
        }else  if(idx>=15){
            result="저체중";
        }else  if(idx>=13){
            result="마름";
        }else  if(idx>=10){
            result="영양실조";
        }else  if(idx>=24){
            result="소모증";
        }
        return result;
    }
}
