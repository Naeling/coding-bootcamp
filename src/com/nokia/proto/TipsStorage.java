package com.nokia.proto;

public class TipsStorage {


    public TipsStorage(){}
    static public boolean storeTip(){
        try {
            DatabaseManager.testPost();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    static public String retrieveRandomTip(){
        try {
            return DatabaseManager.getRandomTip();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}
