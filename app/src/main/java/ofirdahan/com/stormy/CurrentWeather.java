package ofirdahan.com.stormy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CurrentWeather {
    private String mIcon;
    private Long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;
    private String mTimeZone;
    private double mWindSpeed;

    public int getWindSpeed() {
        double windSpeed = mWindSpeed;
        return (int) Math.round(windSpeed);
    }

    public void setWindSpeed(double windSpeed) {
        mWindSpeed = windSpeed;
    }

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    public String getIcon() {
        return mIcon;
    }

    public int getIconId(){
        int iconID = R.mipmap.clear_day;

        if(mIcon.equals("clear-day")){
            iconID = R.mipmap.clear_day;
        }
        else if(mIcon.equals("clear-night")){
            iconID = R.mipmap.clear_night;
        }
        else if (mIcon.equals("rain")) {
            iconID = R.mipmap.rain;
        }
        else if (mIcon.equals("snow")) {
            iconID = R.mipmap.snow;
        }
        else if (mIcon.equals("sleet")) {
            iconID = R.mipmap.sleet;
        }
        else if (mIcon.equals("wind")) {
            iconID = R.mipmap.wind;
        }
        else if (mIcon.equals("fog")) {
            iconID = R.mipmap.fog;
        }
        else if (mIcon.equals("cloudy")) {
            iconID = R.mipmap.cloudy;
        }
        else if (mIcon.equals("partly-cloudy-day")) {
            iconID = R.mipmap.partly_cloudy;
        }
        else if (mIcon.equals("partly-cloudy-night")) {
            iconID = R.mipmap.cloudy_night;
        }

        return iconID;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public Long getTime() {
        return mTime;
    }

    public String getFormattedTime(){
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        Date dateTime = new Date(getTime() * 1000);
        String timeString = formatter.format(dateTime);
        return timeString;
    }

    public void setTime(Long time) {
        mTime = time;
    }

    public int getTemperature() {
        return (int) Math.round(mTemperature);
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public int getPrecipChance() {
        double precipPercentage = mPrecipChance * 100;
        return (int) Math.round(precipPercentage);
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }
}
