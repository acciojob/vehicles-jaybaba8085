package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super("name",0);
        setManual(isManual);

    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate ; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            setGears(1);
            stop();

        }
        if(newSpeed > 0 && newSpeed<=50) {
            setCurrentSpeed(newSpeed);
            setGears(1);
        }
        if(newSpeed > 50 && newSpeed<=100) {
            setCurrentSpeed(newSpeed);
            setGears(2);
        }
        if(newSpeed > 100 && newSpeed<=150) {
            setCurrentSpeed(newSpeed);
            setGears(3);
        }
        if(newSpeed > 150 && newSpeed<=200) {
            setCurrentSpeed(newSpeed);
            setGears(4);
        }
        if(newSpeed > 200 && newSpeed<=250) {
            setCurrentSpeed(newSpeed);
            setGears(5);
        }
        if(newSpeed > 250 ) {
            setCurrentSpeed(newSpeed);
            setGears(6);
        }
        //for all other cases, change the gear accordingly
//        if(newSpeed > 0) {
//            changeSpeed(newSpeed, steer());
//        }
    }
}
