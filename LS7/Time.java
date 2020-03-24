package LS7;

public class Time {
    private int second, minute, hour;
    public void setSecond(int second){
        if (second >= 0 && second <= 59){
            this.second = second;
        } else {
            this.second = 0;
            throw new IllegalArgumentException("invalid second !");
        }
    }
    public void setMinute(int minute){
        if (minute >= 0 && minute <= 59){
            this.minute = minute;
        } else {
            this.minute = 0;
            throw new IllegalArgumentException("invalid second !");
        }
    }
    public void setHour(int hour){
        if (hour >= 0 && hour <= 59){
            this.hour = hour;
        } else {
            this.hour = 0;
            throw new IllegalArgumentException("invalid second !");
        }
    }
    public void setTime(int second, int minute, int hour){
        this.setSecond(second);
        this.setMinute(minute);
        this.setHour(hour);
    }
    public Time(int second, int minute, int hour){
        this.setTime(second, minute, hour);
    }
    public Time(){
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }
    public int getSecond(){
        return this.second;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getHour(){
        return this.hour;
    }
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public Time nextSecond(){
        ++second;
        if (second == 60){
            second = 0;
            ++minute;
            if (minute == 60){
                minute = 0;
                ++hour;
                if (hour == 24){
                    hour = 0;
                }
            }
        }
        return this;
    }
}
