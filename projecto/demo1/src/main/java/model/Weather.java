package model;

import java.time.LocalDateTime;
import java.util.Random;

class Weather {
    private Random random = new Random();
    
    private static String fall = "Fall";
    private static String winter = "Winter";
    private static String spring = "Spring";
    private static String summer = "Summer";
    		
    private static final String[] seasons = {
    		winter, winter,
    		spring, spring, spring,
    		summer, summer, summer,
            fall, fall, fall,
            winter
    };

    private String getSeason() {
        return seasons[LocalDateTime.now().getMonthValue()];
    }

    public double getSeasonDelay() {
        switch (getSeason()){
            case "Summer":
                return this.random.nextDouble() % 0.1;

            case "Spring":
                return this.random.nextDouble() % 0.3;

            case "Fall":
                return this.random.nextDouble() % 0.35;

            default:
                return this.random.nextDouble() % 0.6;
        }
    }
}
