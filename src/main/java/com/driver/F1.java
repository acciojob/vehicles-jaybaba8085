package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super("name",1,2,3,isManual,"Mountain",1);
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
            stop();
            changeGear(1);

        }
        if(newSpeed > 0 && newSpeed<=50) {
//            setCurrentSpeed(newSpeed);
//            setCurrentDirection(getCurrentDirection());
            changeGear(1);
           changeSpeed(newSpeed,getCurrentDirection());

        }
        if(newSpeed > 50 && newSpeed<=100) {
//            setCurrentSpeed(newSpeed);
//            setCurrentDirection(getCurrentDirection());
            changeGear(2);
            changeSpeed(newSpeed,getCurrentDirection());

        }
        if(newSpeed > 100 && newSpeed<=150) {
//            setCurrentSpeed(newSpeed);
//            setCurrentDirection(getCurrentDirection());
            changeGear(3);
            changeSpeed(newSpeed,getCurrentDirection());

        }
        if(newSpeed > 150 && newSpeed<=200) {
//            setCurrentSpeed(newSpeed);
//            setCurrentDirection(getCurrentDirection());
            changeGear(4);
             changeSpeed(newSpeed,getCurrentDirection());

        }
        if(newSpeed > 200 && newSpeed<=250) {
//            setCurrentSpeed(newSpeed);
//            setCurrentDirection(getCurrentDirection());
            changeGear(5);
             changeSpeed(newSpeed,getCurrentDirection());

        }
        if(newSpeed > 250 ) {
//            setCurrentSpeed(newSpeed);
//            setCurrentDirection(getCurrentDirection());
            changeGear(6);
            changeSpeed(newSpeed,getCurrentDirection());

            if(newSpeed>0)
            {
                changeGear(1);
                changeSpeed(newSpeed,getCurrentDirection());
            }
        }
    }
}
