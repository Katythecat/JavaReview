package com.syntax.review9.rewatch;

public class CustomerEncap {
    private String name;
    private long ssn;

    public void setName(String name){
        if(name!=null && !name.isEmpty()){
            this.name=name;
        }
    }

    public String getName(){
        return name;
    }

    public void setSSN(long ssn){
        if(ssn!=0){
            this.ssn=ssn;
    }
    }
    public long getSSN(){
        return ssn;
    }


}
