package com.example.annotaiondemo.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
   
    @Autowired
    AkDemo ak;
    public AkDemo getAk() {
        return ak;
    }

    public void setAk(AkDemo ak) {
        this.ak = ak;
    }

    @Autowired
   MobileProcessor mp;
    public MobileProcessor getMp() {
        return mp;
    }

    public void setMp(MobileProcessor mp) {
        this.mp = mp;
    }
    public void config(){
        System.out.println("Octa core,6GB RAM,48mp rare Camera");
        mp.Processor();
        ak.getSnampdragon();
    }

   

    
}