package model;

import java.time.LocalDateTime;
import java.util.Random;

class Weather {
    private Random random = new Random();
    private static final String[] seasons = {
            "Winter", "Winter",
            "Spring", "Spring", "Spring",
            "Summer", "Summer", "Summer",
            "Fall", "Fall", "Fall",
            "Winter"
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
