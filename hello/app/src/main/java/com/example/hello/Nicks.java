package com.example.hello;

public class Nicks {

        String nickName;
        String nickResult;
        String nickName2;
        String nickResult2;

    public Nicks(String nickName, String nickResult, String nickName2, String nickResult2) {

        this.nickName = nickName;
        this.nickResult = nickResult;
        this.nickName2 = nickName2;
        this.nickResult2 = nickResult2;
    }


    public String getNickName() {
        return nickName;
    }

    public String getNickResult(){
        return nickResult;
    }

    public String getNickName2() {
        return nickName2;
    }

    public String getNickResult2(){ return nickResult2; }
}
