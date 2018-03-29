package practice;

public class Time2 {
    private int hour;
    private int min;
    private int sec;

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public Time2(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    @Override
    public String toString() {
        return "Time2{" +
                "hour=" + hour +
                ", min=" + min +
                ", sec=" + sec +
                '}';
    }
}
