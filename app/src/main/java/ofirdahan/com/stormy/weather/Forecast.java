package ofirdahan.com.stormy.weather;

import ofirdahan.com.stormy.R;

public class Forecast {
    private Current mCurrent;
    private Hour[] mHourlyForecast;
    private Day[] mDailyForecast;

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Hour[] getHourlyForecast() {
        return mHourlyForecast;
    }

    public void setHourlyForecast(Hour[] hourlyForecast) {
        mHourlyForecast = hourlyForecast;
    }

    public Day[] getDailyForecast() {
        return mDailyForecast;
    }

    public void setDailyForecast(Day[] dailyForecast) {
        mDailyForecast = dailyForecast;
    }

    public static int getIconId(String iconString){

        int iconID = R.mipmap.clear_day;

        if(iconString.equals("clear-day")){
            iconID = R.mipmap.clear_day;
        }
        else if(iconString.equals("clear-night")){
            iconID = R.mipmap.clear_night;
        }
        else if (iconString.equals("rain")) {
            iconID = R.mipmap.rain;
        }
        else if (iconString.equals("snow")) {
            iconID = R.mipmap.snow;
        }
        else if (iconString.equals("sleet")) {
            iconID = R.mipmap.sleet;
        }
        else if (iconString.equals("wind")) {
            iconID = R.mipmap.wind;
        }
        else if (iconString.equals("fog")) {
            iconID = R.mipmap.fog;
        }
        else if (iconString.equals("cloudy")) {
            iconID = R.mipmap.cloudy;
        }
        else if (iconString.equals("partly-cloudy-day")) {
            iconID = R.mipmap.partly_cloudy;
        }
        else if (iconString.equals("partly-cloudy-night")) {
            iconID = R.mipmap.cloudy_night;
        }

        return iconID;
    }
}
