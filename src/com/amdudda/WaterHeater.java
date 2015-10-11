package com.amdudda;

import java.util.Date;

/**
 * Created by amdudda on 10/11/15.
 */
public class WaterHeater extends ServiceCall {

    // attributes
    // inherits address, service date, resolved date, and problem description from ServiceCall.
    // also inherits resolution and fee from ServiceCall
    protected double age; // age of the heater
    protected final int county_fee = 20;  // mandatory county fee is $20

    // constructor
    public WaterHeater(String serviceAddress, String problemDescription, Date date, double hAge) {

        super(serviceAddress,problemDescription,date);
        this.age = hAge;
    }

    // toString overrides inherited toString method
    @Override
    public String toString() {
        // preformatting some of our output
        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);

        // and our output
        return "Water Heater Service Call:\n" +
                "Service Address: " + serviceAddress + "\n" +
                "Problem Description: " + problemDescription  + "\n" +
                String.format("Water Heater Age: %.1f year(s)\n", age) +
                "Reported Date: " + reportedDate  + "\n" +
                "Resolved Date: " + resolvedDateString + "\n" +
                "Resolution Description: " + resolutionString + "\n" +
                "Base Fee: " + feeString + "\n" +
                "City Fee: " + this.county_fee;
    }  // end toString override

    // setter and getters for class variables
    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getCounty_fee() {
        return county_fee;
    }
    // end setter and getters

} // end WaterHeater class
