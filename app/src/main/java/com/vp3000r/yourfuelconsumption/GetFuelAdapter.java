package com.vp3000r.yourfuelconsumption;

/**
 * Created by P on 01.12.16.
 */
public class GetFuelAdapter extends PricesController implements GetFuel {
    public double getFuel(int fuelkind) {
     return sendPrice(fuelkind);

    };
}
