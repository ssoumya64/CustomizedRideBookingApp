package com.codingshuttle.project.uber.strategy;

import com.codingshuttle.project.uber.strategy.impl.DriverMatchingHighestRatedStrategy;
import com.codingshuttle.project.uber.strategy.impl.RideFareDefaultFareCalculationStrategy;
import com.codingshuttle.project.uber.strategy.impl.RideFareSurgePricingCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@RequiredArgsConstructor
public class RideStrategyManager {
    private final DriverMatchingHighestRatedStrategy highestRatedStrategy;
    private final DriverMatchingHighestRatedStrategy nearestDriverStrategy;
    private final RideFareSurgePricingCalculationStrategy surgePricingCalculationStrategy;
    private final RideFareDefaultFareCalculationStrategy rideFareDefaultFareCalculationStrategy;
public DriverMatchingStrategy drivermatchingstrategy(double rideRating){
    if(rideRating >= 4.8){
        return highestRatedStrategy;
    }else {
        return nearestDriverStrategy;
    }
}
public RideFareCalculationStrategy rideFareCalculationStrategy() {
    LocalTime surgeStarttime = LocalTime.of(18, 0);
    LocalTime surgeEndtime = LocalTime.of(21, 0);
    LocalTime currenttime = LocalTime.now();
    boolean isSurgeTime = currenttime.isAfter(surgeStarttime) && currenttime.isBefore(surgeEndtime);
    if (isSurgeTime){
        return surgePricingCalculationStrategy;
    }else{
        return rideFareDefaultFareCalculationStrategy;
    }
}

}
