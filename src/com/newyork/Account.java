package com.newyork;

public class Account {

    private String cardId;
    private String userName;//username
    private String passWord;
    private double money;
    private double quotaMoney; //limit everytime

    public String getCardId(){
        return cardId;

    }
    public void setCardId(String cardId){
        this.cardId=cardId;

    }

    public String getUserName(){
        return userName;

    }

    public void setUserName(String userName){
        this.userName=userName;

    }


}
